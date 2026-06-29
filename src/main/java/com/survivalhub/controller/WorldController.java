package com.survivalhub.controller;

import com.survivalhub.model.World;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldController {

    @GetMapping("/api/worlds")
    public List<World> getWorlds() {
        return List.of(
                new World(
                        1L,
                        "Minecraft con amigos",
                        "Minecraft",
                        "Mundo cooperativo para construir base y automatizaciones"
                ),
                new World(
                        2L,
                        "Valheim Server",
                        "Valheim",
                        "Servidor para explorar, construir y derrotar bosses"
                )
        );
    }
}