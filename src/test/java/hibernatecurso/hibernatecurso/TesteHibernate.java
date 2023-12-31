package hibernatecurso.hibernatecurso;

import org.hibernate.usertype.UserCollectionType;
import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {

	@Test
	public void testeHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGenerico = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa usuario = new UsuarioPessoa();
		usuario.setNome("Jeová");
		usuario.setSobrenome("Leite");
		usuario.setIdade(19);
		usuario.setEmail("jeovaleite@gmail.com");
		usuario.setLogin("jeovaleite");
		usuario.setSenha("123456789");
		
		daoGenerico.salvar(usuario);
	}
	
	@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGenerico = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(2L);
		
		pessoa = daoGenerico.pesquisar(pessoa);
		
		System.out.println(pessoa);
	}
	
	@Test
	public void testeBuscarID() {
		DaoGeneric<UsuarioPessoa> daoGenerico = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = daoGenerico.pesquisar(1L, UsuarioPessoa.class);
		
		System.out.println(pessoa);
	}
	
}
