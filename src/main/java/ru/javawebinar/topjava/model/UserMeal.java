package ru.javawebinar.topjava.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by Samusia
 * on 27.11.2015.
 */
@NamedQueries({
        @NamedQuery(name = UserMeal.GET, query = "SELECT m FROM UserMeal m WHERE m.id=:id AND m.user.id=:userId"),
        @NamedQuery(name = UserMeal.ALL_SORTED, query = "SELECT m FROM UserMeal m WHERE m.user.id=:userId ORDER BY m.dateTime DESC"),
        @NamedQuery(name = UserMeal.DELETE, query = "DELETE FROM UserMeal m WHERE m.id=:id AND m.user.id=:userId"),
        @NamedQuery(name = UserMeal.GET_BETWEEN,
                query = "SELECT m from UserMeal m WHERE m.user.id=:userId " +
                        " AND m.dateTime BETWEEN :startDate AND :endDate ORDER BY m.dateTime DESC"),

//        @NamedQuery(name = UserMeal.UPDATE, query = "UPDATE UserMeal m SET m.dateTime = :datetime, m.calories= :calories," +
//                "m.description=:desc where m.id=:id and m.user.id=:userId")
})
@Entity
@Table(name = "accounts")
public class UserMeal extends BaseEntity {
    public static final String GET = "UserMeal.get";
    public static final String ALL_SORTED = "UserMeal.getAll";
    public static final String DELETE = "UserMeal.delete";
    public static final String GET_BETWEEN = "UserMeal.getBetween";

    @Column(name = "date_time", nullable = false)
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    protected LocalDateTime dateTime;

    @Column(name = "description", nullable = false)
    @NotEmpty
    protected String description;

    @Column(name = "description2", nullable = false)
    @NotEmpty
    protected String description2;

    @Column(name = "calories")
    @Range(min = 10, max = 5000)
    @NotNull
    protected Integer calories;

    @Column(name = "login", nullable = false)
    @NotEmpty
    protected String login;

    @Column(name = "pasword", nullable = false)
    @NotEmpty
    protected String password;

    @Column(name = "vk_id")
    @NotNull
    protected Integer vk_id;

    @Column(name = "phone", nullable = false)
    @NotEmpty
    protected String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public UserMeal() {
    }

    public UserMeal(
            Integer id,
            LocalDateTime dateTime,
            String description,
            String description2,
            int calories,
            String login,
            String password,
            int vk_id,
            String phone) {
        super(id);
        this.dateTime = dateTime;
        this.description = description;
        this.description2 = description2;
        this.calories = calories;
        this.login = login;
        this.password = password;
        this.vk_id = vk_id;
        this.phone = phone;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription2() {
        return description2;
    }

    public int getCalories() {
        return calories;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getVkId() {
        return vk_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVkId(int vk_id) {
        this.vk_id = vk_id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", description2='" + description2 + '\'' +
                ", calories=" + calories +
                ", login=" + login +
                ", password=" + password +
                ", vk_id=" + vk_id +
                ", phone=" + phone +
                '}';
    }
}