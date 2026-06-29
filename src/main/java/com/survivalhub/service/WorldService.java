package com.survivalhub.service;

import com.survivalhub.model.World;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {

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