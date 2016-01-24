package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by ansonliu on 2015/10/27.
 */
@RepositoryRestResource(collectionResourceRel = "todo", path = "todo")
public interface TodoRepository extends PagingAndSortingRepository<Todo, String>{


    List<Todo> findByMessage(@Param("message") String message);


    //String login();

}
