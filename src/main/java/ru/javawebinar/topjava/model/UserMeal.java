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
    protected Integer vkId;

    @Column(name = "phone", nullable = false)
    @NotEmpty
    protected String phone;

    @Column(name = "mail", nullable = false)
    @NotEmpty
    protected String mail;

    @Column(name = "user_name", nullable = false)
    @NotEmpty
    protected String userName;

    @Column(name = "status", nullable = false)
    @NotEmpty
    protected String status;

    @Column(name = "app_id", nullable = false)
    @NotEmpty
    protected Integer appId;

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
            int vkId,
            String phone,
            String mail,
            String userName,
            String status,
            int appId) {
        super(id);
        this.dateTime = dateTime;
        this.description = description;
        this.description2 = description2;
        this.calories = calories;
        this.login = login;
        this.password = password;
        this.vkId = vkId;
        this.phone = phone;
        this.mail = mail;
        this.userName = userName;
        this.status = status;
        this.appId = appId;
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
        return vkId;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    public int getAppId() {
        return appId;
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

    public void setVkId(int vkId) {
        this.vkId = vkId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppId(int appId) {
        this.appId = appId;
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
                ", vk_id=" + vkId +
                ", phone=" + phone +
                ", mail=" + mail +
                ", user_name=" + userName +
                ", status=" + status +
                ", appId=" + appId +
                '}';
    }
}