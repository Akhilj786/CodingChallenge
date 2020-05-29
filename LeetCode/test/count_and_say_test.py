import unittest
from src.CountAndSay import count_and_say


class CountAndSayTest(unittest.TestCase):
    def test_count_and_say(self):
        self.assertEqual(count_and_say(n=-1), "")
        self.assertEqual(count_and_say(n=0), "")

    def test_count_and_say_positive(self):
        self.assertEqual(count_and_say(n=1), "1")
        self.assertEqual(count_and_say(n=2), "11")
        self.assertEqual(count_and_say(n=3), "21")
        self.assertEqual(count_and_say(n=4), "1211")
        self.assertEqual(count_and_say(n=5), "111221")


if __name__ == "__main__":
    unittest.main()
