# drop table  if exists survey ;

CREATE TABLE survey (
    id INT PRIMARY KEY auto_increment,
    staff_id varchar(20),
    survey_id varchar(20),
    city varchar(20)
);

INSERT INTO survey (staff_id, survey_id, city) VALUES ('45034377', '101', 'GuangZhou');
