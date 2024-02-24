Algoritmo Cono
	Definir X,L,r,g,h,p Como Real
	X <- 0
	L <- 0
	r <- 0
	g <- 0
	h <- 0
	p <- 0
	p <- 3.14
	Escribir 'Programa que calcule área y volumen de un cono'
	Escribir 'Ingrese radio de la base: '
	Leer r
	Escribir 'Ingrese altura: '
	Leer h
	Escribir 'Ingrese altura inclinada: '
	Leer g
	X <- p*r*(g+r)
	L <- (p*r*r*h)/3
	Escribir 'El área del cono es:',X
	Escribir 'El volumen del ocno es:',L
FinAlgoritmo
