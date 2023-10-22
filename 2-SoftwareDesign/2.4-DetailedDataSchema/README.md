### Деталізований опис схеми даних мовою опису СКБД

CREATE TABLE Users(
    user_id INT PRIMARY KEY,
    name VARCHAR(50),
    surname VARCHAR(50),
    email VARCHAR(100)
);

CREATE TABLE EcoRating(
    ecorating_id INT PRIMARY KEY,
    eco_percentage DECIMAL,
    date DATE
);

CREATE TABLE Consumption(
    consumption_id INT PRIMARY KEY,
    quantity DECIMAL,
    date DATE,
    time TIME,
    user_id INT,
    ecorating_id INT
);

CREATE TABLE PollutionMessages(
    polutionmessages_id INT PRIMARY KEY,
    sending_time TIME,
    user_id INT
);

CREATE TABLE Project(
    project_id INT PRIMARY KEY,
    name VARCHAR(100),
    description VARCHAR(255),
    user_id INT
);

ALTER TABLE Consumption ADD CONSTRAINT consumption_user_fk
  FOREIGN KEY (user_id) REFERENCES Users(user_id);

ALTER TABLE Consumption ADD CONSTRAINT consumption_rating_fk
  FOREIGN KEY (ecorating_id) REFERENCES Eco_Rating(ecorating_id);

ALTER TABLE PollutionMessages ADD CONSTRAINT messages_user_fk
  FOREIGN KEY (user_id) REFERENCES Users(user_id);

ALTER TABLE Project ADD CONSTRAINT project_user_fk
  FOREIGN KEY (user_id) REFERENCES Users(user_id);

ALTER TABLE EcoRating ADD CONSTRAINT eco_rating_range
    CHECK ( eco_percentage BETWEEN 0 AND 100);
  
