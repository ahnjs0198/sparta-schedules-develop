# API 명세서

---

##  Schedules

### 1. 전체 일정 조회

| Method | URL        | descripe        |
|:------:|------------|:----------------|
|  GET   | /schedules | 전체 일정을 가지고 옵니다. |

전체 일정을 가지고 옵니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 일정 아이디                                            |
|  writer   | String   | 작성자명                                              |
|   title   | String   | 할일 제목                                             |
|   todo    | String   | 할일 내용                                             |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Response**
```json=
{
    schedules:[
        {
            id:"1",
            writer:"김르탄",
            title:"장보기",
            todo:"우유, 계란 사기",
            createdAt:"2024-10-30 13:00:00",
            updatedAt:"2024-10-31 18:00:00"
        }
        ...
    ]
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 목록 가져오기 성공 |
| 400  | 목록 가져오기 실패 |
| 401  |     권한 없음      |




---
### 2. 선택 일정 조회

| Method | URL             | descripe         |
|:------:|-----------------|:-----------------|
|  GET   | /schedules/{id} | 선택한 일정을 가지고 옵니다. |


선택한 일정을 가지고 옵니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 일정 아이디                                            |
|  writer   | String   | 작성자명                                              |
|   title   | String   | 할일 제목                                             |
|   todo    | String   | 할일 내용                                             |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Response**
```json=
{     
    id:"2",
    writer:"김르탄",
    title:"공부하기",
    todo:"spring boot 공부하기",
    createdAt:"2024-10-30 13:00:00",
    updatedAt:"2024-10-31 18:00:00"  
}
```

| Code | Description |
|:----:|:-----------:|
| 200  | 일정 가져오기 성공  |
| 400  | 일정 가져오기 실패  |
| 401  |    권한 없음    |




---
### 3. 일정 생성

| Method | URL        | descripe |
|:------:|------------|:---------|
|  POST  | /schedules | 일정 생성    |

Request를 보내면 그에 맞게 일정 DB에 추가합니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 일정 아이디                                            |
|  writer   | String   | 작성자명                                              |
|   title   | String   | 할일 제목                                             |
|   todo    | String   | 할일 내용                                             |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Request**
```json=
{
    writer:"홍길동",
    title:"장보기",
    todo:"우유, 계란 사기"
}
```

**Response**
```json=
{
    id:"3",
    writer:"홍길동",
    title:"장보기",
    todo:"우유, 계란 사기",
    createdAt:"2024-10-30 13:00:00",
    updatedAt:"2024-10-30 13:00:00"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 등록 성공   |
| 400  |  일정 등록 실패   |
| 401  |    권한 없음    |


---
### 4. 일정 수정

| Method | URL             | descripe |
|:------:|-----------------|:---------|
| Patch  | /schedules/{id} | 일정 수정    |

Request 를 보내면 그에 맞게 일정 DB에 정보를 변경합니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 일정 아이디                                            |
|  writer   | String   | 작성자명                                              |
|   title   | String   | 할일 제목                                             |
|   todo    | String   | 할일 내용                                             |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Request**
```json=
{
    id:"1",
    writer:"김르탄",
    title:"운동하기",
    todo:"자전거 타기"
}
```

**Response**
```json=
{
    id:"1",
    writer:"김르탄",
    title:"운동하기",
    todo:"자전거 타기",
    createdAt:"2024-10-30 13:00:00",
    updatedAt:"2024-10-31 18:00:00"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 변경 성공   |
| 400  |  일정 변경 실패   |
| 401  |    권한 없음    |


---
### 5. 일정 삭제

| Method | URL             | descripe |
|:------:|-----------------|:---------|
| Delete | /schedules/{id} | 일정 삭제    |

Request 를 보내면 그에 맞게 일정 DB에서 정보를 삭제합니다.

### 파라미터
|  이름   | 타입       | 설명     |
|:-----:|----------|:-------|
|  id   | Integer  | 일정 아이디 |
| state | String   | 상태코드   |

**Request**
```json=
{
    id:"2"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 삭제 성공   |
| 400  |  일정 삭제 실패   |
| 401  |    권한 없음    |

---

##  Members

### 1. 전체 멤버 조회

| Method | URL      | descripe        |
|:------:|----------|:----------------|
|  GET   | /members | 전체 멤버를 가지고 옵니다. |

전체 멤버를 가지고 옵니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 멤버 아이디                                            |
| username  | String   | 작성 유저명                                            |
|   email   | String   | 이메일                                               |
| password  | String   | 비밀번호                                              |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Response**
```json=
{
    schedules:[
        {
            id:"1",
            username:"김르탄",
            email:"aaa111@gmail.com",
            password:"1234",
            createdAt:"2024-10-30 13:00:00",
            updatedAt:"2024-10-31 18:00:00"
        }
        ...
    ]
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 목록 가져오기 성공 |
| 400  | 목록 가져오기 실패 |
| 401  |     권한 없음      |

---

### 2. 선택 멤버 조회

| Method | URL           | descripe         |
|:------:|---------------|:-----------------|
|  GET   | /members/{id} | 선택한 멤버를 가지고 옵니다. |

선택한 멤버를 가지고 옵니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 멤버 아이디                                            |
| username  | String   | 작성 유저명                                            |
|   email   | String   | 이메일                                               |
| password  | String   | 비밀번호                                              |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Response**
```json=
{
    id:"1",
    username:"김르탄",
    email:"aaa111@gmail.com",
    password:"1234",
    createdAt:"2024-10-30 13:00:00",
    updatedAt:"2024-10-31 18:00:00"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  | 멤버 가져오기 성공  |
| 400  | 멤버 가져오기 실패  |
| 401  |    권한 없음    |

---

### 3. 멤버 생성

| Method | URL      | descripe |
|:------:|----------|:---------|
|  GET   | /members | 멤버 생성    |

Request를 보내면 그에 맞게 멤버 DB에 추가합니다.

### 파라미터

|    이름     | 타입       | 설명                                                |
|:---------:|----------|:--------------------------------------------------|
|    id     | Integer  | 멤버 아이디                                            |
| username  | String   | 작성 유저명                                            |
|   email   | String   | 이메일                                               |
| password  | String   | 비밀번호                                              |
| createdAt | Datetime | 작성일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |
| updatedAt | Datetime | 수정일, ISO 8601<br/>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss] |

**Request**
```json=
{
    username:"김르탄",
    email:"aaa111@gmail.com",
    password:"1234"
}
```

**Response**
```json=
{
    id:"1",
    username:"김르탄",
    email:"aaa111@gmail.com",
    password:"1234",
    createdAt:"2024-10-30 13:00:00",
    updatedAt:"2024-10-31 18:00:00"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  멤버 생성 성공   |
| 400  |  멤버 생성 실패   |
| 401  |    권한 없음    |

---

### 4. 멤버 삭제

| Method | URL           | descripe |
|:------:|---------------|:---------|
|  GET   | /members/{id} | 멤버 삭제    |

Request를 보내면 그에 맞게 멤버 DB에 삭제합니다.

### 파라미터
|  이름   | 타입       | 설명     |
|:-----:|----------|:-------|
|  id   | Integer  | 멤버 아이디 |
| state | String   | 상태코드   |

**Request**
```json=
{
    id:"2"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  멤버 삭제 성공   |
| 400  |  멤버 삭제 실패   |
| 401  |    권한 없음    |

---

![alt text](ERD.png "ERD")