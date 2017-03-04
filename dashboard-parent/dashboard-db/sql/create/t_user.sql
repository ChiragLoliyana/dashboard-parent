CREATE TABLE 'dashboard'.'t_user' (
  'user_id' VARCHAR(10) NOT NULL,
  'password' VARCHAR(20) NOT NULL,
  'first_name' VARCHAR(50) NOT NULL,
  'last_name' VARCHAR(50) NOT NULL,
  'email' VARCHAR(50) NULL,
  'phone' VARCHAR(50) NULL,
  'created_date' DATETIME NOT NULL,
  'created_origin' VARCHAR(50) NOT NULL,
  'updated_date' DATETIME NOT NULL,
  'updated_origin' VARCHAR(50) NOT NULL,
  PRIMARY KEY ('user_id'));
