Chapter - 02

The Basic Spring Boot Application
=================================


Business Requirements

USER STORY 1

As a user of the application, I want to be presented with a random multiplication that I can solve online-
not too easy, so I can use mental calculation and make my brain work everyday.

Sub Tasks,

1. Create a basic service with the business logic
2. Create a basic API endpoint to access this service. REST API
3. Create a basic webpage to ask the users to solve that calculation.

https://spring.io/guides/gs/spring-boot/


The Skeleton APP

creating skeleton
=================

https://start.spring.io/


Warming Up : Some TDD in Action
===============================

MultiplicationServiceTest


@Mockbean - tells spring to inject a mock of the Service or Object.


./mvnw -Dtest=MultiplicationServiceTest test

