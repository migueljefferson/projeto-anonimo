package biz.noip.anonimofanor.dao;

import java.util.List;

public interface GenericDAO<T, K> {
	
	
	public T salvar(T obj);
	
	public T atualizar(T obj);
	
	public T buscarPorId(K key);
	
	public List<T> listar();
	
	public void excluir(T obj);
	
	


}
