function twoSum (nums, target) {

    let dict = new Map(); // complemento : chave
    const size = nums.length;
    let arr = [];

    for(let i = 0; i < size; i++) {

        // Complemento presente
        if(dict.has(nums[i])) {
            
            arr[0] = i;
            arr[1] = dict.get(nums[i]);

            break;

        } else {
            const complement = target - nums[i];
            dict.set(complement, i);
        }
    }

    return arr;
};