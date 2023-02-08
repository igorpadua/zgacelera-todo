import { Task } from "./task.js";

var taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];
const input = document.getElementById("idTask");

document.getElementById("btnEdit").onclick = function() {
	document.getElementById("idLabel").style.display = "none";
	document.getElementById("idTask").style.display = "none";
	document.getElementById("btnEdit").style.display = "none";
	if (taskList.length == 0) {
		alert("Não há tarefas cadastradas!");
		return;
	}

	if (input.value == "") {
		alert("Informe o ID da tarefa que deseja editar!");
		return
	}

	if (input.value >= taskList.length) {
		alert("Tarefa não encontrada!");
		return;
	}

	document.getElementById("form-esconder").style.display = "block";
	document.getElementById("taskSubmit").style.display = "block";

	const task = taskList[input.value];

	document.getElementById("taskName").value = task.name;
	document.getElementById("taskDescription").value = task.description;
	// Formatando Data
	let dataTemp = task.date;
	dataTemp = dataTemp.split("/");
	dataTemp = dataTemp[2] + "-" + dataTemp[1] + "-" + dataTemp[0];
	document.getElementById("taskDate").value = dataTemp;
	document.getElementById("taskPrio").value = task.priority;
	document.getElementById("taskCategoria").value = task.categoria;
	// Selecionando o status da tarefa
	const taskStatus = document.getElementById("statusTarefa");
	for (let i = 0; i < taskStatus.options.length; i++) {
		if (taskStatus.options[i].innerHTML == task.status) {
			document.getElementById("statusTarefa").selectedIndex = i;
			break;
		}
	}
}

document.getElementById("taskSubmit").onclick = function() {
	console.log("Edit task");
	const taskName = document.getElementById("taskName").value;
	const taskDescription = document.getElementById("taskDescription").value;
	const taskDate = document.getElementById("taskDate").value;
	let dataTemp = new Date(taskDate);
	dataTemp.setDate(dataTemp.getDate() + 1);
	const taskPriorty = document.getElementById("taskPrio").value;
	const taskCategoria = document.getElementById("taskCategoria").value;
	// Select box status tarefa
	const taskStatus = document.getElementById("statusTarefa");
	const index = taskStatus.options.selectedIndex;
	const taskStatusValue = taskStatus.options[index].innerHTML;

	// Criar um novo objeto tarefa
	const task = new Task(taskName, taskDescription, dataTemp.toLocaleString().substring(0, 10), taskPriorty, taskCategoria, taskStatusValue);
	// Adicionar a tarefa à lista de tarefas
	if (!(taskName && taskDescription && taskDate && taskPriorty && taskCategoria && taskStatusValue != "Selecione")) {
		alert("Preencha todos os campos!");
		return;
	}
	taskList[input.value] = task;
	window.localStorage.setItem("taskList", JSON.stringify(taskList));
	alert("Tarefa editada com sucesso!");
	document.getElementById("idLabel").style.display = "block";
	document.getElementById("idTask").style.display = "block";
	document.getElementById("btnEdit").style.display = "block";
	document.getElementById("form-esconder").style.display = "none";
	document.getElementById("taskSubmit").style.display = "none";
	document.getElementById("idTask").value = "";
}
