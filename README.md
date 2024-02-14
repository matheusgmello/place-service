# Place Service

Aplicação desenvolvida com base no [desafio da ClickBus](https://github.com/RocketBus/quero-ser-clickbus/tree/master/testes/backend-developer). Baseia-se em uma API para fazer gereciamento de lugares.

# Configurações

### Requisitos

- [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Docker](https://docs.docker.com/)

### Localmente

- Clone o repositório(`git@github.com:matheusgmello/place-service.git`)
- Fazer a build do projeto(`./mvnw clean package`)
- Executar o projeto(`java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar`)
- Acesse a API em (`localhost:8080`)

### Docker

- Clone o repositório(`git@github.com:matheusgmello/place-service.git`)
- Fazer a build do projeto(`./mvnw clean package`)
- Faça a build da imagem(`./mvnw spring-boot:build-image`)
- Suba o container(`docker run --name place-service -p 8080:8080  -d place-service:0.0.1-SNAPSHOT`)

## Rotas

Durante a aplicação utilizei o [httpie](https://httpie.io) como Rest Client

### POST `/places`

- Faz a criação de um lugar.

#### Request Body
```json
{
    "createdAt": "2023-04-20T19:00:07.241632",
    "name": "Place",
    "slug": "place",
    "state": "State",
    "updatedAt": "2023-04-20T19:00:07.241632"
}
```

### GET `/places/{id}`

- Faz a busca de um único local.

``` json
{
    "createdAt": "2023-06-07T14:45:39.693689",
    "name": "Place",
    "slug": "place",
    "state": "State",
    "updatedAt": "2023-06-07T14:45:39.693689"
} 
```

### GET `/places?name=?`

- Busca um local por nome.

```json
[
    {
        "createdAt": "2023-06-07T14:45:39.693689",
        "name": "Place",
        "slug": "place",
        "state": "State",
        "updatedAt": "2023-06-07T14:45:39.693689"
    }
]
```

### PATCH `/places/{id}`

- Faz uma pequena alteração em um local.

```json
{
    "createdAt": "2023-06-07T14:45:39.693689",
    "name": "New Name",
    "slug": "new-name",
    "state": "New State",
    "updatedAt": "2023-06-07T14:53:21.671129345"
}
```

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes automatizados
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

<!--START_SECTION:footer-->
<br />

## 🔗 Connect with me
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/matheusgmello)
[![Reddit](https://img.shields.io/badge/Reddit-%23FF4500.svg?style=for-the-badge&logo=Reddit&logoColor=white)](https://www.reddit.com/user/math7zw)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/matheusgmello/)


<!--END_SECTION:footer-->



