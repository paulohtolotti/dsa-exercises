function maxOnes(nums) {
    let max = 0, count = 0;

    for(const i of nums) {

        if(i == 1) count++;

        if(i != 1 && count > 0) {
            max = max > count ? max : count;
            count = 0;
        }
    }

    return max > count ? max : count;
}

console.log(maxOnes([1,1,0,1,1,1]));