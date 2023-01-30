Chapter 03
==========

A Real Three-Tier Spring Boot Application
=========================================

Introduction
============

Tier
Client tier - user interface / frontend
Application tier - Business logic, and interfaces for frontend and backend
Data tier - database, file system etc.

Application Tier will have the layers
=====================================

1. Business layer - Domains and Applications @Service
2. Presentation layer - Controllers
3. Data layer - @Data or Repo layer


Completing the Basics
=====================

RandomGeneratorServiceTest - Implementation

./mvnw -Dtest=RandomGeneratorServiceImplTest test


======================================================================================================================


Designing the Domain

Multiplication - factors
User - who solves the problem
MultiplicationResultAttempt - factor and value submitted.

Adding Immutability and Lombok

