SELECT *
FROM Departamentos
WHERE pptoDepto >
(
SELECT AVG(pptoDepto)
FROM Departamentos
)