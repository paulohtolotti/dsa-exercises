import unittest

def exponentiation(base:int, power:int, acc:int = 1) -> int:
    if power < 0:
        return 0

    if power == 0:
        return acc

    return exponentiation(base, power - 1, acc * base)

class Tester(unittest.TestCase):

    def test_power_should_return_when_positive_power(self,):
        expected = 1024
        got = exponentiation(2, 10)
        self.assertEqual(expected, got)

    def test_zero_power_should_return_1(self,):
        self.assertEqual(1, exponentiation(50, 0))
        self.assertEqual(1, exponentiation(-50, 0))