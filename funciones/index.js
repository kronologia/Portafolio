
/*funcion sin parametro es decir que no lleva nada dentro del parentesis, por lo tanto se ejecutara
dando el mensaje que pidamos por medio del console.log
*/
function validar() {
    console.log("funcion sin parametros");
    
    let nombre = document.getElementById("nombre").value; 
    if(nombre == null || nombre == ""){
        noHayNombre(nombre);
    } else {
        saludoDefinido();
        saludarProfesor(nombre);
    }
    
    document.getElementById("nombre").value = "";
}
/* esta funcion recibe parametros de entrada, y es llamada en la funcion validar
para crear una conexion entre ambas.
*/
function saludarProfesor(nombre){
    alert(nombre); 
}

/* el valor esta definido es decir es una constante que siempre se ejecutara al ingresar el
parametro solicitado
se puede definir con let o const, pero opte por una const ya que es algo que nunca va a cambiar
*/ 
function saludoDefinido(){
    const saludoDefinido = "Bienvenido profesor: "
    alert(saludoDefinido);
}
/*
es una funcion opcional, que solo se ejecuta bajo una condicion que puede o no suceder.
*/
function noHayNombre(nombre){
    alert("No hay nombre");
}


