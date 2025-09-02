-- 스키마명
create schema first_practice;

-- 쿼리에 스키마 선택
set search_path to first_practice;

-- 쿼리문
INSERT INTO MEMBER (name) VALUES ('name 1'), ('name 2'), ('name 3');