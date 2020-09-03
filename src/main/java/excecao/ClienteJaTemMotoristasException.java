package excecao;

import anotacoes.ConstraintViolada;

@ConstraintViolada(nome="CLIENTE_MOTORISTA_FK", msg= "O cliente tem motoristas cadastrados!")
public class ClienteJaTemMotoristasException extends RuntimeException {
    private final static long serialVersionUID = 1;

    public ClienteJaTemMotoristasException() {
	super();
    }

    public ClienteJaTemMotoristasException(String msg) {
	super(msg);
    }
}
