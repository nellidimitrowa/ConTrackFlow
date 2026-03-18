<h1>ConTrackFlow Architecture</h1>

ConTrackFlow is a full-stack contract lifecycle management system.

The system consists of:

<li>Backend API

<li>Frontend UI

<li>Database

<li>Infrastructure services

<h2>Backend</h2>

Technology stack:

<li>Java

<li>Spring Boot

<li>Spring Security

<li>JPA / Hibernate

Architecture pattern:

Controller

Service

Repository

Entity

DTO

Mapper

Example:

ContractController

ContractService

ContractRepository

Contract

ContractDTO

ContractMapper

<h2>Frontend</h2>

Technology:

<li>React

<li>Axios

<li>React Router

Structure:

pages

components

services

auth

<h2>Database</h2>

Database: MySQL

ORM: Hibernate

Schema is generated automatically via JPA entities.

<h2>Infrastructure</h2>

Containers: Docker

Services:

<li>MySQL

<li>Backend

<li>Frontend

<li> Keycloak (authentication)

Monitoring:

<li>Prometheus

<li>Grafana

<h2>Security</h2>

Authentication: Keycloak / JWT

Authorization: Role-based access control

Roles:

<li>ADMIN
<li>USER
<li>APPROVER

<h2>Deployment</h2>

Local development: Docker Compose

Production: Kubernetes