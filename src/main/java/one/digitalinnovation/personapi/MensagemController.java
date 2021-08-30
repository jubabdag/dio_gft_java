package one.digitalinnovation.personapi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class MensagemController {
    
    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/mensagem")
    public Mensagem gerarMensagem() {
        Mensagem novaMensagem = new Mensagem();
        novaMensagem.setId(contador.incrementAndGet());
        novaMensagem.setConteudo("Alô, Mundo");
        return novaMensagem;
    }
}
