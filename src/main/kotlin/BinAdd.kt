package org.example

fun main(){
    println("Enter binary number 1:")
    val a= readlnOrNull()
    println("Enter binary number 2:")
    val b= readlnOrNull()
    val result= addBinary(a.toString(), b.toString())
    println("The result is : $result")


}
fun addBinary(a: String, b: String): String {
    var sum:Int
    var carry=0
    var i=a.length-1
    var j=b.length-1
    val s=StringBuilder()
    while(i>=0 || j>=0){
        sum=carry
        if(i>=0){
            sum=sum+(a[i]-'0')
            i--
        }
        if(j>=0){
            sum=sum+(b[j]-'0')
            j--
        }
        s.insert(0,sum%2)
        carry=sum/2
    }
    if(carry==1){
        s.insert(0,carry)
    }
    return s.toString()

}