# language: pt

@cadastroDeUsuarios
Funcionalidade: Cadastro de Usuários
Eu como usuário
Quero manipular o cadastro de clientes
Para ter os dados dos clientes registrados e atualizados

@cenario1
Cenário: Consultar Todos os Usuario
Dado que eu nao informe os dados de cadastro
Quando envio uma requisacao get no endpoint /users
Entao a api retona o status code 200
E uma lista com 10 usuarios é retornada

@cenario2
Cenário: Validar Cadastro de Usuario Sem Nome
Dado que eu nao infome o dado 'nome' de cadastro
Quando envio uma requisacao post no endpoint /users
Entao a api retona o status code 400

@cenario3
Cenário: Validar Cadastro de Usuario
Dado que eu informe os dados de cadastro
Quando envio uma requisacao post no endpoint /users
Entao a api retona o status code 201

@cenario4
Cenário: Validar Atualizacao de Cadastro de Usuario
Dado que eu nao informe os dados de cadastro no corpo da requisicao
Quando envio uma requisacao post no endpoint /users
Entao a api retona o status code 200

