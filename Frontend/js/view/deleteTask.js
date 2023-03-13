const taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];
console.log(taskList)

function deleteTask(index) {
	taskList.splice(index, 1);
	window.localStorage.setItem("taskList", JSON.stringify(taskList));
	window.location.reload();
}

document.getElementById("btnDelete").onclick = function() {

	if (taskList.length === 0) {
		alert("Não há tarefas cadastradas!");
		return;
	}

	const input = document.getElementById("idTask");

	if (input.value === "") {
		alert("Informe o ID da tarefa que deseja deletar!");
		return
	}
	deleteTask(input.value);
	alert("Tarefa deletada com sucesso!");
}

