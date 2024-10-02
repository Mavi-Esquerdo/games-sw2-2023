package application.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;





    @Entity
    @Table (name = "plataformas")
    @Getter
    @Setter
    public class Plataforma {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(nullable = false, unique = true)
        private String nome;
    }
    

