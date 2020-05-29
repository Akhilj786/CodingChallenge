import unittest
from src.TwoSum import two_sum


class TwoSumTest(unittest.TestCase):
    def test_two_sum(self):
        actual_res = two_sum([2, 7, 11, 15], 9)
        expected_res = [0, 1]
        self.assertListEqual(actual_res, expected_res)
        actual_res = two_sum([2, 8], 9)
        expected_res = []
        self.assertListEqual(actual_res, expected_res)
        actual_res = two_sum([2, 11, 7], 9)
        expected_res = [0, 2]
        self.assertListEqual(actual_res, expected_res)
        actual_res = two_sum([2, 11, 11, 11, 12, 5, 7], 9)
        expected_res = [0, 6]
        self.assertListEqual(actual_res, expected_res)


if __name__ == "__main__":
    unittest.main()
