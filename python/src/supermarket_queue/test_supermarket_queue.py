import unittest
from supermarket_queue import SupermarketQueue

class TestSupermarketQueue(unittest.TestCase):

    def test_valid(self):
        smq = SupermarketQueue()
        self.assertEqual(smq.simulate([5,3,4], 1), 12, "Should be 12")
        self.assertEqual(smq.simulate([10,2,3,3], 2), 10, "Should be 10")
        self.assertEqual(smq.simulate([2,3,10], 2), 12, "Should be 12")

if __name__ == '__main__':
    unittest.main()