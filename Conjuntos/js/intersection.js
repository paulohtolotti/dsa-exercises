/**
 * Problema de referência https://leetcode.com/problems/intersection-of-two-arrays/
 * Solução 1
 * @param {*} nums1 Array de inteiros
 * @param {*} nums2 Array de inteiros
 * @returns Intersecção dos dois arrays
 */
function intersection(nums1, nums2) {
    const B = new Set([...nums2]);
    const C = new Set([...nums1].filter(a => B.has(a)));
    return [...C];
}

console.log(intersection([1,2,2,1], [2,2]));
console.log(intersection([4,9,5], [9,4,9,8,4]));