import unittest
from src.HaystackNeedle import strStr


class HaystackNeedleTest(unittest.TestCase):
    def test_strStr(self):
        self.assertEqual(strStr("", ""), 0)
        self.assertEqual(strStr("aaaaa", ""), 0)
        self.assertEqual(strStr("a", "aaaa"), -1)
        self.assertEqual(strStr("a", "b"), -1)
        self.assertEqual(strStr("helllo", "llo"), 3)
        self.assertEqual(strStr("hello", "llo"), 2)
        self.assertEqual(strStr("aaaaa", "bba"), -1)

        self.assertEqual(strStr("mississippi", "issipi"), -1)
        self.assertEqual(strStr("mississippi", "pi"), 9)


if __name__ == "__main__":
    unittest.main()
