package com.parent.hdavs.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Entity
@Table(name = "heart")
public class Heart {
    private int id;
    private String time;
    private int heart;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", heart=" + heart +
                '}';
    }
}
