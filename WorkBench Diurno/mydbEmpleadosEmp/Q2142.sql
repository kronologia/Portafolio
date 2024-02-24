SELECT Departamentos.nomDepto
FROM Empleados INNER JOIN Departamentos
ON codDeptoEmp = codDepto
GROUP BY Departamentos.nomDepto
HAVING COUNT(*) > 2