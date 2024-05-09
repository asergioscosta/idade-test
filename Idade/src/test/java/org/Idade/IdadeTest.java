package org.Idade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdadeTest {

    Idade idade;

    @BeforeEach
    void setUp() {
        idade = new Idade();
    }


    @Test
    void deveretornarbebe(){
        idade.setIdade(0);
        assertEquals("Bebê", idade.verificarIdade());
    }

    @Test
    void deveretornarcrianca(){
        idade.setIdade(11);
        assertEquals("Criança", idade.verificarIdade());
    }

    @Test
    void deveretornaradolescente(){
        idade.setIdade(16);
        assertEquals("Adolescente", idade.verificarIdade());
    }

    @Test
    void deveretornarjovem(){
        idade.setIdade(28);
        assertEquals("Jovem", idade.verificarIdade());
    }

    @Test
    void deveretornaradulto(){
        idade.setIdade(50);
        assertEquals("Adulto", idade.verificarIdade());
    }

    @Test
    void deveretornaridoso(){
        idade.setIdade(60);
        assertEquals("Idoso", idade.verificarIdade());
    }

}