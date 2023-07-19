package com.Project.Jobfinder.Repository;

import com.Project.Jobfinder.model.Post;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.AggregateIterable;

@Component
public class SearchRepositoryImpl implements SearchRepository{


    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Override
    public List<Post> findByText(String test) {
        final List<Post> posts= new ArrayList<>();



        MongoDatabase database = client.getDatabase("JobDetails");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text", new Document("query", test).append("path", Arrays.asList("desc", "Salary", "Base")))),
                        new Document("$sort", new Document("Salary", -1L))));

        result.forEach(doc -> posts.add(converter.read(Post.class,doc)) );

        return posts;
    }
}
