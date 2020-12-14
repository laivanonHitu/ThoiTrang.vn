package com.bigshop.service;

import java.util.List;

import com.bigshop.entity.Post;

public interface postService {
	public void save(Post post);
	public List<Post> getAllPost();
	public void updatePost(Post post);
	public Post getPostById(int id);
	public void deletePost(int id);
}
