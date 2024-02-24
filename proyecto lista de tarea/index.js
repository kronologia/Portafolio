let tasklist = [];
let idTaskEdit; 
const alertPlaceholder = document.getElementById('alertErrorTask');


function addTask() {//capturando la tarea

    let TaskValue = document.getElementById('inputTask').value;//se utiliza para agregar un valor o sting al input o lista de tareas
    if (TaskValue !== '') { //validando si el input tiene un valor
        tasklist.push(TaskValue);//para agregar contenido al array list vacia y a la vez empujar hacia abajo la lista de tareas
        document.getElementById('inputTask').value = '';//para limpiar a la vez que se agrega algo al array del input
        showTaskList();
        return;
    }
    alert('ingrese algun valor', 'danger');
}

function showTaskList() {
    let listTask = "";
    const ulTaskList = document.getElementById('TaskList');
    ulTaskList.innerHTML = "";
    const wrapper = document.createElement('li')
    tasklist.forEach(function (task, index) {
        listTask += `<div class="list-group-item">${task}
                <div class="float-end"><button type="button" class="boton1" style="background-color: rgb(0, 200, 0);" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="editTask(${index})">Editar</button>
                    <button type="button" class="boton2" style="background-color: rgb(200, 0, 0);" onclick="deleteTask(${index})">Eliminar</button>
                </div>
            </div>`
    });
    wrapper.innerHTML = listTask; 
    ulTaskList.append(wrapper);
}

function editTask(idTask){
document.getElementById('taskInput').value = tasklist [idTask]; 
idTaskEdit = idTask;
}

function saveEdit(){
 tasklist[idTaskEdit] = document.getElementById('taskInput').value;
 showTaskList();
}

function deleteTask(idTask){
 tasklist.splice(idTask,1);
 showTaskList();
}

//funciones externas.
const alert = (message, type) => {
    const wrapper = document.createElement('div')
    wrapper.innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button id="closeAlert" type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')

    alertPlaceholder.append(wrapper);
    setTimeout(function() {
        document.getElementById('closeAlert').click();
    }, 1500);
}

function backupTask(){
    sessionStorage.setItem('tasklist', tasklist);
}

function restoreTask(){
    let taskData = sessionStorage.getItem('tasklist');
    tasklist = taskData
    console.log(taskData.split(','));
    showTaskList();
}