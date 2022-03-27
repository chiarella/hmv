# Aplicação Back End HMV

**Hospital Moinhos de Vento - HMV**

Aplicação referente ao back-end em JAVA dedicado ao hospital HMV.

Nessa aplicação foram utilizado as seguintes tecologias:

* JAVA 11
* FRAMEWORK SPRING BOOT
* REST API
* JPA HIBERNATE
* LOMBOK
* MAPSTRUCT
* QRCODE
* APACHE MAVEN
* MOCKITO
* GIT HUB
* GIT BACH
* MYSQL
* AMAZON
* HEROKU
* POSTMAN

Dependências:

* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-boot-devtools
* spring-boot-starter-test
* zxing
* springfox
* gson
* json
* imageio
* openimaj
* mysql-connector
* hibernate
* lombok OBS: Apresentou problema o mesmo esta comentando e a codificação foi feita manual entrara na 2ª Parte do projeto
* mapstruct OBS: Apresentou problema o mesmo esta comentando e a codificação foi feita manual entrara na 2ª Parte do projeto


` **Executar o projeto**  `

* Para subir o projeto é necessário ter uma ide para desenvolvimento java e um JDK na versão 11. No caso da ide utilizamos o eclipse.

* Dentro do IDE ao baixar o codigo efetuar o import do mesmo na aba File -> Import
  Escolher a opção: existing maven projects -> next
  Escolha o local aonde efetuou o download do projeto e Finish (projeto precisa estar descompactado)
  
* No eclipse após o import Navegar até a classe HmvApplication

* Clique com o botão direito dentro da classe e escolha a opção "Run As" e Java Application 

OBS: A ultima frase da aba console sera algo como "Started HmvApplication", caso não aparecer essa mensagem, repetir os passos ou
entrar em contato com o desenvolvedor



**Testes**

* Para facilitar os testes esta disponível na raiz do projeto a "Collection Json" do postman utilizado para desenvolvimento
podendo assim até simular o front-end para testes, fora a simulação do fron temos a camada de testes abaixo.

* Todos os testes da aplicação estão nas classes abaixo, as classes são respectivas as camadas de controller e service
* Estão localizados dentro de src/test/java
* Para rodar os teste clique dentro da classe com o botão direito "Run As" -> JUnit test
   * AgendaControllerTest
   * PacienteControllerTest
   * QuizControllerTest
   * AgendaServiceTest
   * PacienteServiceTest
   * QuizServiceTest
