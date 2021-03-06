package io.ddojai.firstwebservicewithkotlin.controller

import org.hamcrest.Matchers.containsString
import org.junit.Assert.assertThat

import org.junit.Test
import org.junit.runner.RunWith
import org.assertj.core.api.Assertions.assertThat
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import io.ddojai.firstwebservicewithkotlin.domain.WelcomeBean

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BasicControllerIT {
    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun `GET welcome returns "Hello World"`() {

        // When
        val body = restTemplate.getForObject("/welcome", String::class.java)

        // Then
        assertThat(body).isEqualTo("Hello World")

    }


    @Test
    fun `GET welcome-with-object returns "Hello World"`() {

        // When
        val body = restTemplate.getForObject("/welcome-with-object", WelcomeBean::class.java)

        // Then
        assertThat(body.message, containsString("Hello World"));
    }


    @Test
    fun `GET welcome-with-parameter returns "Hello World"`() {

        // When
        val body = restTemplate.getForObject("/welcome-with-parameter/name/Buddy", WelcomeBean::class.java)

        // Then
        assertThat(body.message, containsString("Hello World, Buddy"));
    }

}