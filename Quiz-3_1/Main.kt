fun funcao(w: Int ): String{
    return when(w){
        0,1 -> "A"
        4,5,6 -> "B"
        else -> "X" 
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


// A) A X A X
// B) B X A X
// C) A X B X   // Resposta certa 
// D) X A X A
// E) A B A B
