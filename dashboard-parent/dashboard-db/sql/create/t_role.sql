CREATE TABLE dashboard.t_role (
  role_id INT(10) NOT NULL,
  role_desc VARCHAR(50) NOT NULL,
  created_date DATETIME NOT NULL,
  created_origin VARCHAR(10) NOT NULL,
  updated_date DATETIME NOT NULL,
  updated_origin VARCHAR(10) NOT NULL,
  PRIMARY KEY (role_id));
