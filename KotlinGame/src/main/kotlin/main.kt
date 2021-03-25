fun main(args: Array<String>) {
    val player = Player("Plyr", 3, 1, 0)

    player.inventory.add(Loot("red potion", LootType.POTION, 2.5f))
    player.inventory.add(Loot("helmet", LootType.ARMOR, 50.5f))

    println(player);
    println("")
    player.showInventory();
}