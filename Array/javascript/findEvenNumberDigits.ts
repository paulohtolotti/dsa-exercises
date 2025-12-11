function findNumbers(nums:number[]):number {
    let countEvenNumber:number = 0;

    for(const i of nums) {
        let numDigits = i.toString().length;
        if(numDigits % 2 == 0) countEvenNumber++;
    }

    return countEvenNumber;
}

console.log(findNumbers([20,30,40,100]));