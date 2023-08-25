CREATE TABLE File
(
    id        BIGINT       NOT NULL,
    file_name VARCHAR(255) NOT NULL,
    dateTime  TIMESTAMP WITHOUT TIME ZONE,
    file_path VARCHAR(255) NOT NULL,
    CONSTRAINT pk_file PRIMARY KEY (id)
);