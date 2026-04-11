/**
 * Problema https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
 * Implementação utilizando o conceito de listas e pilhas.
 * 
 */
function countStudents(students, sandwiches) {

    while(true) {
        if(students.length === 0) return 0

        if(!students.includes(sandwiches[0])) {
            return students.length;
        }
        else if(students[0] === sandwiches[0]) {
            students.shift();
            sandwiches.shift();
        } 
        else {
            let popped = students.shift();
            students.push(popped);
        }

    }
}

console.log(countStudents([1,1,0,0], [0,1,0,1])); // 0
console.log(countStudents([1,1,1,0,0,1], [1,0,0,0,1,1])) // 3