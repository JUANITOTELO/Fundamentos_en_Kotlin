package quiz1

fun main() {
    var a:Int = (0..1).random();
    var values = listOf("cara","sello");
    println("Adivine cara o sello?");
    var opcion:String = readLine()!!.toString().lowercase();
    while(true){
        if(values[a]==opcion){
            println("Correcto! jugar otra vez? si/no");
            opcion = readLine()!!.toString().lowercase();
            if(opcion=="no"){
                break;
            }
            if(opcion=="si"){
                a = (0..1).random();
                println("Adivine cara o sello?");
            }
        }else{
            if (opcion != "si") {
                println("no es! intente otra vez:");
            }
            opcion = readLine()!!.toString().lowercase();
        }
    }
}