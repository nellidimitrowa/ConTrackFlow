<h1>Domain Model – ConTrackFlow</h1>

<h2>User</h2>

Represents a system user.

| Field     | Type          | Description        |
| --------- | ------------- | ------------------ |
| id        | Long          | Unique identifier  |
| username  | String        | Login username     |
| email     | String        | User email         |
| password  | String        | Password hash      |
| role      | Role          | User role          |
| createdAt | LocalDateTime | Creation timestamp |

<h2>Role</h2>

Defines system roles.

| Field | Type          | Description                      |
|-------| ------------- |----------------------------------|
| id    | Long          | Role ID                          |
| name  | String        | Role name (ADMIN, USER, APPROVER |

<h2>Contract</h2>

Represents a contract entity.

| Field       | Type           | Description    |
| ----------- | -------------- | -------------- |
| id          | Long           | Contract ID    |
| title       | String         | Contract title |
| description | String         | Description    |
| status      | ContractStatus | Current status |
| createdBy   | User           | Creator        |
| createdAt   | LocalDateTime  | Creation time  |


<h2>ContractVersion</h2>

Tracks contract versions.

| Field         | Type          | Description       |
| ------------- | ------------- | ----------------- |
| id            | Long          | Version ID        |
| contract      | Contract      | Parent contract   |
| versionNumber | Integer       | Version number    |
| createdAt     | LocalDateTime | Created timestamp |


<h2>Document</h2>

Stores uploaded documents.

| Field      | Type          | Description      |
| ---------- | ------------- | ---------------- |
| id         | Long          | Document ID      |
| contract   | Contract      | Related contract |
| fileName   | String        | File name        |
| filePath   | String        | File location    |
| uploadedBy | User          | Uploaded by      |
| uploadedAt | LocalDateTime | Upload time      |


<h2>Approval</h2>

Approval workflow entity.

| Field      | Type           | Description                   |
| ---------- | -------------- | ----------------------------- |
| id         | Long           | Approval ID                   |
| contract   | Contract       | Contract                      |
| approver   | User           | Approver                      |
| status     | ApprovalStatus | PENDING / APPROVED / REJECTED |
| comment    | String         | Optional comment              |
| approvedAt | LocalDateTime  | Approval timestamp            |


<h2>Comment</h2>

Contract comments.

| Field     | Type          |
| --------- | ------------- |
| id        | Long          |
| contract  | Contract      |
| user      | User          |
| message   | String        |
| createdAt | LocalDateTime |


<h2>AuditLog</h2>

Tracks important actions.

| Field      | Type          |
| ---------- | ------------- |
| id         | Long          |
| action     | String        |
| user       | User          |
| entityType | String        |
| entityId   | Long          |
| timestamp  | LocalDateTime |
