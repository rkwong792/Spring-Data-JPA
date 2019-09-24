package io.javabrains.Spring.JPA.Tutorial.model;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {}
