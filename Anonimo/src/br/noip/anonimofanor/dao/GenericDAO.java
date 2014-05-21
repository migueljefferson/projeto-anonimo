package br.noip.anonimofanor.dao;

import java.util.List;

public interface GenericDAO<T, KEY> {
	
	
	public T salvar(T obj);
	
	public T atualizar(T obj);
	
	public T buscarPorId(KEY key);
	
	public List<T> listar();
	
	public void excluir(T obj);
	
}
