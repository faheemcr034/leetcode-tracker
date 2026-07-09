# Last updated: 09/07/2026, 10:06:40
class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        count = 0
        while students:
            if students[0] == sandwiches[0]:
                count = 0
                students.pop(0)
                sandwiches.pop(0)
            else:
                count += 1
                popped = students.pop(0)
                students.append(popped)   
            if count == len(students):
                return len(students)              
        return 0