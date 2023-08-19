
#https://www.codewars.com/kata/57b06f90e298a7b53d000a86

class SupermarketQueue():
    def simulate(self, queue_array, number_of_queues: int):
        queues = {}
        counter = 0
        for x in range(number_of_queues):
            queues[str(x) + "queue"] = 0
        while True:
            for x in queues:
                if queues[x] > 0:
                    queues[x] += -1
                if queues[x] == 0 and len(queue_array) > 0:
                    queues[x] = queue_array[0]
                    queue_array.pop(0)
            if len(queue_array) == 0 and self.check_done(queues): 
                break
            counter += 1
        return counter

    def check_done(self, queue_dictionary):
        sum = 0
        for x in queue_dictionary:
            sum += queue_dictionary[x]
        return (sum == 0)

        

