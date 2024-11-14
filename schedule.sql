-- schedule 테이블
CREATE TABLE schedule (
                           id INT,
                           writer STRING,
                           title STRING,
                           todo STRING,
                           createdAt DATETIME,
                           updatedAt DATETIME

);

-- 전체 일정 조회 query
SELECT id, writer, title, todo, createdAt, updatedAt
FROM schedule;

-- 선택 일정 조회 query
SELECT id, writer, title, todo, createdAt, updatedAt
FROM schedule
WHERE id = 1;

-- 일정 생성 query
INSERT INTO schedule (writer, title, todo)
VALUES ('김르탄', '장보기','우유, 계란 사기');

-- 일정 수정 query
UPDATE schedule
SET title = '식사하기', todo = '점심식사하기'
WHERE id = 1;

-- 일정 삭제 query
DELETE FROM schedule
WHERE id = 1;

-- member 테이블
CREATE TABLE member (
                           id INT,
                           username STRING,
                           email STRING,
                           password STRING,
                           createdAt DATETIME,
                           updatedAt DATETIME

);

-- 전체 일정 조회 query
SELECT id, username, email, password, createdAt, updatedAt
FROM member;

-- 선택 일정 조회 query
SELECT id, username, email, password, createdAt, updatedAt
FROM member
WHERE id = 1;

-- 일정 생성 query
INSERT INTO member (username, email, password)
VALUES ('김르탄', 'aaa111@gmail.com','1111');

-- 일정 수정 query
UPDATE member
SET password = '1234'
WHERE id = 1;

-- 일정 삭제 query
DELETE FROM member
WHERE id = 1;