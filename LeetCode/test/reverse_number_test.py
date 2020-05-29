import unittest
from src.ReverseNumber import reverse


class ReverseNumberTest(unittest.TestCase):
    def test_reverse_number(self):
        actual_res = reverse(123)
        expected_res = 321
        self.assertEqual(actual_res, expected_res)
        actual_res = reverse(-123)
        expected_res = -321
        self.assertEqual(actual_res, expected_res)
        actual_res = reverse(120)
        expected_res = 21
        self.assertEqual(actual_res, expected_res)
        actual_res = reverse(1534236469)
        expected_res = 0
        self.assertEqual(actual_res, expected_res)


if __name__ == "__main__":
    unittest.main()
