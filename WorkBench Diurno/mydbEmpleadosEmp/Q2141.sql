SELECT nomDepto FROM Departamentos
WHERE codDepto IN
(
SELECT codDeptoEmp
FROM Empleados
GROUP BY codDeptoEmp
HAVING COUNT(*) > 2
)
