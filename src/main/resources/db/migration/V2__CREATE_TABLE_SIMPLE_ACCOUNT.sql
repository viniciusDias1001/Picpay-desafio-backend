CREATE TABLE SIMPLE_ACCOUNTS(

    ID INT PRIMARY KEY AUTO_INCREMENT,
    USER_ID INT NOT NULL,
    SALDO BIGINT NOT NULL,
    CREDITO BIGINT NOT NULL,
    DATA_CRIACAO DATE NOT NULL
);