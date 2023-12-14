package com.aston.esport_joueurs.Controller;

import com.aston.esport_joueurs.Model.Player;
import com.aston.esport_joueurs.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("")
    public List<Player> getAllPlayers() {
        return playerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Player> getPlayerById(@PathVariable("id") String id) {
        return playerService.findById(id);
    }

    @PostMapping("")
    public String addPlayer(@RequestBody Player player) {
        playerService.save(player);
        return "Player created successfully";
    }

    @PutMapping("/{id}")
    public String updatePlayer(@PathVariable("id") String id, @RequestBody Player updatedPlayer) {
        Optional<Player> optionalPlayer = playerService.findById(id);

        if (optionalPlayer.isPresent()) {
            updatedPlayer.setId(optionalPlayer.get().getId());
            playerService.save(updatedPlayer);
            return "Player updated successfully";
        } else {
            return"Player not found";
        }
    }

    @DeleteMapping ("/{id}")
    public void deletePlayer(@PathVariable("id") String id) {
        playerService.deleteById(id);
    }
}
