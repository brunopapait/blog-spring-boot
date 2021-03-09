package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.PostRepository;

@Component
public class DummyData {

	@Autowired
	private PostRepository postRepository;

//	@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<>();

		Post post1 = new Post();
		post1.setAutor("Bruno H. Papait");
		post1.setData(LocalDate.now());
		post1.setTitulo("Java");
		post1.setTexto(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ");

		Post post2 = new Post();
		post2.setAutor("João V. Papait");
		post2.setData(LocalDate.now());
		post2.setTitulo("Docker");
		post2.setTexto(
				"Mussum Ipsum, cacilds vidis litro abertis. Quem num gosta di mé, boa gentis num é. Atirei o pau no gatis, per gatis num morreus. Manduma pindureta quium dia nois paga. Quem num gosta di mim que vai caçá sua turmis!");

		Post post3 = new Post();
		post3.setAutor("Maria Ap. Papait");
		post3.setData(LocalDate.now());
		post3.setTitulo("AWS");
		post3.setTexto(
				"Bicicleta perdendo freio na descida,  moto estralando, gil chamando pocah de Basculho. Isso aqui ainda vai pegar fogo, vaca entrando no meio de roça!, trator tabaindo com oleo de cabana, arrebentando arame, rasteira baiana, trator tabaindo com oleo de cabana.");

		postList.add(post1);
		postList.add(post2);
		postList.add(post3);

		for (Post post : postList) {
			Post postSaved = postRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}
