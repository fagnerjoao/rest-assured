package br.pe.fj.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


import org.junit.*;

import io.restassured.http.ContentType;

public class Users {
	
	@Test
	public void deveVerificarStausDaApi() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
		.when()
			.get("https://jsonplaceholder.typicode.com/users")
		.then()
			.statusCode(200)
			;
	}
	
	@Test
	public void deveConsultarTodosUsuarios() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
		.when()
			.get("https://jsonplaceholder.typicode.com/users")
		.then()
			.statusCode(200)
			.body("id.max()", is(10))
			;
	}
	
	@Test
	public void deveValidarCadastrUsuarioSemNome() {
		given()
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\"username\": \"\"}")
	.when()
		.post("https://jsonplaceholder.typicode.com/users")
	.then()
		.log().all()
		.statusCode(400)
		.body("id", is(notNullValue()))
		;
	}
	
	@Test
	public void deveVerificarNome() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
		.when()
			.get("https://jsonplaceholder.typicode.com/users/1")
		.then()
			.statusCode(200)
			.body("id", is(1))
			.body("name", containsString("Leanne Graham"))
			;
	}
	
	
	@Test
	public void ValidarCadastroUsuario() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body("{\"username\": \"NEON\", \"suite\": \"Apt. 2022\"}")
		.when()
			.post("https://jsonplaceholder.typicode.com/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("suite", is("Apt. 2022"))
		;
	}
	

	@Test
	public void deveValidarAtualizacaoCadastroUsuario() {
		given()
			.log().all()
			.contentType(ContentType.JSON)
			.body("{\"name\":\"Son Gohan\", \"suite\": \"Apt. 2022\"}")
		.when()
			.put("https://jsonplaceholder.typicode.com/users/1")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(1))
			.body("name", is("Son Gohan"))
			.body("suite", is("Apt. 2022"))
		;
	}

	
	@Test
	public void devoRemoverUsuario() {
		given()
			.contentType(ContentType.JSON)
			.log().all()
		.when()
			.delete("https://jsonplaceholder.typicode.com/users/1")
		.then()
			.log().all()
			.statusCode(200)
		;
	}

	
}