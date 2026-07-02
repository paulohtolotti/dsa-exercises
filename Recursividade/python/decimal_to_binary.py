import unittest

def to_binary(number: int,) -> str:
    binary_array: list[str] = _to_binary_tail(number=number, result=[])
    return "".join(binary_array)


def _to_binary_tail(number: int, result: list[str]) -> list[str]:
    reminder = number % 2
    quotient = number // 2
    result.insert(0, str(reminder))

    if quotient == 0:
        return result
    
    return _to_binary_tail(number=quotient, result=result)

class Tester(unittest.TestCase):

    def test_converter_should_return_correct(self, ):
        expected = '100'
        expected2 = '1'
        self.assertEqual(expected, to_binary(4))
        self.assertEqual(expected2, to_binary(1))

to_binary(4)
to_binary(1)