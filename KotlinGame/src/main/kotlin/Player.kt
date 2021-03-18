class Player(val name: String, val maxLife: Int = 3, var level: Int = 1, var score: Int = 0) {
    var life: Int = maxLife;

    var primary: Weapon = Weapon("Stick","a Small stick", 1);

    var coins: Int = 0;

    fun show() {
        println("""
            name:  $name
            life:  $life
            level: $level
            score: $score
            coins: $coins
            
            Weapon:
                name: ${primary.name}
                description: ${primary.description}
                damage: ${primary.damage}
            """.trimIndent())
    }
}