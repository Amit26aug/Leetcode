import scala.collection.mutable
object Solution {
    def subsets(nums: Array[Int]): List[List[Int]] = {
        
        val res = mutable.ListBuffer[List[Int]]()
        val curState = mutable.Stack[Int]()
        
        def uniqueSubset(cur: Int): Unit = {
            if (cur == nums.length) {
                res += curState.toList
            } else {
                uniqueSubset(cur + 1)
                curState push nums(cur)
                uniqueSubset(cur + 1)
                curState.pop
            }
        }
        
        uniqueSubset(0)
        return res.toList
    }

    def subsetsCascade(nums: Array[Int]): List[List[Int]] = {
        
        val res = mutable.ListBuffer[List[Int]](List[Int]())
        
        for (num <- nums) {
            for (subRes <- res.toList) {
                res += List(num) ::: subRes
            }
        }
        return res.toList
    }

}