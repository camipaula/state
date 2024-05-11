package com.example;

import com.example.ui.Player;
import com.example.ui.UI;

public class Main {
     public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}