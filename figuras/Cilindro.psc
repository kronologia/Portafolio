Algoritmo Cilindro
	Definir X,L,r,h,p Como Real
	X <- 0
	L <- 0
	r <- 0
	h <- 0
	p <- 3.14
	Escribir 'Programa que calcule area y volumen de un cilindro'
	Escribir 'Ingrese radio de la base: '
	Leer r
	Escribir 'Ingrese altura: '
	Leer h
	X <- 2*p*r*(h+r)
	L <- p*r*r*h
	Escribir 'El área del cilindro es:',X
	Escribir 'El volumen del cilindro es:',L
FinAlgoritmo
