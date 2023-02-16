class Solution {
    fun maxRotateFunction(A: IntArray): Int {
        var s = 0
        var a = 0
        A.mapIndexed{i,it->
                s = s + (it*i)
                a = a + it
        }
        var m = s
        for (i in A.size-1 downTo 0){
            s = s-A[i]*A.size+a
            m = maxOf(s, m)
        }
        return m
    }
}