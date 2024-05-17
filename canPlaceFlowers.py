class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        length = len(flowerbed)
        x = 0
        if n == 0:
            return True
        while x < length:
            if flowerbed[x] == 0:
                #condition to not run out of bounds
                if x < length - 1:
                    next = flowerbed[x + 1]
                else:
                    next = 0
                if next == 0:
                    n-= 1
                    x += 2 #skip to next plot (cant be next to each other)
                else:
                    x += 1 #go to next area to see if nothing is together
                if n == 0:
                    return True
            else: 
                x += 2 #skip to next plot (cant be next to eatch other)
        return False
        
