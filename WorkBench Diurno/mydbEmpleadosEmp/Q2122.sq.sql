SELECT nomEmp, appEmp, apmEmp FROM Empleados
WHERE codDeptoEmp IN
(SELECT codDepto FROM Departamentos WHERE pptoDepto > 60000)
