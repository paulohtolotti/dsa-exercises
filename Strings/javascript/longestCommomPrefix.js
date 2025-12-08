function longestCommomPrefix(strs) {

    if(strs.length == 1) return strs[0];

    let str = [];
    
    strs.sort();
    const first = strs[0];
    const last = strs[strs.length - 1];

    for(let i=0; i<first.length; i++) {

        if(first[i] !== last[i]) break;

        str.push(first[i]);
    }

    return str.toString().replaceAll(",", "");
}

console.log(longestCommomPrefix(["flow", "flower", "flight"]));
console.log(longestCommomPrefix(["dog", "doguard", "dogfigth"]));