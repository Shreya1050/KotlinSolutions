package org.example

import java.lang.NumberFormatException
//Question:
//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
// then return 0.
fun main() {
    var rev=0
    println("Enter the number to reverse:")
    val n = readlnOrNull()
    try {
        rev = revFun(n?.toInt() ?: 0)
        if (n != null) {
            println("The reverse of $n is : $rev")
        }
    }
    catch(e:NumberFormatException){
        println("The reverse of $n exceeds integer range hence result is : $rev")
    }
}
fun revFun(x: Int): Int {
    var num:Long=0
    var temp:Long= x.toLong()
    if(temp>0 && temp<=Math.pow(2.toDouble(),31.toDouble()).toInt()-1){
        while(temp>0){
            val r=temp%10
//            println(r)
            temp=temp/10
            num=num*10 + r
//            println(num)
        }
        if(num<=Math.pow(2.toDouble(),31.toDouble()).toInt()-1){
            return num.toInt()
        }
        else return 0
    }
    else if(temp<0 && x>=(-1)*Math.pow(2.toDouble(),31.toDouble()).toInt()){
        temp=(-1)*(temp)
        while(temp>0){
            val r=temp%10
            temp=temp/10
            num=num*10 + r
        }
        num=num*(-1)
        if(num>=(-1)*Math.pow(2.toDouble(),31.toDouble()).toInt()){
            return num.toInt()
        }
        else return 0
    }
    return 0
}
