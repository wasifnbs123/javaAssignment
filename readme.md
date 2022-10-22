Technology Stack:
-
1. Java 8
2. Spring Boot 2.6.6
3. Lombok
4. MapStruct with Spring Component Model
5. JPA repository & Hibernate ORM Mapping

API Contracts
- 
Post/ The endpoint is used for creating/updating the PaymentMethod.

1. Endpoint URL: http://localhost:8080/api/v1.0/configuration/payment-methods
2. JSON Request Body:
    {
        "name": "abc",
        "displayName": "Alfa wasif Lebanon",
        "paymentType": "MOBILE_CARRIER",
        "paymentPlans": [{
            "netAmount": 5.99,
            "taxAmount": 0,
            "grossAmount": 5.99,
            "currency": "USD--+",
            "duration": "Month"
        }]
    }
    
Get/ The endpoint is used to findAll, findById, findByName.

1. Endpoint URL: 
    http://localhost:8080/api/v1.0/configuration/payment-methods
    http://localhost:8080/api/v1.0/configuration/payment-methods?id=133
    http://localhost:8080/api/v1.0/configuration/payment-methods?name=abcd
