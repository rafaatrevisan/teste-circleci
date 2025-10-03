package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {

    @Test
    void deveRetornarMensagem() {
        HelloController controller = new HelloController();
        String resposta = controller.hello();
        assertThat(resposta).isEqualTo("Olá, CI/CD com CircleCI!");
    }
}
