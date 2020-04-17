package com.lazydev.stksongbook.webapp.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * This is the model class of the User Role entity. It is used for determining whether the User is an admin,
 * moderator or regular user and giving them proper permissions within the application.
 *
 * @author Andrzej Przybysz
 * @version 1.0
 */

@Entity
@Table(name = "user_roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(exclude = "users")
//@EntityListeners(AuditingEntityListener.class)
public class UserRole {

  /**
   * @param id is the Primary Key in the table. By definition, it must be unique.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  /**
   * @param name represents the name of the role. It must be unique.
   */
  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @OneToMany(mappedBy = "userRole")
  private Set<User> users;

  //TODO add some kind of permissions
}
