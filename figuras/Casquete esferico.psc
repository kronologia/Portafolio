Algoritmo Casquete_esferico
	Definir X,L,r,h,p Como Real
	X <- 0
	L <- 0
	r <- 0
	h <- 0
	p <- 0
	Escribir 'Programa que calcule area y volumen de casquete esferico'
	Escribir 'Ingrese radio: '
	Leer r
	Escribir 'Ingrese altura: '
	Leer h
	X <- 2*p*r*h
	L <- (h*h*p*(3*r*h))/3
	Escribir 'El �rea del casquete es:',X
	Escribir 'El volumen del casquete es:',L
FinAlgoritmo
