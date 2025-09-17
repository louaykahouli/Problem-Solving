class Solution(object):
    def reverseWords(self, s):
        L=s.split()
        L1=L[::-1]
        ch=" ".join(L1)
        return ch