let taskList = [];
let idTaskEdit;
const alertPlaceholder = document.getElementById('alertErrorTask');

function addTask() {
    //capturando la tarea
    let taskValue = document.getElementById('inputTask').value;
    //validando si el input tiene valor
    let taskValue2 = document.getElementById('cellNumber').value;
    //la razon de poner variables diferentes, es por que tu necesitas saber si el 
    //punto donde estas buscando tiene informacion y es coherente es decir lo que necesitas para tu codigo.
  if(taskValue == "" || taskValue == null){
    alert("Ingrese Algun Valor","danger");
    return false;
  }
  if(taskValue2 == "" || taskValue2 == null){
    alert("Ingrese Algun Valor","danger");
    return false;
  }

  let nuevo = {
    nombre: taskValue,
    numero: taskValue2
  }
  taskList.push(nuevo);
  document.getElementById("inputTask").value = ""
  document.getElementById("cellNumber").value = ""
  showTaskList();
  return;

}

function editTask(idTask) {
    document.getElementById('inputEditTask').value = taskList[idTask].nombre;
    document.getElementById('inputEditTask2').value = taskList[idTask].numero;
    idTaskEdit = idTask;
}


function deleteTask(idTask) {
    taskList.splice(idTask,1);
    showTaskList();
}

function saveTaskEdit() {
    taskList[idTaskEdit].nombre = document.getElementById('inputEditTask').value;
    taskList[idTaskEdit].numero = document.getElementById('inputEditTask2').value;
    showTaskList();
}

function backupTask(){
   sessionStorage.setItem('taskList', JSON.stringify(taskList)); 
}

function restoreTask() {
    let taskData = sessionStorage.getItem('taskList');
    if(taskData !== null) {
        taskList = JSON.parse(taskData);
        showTaskList();
        return;
    }
}

function showTaskList() {
    let listTask = '';
    const ulTaskList = document.getElementById('taskList');
    ulTaskList.innerHTML = '';
    const wrapper = document.createElement('div');
    taskList.forEach(function (task, index) {
        listTask += `<div class="list-group-item fs-3">
        <div>${task.nombre}</div>
        ${task.numero}
      <div class="btn-group float-end" role="group" aria-label="Basic outlined example">
        <button onclick="editTask(${index}) (${index})" type="button" class="btn btn-outline-primary" 
        data-bs-toggle="modal" data-bs-target="#editTaskModal">Editar</button>
        <button onclick="deleteTask(${index})" type="button" class="btn btn-outline-danger">Eliminar</button>
      </div>
    </div>`
    });
    wrapper.innerHTML = listTask;
    ulTaskList.append(wrapper);
}

//Funciones externas
const alert = (message, type) => {
    const wrapper = document.createElement('div')
    wrapper.innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button id="closeAlert" type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')

    alertPlaceholder.append(wrapper);
    setTimeout(function () {
        document.getElementById('closeAlert').click();
    }, 1500);
}



function searchTask(){
    let buscar = document.getElementById('inputSearchTask').value
    let posicion = null;
    let encontrado = "";
    taskList.forEach(function(task, index){
    if(task.nombre == buscar){
        encontrado = task;
        posicion= index;
        return;
    }
    });
let listTask = '';
    const ulTaskList = document.getElementById('taskList');
    ulTaskList.innerHTML = '';
    const wrapper = document.createElement('div');
   
        listTask += `<div class="list-group-item fs-3"><div>${encontrado.nombre}</div>
        ${encontrado.numero}
      <div class="btn-group float-end" role="group" aria-label="Basic outlined example">
        <button onclick="editTask(${posicion})" type="button" class="btn btn-outline-primary" 
        data-bs-toggle="modal" data-bs-target="#editTaskModal">Editar</button>
        <button onclick="deleteTask(${posicion})" type="button" class="btn btn-outline-danger">Eliminar</button>
      </div>
    </div>`
   
    wrapper.innerHTML = listTask;
    ulTaskList.append(wrapper);
}

