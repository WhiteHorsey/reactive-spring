package com.reactive.todo.exception;


public class ItemNotFoundException extends NotFoundException {


   public ItemNotFoundException(Long id) {
      super(String.format("Item [%d] is not found", id));
   }

}