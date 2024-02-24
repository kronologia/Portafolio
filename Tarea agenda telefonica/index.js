let taskList = [];
let idTaskEdit;
const alertPlaceholder = document.getElementById('alertErrorTask');

function addTask() {
    //capturando la tarea
    let taskValue = document.getElementById('inputTask').value;
    //validando si el input tiene valor
    if (taskValue !== '') {
        //agregando la tarea capturada a la lista global
        taskList.push(taskValue);
        //limpiando el input
        document.getElementById('inputTask').value = '';

        showTaskList();
        return;
    }

    alert('Ingrese algun valor', 'danger');
}

function editTask(idTask) {
    document.getElementById('inputEditTask').value = taskList[idTask];
    idTaskEdit = idTask;
}

function deleteTask(idTask) {
    taskList.splice(idTask,1);
    showTaskList();
}

function saveTaskEdit() {
    taskList[idTaskEdit] = document.getElementById('inputEditTask').value;
    showTaskList();
}

function backupTask(){
   sessionStorage.setItem('taskList', taskList); 
}

function restoreTask() {
    let taskData = sessionStorage.getItem('taskList');
    if(taskData !== "") {
        taskList = taskData.split(',');
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
        listTask += `<div class="list-group-item fs-3">${task}
      <div class="btn-group float-end" role="group" aria-label="Basic outlined example">
        <button onclick="editTask(${index})" type="button" class="btn btn-outline-primary" 
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

const contacto = {
    Nombre:"",
    Numero:""  
 
}

function register(){
    

}