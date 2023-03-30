import {cadastro} from "./Cadastro.js";
import validaId from "../util/ValidaId.js";

const taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];
let id

document.getElementById("btnEdit").onclick = function() {
	try {
		escodeDigiteId()

		id = validaId(taskList)

		mostraEdit()

		const task = taskList[id]

		insereElementosTask(task)
	} catch (error) {
		alert(error.message)
		mostraDigiteId()
	}

}

document.getElementById("taskSubmit").onclick = function() {
	const task = cadastro()
	if (!(task.name && task.description && task.date && task.priority && task.categoria && task.status !== "Selecione")) {
		alert("Preencha todos os campos!");
		return;
	}
	taskList[id] = task;
	window.localStorage.setItem("taskList", JSON.stringify(taskList));
	alert("Tarefa editada com sucesso!");
	escondeEdit();
}

function insereElementosTask(task) {
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
		if (taskStatus.options[i].innerHTML === task.status) {
			document.getElementById("statusTarefa").selectedIndex = i;
			break;
		}
	}
}

function escodeDigiteId() {
	document.getElementById("idLabel").style.display = "none";
	document.getElementById("idTask").style.display = "none";
	document.getElementById("btnEdit").style.display = "none";
}

function mostraDigiteId() {
	document.getElementById("idLabel").style.display = "block";
	document.getElementById("idTask").style.display = "block";
	document.getElementById("btnEdit").style.display = "block";
}

function mostraEdit() {
	document.getElementById("form-esconder").style.display = "block";
	document.getElementById("taskSubmit").style.display = "block";
}

function escondeEdit() {
	document.getElementById("idLabel").style.display = "block";
	document.getElementById("idTask").style.display = "block";
	document.getElementById("btnEdit").style.display = "block";
	document.getElementById("form-esconder").style.display = "none";
	document.getElementById("taskSubmit").style.display = "none";
	document.getElementById("idTask").value = "";
}
