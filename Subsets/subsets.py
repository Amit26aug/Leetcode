class Solution:
	
	# Using backtracking
	def subsets(self, nums: List[int]) -> List[List[int]]:
        curList = []
        res = []
        def uniqueSubsets(curInd):
            if curInd == len(nums):
                res.append(list(curList))
                return
                
            uniqueSubsets(curInd + 1)
            curList.append(nums[curInd])
            uniqueSubsets(curInd + 1)
            curList.pop()
        
        uniqueSubsets(0)
        return res

	# Cascading
	def subsetsCascading(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
		# for each number in nums, add it to existing outputs
        for i in nums:
            res += [[i] + subRes for subRes in res]
        return res

