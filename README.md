# MyTasks


### Technologies Used

![JAVA Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL Badge](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Netbeans Badge](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)
![Linux Badge](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)


## MyTasks - Your tasks in one place!

Application developed for studying purposes, written in pure JAVA, using the MySQL database and Apache NetBeans IDE.

It is a project and task management application that allows the creation of projects and the association of tasks to them.



### Main Screen
![image](https://user-images.githubusercontent.com/12122794/223899027-c3e2201e-b0a2-4f1b-90b4-0827ff8b3c06.png)

![image](https://user-images.githubusercontent.com/12122794/223898019-43bd99aa-09ef-4035-a481-f4cf3537b8bc.png)

Deadline validation (red late, yellow on day and green deadline)

### Project Registration (with field validation)
![image](https://user-images.githubusercontent.com/12122794/223898243-a31ec7bc-0ab9-4e3f-8ae3-660b786a78df.png)

### Task registration (with field validation)
![image](https://user-images.githubusercontent.com/12122794/223898403-a9e7ff10-8784-4863-9fb1-372e97f52250.png)

### Importing the database

To import an SQL file into a MySQL database, you can use the mysql command-line utility. The following command shows how to import an SQL file to a MySQL database:


```JAVA
mysql -u <username> -p <database name> < <path to import file>
```

Where:

<username> is the MySQL user name that has permission to access the database.
<password> is the MySQL user's password.
<database name> is the name of the database that you want to import the SQL file into.
<path to import file> is the full path to the SQL file that you want to import.
You can run this command in a command prompt or terminal to import the SQL file.

Alternatively, if you are using a graphical interface to manage the database, such as MySQL Workbench, you can import the SQL file using the "Database" -> "Data Import" -> "Import from Self-Contained File" menu option. In this option, you can choose the SQL file you want to import and configure the necessary options before running the import.

Use the database-file.sql file for import
