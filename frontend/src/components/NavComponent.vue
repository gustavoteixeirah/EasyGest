<script setup lang="ts">
import { useAuthStore } from "../stores/AuthStore";

const authStore = useAuthStore();

</script>


<template>
    <div class="nav">
        <!-- {{ authStore.session.token }} -->
        <div class="appName">
            EasyGest
        </div>
        <div>
            <button @click="authStore.logout" v-if="authStore.isLoggedIn()">Logout</button>
            <RouterLink to="/login" v-if="!authStore.isLoggedIn()">Login</RouterLink>
        </div>

    </div>
</template>

<style scoped>
.nav {
    /* background-color: cyan; */
    display: flex;
    justify-content: space-between;
    text-align: right;
    padding:  20px 20px 20px 20px;
    
}
.appName {
    font-size: 21px;
    color: blue;
    font-weight: 700;
}
</style>