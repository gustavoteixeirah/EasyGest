import { createPinia } from "pinia";
import { createApp } from "vue";
import { createRouter, createWebHistory } from "vue-router";
import App from "./App.vue";
import AxiosAdapter from "./infra/http/AxiosAdapter";
import AuthServiceHttp from "./services/AuthServiceHttp";
import BoardServiceHttp from "./services/BoardServiceHttp";
import { useAuthStore } from "./stores/AuthStore";
import DashboardViewVue from "./views/DashboardView.vue";
import LoginViewVue from './views/LoginView.vue';
import LandingPageViewVue from './views/LandingPageView.vue';

const app = createApp(App);

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {path: "/", component: LandingPageViewVue},
        {path: "/login", component: LoginViewVue},
        {path: "/dashboard", component: DashboardViewVue},
    ]
})

const httpClient = new AxiosAdapter(router);
const baseUrl = "http://localhost:8080";
const authService = new AuthServiceHttp(httpClient, baseUrl);

const pinia = createPinia();
pinia.use(({ store }) => {
  store.$router = router,
  store.authService = authService
});

app.use(router)
app.use(pinia)

useAuthStore().init();

app.provide("boardService", new BoardServiceHttp(httpClient, baseUrl));

app.mount("#app");
