package br.pe.fj.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


import org.junit.Test;

import io.restassured.http.ContentType;

public class Posts {
	

	@Test
	public void deveValidarAtualizacaoPublicacao() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body("{\"title\":\"Dasafio NEON\", \"body\": \"Obrigado pela oportunidade!\"}")
		.when()
			.put("https://jsonplaceholder.typicode.com/posts/1")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(1))
			.body("title", is("Dasafio NEON"))
			.body("body", is("Obrigado pela oportunidade!"))
		;
	}

	

}
