package excecao;

import anotacoes.ConstraintViolada;

@ConstraintViolada(nome="preco", msg="Preço acima do permitido para viagem")
public class AcimaDoPrecoViagemException extends RuntimeException {
	private final static long serialVersionUID = 1;

	public AcimaDoPrecoViagemException() {
		super();
	}

	public AcimaDoPrecoViagemException(String msg) {
		super(msg);
	}
}
