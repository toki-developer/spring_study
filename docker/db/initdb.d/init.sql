USE study_spring;

CREATE TABLE IF NOT EXISTS todo(
  id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  title VARCHAR(50),
  description  VARCHAR(100),
  importance INT,
  period date,
  completed INT,
  created_at timestamp  default current_timestamp,
  updated_at timestamp default current_timestamp on update current_timestamp
);