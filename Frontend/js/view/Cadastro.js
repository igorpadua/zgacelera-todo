import {Task} from "../model/task.js";
import { validar } from "../util/validaoTask.js";

function cadastro() {

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

export { cadastro };

