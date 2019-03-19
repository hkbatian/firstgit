package com.android.cloudolp.store.customizeposapplication.bean;

/**
 * Created by zhoucl on 2018/2/28.
 */

public class BaseBean {

    //张三分支
    String str="张三"

//地三尺提交 
    public String name;

    private long baseId;

    public BaseBean() {
        this.baseId = System.currentTimeMillis();
    }

    public long getBaseId() {
        return baseId;
    }

    public void setBaseId(long baseId) {
        this.baseId = baseId;
    }
}
