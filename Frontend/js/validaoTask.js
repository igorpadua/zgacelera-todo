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

export { validaNome, validaDescricao, validaData, validaNivel };
