def sort(nums):
	for i in range(len(nums)):
		min_idx=i
		for j in range(i,len(nums)):
			if nums[j]<nums[min_idx]:
				min_idx=j
		if i!=min_idx:
			nums[i],nums[min_idx]=nums[min_idx],nums[i]   
	return nums
def sortColor_m2(nums):
	count_0=0
	count_1=0
	count_2=0
	for num in nums:
		if num==0:
			count_0+=1
		elif num==1:
			count_1+=1
		else:
			count_2+=1
	for i in range(len(nums)):
		if count_0 > 0:
			nums[i]=0
			count_0-=1
		elif count_1 > 0:
			nums[i]=1
			count_1-=1
		else:
			nums[i]=2
	print(nums)
	return nums
def sortColor_m3(nums):
	i=0
	j=0
	k=len(nums)-1
	while(j<=k):
		if nums[j]==1:
			j+=1
		elif (nums[j] == 2):
			nums[j],nums[k]=nums[k],nums[j]
			k-=1
		else:#nums[j] == 0
			nums[i],nums[j]=nums[j],nums[i]
			i+=1
			j+=1
	print(nums)			
nums=[1,1,2,0,2,1,1,0] 
nums2=[2,0,1]
ans=sortColor_m3(nums)
print(ans)
