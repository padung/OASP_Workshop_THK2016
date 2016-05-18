-- *** Employee ***
CREATE TABLE EMPLOYEE (
  id BIGINT NOT NULL,
  modificationCounter INTEGER NOT NULL,
  firstName VARCHAR(255),
  lastName VARCHAR(255),
  age INTEGER,
  restaurantId BIGINT NOT NULL
);

ALTER TABLE EMPLOYEE ADD CONSTRAINT FK_RESTAURANT FOREIGN KEY(restaurantId) REFERENCES RESTAURANT(id) NOCHECK;

INSERT INTO EMPLOYEE(id, modificationCounter, firstName, lastName, age, restaurantId) VALUES (0, 0, 'Max', 'Mustermann', 42, 0);
INSERT INTO EMPLOYEE(id, modificationCounter, firstName, lastName, age, restaurantId) VALUES (1, 0, 'Marlene', 'Musterfrau', 24, 0);
INSERT INTO EMPLOYEE(id, modificationCounter, firstName, lastName, age, restaurantId) VALUES (2, 0, 'Peter', 'Petersen', 30, 1);
INSERT INTO EMPLOYEE(id, modificationCounter, firstName, lastName, age, restaurantId) VALUES (3, 0, 'Nina', 'Nani', 35, 1);