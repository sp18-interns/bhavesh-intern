CREATE DATABASE NEWDB;
SHOW DATABASES ;
DROP DATABASE NEWDB ;
SHOW DATABASES ;
USE sys;

CREATE TABLE SALESMAN 
(
SALESMAN_ID INT(22) NOT NULL,
NAME VARCHAR(40) NOT NULL ,
CITY VARCHAR (100) ,
COMMISSION NVARCHAR (100)
)
SELECT * FROM SALESMAN 

SELECT
    AVG(ALL COMMISSION )
FROM
    SALESMAN;
   
   
