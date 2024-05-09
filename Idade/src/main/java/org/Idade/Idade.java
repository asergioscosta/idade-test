package org.Idade;
public class Idade {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {
        if (idade < 2) {
            return "Bebê";
        }
        else {
            if (idade < 12) {
                return "Criança";
            }
            else {
                if (idade < 18) {
                    return "Adolescente";
                }
                else {
                    if (idade < 30) {
                        return "Jovem";
                    }
                    else {
                        if (idade < 60) {
                            return "Adulto";
                        }
                        else {
                            return "Idoso";
                        }
                    }
                }
            }
        }
    }
}

