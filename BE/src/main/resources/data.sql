INSERT INTO USER (USER_ID, PRINCIPAL, CREDENTIAL, NAME) VALUES (1, 'admin@b105.io', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', '동동스');

INSERT INTO AUTHORITY (AUTHORITY_ID,AUTHORITY_NAME) values (1,'ROLE_ADMIN');
INSERT INTO AUTHORITY (AUTHORITY_ID,AUTHORITY_NAME) values (2,'ROLE_SHELTER');
INSERT INTO AUTHORITY (AUTHORITY_ID,AUTHORITY_NAME) values (3,'ROLE_SUPPORTER');

INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) values (1, 1);
