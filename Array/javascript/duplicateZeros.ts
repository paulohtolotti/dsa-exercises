function duplicateZeroes(arr: Array<number>):void {

    const size:number = arr.length;
    let passIndex:number = -1;

    for(let i=0; i<size; i++) {

        if(i === passIndex) continue;

        if(arr[i] == 0) {
            arr.splice(i+1, 0, 0);
            passIndex = i + 1;
        } 

        if(arr.length > size) arr.pop();

    }

}

const numbers:number[] = [1,0,2,3,0,4,5,0];
duplicateZeroes(numbers);
console.log(numbers) // [1, 0, 0, 2,3, 0, 0, 4, 5, 0, 0];

