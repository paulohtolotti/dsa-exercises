function studentsCount(courses) {
    let set = new Set();

    for(let i = 0; i < courses.length; i++) {
        for (let j = 0; j < courses[i].length; j++) {
            set.add(courses[i][j]);
        }
    }

    return set.size;
}

console.log(studentsCount([
  [15, 21, 80, 42],
  [21, 80, 47],
  [12, 21, 47, 35]
]
))