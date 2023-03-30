export default function (taskList) {
    if (taskList.length === 0) {
        throw new Error("Não há tarefas cadastradas!");
    }

    const input = document.getElementById("idTask");

    if (input.value === "") {
        throw new Error("Preencha o campo ID!");
    }

    if (input.value >= taskList.length) {
        throw new Error("ID inválido!");
    }

    return input.value;
}