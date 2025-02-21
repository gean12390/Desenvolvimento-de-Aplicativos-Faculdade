fun funcao(w: Int ): String{
    return when(w){
        in 1..4 -> "W"
        in 0..8 -> "R"
        else -> "U" 
         }
    }


//////////////////////////////////////////////////////////////////////////////////////////////

fun main() {
   val list = arrayOf(1,2,3,4,5,6,7)
   var i = 0
   
   while(i < list.size){
       if(i % 2 == 0){
            val opt = list[i]
            print(funcao(opt) + " ")
       }
       i++
   }
   
}

// A) W R W R
// B) W W R R   X //RESPOSTA CERTA
// C) R W R W
// D) W W R R   X // RESPOSTA CERTA
// E) U R U W
