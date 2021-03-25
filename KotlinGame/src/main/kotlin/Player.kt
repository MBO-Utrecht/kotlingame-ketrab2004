class Player(val name: String, val maxLife: Int = 3, var level: Int = 1, var score: Int = 0) {
    var life: Int = maxLife;

    var primary: Weapon = Weapon("Stick", 1);

    var inventory: ArrayList<Loot> = ArrayList();

    var coins: Int = 0;

    override fun toString(): String {
        return """
name:  $name
life:  $life
level: $level
score: $score
coins: $coins

* Weapon:
$primary """
    }

    fun showInventory() {
        println("* Inventory:")
        for ((i, item) in inventory.withIndex()) {
            println(
"""=== $i:
$item""")
        }
    }
}