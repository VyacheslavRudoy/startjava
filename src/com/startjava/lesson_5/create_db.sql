-- create database

CREATE TABLE Jaegers (
    id         SERIAL PRIMARY KEY,
    modelName  TEXT,
    mark       TEXT,
    height     CHAR(6),
    weight     DOUBLE PRECISION,
    status     TEXT,
    origin     TEXT,
    launch     DATE,
    kaijuKill  INTEGER);