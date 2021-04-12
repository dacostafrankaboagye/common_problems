# Question
#Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

#Examples:

#solution('abc') # should return ['ab', 'c_']
#solution('abcdef') # should return ['ab', 'cd', 'ef']



-

def solution(s):
    if len(s) == 0: return []
    s = list(s)
    if len(s) %2 != 0: s.append("_")
    s = iter(s)
    m = []
    while True:
        try:
            m.append(next(s) + next(s))
        except:
            return " ".join(m).split(" ")

