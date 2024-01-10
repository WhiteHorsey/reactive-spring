package com.reactive.todo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Table // not doing it impacts performance
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class Item {

   @Id
   private Long id;

   @Version
   private Long version;

   @Size(max=4000)
   @NotBlank
   private String description;

   @NotNull
   private ItemStatus status = ItemStatus.TODO;

   private Long assigneeId;

   @Transient
   private Person assignee;

   @Transient
   private List<Tag> tags;

   @CreatedDate
   private LocalDateTime createdDate;

   @LastModifiedDate
   private LocalDateTime lastModifiedDate;

}