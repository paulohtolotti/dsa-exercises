function checkDomain(email) {
    return email.match(/\.br$/);
}

console.log(checkDomain("marcos@yahoo.com.br") ? "É brasileiro" : "Não é brasileiro");
console.log(checkDomain("marcos@yahoo.br") ? "É brasileiro" : "Não é brasileiro");
console.log(checkDomain("marcos@yahoo.br.gom") ? "É brasileiro" : "Não é brasileiro");
console.log(checkDomain("gov@gov.br") ? "É brasileiro" : "Não é brasileiro");
console.log(checkDomain("oscorp@oscop.ny") ? "É brasileiro" : "Não é brasileiro");