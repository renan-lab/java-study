package com.renan.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {

	void abrirConexao();
	void fecharConexao();
}
