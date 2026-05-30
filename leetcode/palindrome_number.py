class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_string = str(x)
        right = len(x_string) - 1
        end = len(x_string)

        for left in range(end):
            if x_string[left] != x_string[right]: return False
            right -= 1
        
        return True

    def isPalindromePythonic(self, x: int) -> bool:
        number = str(x)
        reversed_number = number[::-1]
        return number == reversed_number
        
solution = Solution()
print( 5 // 2)

print("121", solution.isPalindrome(121))
print("-121", solution.isPalindrome(-121))
print("10", solution.isPalindrome(10))
print("11", solution.isPalindrome(11))
print("22110", solution.isPalindrome(22110))

print("="*100)
print("121", solution.isPalindromePythonic(121))
print("-121", solution.isPalindromePythonic(-121))
print("10", solution.isPalindromePythonic(10))
print("11", solution.isPalindromePythonic(11))
print("22110", solution.isPalindromePythonic(22110))
