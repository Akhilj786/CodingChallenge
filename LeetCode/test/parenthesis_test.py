import unittest
from src.Parenthesis import is_valid


class ParanthesisTest(unittest.TestCase):
    def test_parenthesis(self):
        self.assertEqual(is_valid(""), True)
        self.assertEqual(is_valid("{}"), True)
        self.assertEqual(is_valid("()"), True)
        self.assertEqual(is_valid("()[]{}"), True)
        self.assertEqual(is_valid("(((((())))))"), True)
        self.assertEqual(is_valid("()()()()"), True)
        self.assertEqual(is_valid("((()(())))"), True)
        self.assertEqual(is_valid("(]"), False)
        self.assertEqual(is_valid("([]"), False)
        self.assertEqual(is_valid("(((((((()"), False)


if __name__ == "__main__":
    unittest.main()
