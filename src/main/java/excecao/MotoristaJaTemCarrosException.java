package excecao;

import anotacoes.ConstraintViolada;

@ConstraintViolada(nome="MOTORISTA_CARRO_FK", msg= "O motorista tem carros cadastrados!")
public class MotoristaJaTemCarrosException extends RuntimeException {
    private final static long serialVersionUID = 1;

    public MotoristaJaTemCarrosException() {
	super();
    }

    public MotoristaJaTemCarrosException(String msg) {
	super(msg);
    }
}
