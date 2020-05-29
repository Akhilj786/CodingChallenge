import unittest
from src.RemoveDuplicate import removeDuplicates, removeElement


class RemoveDuplicatesTest(unittest.TestCase):
    def test_remove_duplicates(self):
        self.assertEqual(removeDuplicates([1, 1, 1]), 1)
        self.assertEqual(removeDuplicates([1, 1, 2]), 2)
        self.assertEqual(removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]), 5)

    def test_remove_element(self):
        self.assertEqual(removeElement([], 1), 0)
        self.assertEqual(removeElement([1], 1), 0)
        self.assertEqual(removeElement([2, 2], 1), 2)
        self.assertEqual(removeElement([1, 1, 2], 1), 1)
        self.assertEqual(removeElement([1, 1, 2], 2), 2)
        self.assertEqual(removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2), 5)


if __name__ == "__main__":
    unittest.main()
