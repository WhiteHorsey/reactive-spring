package com.reactive.todo.mapper;


import com.reactive.todo.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

   PersonResource toResource(Person person);

}