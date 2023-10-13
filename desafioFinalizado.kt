public enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracaoEmMinutos: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel:Nivel) {
        
     val inscritos = mutableListOf<Usuario>()
    
     fun matricular(usuario: Usuario, formacao: Formacao) {
          inscritos.add(usuario)          
          for(inscrito in listOf(inscritos))
         {
             println("Usuario: ${usuario.nome} matriculado em ${formacao.nome} nível ${formacao.nivel} nos conteudos ${formacao.conteudos}")
         }
     }
     
     
}

fun main() {
    val conteudo1 = ConteudoEducacional("Variaveis", 60)
    val conteudo2 = ConteudoEducacional("Funcoes", 120)
    val conteudo3 = ConteudoEducacional("POO", 120)
    val conteudos = mutableListOf(conteudo1)
    conteudos.add(conteudo2)
    conteudos.add(conteudo3)
    
    var Kotlin = Formacao("Explicando Kotlin", conteudos, Nivel.BASICO)
    var Java = Formacao("Explicando Java", conteudos, Nivel.BASICO)
    var C = Formacao("Explicando C", conteudos, Nivel.BASICO)
    
    val usuario1 = Usuario("Renan")
    val usuario2 = Usuario("Laka")
    val usuario3 = Usuario("Laís")
    
    Kotlin.matricular(usuario1,Kotlin)
    Java.matricular(usuario2,Java)
    C.matricular(usuario3,C)
}
