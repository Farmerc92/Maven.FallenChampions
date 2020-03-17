package npc.monster.drops;


import interfaces.Value;
import player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Item implements Value, Dropable {
    public HashMap dropTable;

    public void lootPickUp(){
    }
}
