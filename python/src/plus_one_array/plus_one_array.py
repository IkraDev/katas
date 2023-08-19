
#https://www.codewars.com/kata/5514e5b77e6b2f38e0000ca9

class PlusOneArray():
    def calculate(self, input_array):
        reverse_array = input_array[::-1]
        self.add_at_index(reverse_array, 0)
        return reverse_array[::-1]

    def add_at_index(self, input_array, index):
        if (input_array[index] < 9):
            input_array[index] += 1
        else:
            input_array[index] = 0
            if (index < len(input_array) - 1):
                self.add_at_index(input_array, index + 1)
            else:
                input_array.append(1)

