# Getting Started

- build project run `./gradew build`
- build docker image run `docker build -t kotlin-restful-api:0.0.1 .`
- run apps `docker compose up -d`

## API

### create new category

Request:
- Method : POST
- Endpoint : `/api/categories`
- Header : 
    - Accept : application/json
    - Content-Type : application/json
- Body :

```json
{
  "name" : "string",
  "description" : "string"
}
```

Response :

```json
{
  "code": 201,
  "message": "ok",
  "data": {
    "id": "string",
    "name": "string",
    "description": "string",
    "createdAt": "date",
    "updatedAt": "date"
  }
}
```


