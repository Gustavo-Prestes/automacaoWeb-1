package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.CredentialsImp;

public enum Credentials implements CredentialsImp{
	
	CADASTRADO{
		@Override
		public String usuarioCliente() {
			return "testee@teste123.com";
		}

		@Override
		public String senhaCliente() {
			return "teste123";
		}
	},

	EMAIL_INVALIDO {
		@Override
		public String usuarioCliente() {
			return "invalido@email.com";
		}

		@Override
		public String senhaCliente() {
			return "1234Teste";
		}
	}
	;

	

}
