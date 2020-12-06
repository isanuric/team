CREATE TABLE person (
    id SERIAL PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    city varchar(255),
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE poems(
    id SERIAL UNIQUE PRIMARY KEY,
    poem_name VARCHAR UNIQUE NOT NULL,
    poem VARCHAR (1024),
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE poems_list(
    id SERIAL PRIMARY KEY,
    poem_start VARCHAR UNIQUE NOT NULL,
    poem_id REFERENCES poems (id),
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);



CREATE TABLE IF NOT EXISTS dictionary (
    id SERIAL PRIMARY KEY,
    english VARCHAR,
    persian VARCHAR,
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);


INSERT INTO poems (poem_name, poem) VALUES ('غزل ۱', 'الا یا ایها الساقی ادرکسا و ناولها');

