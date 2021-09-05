package com.relevel.reddit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @since Jul 31, 2021 6:17 PM
 */
@Entity
public class User {
    
    @Id
    private long userId;
}
