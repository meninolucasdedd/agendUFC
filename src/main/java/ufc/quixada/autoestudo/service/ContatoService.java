package ufc.quixada.autoestudo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufc.quixada.autoestudo.model.Contato;
import ufc.quixada.autoestudo.repository.IContatoRepository;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private IContatoRepository contatoRepository;

    public List<Contato> findAll() {
        return contatoRepository.findAll();
    }

    public Contato findById(Integer id) {
        return contatoRepository.findOne(id);
    }

    public Contato saveContact(Contato contato) {
        contatoRepository.save(contato);

        return contato;
    }

    public Contato update(Integer id, String nome, String email) {
        Contato contato = new Contato();
        contato.setId(id);
        contato.setNome(nome);
        contato.setEmail(email);
        contatoRepository.save(contato);

        return contato;
    }

    public Contato remove(Integer id) {
        Contato contato = findById(id);
        contatoRepository.delete(id);
        return contato;
    }
}
