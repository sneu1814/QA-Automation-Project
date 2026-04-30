-- View all users
SELECT * FROM users;

-- Check active users
SELECT * FROM users WHERE status = 'active';

-- Count total users
SELECT COUNT(*) FROM users;

-- Find specific user
SELECT * FROM users WHERE name = 'Simran';

-- Check missing emails
SELECT * FROM users WHERE email IS NULL;