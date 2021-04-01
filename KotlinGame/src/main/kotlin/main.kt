fun main(args: Array<String>) {
    /*val player = Player("Plyr", 3, 1, 0)

    player.inventory.add(Loot("red potion", LootType.POTION, 2.5f))
    player.inventory.add(Loot("helmet", LootType.ARMOR, 50.5f))

    println(player);
    println("")
    player.showInventory();
    println(""); println("");
    */


    val player2 = Player("Player 2", 3, 1, 0)
    player2.inventory.add(  Loot("helmet", LootType.ARMOR, 45f) )
    player2.inventory.add(  Loot("blue potion", LootType.POTION, 25f)   )

    player2.inventory.add(  Loot("ring 1", LootType.RING, 15f)  )
    player2.inventory.add(  Loot("ring 2", LootType.RING, 14.99f)   )

    player2.showInventory()

    println(""); println("");

    for (i in 100 downTo 0)
    {
        if (i % 3 == 0 && i % 5 == 0){
            println("$i is deelbaar door 3 en 5")
        }else if (i % 3 == 0){
            println("$i is deelbaar door 3")
        }else if (i % 5 == 0){
            println("$i is deelbaar door 5")
        }
    }

}