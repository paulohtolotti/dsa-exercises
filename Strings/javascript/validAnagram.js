/**
 * 
 * @param {String} r 
 * @param {String} s 
 * Transforma r e s em array de char, ordena e transforma em String para comparar.
 * @returns 
 */

function validAnagram(r, s) {
    const rArray = r.split("").sort();
    const sArray = s.split("").sort();

    return rArray.toString() === sArray.toString()
}

console.log(validAnagram("boi", "oib"));
console.log(validAnagram("gato", "toga"));
console.log(validAnagram("rati", "rato"));