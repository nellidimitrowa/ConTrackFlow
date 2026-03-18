<h1>API Endpoints</h1>

<h2>Authentication</h2>

POST /auth/login

POST /auth/register

<h2>Users</h2>

GET /users

GET /users/{id}

POST /users

DELETE /users/{id}

<h2>Contracts</h2>

GET /contracts

GET /contracts/{id}

POST /contracts

PUT /contracts/{id}

DELETE /contracts/{id}

<h2>Contract Versions</h2>

GET /contracts/{id}/versions

POST /contracts/{id}/versions

<h2>Documents</h2>

POST /documents/upload

GET /documents/{id}

DELETE /documents/{id}

<h2>Approvals</h2>

POST /contracts/{id}/approve

POST /contracts/{id}/reject

GET /contracts/{id}/approvals

<h2>Comments</h2>

POST /contracts/{id}/comments

GET /contracts/{id}/comments

<h2>Audit Logs</h2>

GET /audit
