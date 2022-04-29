package com.parent.hdavs.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Entity
@Table(name = "light")
public class Light {
    private int id;
    private String time;
    private int light;

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

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Light{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", light=" + light +
                '}';
    }
}
