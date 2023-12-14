package com.aston.esport_joueurs.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "joueur")
public class Player {
    @Id
    private String id;
    @NonNull
    private String pseudo;
    @NonNull
    private String first_name;
    @NonNull
    private String last_name;
    @NonNull
    private Role role;

    public enum Role {
        Toplaner,
        Jungler,
        Midlaner,
        AdCarry,
        Support,
        Coach,
        Bench
    }
}
