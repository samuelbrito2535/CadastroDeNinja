package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
