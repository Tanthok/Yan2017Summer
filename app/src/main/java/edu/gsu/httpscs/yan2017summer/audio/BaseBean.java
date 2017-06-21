package edu.gsu.httpscs.yan2017summer.audio;

import java.io.Serializable;

/**
 * Created by TanSurface on 6/21/2017.
 */

public class BaseBean implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
