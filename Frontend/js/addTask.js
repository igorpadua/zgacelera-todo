import { Task } from "./task.js";

var taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];

// Adicionar uma nova tarefa
document.getElementById("taskSubmit").onclick = function() {
	const taskName = document.getElementById("taskName").value;
	const taskDescription = document.getElementById("taskDescription").value;
	const taskDate = document.getElementById("taskDate").value;
	let dataTemp = new Date(taskDate);
	dataTemp.setDate(dataTemp.getDate() + 1);
	const taskPriorty = document.getElementById("taskPrio").value;
	const taskCategoria = document.getElementById("taskCategoria").value;
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
	taskList.push(task);
	window.localStorage.setItem("taskList", JSON.stringify(taskList));
	alert("Tarefa adicionada com sucesso!");
}

