package ru.javawebinar.topjava.to;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Created by Samusia
 * on 27.11.2015.
 */
public class UserMealWithExceed {
    protected final Integer id;

    protected final LocalDateTime dateTime;

    protected final String description;

    protected final String description2;

    protected final int calories;

    protected final String login;

    protected final String password;

    protected final boolean exceed;

    public UserMealWithExceed(@JsonProperty("id") Integer id,
                              @JsonProperty("dateTime") LocalDateTime dateTime,
                              @JsonProperty("description") String description,
                              @JsonProperty("description2") String description2,
                              @JsonProperty("calories") int calories,
                              @JsonProperty("login") String login,
                              @JsonProperty("password") String password,
                              @JsonProperty("exceed") boolean exceed) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.description2 = description2;
        this.calories = calories;
        this.login = login;
        this.password = password;
        this.exceed = exceed;
    }

    public Integer getId() {
        return id;
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

    public boolean isExceed() {
        return exceed;
    }

    @Override
    public String toString() {
        return "UserMealWithExceed{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", description2='" + description2 + '\'' +
                ", calories=" + calories +
                ", login=" + login +
                ", password=" + password +
                ", exceed=" + exceed +
                '}';
    }
}
