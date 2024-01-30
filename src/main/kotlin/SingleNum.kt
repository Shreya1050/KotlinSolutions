package org.example

fun main(){
    println("Enter the size of array :")
    val n= readlnOrNull()
    val arr=IntArray(n!!.toInt())
    println("Enter the elements of array such that every element appears twice except one :")
    for(i in 0..<n!!.toInt()){
        arr[i]= readlnOrNull()!!.toInt()
    }
    println("The only single element in this array is : ${singleNumber(arr)}")
}
fun singleNumber(nums: IntArray): Int {
    var res=0
    for(i in nums){
        res=res xor i
    }
    return res
}