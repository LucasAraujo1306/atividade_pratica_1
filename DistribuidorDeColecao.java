import java.util.*;

public class DistribuidorDeColecao {
    public static int calcularModuloMatricula(Aluno aluno) {
        int soma = 0;
        for (char c : aluno.getMatricula().toCharArray()) {
            if (Character.isDigit(c)) soma += Character.getNumericValue(c);
        }
        return soma % 3;
    }

    public static void distribuir(Aluno aluno,
                                  List<Pessoa> lista,
                                  Set<Pessoa> conjunto,
                                  Map<String, Pessoa> mapa) {

        int resultado = calcularModuloMatricula(aluno);
        switch (resultado) {
            case 0 -> lista.add(aluno);
            case 1 -> conjunto.add(aluno);
            case 2 -> mapa.put(aluno.getCpf(), aluno);
        }
    }
}