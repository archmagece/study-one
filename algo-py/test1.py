def solution(friends, gifts):
    answer = None
    gtMap = {}
    scoreMap = {}
    # 선물 포인트
    for gift in gifts:
        names = gift.split()
        from_ = names[0]
        to = names[1]
        if from_ in scoreMap:
            scoreMap[from_] += 1
        else:
            scoreMap[from_] = 1

        if (from_, to) in gtMap:
            print("if from: {}, to: {}".format(from_, to))
            gtMap[(from_, to)] += 1
        elif (to, from_) in gtMap:
            print("elif from: {}, to: {}".format(to, from_))
            gtMap[(to, from_)] -= 1
        else:
            print("else from: {}, to: {}".format(from_, to))
            gtMap[(from_, to)] = 1

    # if gtK, gtV in gtMap.items():

    # 가장 많이 받은 사람
    bestMap = {friend: 0 for friend in friends}
    for friend in friends:
        bestMap[friend] = 0

    for k, v in gtMap.items():
        if 0 < v:
            bestMap[k[0]] += 1
        elif v < 0:
            bestMap[k[1]] += 1
        else:
            if scoreMap[k[0]] < scoreMap[k[1]]:
                bestMap[k[1]] += 1
            elif scoreMap[k[0]] > scoreMap[k[1]]:
                bestMap[k[0]] += 1

    for k, v in bestMap.items():
        if v == max(bestMap.values()):
            answer = v
            break
    print(scoreMap)
    print(gtMap)
    return answer


result = solution(
    ["muzi", "ryan", "frodo", "neo"],
    ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"]
)
print(result) # 2
result = solution(
    ["joy", "brad", "alessandro", "conan", "david"],
    ["alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"]
)
print(result) # 4
