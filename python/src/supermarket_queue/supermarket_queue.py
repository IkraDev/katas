
#https://www.codewars.com/kata/57b06f90e298a7b53d000a86

class SupermarketQueue():
    def simulate(self, queueArr, numOfQueues: int):
        queues = {}
        counter = 0
        for x in range(numOfQueues):
            queues[str(x) + "queue"] = 0
        while True:
            for x in queues:
                if queues[x] > 0:
                    queues[x] += -1
                if queues[x] == 0 and len(queueArr) > 0:
                    queues[x] = queueArr[0]
                    queueArr.pop(0)
            if len(queueArr) == 0 and self.checkDone(queues): break
            counter += 1
        return counter

    def checkDone(self, queueDic):
        sum = 0
        for x in queueDic:
            sum += queueDic[x]
        return (sum == 0)

        

