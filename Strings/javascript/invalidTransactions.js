/**
 * 
 * @param {Array<String>} transactions
 *  Lista de transações, sendo que cada posição é uma String contendo
 *  {name}, {time}, {value}, {city}, separados por vírgulas.
 *  
 *  Critérios para invalidar: value > 1000 OU mesma pessoa realizar uma transação
 *  em 60 ou menos minutos em duas cidades diferentes.
 * 
 *  @return {Array<String>} lista de todas as transações inválidas. 
 */

class Transaction {

    constructor(csv) {
        const data = csv.split(",");
        this.name = data[0];
        this.time = parseInt(data[1]);
        this.value = parseInt(data[2]);
        this.city = data[3];
    }
}
function invalidTransactions(transactions) {

    //Inicia uma lista de booleanos com valores falsos
    let invalidPositions = [];
    const size = transactions.length;
    for(let i=0; i<size; i++) {
        invalidPositions[i] = false;
    }


    for(let i=0; i<size; i++) {

        const t = new Transaction(transactions[i]);

        if(t.value > 1000) invalidPositions[i] = true;

        for(let j=i+1; j<size; j++) {

            const u = new Transaction(transactions[j]);

            if(t.name == u.name && t.city != u.city && Math.abs(t.time - u.time) <= 60) {
                invalidPositions[i] = true;
                invalidPositions[j] = true;
            }
        }
        
    }
    let invalidList = [];
    for(let i=0; i<size; i++) {
        if(invalidPositions[i]) invalidList.push(transactions[i]);
    }

    return invalidList;
}

console.log(invalidTransactions(["alice,20,800,mtv", "alice,50,100,mtv", "alice,51,100,frankfurt"]));