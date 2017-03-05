CREATE USER 'dashboard_adm'@'localhost' IDENTIFIED BY 'dashboard_adm_01';
GRANT ALL ON dashboard.* TO 'dashboard_adm'@'localhost';

CREATE SCHEMA dashboard;
