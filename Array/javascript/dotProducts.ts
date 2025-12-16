function dotProduct(arr: Array<number>, arr2: Array<number>): number {

    let total:number = 0;

    for(let i=0; i<arr.length; i++) {
        total += arr[i] * arr2[i];
    }

    return total;
}

console.log(dotProduct([0,2], [0,11]));

