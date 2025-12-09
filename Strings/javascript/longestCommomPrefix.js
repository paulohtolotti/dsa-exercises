/**
 * 
 * @param {Array<String>} strs
 *         Array de Strings 
 * @returns {String}
 *          String contendo o maior prefixo comum ou "" caso não exista
 */
function longestCommomPrefix(strs) {

    if(strs.length == 1) return strs[0];

    let str = [];
    
    strs.sort();
    const first = strs[0];
    const last = strs[strs.length - 1];

    let min = first.length < last.length ? first.length : last.length;

    for(let i=0; i<min; i++) {

        if(first[i] !== last[i]) break;

        str.push(first[i]);
    }

    return str.toString().replaceAll(",", "");
}

console.log(longestCommomPrefix(["flow", "flower", "flight"]));
console.log(longestCommomPrefix(["dog", "doguard", "dogfigth"]));