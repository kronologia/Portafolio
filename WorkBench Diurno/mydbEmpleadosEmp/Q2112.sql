SELECT E.nomEmp, E.appEmp, E.appEmp, D.nomDepto, D.pptoDepto 
FROM Empleados E INNER JOIN Departamentos D
ON E.codDeptoEmp = D.codDepto