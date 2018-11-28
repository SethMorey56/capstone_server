ALTER TABLE messages ALTER COLUMN created_at SET DEFAULT now();

INSERT INTO users (name, email, password) VALUES
  ('Seth', 'seth@mail.com', 'pass'),
  ('Chelsea', 'chelsea@mail.com', 'word'),
  ('Albert', 'albert@mail.com', 'something'),
  ('Nhan', 'nhan@mail.com', 'something'),
  ('Lauren', 'lauren@mail.com', 'something'),
  ('Elijah', 'elijah@mail.com', 'darkside');

Insert INTO counselors_domain (name, email, password) VALUES
  ('Troy', 'troy@mail.com', 'asdf'),
  ('Todd', 'todd@mail.com', 'asdf'),
  ('Jake', 'jake@mail.com', 'asdf'),
  ('John', 'john@mail.com', 'asdf'),
  ('Ashy', 'matt@mail.com', 'asdf'),
  ('Mimi', 'mimi@mail.com', 'asdf');

INSERT INTO messages (message, counselor_id, user_id) VALUES
  ('this is a seeded message from Java data', 1, 1 );