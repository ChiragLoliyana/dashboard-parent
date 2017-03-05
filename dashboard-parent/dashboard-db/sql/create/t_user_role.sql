CREATE TABLE dashboard.t_user_role (
  user_role_id INT NOT NULL,
  user_id VARCHAR(10) NOT NULL,
  role_id INT(10) NOT NULL,
  created_date DATETIME NOT NULL,
  created_origin VARCHAR(10) NOT NULL,
  updated_date DATETIME NOT NULL,
  updated_origin VARCHAR(10) NOT NULL,
  PRIMARY KEY (user_role_id));
