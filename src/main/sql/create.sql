# drop table survey;

CREATE TABLE survey (
    id INT PRIMARY KEY auto_increment,
    staffid varchar(20),
    surveyid varchar(20),
    city varchar(20)
);

INSERT INTO survey (staffid, surveyid, city) VALUES ('45034377', '101', 'GuangZhou');
