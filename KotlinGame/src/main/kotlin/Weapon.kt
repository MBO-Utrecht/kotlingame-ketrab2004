class Weapon (val name: String, val damage: Int) {
    val description: String = "owww"

    override fun toString(): String {
        return """
            name:  $name
            description:  $description
            damage: $damage
            """.trimIndent()
    }
}