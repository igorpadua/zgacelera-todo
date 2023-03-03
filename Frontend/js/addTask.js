import {criaTask} from "./criaTask.js";

const taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];

// Adicionar uma nova tarefa
document.getElementById("taskSubmit").onclick = function() {
	try {
		let task = criaTask()
		taskList.push(task);
		window.localStorage.setItem("taskList", JSON.stringify(taskList));
		alert("Tarefa adicionada com sucesso!");
		document.getElementById("taskName").value = "";
		document.getElementById("taskDescription").value = "";
		document.getElementById("taskDate").value = "";
		document.getElementById("taskPrio").value = "";
		document.getElementById("taskCategoria").value = "";
		document.getElementById("statusTarefa").value = "";
	} catch (error) {
		alert(error);
		return;
	}

}

