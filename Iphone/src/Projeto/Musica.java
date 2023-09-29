package Projeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Musica{

	private List<Musica> musicaList;
	
	public Musica() {
		this.musicaList = new ArrayList<>();				
	}
	
	public List<Musica> exibirMusicas(String nomeMusica){
		
		List<String> musicas = Arrays.asList("Música A", "Música B","Música C");
		if(!musicas.isEmpty()) {
			List<Musica> musicaPorNome = new ArrayList<>(musicaList);
			Predicate<String> musicasPorNome= musica -> musica.contains(nomeMusica);
			musicas.stream().filter(musicasPorNome).forEach(System.out::println);
			return musicaPorNome;
			
			
		} else {
			 throw new RuntimeException("A lista está vazia!");
		}
	}


	
	
	
	
}
