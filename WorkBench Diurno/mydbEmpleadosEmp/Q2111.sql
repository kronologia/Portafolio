SELECT Empleados.nomEmp, Empleados.appEmp, Empleados.appEmp, Departamentos.nomDepto, 
Departamentos.pptoDepto
FROM Empleados INNER JOIN Departamentos
ON Empleados.codDeptoEmp = Departamentos.codDepto