function removeNonDigits(cpf) {
    return cpf.replaceAll(/\D/g, "");
}

console.log(removeNonDigits("327.501.488-98"));