CREATE DATABASE 'helpdesk'


CREATE TABLE `user` (
  
	`uid` varchar(10) NOT NULL,
  
	`firstName` varchar(50) DEFAULT NULL,
  
	`lastName` varchar(50) DEFAULT NULL,
  
	`password` varchar(10) DEFAULT NULL,
  
	`gender` varchar(45) DEFAULT NULL,
  
	`email` varchar(30) DEFAULT NULL,
  
	`hometown` varchar(30) DEFAULT NULL,
  
	`type` varchar(45) DEFAULT NULL,
  
	PRIMARY KEY (`uid`)

)ENGINE=InnoDB DEFAULT CHARSET=latin1

INSERT INTO user VALUES('U1003','Malaka','Silva','123456','Male','malaka@gmail.com','Minuwangoda','User');

INSERT INTO user VALUES('U1004','Chathura','Perera','123456','Male','Chathura@gmail.com','Thalawathugoda','User');

INSERT INTO user VALUES('Admin','Malaka','Silva','password','Male','admin@medc.com','Minuwangoda','Admin');

INSERT INTO user VALUES('T1003','Rashintha','Marasinghe','123456','Male','rashintha@gmail.com','Wattala','Tech');

INSERT INTO user VALUES('U1005','Pasan','Godamune','123456','Male','pasan@gmail.com','Malabe','User');




SELECT * FROM user






CREATE TABLE `query` (
  
	`qid` varchar(30) NOT NULL,
  
	`uid` varchar(30) NOT NULL,
  
	`query` varchar(255) NOT NULL,
  
	PRIMARY KEY (`qid`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1

INSERT INTO query VALUES('Q1003','U1003','When will I be able to channel Dr. M.D. Silva?');

INSERT INTO query VALUES('Q1004','U1003','How could I reset my password?');

INSERT INTO query VALUES('Q1005','U1004','I would like to know that If Dr. J.D. Perera will be available tomorrow');

INSERT INTO query VALUES('Q1006','U1005','I want to deactivate my account. How could I do it?');

INSERT INTO query VALUES('Q1007','U1005','How could I channel a Dr. using hospital website?');

SELECT * FROM query;

CREATE TABLE `solutions` (
  
	`sid` varchar(30) NOT NULL,
  
	`qid` varchar(30) NOT NULL,
  
	`techid` varchar(30) NOT NULL,
  
	`solution` varchar(255) NOT NULL,
  
	PRIMARY KEY (`qid`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1

insert into solutions values('S1003','Q1003','T1003','Dr. M.D. Silva will be available after 22nd Tuesday');

insert into solutions values('S1004','Q1004','T1003','Resetting a password can only be done by the administrator. We will help you to reset the password');

insert into solutions values('S1005','Q1005','T1003','Yes.He will be available tomorrow');

insert into solutions values('S1006','Q1006','T1003','Kindly check your view profile and you will see the deactivation link');

insert into solutions values('S1007','Q1007','T1003','When you click name of the Dr you will see the channel link');

select * from solutions;




CREATE TABLE `notice` (
  
	`nid` varchar(30) NOT NULL,
  
	`notice` varchar(255) NOT NULL,
  
	PRIMARY KEY (`nid`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1

insert into notice values('N1003','Surgeon Dr. M.J. Gunaratne will not be available for the next 3 weeks');

insert into notice values('N1004','Since Account passwords has been resetted, Users will have to set new passwords to their accounts');

insert into notice values('N1005','Dr. W.D.Amaraweera will not be available for 13th Saturday, Patients who channeled him, Please be noticed');
insert into notice values('N1006','Hospital web site will be unavailable for tomorrow due to maintenance');
 