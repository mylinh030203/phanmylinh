
insert into CLASSROOM values ('Packard', '101', '500');
insert into CLASSROOM values ('Painter', '514', '10');
insert into CLASSROOM values ('Taylor', '3128', '70');
insert into CLASSROOM values ('Watson', '100', '30');
insert into CLASSROOM values ('Watson', '120', '50');
insert into DEPARTMENT values ('Biology', 'Watson', '90000');
insert into DEPARTMENT values ('Comp. Sci.', 'Taylor', '100000');
insert into DEPARTMENT values ('Elec. Eng.', 'Taylor', '85000');
insert into DEPARTMENT values ('Finance', 'Painter', '120000');
insert into DEPARTMENT values ('History', 'Painter', '50000');
insert into DEPARTMENT values ('Music', 'Packard', '80000');
insert into DEPARTMENT values ('Physics', 'Watson', '70000');
insert into COURSE values ('BIO-101', 'Intro. to Biology', 'Biology', '4');
insert into COURSE values ('BIO-301', 'Genetics', 'Biology', '4');
insert into COURSE values ('BIO-399', 'Computational Biology', 'Biology', '3');
insert into COURSE values ('CS-101', 'Intro. to Computer Science', 'Comp. Sci.', '4');
insert into COURSE values ('CS-190', 'Game Design', 'Comp. Sci.', '4');
insert into COURSE values ('CS-315', 'Robotics', 'Comp. Sci.', '3');
insert into COURSE values ('CS-319', 'Image Processing', 'Comp. Sci.', '3');
insert into COURSE values ('CS-347', 'Database System Concepts', 'Comp. Sci.', '3');
insert into COURSE values ('EE-181', 'Intro. to Digital Systems', 'Elec. Eng.', '3');
insert into COURSE values ('FIN-201', 'Investment Banking', 'Finance', '3');
insert into COURSE values ('HIS-351', 'World History', 'History', '3');
insert into COURSE values ('MU-199', 'Music Video Production', 'Music', '3');
insert into COURSE values ('PHY-101', 'Physical Principles', 'Physics', '4');
insert into INSTRUCTOR values ('10101', 'Srinivasan', 'Comp. Sci.', '65000');
insert into INSTRUCTOR values ('12121', 'Wu', 'Finance', '90000');
insert into INSTRUCTOR values ('15151', 'Mozart', 'Music', '40000');
insert into INSTRUCTOR values ('22222', 'Einstein', 'Physics', '95000');
insert into INSTRUCTOR values ('32343', 'El Said', 'History', '60000');
insert into INSTRUCTOR values ('33456', 'Gold', 'Physics', '87000');
insert into INSTRUCTOR values ('45565', 'Katz', 'Comp. Sci.', '75000');
insert into INSTRUCTOR values ('58583', 'Califieri', 'History', '62000');
insert into INSTRUCTOR values ('76543', 'Singh', 'Finance', '80000');
insert into INSTRUCTOR values ('76766', 'Crick', 'Biology', '72000');
insert into INSTRUCTOR values ('83821', 'Brandt', 'Comp. Sci.', '92000');
insert into INSTRUCTOR values ('98345', 'Kim', 'Elec. Eng.', '80000');
insert into SECTION values ('BIO-101', '1', 'Summer', '2017', 'Painter', '514', 'B');
insert into SECTION values ('BIO-301', '1', 'Summer', '2018', 'Painter', '514', 'A');
insert into SECTION values ('CS-101', '1', 'Fall', '2017', 'Packard', '101', 'H');
insert into SECTION values ('CS-101', '1', 'Spring', '2018', 'Packard', '101', 'F');
insert into SECTION values ('CS-190', '1', 'Spring', '2017', 'Taylor', '3128', 'E');
insert into SECTION values ('CS-190', '2', 'Spring', '2017', 'Taylor', '3128', 'A');
insert into SECTION values ('CS-315', '1', 'Spring', '2018', 'Watson', '120', 'D');
insert into SECTION values ('CS-319', '1', 'Spring', '2018', 'Watson', '100', 'B');
insert into SECTION values ('CS-319', '2', 'Spring', '2018', 'Taylor', '3128', 'C');
insert into SECTION values ('CS-347', '1', 'Fall', '2017', 'Taylor', '3128', 'A');
insert into SECTION values ('EE-181', '1', 'Spring', '2017', 'Taylor', '3128', 'C');
insert into SECTION values ('FIN-201', '1', 'Spring', '2018', 'Packard', '101', 'B');
insert into SECTION values ('HIS-351', '1', 'Spring', '2018', 'Painter', '514', 'C');
insert into SECTION values ('MU-199', '1', 'Spring', '2018', 'Packard', '101', 'D');
insert into SECTION values ('PHY-101', '1', 'Fall', '2017', 'Watson', '100', 'A');
insert into TEACHES values ('10101', 'CS-101', '1', 'Fall', '2017');
insert into TEACHES values ('10101', 'CS-315', '1', 'Spring', '2018');
insert into TEACHES values ('10101', 'CS-347', '1', 'Fall', '2017');
insert into TEACHES values ('12121', 'FIN-201', '1', 'Spring', '2018');
insert into TEACHES values ('15151', 'MU-199', '1', 'Spring', '2018');
insert into TEACHES values ('22222', 'PHY-101', '1', 'Fall', '2017');
insert into TEACHES values ('32343', 'HIS-351', '1', 'Spring', '2018');
insert into TEACHES values ('45565', 'CS-101', '1', 'Spring', '2018');
insert into TEACHES values ('45565', 'CS-319', '1', 'Spring', '2018');
insert into TEACHES values ('76766', 'BIO-101', '1', 'Summer', '2017');
insert into TEACHES values ('76766', 'BIO-301', '1', 'Summer', '2018');
insert into TEACHES values ('83821', 'CS-190', '1', 'Spring', '2017');
insert into TEACHES values ('83821', 'CS-190', '2', 'Spring', '2017');
insert into TEACHES values ('83821', 'CS-319', '2', 'Spring', '2018');
insert into TEACHES values ('98345', 'EE-181', '1', 'Spring', '2017');
insert into STUDENT values ('00128', 'Zhang', 'Comp. Sci.', '102');
insert into STUDENT values ('12345', 'Shankar', 'Comp. Sci.', '32');
insert into STUDENT values ('19991', 'Brandt', 'History', '80');
insert into STUDENT values ('23121', 'Chavez', 'Finance', '110');
insert into STUDENT values ('44553', 'Peltier', 'Physics', '56');
insert into STUDENT values ('45678', 'Levy', 'Physics', '46');
insert into STUDENT values ('54321', 'Williams', 'Comp. Sci.', '54');
insert into STUDENT values ('55739', 'Sanchez', 'Music', '38');
insert into STUDENT values ('70557', 'Snow', 'Physics', '0');
insert into STUDENT values ('76543', 'Brown', 'Comp. Sci.', '58');
insert into STUDENT values ('76653', 'Aoi', 'Elec. Eng.', '60');
insert into STUDENT values ('98765', 'Bourikas', 'Elec. Eng.', '98');
insert into STUDENT values ('98988', 'Tanaka', 'Biology', '120');
insert into TAKES values ('00128', 'CS-101', '1', 'Fall', '2017', 'A');
insert into TAKES values ('00128', 'CS-347', '1', 'Fall', '2017', 'A-');
insert into TAKES values ('12345', 'CS-101', '1', 'Fall', '2017', 'C');
insert into TAKES values ('12345', 'CS-190', '2', 'Spring', '2017', 'A');
insert into TAKES values ('12345', 'CS-315', '1', 'Spring', '2018', 'A');
insert into TAKES values ('12345', 'CS-347', '1', 'Fall', '2017', 'A');
insert into TAKES values ('19991', 'HIS-351', '1', 'Spring', '2018', 'B');
insert into TAKES values ('23121', 'FIN-201', '1', 'Spring', '2018', 'C+');
insert into TAKES values ('44553', 'PHY-101', '1', 'Fall', '2017', 'B-');
insert into TAKES values ('45678', 'CS-101', '1', 'Fall', '2017', 'F');
insert into TAKES values ('45678', 'CS-101', '1', 'Spring', '2018', 'B+');
insert into TAKES values ('45678', 'CS-319', '1', 'Spring', '2018', 'B');
insert into TAKES values ('54321', 'CS-101', '1', 'Fall', '2017', 'A-');
insert into TAKES values ('54321', 'CS-190', '2', 'Spring', '2017', 'B+');
insert into TAKES values ('55739', 'MU-199', '1', 'Spring', '2018', 'A-');
insert into TAKES values ('76543', 'CS-101', '1', 'Fall', '2017', 'A');
insert into takes values ('76543', 'CS-319', '2', 'Spring', '2018', 'A');
insert into TAKES values ('76653', 'EE-181', '1', 'Spring', '2017', 'C');
insert into TAKES values ('98765', 'CS-101', '1', 'Fall', '2017', 'C-');
insert into TAKES values ('98765', 'CS-315', '1', 'Spring', '2018', 'B');
insert into TAKES values ('98988', 'BIO-101', '1', 'Summer', '2017', 'A');
insert into TAKES values ('98988', 'BIO-301', '1', 'Summer', '2018', null);
insert into ADVISOR values ('00128', '45565');
insert into ADVISOR values ('12345', '10101');
insert into ADVISOR values ('23121', '76543');
insert into ADVISOR values ('44553', '22222');
insert into ADVISOR values ('45678', '22222');
insert into ADVISOR values ('76543', '45565');
insert into ADVISOR values ('76653', '98345');
insert into ADVISOR values ('98765', '98345');
insert into ADVISOR values ('98988', '76766');
insert into TIMESLOT values ('A', 'M', '8:00', '8:50');
insert into TIMESLOT values ('A', 'W', '8:00', '8:50');
insert into TIMESLOT values ('A', 'F', '8:00', '8:50');
insert into TIMESLOT values ('B', 'M', '9:00', '9:50');
insert into TIMESLOT values ('B', 'W', '9:00', '9:50');
insert into TIMESLOT values ('B', 'F', '9:00', '9:50');
insert into TIMESLOT values ('C', 'M', '11:00', '11:50');
insert into TIMESLOT values ('C', 'W', '11:00', '11:50');
insert into TIMESLOT values ('C', 'F', '11:00', '11:50');
insert into TIMESLOT values ('D', 'M', '13:00', '13:50');
insert into TIMESLOT values ('D', 'W', '13:00', '13:50');
insert into TIMESLOT values ('D', 'F', '13:00', '13:50');
insert into TIMESLOT values ('E', 'T', '10:30', '11:45 ');
insert into TIMESLOT values ('E', 'R', '10:30', '11:45 ');
insert into TIMESLOT values ('F', 'T', '14:30', '15:45 ');
insert into TIMESLOT values ('F', 'R', '14:30', '15:45 ');
insert into TIMESLOT values ('G', 'M', '16:00', '16:50');
insert into TIMESLOT values ('G', 'W', '16:00', '16:50');
insert into TIMESLOT values ('G', 'F', '16:00', '16:50');
insert into TIMESLOT values ('H', 'W', '10:00', '12:30');
insert into PREREQ values ('BIO-301', 'BIO-101');
insert into PREREQ values ('BIO-399', 'BIO-101');
insert into PREREQ values ('CS-190', 'CS-101');
insert into PREREQ values ('CS-315', 'CS-101');
insert into PREREQ values ('CS-319', 'CS-101');
insert into PREREQ values ('CS-347', 'CS-101');
insert into PREREQ values ('EE-181', 'PHY-101');
