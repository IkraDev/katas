
#https://www.codewars.com/kata/5514e5b77e6b2f38e0000ca9

class PlusOneArray():
    def calc(self, inputArr):
        reverseArr = inputArr[::-1]
        self.addAtIndex(reverseArr, 0)
        return reverseArr[::-1]

    def addAtIndex(self, inputArr, index):
        if (inputArr[index] < 9):
            inputArr[index] += 1
        else:
            inputArr[index] = 0
            if (index < len(inputArr) - 1):
                self.addAtIndex(inputArr, index + 1)
            else:
                inputArr.append(1)

