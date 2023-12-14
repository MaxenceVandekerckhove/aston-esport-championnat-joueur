package com.aston.esport_joueurs.Repository;

import com.aston.esport_joueurs.Model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

}
