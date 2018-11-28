ALTER TABLE messages ALTER COLUMN created_at SET DEFAULT now();

INSERT INTO users (name, email, password) VALUES
  ('Seth', 'seth@mail.com', 'pass'),
  ('Chelsea', 'chelsea@mail.com', 'word'),
  ('Albert', 'albert@mail.com', 'something'),
  ('Nhan', 'nhan@mail.com', 'something'),
  ('Lauren', 'lauren@mail.com', 'something'),
  ('Elijah', 'elijah@mail.com', 'darkside');

Insert INTO counselors_domain (name, email, password, about, img) VALUES
  ('Troy', 'troy@mail.com', 'asdf', 'This is seeded from Java, this is a dope and profound about section. <doge>', 'https://avatars3.githubusercontent.com/u/20520404?s=460&v=4'),
  ('Todd', 'todd@mail.com', 'asdf', 'about', 'http://www.thatentertains.com/wp-content/uploads/2018/01/female-place-holder-profile-image.jpg'),
  ('Jake', 'jake@mail.com', 'asdf', 'about', 'http://www.thatentertains.com/wp-content/uploads/2018/01/female-place-holder-profile-image.jpg'),
  ('John', 'john@mail.com', 'asdf', 'about', 'http://www.thatentertains.com/wp-content/uploads/2018/01/female-place-holder-profile-image.jpg'),
  ('Ashy', 'matt@mail.com', 'asdf', 'about', 'http://www.thatentertains.com/wp-content/uploads/2018/01/female-place-holder-profile-image.jpg'),
  ('Mimi', 'mimi@mail.com', 'asdf', 'about', 'http://www.thatentertains.com/wp-content/uploads/2018/01/female-place-holder-profile-image.jpg');

INSERT INTO messages (message, counselor_id, user_id) VALUES
  ('this is a seeded message from Java data', 1, 1 );

INSERT INTO intake (email, name, phone, question_one, question_two, question_three) VALUES
  ('troy@mail.com', 'Troy', '(602)-432-5618', 'This is a seeded demo answer', 'as well as this', 'and also this');