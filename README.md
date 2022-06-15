## NEON Back-end


# Setup PC
- JDK 8 ou superior
- Eclipse IDE for Java Developers
- Configurar as variáveis de ambiente (ex: JAVA_HOME) de acordo com SO


# Setup Prjeto (MAven dependencies)
- rest-assured 4.4.0 (https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0)
- junit 4.12 (https://mvnrepository.com/artifact/junit/junit/4.12)
- gson 2.8.5 (https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5)

# Cenários Front-end
Nome Cenário                                            |   Tag
--------------------------------------------------------| ---------
Cenário 1: Consultar Todos os Usuario                   | cenario_1
Cenário 2: Validar Cadastro de Usuario Sem Nome         | cenario_2
Cenário 3: Validar Cadastro de Usuario                  | cenario_3
Cenário 4: Validar Atualizacao de Cadastro de Usuario   | cenario_4
Cenário 5: Validar Atualizacao de Publicacao            | cenario_5

* Os demais cenários estão em: /neon-rest-assured/src/main/resources/features


# Execução dos Cenário:
- Os testes devem ser executados como 'Junit Test'
- A execução pode ser feita individualmente nas classes 'Users.java' e/ou 'Posts.java'
- A execução pode ser feita por meio da suite de testes 'Runner.java'

# Obs.:
- Junto ao projeto há um arquivo 'JSONPlaceholder.postman_collection' com os teste que realizei manualmente

# Resources
##### [Rest Assured](https://rest-assured.io)
##### [Junit](https://junit.org/)