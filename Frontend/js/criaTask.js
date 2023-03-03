import {Task} from "./task.js";
import {validaData, validaDescricao, validaNivel, validaNome} from "./validaoTask.js";

function criaTask() {

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

    validar(taskName, taskDescription,taskPriorty, dataTemp, taskCategoria, taskStatusValue)

    // Criar um novo objeto tarefa
    return new Task(taskName, taskDescription, dataTemp.toLocaleString().substring(0, 10), taskPriorty, taskCategoria, taskStatusValue);
}

function validar(taskName, taskDescription,taskPriorty, dataTemp, taskCategoria, taskStatusValue) {
    if (!validaNome(taskName)) {
        throw new Error("Nome da tarefa inválido");
    }

    if (!validaDescricao(taskDescription)) {
        throw new Error("Descrição da tarefa inválida");
    }

    if (!validaData(dataTemp.toLocaleDateString()) || (dataTemp < new Date())) {
        throw new Error("Data inválida");
    }

    if (!validaNivel(taskPriorty)) {
        throw new Error("Nível de prioridade inválido");
    }

    if (!validaNome(taskCategoria)) {
        throw new Error("Categoria inválida");
    }

    if (taskStatusValue === "Selecione") {
        throw new Error("Status inválido");
    }

}

export { criaTask };

