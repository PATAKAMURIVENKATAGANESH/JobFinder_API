package com.Project.Jobfinder.Repository;

import com.Project.Jobfinder.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
