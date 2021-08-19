USE study_spring;

CREATE TABLE IF NOT EXISTS todo(
  id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  title VARCHAR(50),
  description  VARCHAR(100),
  importance INT,
  period date,
  created_at datetime  default current_timestamp,
  updated_at timestamp default current_timestamp on update current_timestamp
);

INSERT INTO todo (title, description, importance, period)  VALUES ("study", "study spring boot", 1, '20210819');