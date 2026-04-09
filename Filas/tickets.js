function timeRequiredToBuy(tickets, k) {

    let queue = [];
    const size = tickets.length;

    // Cria a fila com os índices para cada pessoa
    for(let i = 0; i < size; i++) {
        queue.push(i);
    }

    let total = 0;

    while(true) {

        let i = queue.shift(); // Retira o índice da pessoa da fila

        tickets[i] -= 1;
        total++;

        // Se a pessoa não comprou tudo, retorna
        if(tickets[i] != 0) {
            queue.push(i);
        } 

        if(tickets[k] === 0) return total;

    }
}

console.log(timeRequiredToBuy([1 ,1], 1));
console.log(timeRequiredToBuy([2, 3, 2], 2));