package excecao;

import anotacoes.ConstraintViolada;

@ConstraintViolada(nome="CARRO_VIAGEM_FK", msg= "O carro tem viagens cadastradas!")
public class CarroJaTemViagensException extends RuntimeException {
    private final static long serialVersionUID = 1;

    public CarroJaTemViagensException() {
	super();
    }

    public CarroJaTemViagensException(String msg) {
	super(msg);
    }
}
