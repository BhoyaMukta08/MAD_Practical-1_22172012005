fun main(){
    println("Enter month number")
    when (readLine()!!.toInt()){
        1 -> print("Month = January")
        2 -> print("Month = Fabruary")
        3 -> print("Month = March")
        4 -> print("Month = April")
        5 -> print("Month = May")
        6 -> print("Month = June")
        7 -> print("Month = July")
        8 -> print("Month = August")
        9 -> print("Month = September")
        10 -> print("Month = October")
        11 -> print("Month = November")
        12 -> print("Month = December")
     else -> {
         print("Enter proper month number")
     }
    }
}