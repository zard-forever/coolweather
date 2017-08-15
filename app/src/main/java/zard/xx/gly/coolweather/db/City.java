package zard.xx.gly.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by XX on 2017/8/16.
 *
 * Class Of City
 * 城市实体类
 */
public class City extends DataSupport {

    private int id;
    //The name of city
    //市名
    private String cityName;
    //The code of city
    //市的代号
    private int cityCode;
    //the id of the province where the city is
    //市所在的省的id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
