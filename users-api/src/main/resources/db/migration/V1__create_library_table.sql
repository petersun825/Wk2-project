create table BOOKS (
--     create serial ID
    ID serial,
    DAY date,
    TOTAL integer NOT NULL,
    BORROW integer NOT NULL,
    AVAILABLE integer NOT NULL
);