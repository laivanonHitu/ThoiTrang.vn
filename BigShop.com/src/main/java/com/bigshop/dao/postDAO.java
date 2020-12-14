package com.bigshop.dao;

import java.util.List;

import com.bigshop.entity.Post;

public interface postDAO {
	public void save(Post post);
	public List<Post> getAllPost();
	public void updatePost(Post post);
	public void deletePost(int id);
	public Post getPostById(int id);
}
