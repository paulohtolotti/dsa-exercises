import unittest


def sum_digits(number: int, total: int = 0):
    
    if number == 0:
        return total
    
    quotient = number // 10
    reminder = number % 10
    total += reminder

    return sum_digits(number=quotient, total=total)

class Tester(unittest.TestCase):
    def test_sum_digits_returns_valid_response(self, ):
        expected = 11
        self.assertEqual(expected, sum_digits(5150))
    
    def test_sum_digits_returns_valid_when_negative_number(self, ):
        expected = 11
        self.assertEqual(expected, sum_digits(-5150))

sum_digits(5150)