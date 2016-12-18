package com.formento.spring.reactive.web.api.v1.controller;

import org.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AlbumControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldGetAllProducts() {
        // given
        final String url = "/v1/products";
        final HttpMethod httpMethod = HttpMethod.GET;
        final HttpEntity<?> httpEntity = HttpEntity.EMPTY;
        final String bodyResponse="[{\"name\": \"book\"}]";

        // when
        final ResponseEntity<String> response = restTemplate.exchange(url, httpMethod, httpEntity, String.class);

        // then
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        JSONAssert.assertEquals(bodyResponse, new JSONArray(response.getBody()), false);
    }

}
