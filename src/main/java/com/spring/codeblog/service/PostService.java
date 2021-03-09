/**
 * 
 */
package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

/**
 * @author Bruno H. Papait
 *
 */
public interface PostService {
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
}
