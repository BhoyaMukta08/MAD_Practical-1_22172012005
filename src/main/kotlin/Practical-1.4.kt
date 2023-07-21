 fun main(){
    println("Enter number")
    val a = readLine()!!.toInt()
    val s = if(a%2==0)
        "$a is even number"
    else
        "$a is odd number"

    println(s)

}