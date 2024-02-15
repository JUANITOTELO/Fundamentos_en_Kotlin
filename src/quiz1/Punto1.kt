package quiz1
import kotlin.math.*

class calculadora{
    fun sumar(a:Int,b:Int):Int{
        return a+b;
    }
    fun restar(a:Int,b:Int):Int{
        return a-b;
    }
    fun multiplicar(a:Int,b:Int):Int{
        return a*b;
    }
    fun dividir(a:Int,b:Int):Int{
        return a/b;
    }
    fun potencia(a:Int,b:Int):Int{
        return (a.toDouble().pow(b.toDouble())).toInt();
    }
    fun raizCuadrada(a:Int):Double{
        return(a.toDouble().pow(0.5));
    }
}

fun main() {
    var a:Int = (0..10).random();
    println("a: "+a);
    var b:Int = (0..10).random();
    println("b: "+b);
    print("\nOpciones:\n sumar\n restar\n multiplicar\n dividir\n potenciar\n raíz\n\n");
    var opcion:String = readln()!!.toString().lowercase();
    val c = calculadora();
    when(opcion){
        "sumar"->println("Suma: "+c.sumar(a,b));
        "restar"->println("Resta: "+c.restar(a,b));
        "multiplicar"->println("Multiplicación: "+c.multiplicar(a,b));
        "dividir"->println("Dividición: "+c.dividir(a,b));
        "pontenciar"->println("Potenciación: "+c.potencia(a,b));
        "raiz"->println("Raíz cuadrada de a: "+c.raizCuadrada(a)+"\nRaíz cuadrada de b: "+c.raizCuadrada(b));
        else->println("Opción incorrecta.");
    }
}