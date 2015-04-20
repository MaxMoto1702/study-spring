IF OBJECT_ID('COMMENTS', 'U') IS NOT NULL
  DROP TABLE COMMENTS;
IF OBJECT_ID('PICTURES', 'U') IS NOT NULL
  DROP TABLE PICTURES;
IF OBJECT_ID('CLIENTS', 'U') IS NOT NULL
  DROP TABLE CLIENTS;

CREATE TABLE CLIENTS
(
  ID        INT         NOT NULL PRIMARY KEY IDENTITY,
  FULL_NAME VARCHAR(60) NOT NULL,
  EMAIL     VARCHAR(60) NOT NULL,
  PHONE     VARCHAR(20) NOT NULL
);

CREATE TABLE PICTURES
(
  ID          INT          NOT NULL PRIMARY KEY IDENTITY,
  NAME        VARCHAR(60)  NOT NULL,
  DESCRIPTION VARCHAR(160) NOT NULL,
  CREATE_DATE DATE         NOT NULL DEFAULT GETDATE(),
  EDIT_DATE   DATE         NOT NULL DEFAULT GETDATE(),
  THUMB_PATH  VARCHAR(60)  NOT NULL,
  FILE_PATH   VARCHAR(60)  NOT NULL
);

CREATE TABLE COMMENTS
(
  ID          INT          NOT NULL PRIMARY KEY IDENTITY,
  PICTURE_ID  INT          NOT NULL,
  TEXT        VARCHAR(160) NOT NULL,
  CREATE_DATE DATE         NOT NULL DEFAULT GETDATE(),
  EDIT_DATE   DATE         NOT NULL DEFAULT GETDATE(),
  CLIENT_ID   INT          NOT NULL,
  CONSTRAINT FK_COMMETN_PICTURE FOREIGN KEY (PICTURE_ID) REFERENCES PICTURES (ID),
  CONSTRAINT FK_COMMETN_CLIENT FOREIGN KEY (CLIENT_ID) REFERENCES CLIENTS (ID)
);

INSERT INTO PICTURES (NAME, DESCRIPTION, CREATE_DATE, EDIT_DATE, THUMB_PATH, FILE_PATH) VALUES
  ('Picture 1', 'Picture for develop', '2015-04-15', '2015-04-17', '/resources/images/thumbs/00000.jpg',
   '/resources/images/00000.jpg'),
  ('Picture 2', 'Picture for develop', '2015-04-16', '2015-04-16', '/resources/images/thumbs/00001.jpg',
   '/resources/images/00001.jpg'),
  ('Picture 3', 'Picture for develop', '2015-04-17', '2015-04-18', '/resources/images/thumbs/00002.jpg',
   '/resources/images/00002.jpg'),
  ('Picture 4', 'Picture for develop', '2015-04-18', '2015-04-20', '/resources/images/thumbs/00003.jpg',
   '/resources/images/00003.jpg'),
  ('Picture 4', 'Picture for develop', '2015-04-19', '2015-04-19', '/resources/images/thumbs/00004.jpg',
   '/resources/images/00004.jpg');

INSERT INTO CLIENTS (FULL_NAME, EMAIL, PHONE) VALUES
  ('Client 1', 'email1@mail.ru', ''),
  ('Client 2', 'email2@mail.ru', ''),
  ('Client 3', 'email3@mail.ru', ''),
  ('Client 4', 'email4@mail.ru', ''),
  ('Client 5', 'email5@mail.ru', '1234567890');

INSERT INTO COMMENTS (PICTURE_ID, TEXT, CREATE_DATE, EDIT_DATE, CLIENT_ID) VALUES
  (4, 'Simple comment', '2015-04-19', '2015-04-20', 1),
  (4, 'Simple comment', '2015-04-19', '2015-04-20', 2),
  (1, 'Simple comment', '2015-04-19', '2015-04-20', 5),
  (3, 'Simple comment', '2015-04-19', '2015-04-20', 3),
  (2, 'Simple comment', '2015-04-19', '2015-04-20', 4);

-- SELECT *
-- FROM PICTURES;
-- SELECT *
-- FROM CLIENTS;
-- SELECT *
-- FROM COMMENTS;
-- SELECT *
-- FROM PICTURES
--   LEFT JOIN COMMENTS ON PICTURES.ID = COMMENTS.PICTURE_ID
--   LEFT JOIN CLIENTS ON CLIENTS.ID = COMMENTS.CLIENT_ID;
