import unittest
from three_sticks import ThreeSticks

class TestThreeSticks(unittest.TestCase):
    
    def test_valid(self):
        ts = ThreeSticks()
        self.assertEqual(ts.convert_two_to_three(1, 2), 1, "Should be 1")
        self.assertEqual(ts.convert_two_to_three(3, 3), 2, "Should be 2")
        self.assertEqual(ts.convert_two_to_three(9, 0), 3, "Should be 3")

if __name__ == '__main__':
    unittest.main()