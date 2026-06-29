package com.survivalhub.controller;

import com.survivalhub.model.World;
import com.survivalhub.service.WorldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldController {

    private final WorldService worldService;

    public WorldController(WorldService worldService) {
        this.worldService = worldService;
    }

    @GetMapping("/api/worlds")
    public List<World> getWorlds() {
        return worldService.getWorlds();
    }

    @GetMapping("/api/worlds/{id}")
    public ResponseEntity<World> getWorldById(@PathVariable Long id) {
        return worldService.getWorldById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}