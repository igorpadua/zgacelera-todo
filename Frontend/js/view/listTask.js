const taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];
console.log(taskList)

function criaTabelaTask(task, i) {
	let lista = "<tr>"
	lista +=    "<td>" + i + "</td>"
	lista += 		"<td>" + task.name + "</td>"
	lista += 		"<td>" + task.description + "</td>"
	lista += 		"<td>" + task.date + "</td>"
	lista += 		"<td>" + task.priority + "</td>"
	lista += 		"<td>" + task.categoria + "</td>"
	lista += 		"<td>" + task.status + "</td>"
	lista += "</tr>"

	return lista
}

// Lista todas as tarefas
function listTasks() {
	if (taskList.length === 0) {
		alert("Nenhuma tarefa cadastrada!");
		return ""
	}
	let lista = "<tr><th>Id</th><th>Nome</th><th>Descrição</th><th>Data</th><th>Prioridade</th><th>Categoria</th><th>Status</th></tr>"
	for (let i = 0; i < taskList.length; i++) {
		lista += criaTabelaTask(taskList[i], i)
	}

		return lista;
}

document.getElementById("listarTask").innerHTML = listTasks();

// Ordernar
function odernarStatus(status) {

	let lista = ""
	if (taskList.length === 0) {
		alert("Nenhuma tarefa cadastrada!");
		return
	}
	lista = "<tr><th>Id</th><th>Nome</th><th>Descrição</th><th>Data</th><th>Prioridade</th><th>Categoria</th><th>Status</th></tr>"
	for (let i = 0; i < taskList.length; i++) {
		if (taskList[i].status === status) {
			lista += criaTabelaTask(taskList[i], i)
		}
	}
	document.getElementById("listarTask").innerHTML = lista;
}

document.getElementById("filter-todo").onclick = function() {
	odernarStatus("A fazer");
}

// Ordernar por doing
document.getElementById("filter-doing").onclick = function() {
	odernarStatus("Em andamento");
}

// Ordernar por done
document.getElementById("filter-done").onclick = function() {
	odernarStatus("Concluída");
}

// Ordernar por todas
document.getElementById("filter-all").onclick = function() {
	document.getElementById("listarTask").innerHTML = listTasks();
}
