# Getting Started 

_SQL is structured Query Language that is written interact and manipulate databases. A database a the organizing of data into a structure such as table with rows and columns._ 

# Basic Queries: 

## SELECT:
  -  The most basic query to manipulate a database by selecting specified columns 
  
  ### Syntax: 
  ```
    SELECT column 1, column 2... FORM TABLE;
  ```
  
  ### Example: 
  ```
    SELECT name FROM Student;
  ```

  - To select all columns from a table use * symbol: 

  ```
    SELECT * FROM  Student;
  ```

## WHERE:
  - Retrieves data that meet the requirements of the specified condition.
  ```
    SELECT fname FROM Student WHERE  city='Mexico';
  ```

## LIMIT:
  - Retrieves the specified number of data 

  ```
    SELECT fname, lname FROM Student WHERE grade > 75 LIMIT 5;
  ```

## AND:
  - An operator that displays a record if all the conditions separated by AND are true. 

  ```
    SELECT * FROM Student WHERE fname='John' AND lname='Doe';
  ```
## OR:
  - An operator that displays a record if any the conditions separated by the OR is true.

  ```
    SELECT * FROM Student WHERE fname='John' OR lnam='Doe';
  ```
## NOT: 
  - An operator that displays a record if the condition/conditions  are NOT true.

    ### Syntax: 

    ```
      SELECT column 1, column 2, ... FROM table_name WHERE NOT condition;
    ```

    ### Example: 
  ```
    SELECT * FROM Student WHERE NOT lname='Doe';
  ```
## NOT: 
  - An operator that displays a record if the condition/conditions  are NOT true.

    ### Syntax: 

    ```
      SELECT column 1, column 2, ... FROM table_name WHERE NOT condition;
    ```

    ### Example: 
  ```
    SELECT * FROM Student WHERE NOT lname='Doe';
  ```

# Server Functions (String functions) : 

 - Built-in SQL server functions.

  ## UPPER(): 
   - A function that converts column data to upper-case.

  ### Syntax: 
  ```
    SELECT UPPER(column)
  ```

  ### Example: 
  ```
    SELECT UPPER(fname) FROM Students;
  ```

  This will return a column of all fnames capitalized.

  ## LOWER(): 
   - A function that converts column data to lower-case.

  ### Syntax: 
  ```
    SELECT LOWER(text)
  ```

  ### Example: 
  ```
    SELECT LOWER(fname) FROM Students;
  ```

  This will return a column of all fnames lower cased.

# Set-up