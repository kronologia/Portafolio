SELECT Empleados.nomEmp, Empleados.appEmp, Empleados.apmEmp
FROM Empleados INNER JOIN Departamentos
ON Empleados.codDeptoEmp = Departamentos.codDepto
AND Departamentos.pptoDepto > 600000