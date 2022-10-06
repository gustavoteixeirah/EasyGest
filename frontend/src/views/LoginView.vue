<script setup lang="ts">
import { ref } from "vue";
import { useAuthStore } from "../stores/AuthStore";


const username = ref ("")
const password = ref ("")

const authStore = useAuthStore();
</script>



<template>
    <div class="main">
        <h2>Bem-vindo(a)!</h2>
        <div class="loginBox">
            <input type="text" v-model="username" placeholder="e-mail" />
            <input type="password" v-model="password" placeholder="senha" @keyup.enter="authStore.login(username, password)" />
            <button @click="authStore.login(username, password)">Login</button>
        </div>
        <div class="cadastrar">
            <div>
                <h4>Primeira vez aqui?</h4>
                <h5>Clique no botão abaixo para
                <br/> realizar o seu cadastro!</h5>
            </div>

            <button @click="">Cadastrar</button>
        </div>
    </div>
</template>

<style scoped>
input {
    background-color: lightgray;
    border: 0px;
    height: 32px;
    width: 256px;
    font-size: 24px;
}
button {
    font-size: 21px;
    height: 32px;
    width: 180px;
    color: whitesmoke;
    background-color: blue;
    border: 0px;
}
    
.main {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 20px;
}

.loginBox {
    width: 256px;
    padding: 8px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 10px;
}

.cadastrar {
    margin-top: 40px;
    text-align: center;
    display: flex;
    justify-content: center;
    flex-direction: column;
    align-items: center;
}
</style>