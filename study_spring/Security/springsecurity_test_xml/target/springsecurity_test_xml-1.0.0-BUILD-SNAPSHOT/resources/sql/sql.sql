CREATE TABLE users(
                      username varchar(50) NOT NULL PRIMARY KEY,
                      password varchar(50) NOT NULL,
                      enabled char(1) DEFAULT '1'
);

CREATE TABLE authorities(
                            username varchar(50) NOT NULL,
                            authority varchar(50)NOT NULL,
                            CONSTRAINT fk_authorities_users FOREIGN KEY(username)REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username ON authorities (username, authority);

INSERT INTO users (username, password)values('user00', 'pw00');
INSERT INTO users (username, password)values('member00', 'pw00');
INSERT INTO users (username, password)values('admin00', 'pw00');

INSERT INTO authorities (username, authority)values('user00', 'ROLE_USER');
INSERT INTO authorities (username, authority)values('member00', 'ROLE_MANAGER');
INSERT INTO authorities (username, authority)values('admin00', 'ROLE_MANAGER');
INSERT INTO authorities (username, authority)values('admin00', 'ROLE_ADMIN');

SELECT * FROM users;

SELECT * FROM authorities;