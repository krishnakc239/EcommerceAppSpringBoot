package com.edu.mum.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email", unique = true, nullable = false)
//    @Email(message = "*Please provide a valid Email")
//    @NotBlank(message = "*Please provide an email")
    private String email;

    @Column(name = "password", nullable = false)
//    @Length(min = 5, message = "*Your password must have at least 5 characters")
//    @NotBlank(message = "*Please provide your password")
//    @JsonIgnore
    private String password;

    @Column(name = "username", nullable = false, unique = true)
//    @Length(min = 5, message = "*Your username must have at least 5 characters")
//    @NotBlank(message = "*Please enter your username")
    private String username;

    @Column(name = "first_name")
//    @org.hibernate.validator.constraints.NotEmpty(message = "*Please provide your name")
    private String firstName;

    @Column(name = "last_name")
//    @NotBlank(message = "*Please provide your last name")
    private String lastName;

    @Column(name = "active", nullable = false)
    private int active;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

    private Collection<Role> roles;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)

//    private Collection<Post> posts;


//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    private Account account;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    @ToString.Exclude
//    private List<Payment> payments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

//    public Collection<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(Collection<Post> posts) {
//        this.posts = posts;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
//
//    public List<Payment> getPayments() {
//        return payments;
//    }
//
//    public void setPayments(List<Payment> payments) {
//        this.payments = payments;
//    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", active=" + active +
                ", roles=" + roles +
                '}';
    }
}
