const nomeRegex = /^[a-zA-Z0-9 ]{3,20}$/;
const descricaoRegex = /^[a-zA-Z0-9 ]{3,50}$/;
const dataRegex = /^\d{2}\/\d{2}\/\d{4}$/;
const nivelRegex = /^[0-5]$/;

function validaNome(nome) {
    return nomeRegex.test(nome);
}

function validaDescricao(descricao) {
    return descricaoRegex.test(descricao);
}

function validaData(data) {
    return dataRegex.test(data);
}

function validaNivel(nivel) {
    return nivelRegex.test(nivel);
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

export { validar };
