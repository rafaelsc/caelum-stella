package br.com.caelum.stella.boleto;

public class Emissor {
	private String agencia;
	private String dvAgencia;
	private String contaCorrente;
	private String carteira;
	private String numConvenio;
	private String nossoNumero;
	private String cedente;
	private String dvContaCorrete;

	private Emissor() {
	}

	public static Emissor newEmissor() {
		return new Emissor();
	}

	/**
	 * Devolve o número da agencia sem o digito
	 * 
	 */
	public String getAgencia() {
		return this.agencia;
	}

	/**
	 * Associa uma agencia, SEM o dígito verificador, ao emissor
	 * 
	 * @param agencia
	 */
	public Emissor comAgencia(String agencia) {
		this.agencia = agencia;
		return this;
	}

	/**
	 * Devolve o número da conta corrente sem o digito
	 * 
	 */
	public String getContaCorrente() {
		return this.contaCorrente;
	}

	/**
	 * Associa uma conta corrente, SEM o dígito verificador, ao emissor
	 * 
	 * @param contaCorrente
	 */
	public Emissor comContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
		return this;
	}

	/**
	 * Devolve a carteira<br/> Valor informado pelo banco para identificação do
	 * tipo de boleto
	 * 
	 */
	public String getCarteira() {
		return this.carteira;
	}

	/**
	 * Associa uma carteira ao emissor<br/> Valor informado pelo banco para
	 * identificação do tipo de boleto
	 * 
	 * @param carteira
	 */
	public Emissor comCarteira(String carteira) {
		this.carteira = carteira;
		return this;
	}

	/**
	 * Devolve o número do convênio<br/> Valor que identifica um emissor junto
	 * ao seu banco para associar seus boletos<br/> Valor informado pelo banco
	 * 
	 */
	public String getNumConvenio() {
		return this.numConvenio;
	}

	/**
	 * Associa um número de convênio ao emissor<br/> Valor que identifica um
	 * emissor junto ao seu banco para associar seus boletos<br/> Valor
	 * informado pelo banco
	 * 
	 * @param numConvenio
	 */
	public Emissor comNumConvenio(String numConvenio) {
		this.numConvenio = numConvenio;
		return this;
	}

	/**
	 * Devolve o nosso número<br/> Valor que o cedente escolhe para manter
	 * controle sobre seus boletos. Esse valor serve para o cedente identificar
	 * quais boletos foram pagos ou não. Recomenda-se o uso de números
	 * sequenciais, na geração de diversos boletos, para facilitar a
	 * identificação dos boletos pagos
	 * 
	 */
	public String getNossoNumero() {
		return this.nossoNumero;
	}

	/**
	 * Associa o nosso número ao emissor<br/> Valor que o cedente escolhe para
	 * manter controle sobre seus boletos. Esse valor serve para o cedente
	 * identificar quais boletos foram pagos ou não. Recomenda-se o uso de
	 * números sequenciais, na geração de diversos boletos, para facilitar a
	 * identificação dos boletos pagos
	 * 
	 * @param nossoNumero
	 */
	public Emissor comNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
		return this;
	}

	/**
	 * Devolve o cedente. (nome do emissor)
	 * 
	 */
	public String getCedente() {
		return this.cedente;
	}

	/**
	 * Associa um cedente (nome) ao emissor
	 * 
	 * @param cedente
	 */
	public Emissor comCedente(String cedente) {
		this.cedente = cedente;
		return this;
	}

	public String getDvContaCorrente() {
		return this.dvContaCorrete;
	}

	public Emissor comDvContaCorrete(String dv) {
		this.dvContaCorrete = dv;
		return this;
	}

	public String getDvAgencia() {
		return this.dvAgencia;
	}

	public Emissor comDvAgencia(String dv) {
		this.dvAgencia = dv;
		return this;
	}

	public String getContaCorrenteFormatado() {
		return String.format("%08d", Integer.parseInt(this.contaCorrente));
	}

	public String getNossoNumeroFormatado() {
		return String.format("%010d", Integer.parseInt(this.nossoNumero));
	}

	public String getNumConvenioFormatado() {
		return String.format("%07d", Integer.parseInt(this.numConvenio));
	}
}
