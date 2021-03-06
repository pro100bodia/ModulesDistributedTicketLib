INSERT INTO user (username, password, first_name, last_name, email, role) VALUES
  ('serhiilytka', '$2a$04$sBdQjNR9AlTv1XG32g.0LO8Zfoq9QDhA02vKn07AMvRZsdzU.gJgq', 'Serhii', 'Lytka', 'serhii@gmail.com', 'ROLE_ADMIN'),
  ('marypublic', '$2a$04$8km1JN9lPh4C3jn.lsAZiuIq.8xK4QZAWrzSZpZo6TpV7c4gi5Fyu', 'Mary', 'Public', 'mary@gmail.com', 'ROLE_CASHIER'),
  ('johndou', '$2a$04$8km1JN9lPh4C3jn.lsAZiuIq.8xK4QZAWrzSZpZo6TpV7c4gi5Fyu', 'John', 'Dou', 'john@gmail.com', 'ROLE_USER'),
  ('bohdanpukhalskyi', '$2a$04$sBdQjNR9AlTv1XG32g.0LO8Zfoq9QDhA02vKn07AMvRZsdzU.gJgq', 'Bohdan', 'Pukhalskyi', 'bohdan@gmail.com', 'ROLE_ADMIN'),
  ('becherovka', '$2a$04$8km1JN9lPh4C3jn.lsAZiuIq.8xK4QZAWrzSZpZo6TpV7c4gi5Fyu', 'Joan', 'Becher', 'becherovka@gmail.com', 'ROLE_CASHIER'),
  ('heidy', '$2a$04$8km1JN9lPh4C3jn.lsAZiuIq.8xK4QZAWrzSZpZo6TpV7c4gi5Fyu', 'Heidemarie', 'Stefanyshyn-Piper', 'heidy@gmail.com', 'ROLE_USER');


INSERT INTO ticket (title, description, created_at) VALUES
  ('title1', 'description for title1', '2019-09-11 12:00:00'),
  ('title2', 'description for title2', '2019-09-11 12:30:00'),
  ('title3', 'description for title3', '2019-09-11 13:00:00'),
  ('title4', 'description for title4', '2019-09-11 13:30:00');

INSERT INTO ticket_user (user_id, ticket_id) VALUES
  (1, 1),
  (1, 2),
  (2, 3),
  (3, 4);
