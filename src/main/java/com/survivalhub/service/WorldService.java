package com.survivalhub.service;

import com.survivalhub.model.World;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorldService {

    private final List<World> worlds = List.of( 
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
        public List<World> getWorlds() {
            return worlds;
        }
        public Optional<World> getWorldById(Long id) {
            return worlds.stream()
                    .filter(world -> world.getId().equals(id))
                    .findFirst();
        }
    }