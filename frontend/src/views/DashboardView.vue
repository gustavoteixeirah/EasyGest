<script setup lang="ts">
import { inject, onMounted, reactive, ref } from "vue";
import DashboardComponent from "../components/DashboardComponent.vue";

// import { useRoute } from "vue-router";

const data: { board: Board | undefined } = reactive({ board: undefined });

// const route = useRoute();
// const idBoard = parseInt(route.params.idBoard as string);

// onMounted(async () => {
// });
</script>

<template>
<!-- <RouterLink to="/boards">Boards</RouterLink> -->
<DashboardComponent></DashboardComponent>
</template>

<style scoped>

</style>
