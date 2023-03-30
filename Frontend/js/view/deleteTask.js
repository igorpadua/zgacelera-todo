import ValidaId from "../util/ValidaId.js";

const taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];

function deleteTask(index) {
	taskList.splice(index, 1);
	window.localStorage.setItem("taskList", JSON.stringify(taskList));
	window.location.reload();
}

document.getElementById("btnDelete").onclick = function() {
	try {
		const id = ValidaId(taskList)
		deleteTask(id);
		alert("Tarefa deletada com sucesso!");
	} catch (error) {
		alert(error.message)
	}
}

