import unittest
from src.BinarySearch import binary_search, searchInsert


class BinarySearchTest(unittest.TestCase):
    def test_binary_search(self):
        self.assertEqual(binary_search([1, 2, 4], 4), 2)
        self.assertEqual(binary_search([1, 2, 4], 2), 1)
        self.assertEqual(binary_search([1, 2, 4], 1), 0)
        self.assertEqual(binary_search([1, 2, 4], 3), -1)

    def test_binary_search_string(self):
        self.assertEqual(binary_search(["AB", "ABCD", "DEF"], "DEF"), 2)
        self.assertEqual(binary_search(["AB", "ABCD", "DEF"], "AB"), 0)
        self.assertEqual(binary_search(["AB", "ABCD", "DEF"], "ABCD"), 1)
        self.assertEqual(binary_search(["AB", "ABCD", "DEF"], "abcd"), -1)

    def test_searchInsert(self):
        self.assertEqual(searchInsert([1, 3, 5, 6], 5), 2)
        self.assertEqual(searchInsert([1, 3, 5, 6], 2), 1)
        self.assertEqual(searchInsert([1, 3, 5, 6], 7), 4)
        self.assertEqual(searchInsert([1, 3, 5, 6], 0), 0)
        self.assertEqual(searchInsert([], 0), 0)


if __name__ == "__main__":
    unittest.main()
