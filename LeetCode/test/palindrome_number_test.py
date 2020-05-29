import unittest
from src.PalindromeNumber import isPalindrome,isPalindrome_Optimize


class PalindromeNumberTest(unittest.TestCase):
    def test_reverse_number(self):
        actual_res = isPalindrome(123)
        expected_res = False
        self.assertEqual(actual_res, expected_res)
        actual_res = isPalindrome(121)
        expected_res = True
        self.assertEqual(actual_res, expected_res)
        actual_res = isPalindrome(-121)
        expected_res = False
        self.assertEqual(actual_res, expected_res)

    def test_reverse_number_optimize(self):
        actual_res = isPalindrome_Optimize(123)
        expected_res = False
        self.assertEqual(actual_res, expected_res)
        actual_res = isPalindrome_Optimize(121)
        expected_res = True
        self.assertEqual(actual_res, expected_res)
        actual_res = isPalindrome_Optimize(-121)
        expected_res = False
        self.assertEqual(actual_res, expected_res)


if __name__ == "__main__":
    unittest.main()
