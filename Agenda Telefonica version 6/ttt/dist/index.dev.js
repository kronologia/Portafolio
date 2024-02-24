"use strict";

var taskList = [];
var idTaskEdit;
var alertPlaceholder = document.getElementById('alertErrorTask');

function addTask() {
  //capturando la tarea
  var taskValue = document.getElementById('inputTask').value; //validando si el input tiene valor

  var taskValue2 = document.getElementById('cellNumber').value; //la razon de poner variables diferentes, es por que tu necesitas saber si el 
  //punto donde estas buscando tiene informacion y es coherente es decir lo que necesitas para tu codigo.

  if (taskValue == "" || taskValue == null) {
    alert("Ingrese Algun Valor", "danger");
    return false;
  }

  if (taskValue2 == "" || taskValue2 == null) {
    alert("Ingrese Algun Valor", "danger");
    return false;
  }

  var nuevo = {
    nombre: taskValue,
    numero: taskValue2
  };
  taskList.push(nuevo);
  document.getElementById("inputTask").value = "";
  document.getElementById("cellNumber").value = "";
  showTaskList();
  return;
}

function editTask(idTask) {
  document.getElementById('inputEditTask').value = taskList[idTask].nombre;
  document.getElementById('inputEditTask2').value = taskList[idTask].numero;
  idTaskEdit = idTask;
}

function deleteTask(idTask) {
  taskList.splice(idTask, 1);
  showTaskList();
}

function saveTaskEdit() {
  taskList[idTaskEdit].nombre = document.getElementById('inputEditTask').value;
  taskList[idTaskEdit].numero = document.getElementById('inputEditTask2').value;
  showTaskList();
}

function backupTask() {
  sessionStorage.setItem('taskList', JSON.stringify(taskList));
}

function restoreTask() {
  var taskData = sessionStorage.getItem('taskList');

  if (taskData !== null) {
    taskList = JSON.parse(taskData);
    showTaskList();
    return;
  }
}

function showTaskList() {
  var listTask = '';
  var ulTaskList = document.getElementById('taskList');
  ulTaskList.innerHTML = '';
  var wrapper = document.createElement('div');
  taskList.forEach(function (task, index) {
    listTask += "<div class=\"list-group-item fs-3\">\n        <div>".concat(task.nombre, "</div>\n        ").concat(task.numero, "\n      <div class=\"btn-group float-end\" role=\"group\" aria-label=\"Basic outlined example\">\n        <button onclick=\"editTask(").concat(index, ") (").concat(index, ")\" type=\"button\" class=\"btn btn-outline-primary\" \n        data-bs-toggle=\"modal\" data-bs-target=\"#editTaskModal\">Editar</button>\n        <button onclick=\"deleteTask(").concat(index, ")\" type=\"button\" class=\"btn btn-outline-danger\">Eliminar</button>\n      </div>\n    </div>");
  });
  wrapper.innerHTML = listTask;
  ulTaskList.append(wrapper);
} //Funciones externas


var alert = function alert(message, type) {
  var wrapper = document.createElement('div');
  wrapper.innerHTML = ["<div class=\"alert alert-".concat(type, " alert-dismissible\" role=\"alert\">"), "   <div>".concat(message, "</div>"), '   <button id="closeAlert" type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>', '</div>'].join('');
  alertPlaceholder.append(wrapper);
  setTimeout(function () {
    document.getElementById('closeAlert').click();
  }, 1500);
};

function searchTask() {
  var buscar = document.getElementById('inputSearchTask').value;
  var posicion = null;
  var encontrado = "";
  taskList.forEach(function (task, index) {
    if (task.nombre == buscar) {
      encontrado = task;
      posicion = index;
      return;
    }
  });
  var listTask = '';
  var ulTaskList = document.getElementById('taskList');
  ulTaskList.innerHTML = '';
  var wrapper = document.createElement('div');
  listTask += "<div class=\"list-group-item fs-3\"><div>".concat(encontrado.nombre, "</div>\n        ").concat(encontrado.numero, "\n      <div class=\"btn-group float-end\" role=\"group\" aria-label=\"Basic outlined example\">\n        <button onclick=\"editTask(").concat(posicion, ")\" type=\"button\" class=\"btn btn-outline-primary\" \n        data-bs-toggle=\"modal\" data-bs-target=\"#editTaskModal\">Editar</button>\n        <button onclick=\"deleteTask(").concat(posicion, ")\" type=\"button\" class=\"btn btn-outline-danger\">Eliminar</button>\n      </div>\n    </div>");
  wrapper.innerHTML = listTask;
  ulTaskList.append(wrapper);
}