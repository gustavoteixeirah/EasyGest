<script setup lang="ts">
    import { useAuthStore } from "../stores/AuthStore";

    const authStore = useAuthStore();

</script>


<template>
    <div class="nav">
        {{ authStore.session.token }}
    <button @click="authStore.logout" v-if="authStore.isLoggedIn()">Logout</button>
    <RouterLink to="/login" v-if="!authStore.isLoggedIn()">Login</RouterLink>
</div>
</template>

<style scoped>
.nav{
    text-align: right;
    margin-bottom: 20px;
}
</style>