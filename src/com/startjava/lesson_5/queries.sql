SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status = 'worker';
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-2';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers ORDER BY launch ASC LIMIT 1;
SELECT * FROM Jaegers ORDER BY kaijuKill DESC LIMIT 1;
SELECT AVG (CAST (weight AS int)) FROM Jaegers;
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'worker';
DELETE FROM Jaegers WHERE status = 'destroyed';
SELECT * FROM Jaegers;