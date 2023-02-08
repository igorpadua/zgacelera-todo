let taskList = JSON.parse(window.localStorage.getItem("taskList")) || [];

// Lista todas as tarefas
function listTasks() {
	if (taskList.length == 0) {
		alert("Nenhuma tarefa cadastrada!");
		return ""
	}
	let lista = "<tr><th>Id</th><th>Nome</th><th>Descrição</th><th>Data</th><th>Prioridade</th><th>Categoria</th><th>Status</th></tr>"
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

document.getElementById("listarTask").innerHTML = listTasks();

// Ordernar
function odernarStatus(status) {

	let lista = ""
	if (taskList.length == 0) {
		alert("Nenhuma tarefa cadastrada!");
		return
	}
	lista = "<tr><th>Id</th><th>Nome</th><th>Descrição</th><th>Data</th><th>Prioridade</th><th>Categoria</th><th>Status</th></tr>"
	for (var i = 0; i < taskList.length; i++) {
		if (taskList[i].status == status) {
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
	odernarStatus("Concluido");
}

// Ordernar por todas
document.getElementById("filter-all").onclick = function() {
	document.getElementById("listarTask").innerHTML = listTasks();
}
