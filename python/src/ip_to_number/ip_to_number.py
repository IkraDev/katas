
#https://www.codewars.com/kata/541a354c39c5efa5fa001372

class IpToNumber():
    def convert_ip_to_number(self, input_ip: str):
        ip_numbers = input_ip.split(".")
        merged_binary = ""
        for number in ip_numbers:
            merged_binary += self.integer_to_binary_string(int(number))
        return int(merged_binary, 2)
        
    def integer_to_binary_string(self, input_integer: int):
        binary = format(input_integer, 'b')
        if len(binary) < 8:
            return ("0" * (8 - len(binary))) + binary
        return binary
    
    def convert_number_to_ip(self, input_number: int):
        binary_total = self.integer_to_binary_string(input_number)
        binary_total = ("0" * (32 - len(binary_total)) + binary_total) #to make sure its always 32bit long
        binary_numbers = list(self.split_by_n(binary_total, 8))
        merged_ip = ""
        for number in binary_numbers:
            merged_ip += "." + str(int(number, 2))
        return merged_ip[1:] #remove first dot

    def split_by_n(self, seq, n):
        while seq:
            yield seq[:n]
            seq = seq[n:]
        