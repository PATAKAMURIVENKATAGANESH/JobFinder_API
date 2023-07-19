package com.Project.Jobfinder.Repository;

import com.Project.Jobfinder.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String test);
}
