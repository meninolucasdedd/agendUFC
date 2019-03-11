package ufc.quixada.autoestudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufc.quixada.autoestudo.model.Contato;

@Repository
public interface IContatoRepository extends JpaRepository<Contato, Integer> {


}
