package com.parent.hdavs.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Entity
@Table(name = "humidity")
public class Humidity {
    private int id;
    private String time;
    private int humidity;

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

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", humidity=" + humidity +
                '}';
    }
}
