public class Informa_dados {
	public static void main (String [] args) {
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		a.setNome("Leila Brum");
		a.setCPF("000.111.222-33");
		a.setCNPJ("444 555 /0001");
		a.setCartao("9776-J");
		
		System.out.println("Nome do contribuinte: " + a.getNome());
		System.out.println("CPF do contribuinte: " + a.getCPF());
		System.out.println("CNPJ do contribuinte:" + a.getCNPJ());
		System.out.println("Cartão do contribuinte: " + a.getCartao());
	}
}
