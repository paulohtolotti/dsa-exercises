"""
    Link referência https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/?envType=daily-question&envId=2026-06-01
    Status 
    Runtime: 4ms
    Beats 9.89%
"""

class Solution:
    def minimumCost(self, cost: list[int]) -> int:

        size:int = len(cost)
        # Best cases exit early
        if size == 1:
            return cost[0]

        if size == 2:
            return cost[0] + cost[1]
        
        cost.sort(reverse=True)
        total_cost:int = 0
        condition:bool = True

        while condition:
            if size < 3 or not cost:
                break

            total_cost += cost[0] + cost[1]
            cost = cost[3:]
            size = len(cost)
        
        if len(cost) != 0:
            for item in cost:
                total_cost += item

        return total_cost

solution = Solution()

print(solution.minimumCost([6,5,7,9,2,2]))
print(solution.minimumCost([1,2,3]))
print(solution.minimumCost([5,5]))
print(solution.minimumCost([3,3,3,1]))
"""
    cost = [6,5,7,9,2,2]

    def minimumCost():
        
        size = 6
        if size == 1:
            false
        if size == 2:
            false

        sort 
        cost = [9, 7, 6, 5, 2, 2]
        total = 0
        for i in range(6) # 0
            max_cost = cost[i] -> 9
            if size % 3 == 0:
                for j in range(i+1, 6) -> 0 + 1:
                    se max_cost > j and max_cost > j+1:
                        total = max_cost + j
                        cost.pop(i, j, j+1)
                        size -= 3
            else:
                total += cost[0] + cost[1]

        cost = [5, 2, 2]
        for i in range(6) # 1
            max_cost = cost[i] - > 5
            for j in range(i+1, 6): -> 0 + 1
                se max_cost > j and max_cost > j+1

"""