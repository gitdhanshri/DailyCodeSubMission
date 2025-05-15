def matchSubsequnce(words,groups):
	res=[words[0]]
	prev=groups[0]
	for i in range(1,len(groups)):
		if groups[i] != prev :
			res.append(words[i])
			prev=groups[i]
	print("Answer--->:",res)
	return res
matchSubsequnce(["ab"], [1])
	
	
	
	
