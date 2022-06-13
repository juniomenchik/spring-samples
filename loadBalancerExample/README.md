USER é o BALANCEADOR DE CARGA
    que nesta aplicacao faz consultas e configura uma saida diferente.

entrar no user
$mvn spring-boot:run

Para subir as aplicacoes deve-se entrar nas pastas say-hello e utilizar os comandos
$SERVER_PORT=8090 mvn spring-boot:run
$SERVER_PORT=9999 mvn spring-boot:run
$SERVER_PORT=9092 mvn spring-boot:run

