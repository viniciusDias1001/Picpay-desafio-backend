CREATE TABLE TRANSFERS(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    SEND_ACCOUNT_ID INT,
    RECIVE_ACCOUNT_ID INT,
    VALUE_TRANSFER DECIMAL(10,2) NOT NULL,
    TRANSFER_TYPE VARCHAR(15) NOT NULL,
    DATA_TRANSFERENCE DATE NOT NULL
);