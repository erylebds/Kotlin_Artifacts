fun docCats() {
    println("Generating Cat API Docs... Complete")
}

fun designDogs() {
    println("Designing Dog Tracker UI with Material layout")
}

fun automateCafe() {
    println("Running Café CI/CD automation...")
    println("Done Build, Test, Deploy")
}

fun manageWeightliftingProject() {
    val milestones = listOf("Start", "PR Goal", "Maintenance")
    milestones.forEachIndexed { i, m -> println("Phase ${i + 1}: $m") }
}

fun ciFinances() {
    println("Running Financial Report Build Pipeline... done")
}

fun generatePeppaDocs() {
    println("Exporting Peppa Pig episode documentation")
}

fun designShoesUI() {
    println("Creating responsive Shoe Shop layout prototype")
}

fun main() {
    docCats()
    designDogs()
    automateCafe()
    manageWeightliftingProject()
    ciFinances()
    generatePeppaDocs()
    designShoesUI()
}
