
CREATE SEQUENCE category_id_seq;
CREATE TABLE category (
    id NUMERIC NOT NULL DEFAULT nextval('category_id_seq') PRIMARY KEY,
    category_name VARCHAR(250)
);

CREATE SEQUENCE sub_category_id_seq;
CREATE TABLE sub_category (
    id NUMERIC NOT NULL DEFAULT nextval('sub_category_id_seq') PRIMARY KEY,
    sub_category_name VARCHAR(250),
    category_id NUMERIC REFERENCES category (id)
);

CREATE SEQUENCE etablisment_id_seq;
CREATE TABLE etablisment (
    id NUMERIC NOT NULL DEFAULT nextval('etablisment_id_seq') PRIMARY KEY,
    name VARCHAR(255),
    siren VARCHAR(255),
    address VARCHAR(255),
    city VARCHAR(255),
    cp VARCHAR(255),
    longitude VARCHAR(255),
    lattitude VARCHAR(255),
    sub_category_id NUMERIC REFERENCES sub_category (id)
);