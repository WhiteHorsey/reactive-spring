package com.reactive.todo.model;

import lombok.Getter;

/**
 * PostgreSQL notification topics
 */
@Getter
public enum NotificationTopic {
   ITEM_SAVED,
   ITEM_DELETED
}