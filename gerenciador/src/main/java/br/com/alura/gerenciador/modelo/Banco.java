package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("PolacoTUR");
		
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Allura");
		
		lista.add(empresa);
		lista.add(empresa1);
		
		Usuario u1 = new Usuario();
		u1.setLogin("vmm");
		u1.setSenha("123");
		
		Usuario u2 = new Usuario();
		u2.setLogin("caleb");
		u2.setSenha("12345");
		
		Usuario u3 = new Usuario();
		u3.setLogin("vek");
		u3.setSenha("123");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		
		
		
	}
	
	
	
	
	public void add(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
		
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id) {
				it.remove();
			}
			
		}
	
		
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for(Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
			
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		
		for(Usuario usuario : listaUsuarios) {
			
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
			
		}
		
		return null;
	}

}
