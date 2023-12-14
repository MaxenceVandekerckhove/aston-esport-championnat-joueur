package com.aston.esport_joueurs.Service;

import com.aston.esport_joueurs.Model.Player;
import com.aston.esport_joueurs.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAll() {
        return playerRepository.findAll();
    }

    public Optional<Player> findById(String id) {
        return playerRepository.findById(id);
    }

    public String deleteById(String id) {
        playerRepository.deleteById(id);
        return "";
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }
}

