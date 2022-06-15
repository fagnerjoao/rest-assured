# language: pt

@Posts
Funcionalidade: Posts
Eu como usuário
Quero fazer validar os posts dos usuários
Para verificar as postagens registradas


Cenário: Validar Atualizacao de Publicacao
Dado que eu informe o dado 'id' no query params
E que informe os dados a serem alterados
Quando envio uma requisacao put no endpoint /posts/1
Entao a api retona o status code 200
E o valores informados são retornados atualizados no response