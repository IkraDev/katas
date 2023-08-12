import unittest
from plus_one_array import PlusOneArray

class TestPlusOneArray(unittest.TestCase):

    def test_valid(self):
        poa = PlusOneArray()
        self.assertEqual(poa.calc([4, 3, 2, 5]), [4, 3, 2, 6], "Should be [4, 3, 2, 6]")
        self.assertEqual(poa.calc([1, 2, 3, 9]), [1, 2, 4, 0], "Should be [1, 2, 4, 0]")
        self.assertEqual(poa.calc([9, 9, 9, 9]), [1, 0, 0, 0, 0], "Should be [1, 0, 0, 0, 0]")

if __name__ == '__main__':
    unittest.main()
