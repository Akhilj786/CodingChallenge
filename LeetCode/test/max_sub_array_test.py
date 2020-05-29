import unittest
from src.MaxSubArray import max_sub_array, max_sub_array_optimized, max_sub_array_dp


class MaxSubArrayTest(unittest.TestCase):
    def test_max_sub_array(self):
        self.assertEqual(max_sub_array([]
                                       ), -1)
        self.assertEqual(max_sub_array([0]
                                       ), 0)
        self.assertEqual(max_sub_array([-2]
                                       ), -2)
        self.assertEqual(max_sub_array([-2, 1, -3, 4, -1, 2, 1, -5, 4]
                                       ), 6)

    def test_max_sub_array_optimized(self):
        self.assertEqual(max_sub_array_optimized([]
                                                 ), (-1, -1))
        self.assertEqual(max_sub_array_optimized([0]
                                                 ), (0, 0))
        self.assertEqual(max_sub_array_optimized([-2]
                                                 ), (0, 0))
        self.assertEqual(max_sub_array_optimized([-2, 1, -3, 4, -1, 2, 1, -5, 4]
                                                 ), (3, 6))

    def test_max_sub_array_dp(self):
        self.assertEqual(max_sub_array_dp([]
                                          ), -1)
        self.assertEqual(max_sub_array_dp([0]
                                          ), 0)
        self.assertEqual(max_sub_array_dp([-2]
                                          ), -2)
        self.assertEqual(max_sub_array_dp([-2, 1, -3, 4, -1, 2, 1, -5, 4]
                                          ), 6)


if __name__ == "__main__":
    unittest.main()
