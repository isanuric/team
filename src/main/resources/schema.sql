CREATE TABLE person (id int, first_name varchar(255), last_name varchar(255), city varchar(255));


CREATE TABLE poems(
    id SERIAL PRIMARY KEY,
    poem_name VARCHAR UNIQUE NOT NULL,
    poem VARCHAR (1024),
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);

INSERT INTO poems (poem_name, poem) VALUES ('غزل ۱', 'الا یا ایها الساقی ادرکسا و ناولها');

