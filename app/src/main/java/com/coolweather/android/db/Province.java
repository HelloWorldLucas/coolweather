package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Gonglx on 2017/4/13.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceId;
    private String provinceName;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
