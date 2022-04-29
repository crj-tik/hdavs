package com.parent.hdavs.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Entity
@Table(name = "tilt")
public class Tilt {
    private int id;
    private String time;
    private int tilt;


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

    public int getTile() {
        return tilt;
    }

    public void setTile(int tilt) {
        this.tilt = tilt;
    }

    @Override
    public String toString() {
        return "Tilt{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", tile=" + tilt +
                '}';
    }
}
