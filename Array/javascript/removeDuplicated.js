/**
 * Problema referência: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * @param {*} nums array de números
 * @returns k nª de ocorrências de elementos duplicados
 */
function removeDuplicates(nums) {
    let setCounter = new Set();
    let k = 0;

    for(let i of nums) {
        if(!setCounter.has(i)) {
            setCounter.add(i);
            nums[k++] = i;
        }
    }

    return k;
}

function remove2(nums) {
    let dictCounter = {};
    let k = 0;

    for(let i of nums) {
        if(!(i in dictCounter)) {
            dictCounter[i] = i;
            nums[k++] = i;
        } 
    }
    return k;
}

console.log(removeDuplicates([1,1,2]));
console.log(removeDuplicates([0,0,1,1,1,2,2,3,3,4]));
console.log(remove2([1,1,2])); 
console.log(remove2([0,0,1,1,1,2,2,3,3,4]));


