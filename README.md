# Description

- Student Registration System is application primarily used to get the details of Students in the University. Certain functionally is added like Enrollment of student, Check prerequisites of students etc.
- Student Registration System will speed up the process to validate the prerequisites, to check the eligibility of the student to enroll in particular class.
- This application is implemented using Oracle, JDBC and Java Jframe to access the student database, perform certain operations with interactive and appealing GUI.

# Features 

- Login page, to authenticate the user.
- Display tables on selection with drop down list.
- Search TAs with valid Class id and display TA’s B#, first name and last name. Messages are shown if class-id is invalid or the class entered has no TA.
- Search Prerequisites of Course with dept code and course# as an input from user. Also, messages are displayed if any of the input parameter is invalid.
- Enroll a student into a class with valid B# of the student and the class-id of the class as an input parameter. Messages are displayed if any of the input parameter is invalid.
- Drop a student from Enrollment with the class-id and B# of student as an input.
- Delete a student from the Students table based on the given B# as an input.


# Student_Registration_System


![login1](https://user-images.githubusercontent.com/45721523/59523034-319f2100-8e9e-11e9-9fff-bc41d1e89e8a.PNG)


# **Dashboard for Student_Registration_System** 


![menu](https://user-images.githubusercontent.com/45721523/59523082-5d220b80-8e9e-11e9-973c-8865bb5f1768.PNG)


## Requirements

- Oracle Database.
- Java 1.8/JDBC.
- NetBeans 8.2 or Eclipse(Oxygen).
- External Jars

  - ojdbc5.jar
  - rs2xml.jar
 - VPN (Optional)
 

## Data Definition

- Following Tables will be used in system. They are self-explanatory given some knowledge of Oracle SQL.

  - Students (B#, first_name, last_name, status, gpa, email, bdate, deptname)
  - Tas (B#, ta_level, office )
  - Courses (dept_code, course#, title)
  - Classes (classid, dept_code, course#, sect#, year, semester, limit, class_size, room, TA_B#)
  - Enrollments (B#, classid, lgrade)
  - Prerequisites (dept_code, course#, pre_dept_code, pre_course#)
  - Logs(log#, op_name, op_time, table_name, operation, key_value)
  
        
