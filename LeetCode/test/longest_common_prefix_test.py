import unittest
from src.LongestCommonPrefix import longestCommonPrefix


class RomanTest(unittest.TestCase):
    def test_longest_common_prefix(self):
        self.assertEqual(longestCommonPrefix(["flower", "flow", "flight"]), 'fl')
        self.assertEqual(longestCommonPrefix(["flower", "flow", "flight"]), 'fl')
        self.assertEqual(longestCommonPrefix([]), '')


if __name__ == "__main__":
    unittest.main()
