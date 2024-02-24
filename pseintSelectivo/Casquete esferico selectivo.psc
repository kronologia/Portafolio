Algoritmo Casquete_esferico
	Definir X,L,r,h,p Como Real
	X <- 0
	L <- 0
	r <- 0
	h <- 0
	p <- 3.14
	Escribir 'Programa que calcule area y volumen de casquete esferico'
	Escribir 'Ingrese radio: '
	Leer r
	Escribir 'Ingrese altura: '
	Leer h
	si (r>0) y (h<6) Entonces
		X <- 2*p*r*h
		L <- (h*h*p*(3*r*h))/3
		Escribir 'El área del casquete es:',X
		Escribir 'El volumen del casquete es:',L
	SiNo
		Escribir "error, uno de los valores no corresponde"
	FinSi

FinAlgoritmo
