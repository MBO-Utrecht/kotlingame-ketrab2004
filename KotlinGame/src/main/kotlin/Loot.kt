enum class LootType {
    KEY, JEWELRY, ARMOR, RING, POTION
}

class Loot (val name:String, val type: LootType, val worth: Float ) {
    val description:String = "cool item";


    override fun toString(): String {
        return """
            name:  $name
            description:  $description
            type: $type
            worth: $worth
            """.trimIndent()
    }
}