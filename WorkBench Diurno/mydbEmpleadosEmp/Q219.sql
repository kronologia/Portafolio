DELETE FROM Empleados
WHERE codDeptoEmp IN
(
SELECT codDepto FROM Departamentos
WHERE pptoDepto >= 600000
)