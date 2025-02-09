fun main(){
    val f = "João";
    val u = "Silva";
    val n = "$f $u";

    val g = "Ola, $n! Seja bem-vindo";
    val a = g[g.length -1];
    val b = if (g.startsWith("Ola")) 2 else 3;
    val l = g[g.length -2];
    val m = u.uppercase().substring(1,2);
    val r = u.substring(0,2);

    val x = if (n.startsWith("SI")) 4 else 5;

    println("$a$b$l$m$r$x");
}