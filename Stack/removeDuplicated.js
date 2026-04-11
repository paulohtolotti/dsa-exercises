/**
 * Problema referência: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/1973533110/
 * Solução adotada: usar uma pilha para empilhar cada char da String. Quando um caracter
 * é igual ao topo da pilha, fazemos um pop, eliminando caracteres duplicados em sequência.
 * @param {String} text 
 * @returns String sem caracteres sequenciais repetidos
 */
function removeDuplicated(text) {
    let stack = []
    const size = text.length;
    stack.push(text[0]);

    for(let i = 1; i < size; i++) {
        if(text[i] === stack.at(-1)) {
            stack.pop();
        } else {
            stack.push(text[i]);
        }
    }

    return stack.join("");
}

console.log(removeDuplicated("abbaca")) // ca
console.log(removeDuplicated("ppaaxbby")) // xy
console.log(removeDuplicated("azxxzy")) // ay