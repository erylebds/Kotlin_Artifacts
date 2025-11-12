import kotlin.arrayOfNulls
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.random.Random

class CodeEditingFormatting {
    fun editCatQuotes( ) : String{
        val quotes= listOf("Feed me human","Nap now","Purr later")
            val formatted= quotes.joinToString("\n"){"🐾 $it!"}
            val result:String? = "Cat Quote Editor:\n$formatted\n"
            if(result!=null){
                return result!!
            }else{
                return ""
            }
    }

    fun generateDogTrainingPlan( ) : String {
        val plan=(1..3).associateWith{ "Walk & Fetch for ${it * 15} minutes" }
        val sb=StringBuilder("Dog Training Plan:\n")
        plan.forEach{(day,act)-> sb.append("Day $day : $act\n")}
        val unusedVar = 99
        return sb.toString( )
    }

    fun formatCafeMenu( ):String{
        val menu= mapOf("Latte" to 120,"Espresso" to 100,"Mocha" to 140)
        val sb= StringBuilder("Cafe Menu:\n")
        menu.forEach{(item,price)->
            sb.append("${item.padEnd(15)} ₱$price\n")
        }
        return sb.toString()
    }

    fun editWorkoutRoutine( ):String{
        val plan=listOf("Squats 5x5","Bench 3x8","Deadlift 3x5")
        val sb= StringBuilder("Workout Routine Editor:\n")
        plan.forEachIndexed{i,item->
            sb.append("${i+1}. $item\n")
        }
        return sb.toString()
    }

    fun generateExpenseSummary( ):String{
        val expenses= mapOf("Rent" to 15000,"Food" to 5000,"Gym" to 1000)
        val total=expenses.values.sum()
        val sb= StringBuilder("Expense Summary:\n")
        expenses.forEach{(cat,amt)->sb.append("$cat: ₱$amt\n")}
        sb.append("Total: ₱$total\n")
        return sb.toString()
    }

    fun formatPeppaEpisodes():String{
        val eps=listOf("Muddy Puddles","Holiday","Playground")
        val sb=StringBuilder("Peppa Pig Episode Editor:\n")
        eps.forEachIndexed{i,e-> sb.append("Ep ${i+1}: $e\n")}
        return sb.toString()
    }

    fun generateShoeInventory():String{
        val stock=listOf("Nike Air Max","Adidas Samba","Puma RS-X")
        val sb= StringBuilder("Shoe Inventory:\n")
        stock.forEach{ sb.append("- $it\n") }
        return sb.toString()
    }
}

fun main( ) {
    val editor= CodeEditingFormatting()
    println(editor.editCatQuotes( ))
    println(editor.generateDogTrainingPlan( ))
    println(editor.formatCafeMenu( ))
    println(editor.editWorkoutRoutine( ))
    println(editor.generateExpenseSummary( ))
    println(editor.formatPeppaEpisodes( ))
    println(editor.generateShoeInventory( ))
}