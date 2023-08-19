import unittest
from ip_to_number import IpToNumber

class TestIpToNumber(unittest.TestCase):

    def test_ip_to_num(self):
        itn = IpToNumber()
        self.assertEqual(itn.convert_ip_to_number("192.168.1.1"), 3232235777, "Should be 3232235777")
        self.assertEqual(itn.convert_ip_to_number("10.0.0.0"), 167772160, "Should be 167772160")
        self.assertEqual(itn.convert_ip_to_number("176.16.0.1"), 2953838593, "Should be 2953838593")

    def test_num_to_ip(self):
        itn = IpToNumber()
        self.assertEqual(itn.convert_number_to_ip(3232235777), "192.168.1.1", "Should be 192.168.1.1")
        self.assertEqual(itn.convert_number_to_ip(167772160), "10.0.0.0", "Should be 10.0.0.0")
        self.assertEqual(itn.convert_number_to_ip(2953838593), "176.16.0.1", "Should be 176.16.0.1")

if __name__ == '__main__':
    unittest.main()