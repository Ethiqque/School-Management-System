REVOKE ALL PRIVILEGES ON DATABASE school FROM school_user;

DROP USER IF EXISTS school_user;
CREATE USER school_user WITH PASSWORD '1234';
