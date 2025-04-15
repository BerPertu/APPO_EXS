package Ex2;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	// ======================= GETTERS ============ //
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	// ======================= SETTERS =========== //
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: Nome não pode ser vazio!");
		} else {
			this.nome = nome;
		}
	}

	public void setIdade(int idade) {
		if (idade < 0 || idade > 120) {
			System.out.println("Erro: Idade deve ser entre 0 e 120 anos!");
		} else {
			this.idade = idade;
		}
	}

}

	
	