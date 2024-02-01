# School Management System

## Description

This is an application for managing a school system, including functionality for working with groups, courses, students, and student assignments to courses.

## Installation and Setup Instructions

### Database Preparation

Before running the application, you need to create a database and a user.

#### Creating a User and a Database

Open your terminal and execute the following commands:

1. **Create a user:**
   ```shell
   psql -U postgres -c "CREATE USER school_user WITH PASSWORD '1234';"

2. **Create a database:**
   ```shell
   psql -U postgres -c "CREATE DATABASE school;"


3. **Assign privileges to the user:**
   ```shell
   psql -U postgres -c "GRANT ALL PRIVILEGES ON DATABASE school TO school_user;"


4. **Create create_tables.sql file:**
   ```shell
   psql -U school_user -d school -a -f path/to/sql/create_tables.sql
   
