package org.example

fun main() {
    val ram=0.5
    val sham=0.3
    val rahim=0.2
    val list:MutableList<Int> = mutableListOf()
    var num:Int
    while(true){
        print("Enter apple weight in gram(-1 to stop): ")
        num=readlnOrNull()!!.toInt()
        if(num==-1){
            break
        }
        else {
            list.add(num)
        }
    }
    var totalWeight=0
    for(element in list){
        totalWeight += element
    }
    println("Distribution Result :")
    println("Ram: ${divideApples(list,ram,totalWeight)}")
    println("Sham: ${divideApples(list,sham,totalWeight)}")
    println("Rahim: ${divideApples(list,rahim,totalWeight)}")
}
fun divideApples(list:MutableList<Int>, percent:Double,totalWeight:Int):List<Int>{
    val allocatedWeight = (totalWeight * percent).toInt()
    var currentWeight = 0
    val result = mutableListOf<Int>()

    for (appleWeight in list.sortedDescending()) {
        if (currentWeight + appleWeight <= allocatedWeight) {
            result.add(appleWeight)
            currentWeight += appleWeight
            list.remove(appleWeight)
        }
    }
    return result
}
