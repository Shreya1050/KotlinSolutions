package org.example
import java.util.ArrayDeque
fun main(){
    println("Enter a string containing opening and closing braces :")
    val n= readlnOrNull()
    println("The input string is valid : ${isValid(n.toString())}")
}
fun isValid(s: String): Boolean {
    val stack=ArrayDeque<Char>()
    for (i in s){
        when(i){
            '(','{','['-> stack.push(i);
            ')' -> {
                if(stack.isEmpty() || stack.pop()!='('){
                    return false
                }
            }
            '}' -> {
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false
                }
            }
            ']'-> {
                if(stack.isEmpty() || stack.pop()!='['){
                    return false
                }
            }
        }
    }
    return stack.isEmpty()
}