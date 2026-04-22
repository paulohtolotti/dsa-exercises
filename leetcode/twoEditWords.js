/**
 * Problema https://leetcode.com/problems/words-within-two-edits-of-dictionary/
 * Abordagem: força bruta. Iterar sobre cada palavra e contar a quantidade de caracteres
 * diferentes.
 * O break evita iterações desnecessárias quando a contagem excede o limite de 2 caracteres.
 * Complexidade
 * Espacial: O(1). São criadas sempre 2 variáveis, independente do tamanho da entrada.
 * Temporal: O(N x M). O nº de passos é diretamente proporcional ao tamanho do array
 * de  entrada (N) e o tamanho de cada String (M).

 * @param {*} queries 
 * @param {*} dictionary 
 * @returns 
 */
var twoEditWords = function(queries, dictionary) {
    let words = [];

    for(const word of queries) {
        const wordToBeAppended = checkHanlder(word, dictionary);

        if(wordToBeAppended !== null) {
            words.push(word);
        }
    }

    return words;
};


function checkHanlder(queryWord, dictionary) {

    const MINIMUM_SIZE = 2;
    
    for(const word of dictionary) {
        
        let counter = 0;

        for(let i = 0; i < word.length; i++) {
            if(counter > 2) break;
            if(queryWord[i] !== word[i]) {
                counter++;
            }
        }
        
        if(counter <= MINIMUM_SIZE) {
            return queryWord;
        }
    }

    return null;
}

console.log(twoEditWords(["word","note","ants","wood"],["wood","joke","moat"]));
console.log(twoEditWords(["yes"], ["not"]));