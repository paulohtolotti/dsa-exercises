function reverseList(list) {

    if(list.length == 0) return list;
    let listB = []
    return tailReverseList(list, listB);
}

function tailReverseList(list, listB) {

    if(list.length == 0) return listB;
    listB.push(list.pop());
    return tailReverseList(list, listB);
}

console.log(reverseList(["Maçã", "Caju", "Uva", "Morango"]));