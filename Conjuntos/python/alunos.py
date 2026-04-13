def students_count(courses: list[list[int]]):
    idSet = set()
    for c in courses:
        for s in c:
            idSet.add(s)
    
    return len(idSet)


print(students_count([
  [15, 21, 80, 42],
  [21, 80, 47],
  [12, 21, 47, 35]
]
))
