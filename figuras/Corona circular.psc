Algoritmo Corona_circular
	Definir X,Lmayor,Lmenor,rmayor,rmenor,p Como Real
	X <- 0
	Lmayor <- 0
	Lmenor <- 0
	rmayor <- 0
	rmenor <- 0
	p <- 3.14
	Escribir 'Programa que calcule área, perímetro mayor y perimetro menor de una corona circular'
	Escribir 'Ingrese radio mayor: '
	Leer rmayor
	Escribir 'Ingrese radio menor: '
	Leer rmenor
	X <- p*((rmayor*rmayor)-(rmenor*rmenor))
	Lmayor <- 2*p*rmayor
	Lmenor <- 2*p*rmenor
	Escribir 'El área de la corona circular es:',X
	Escribir 'El perimetro mayor de la corona circular es:',Lmayor
	Escribir 'El perimetro menor de la corona circular es:',Lmenor
FinAlgoritmo
