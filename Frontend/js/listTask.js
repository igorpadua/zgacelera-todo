let taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];

// Lista todas as tarefas
function listTasks() {
	let lista = ""
	if (taskList.length == 0) {
		alert("Nenhuma tarefa cadastrada!");
	} else {
		for (var i = 0; i < taskList.length; i++) {
			lista += "<tr>"
			lista +=    "<td>" + i + "</td>"
			lista += 		"<td>" + taskList[i].name + "</td>"
			lista += 		"<td>" + taskList[i].description + "</td>"
			lista += 		"<td>" + taskList[i].date + "</td>"
			lista += 		"<td>" + taskList[i].priority + "</td>"
			lista += 		"<td>" + taskList[i].categoria + "</td>"
			lista += 		"<td>" + taskList[i].status + "</td>"
			lista += "</tr>"
		}

		return lista;
	}
	return ""
}

document.getElementById("listarTask").innerHTML += listTasks();

