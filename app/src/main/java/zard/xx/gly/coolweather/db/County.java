package zard.xx.gly.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by XX on 2017/8/16.
 *
 * Class of County
 * 县的实体类
 */
public class County extends DataSupport {

    private int id;
    //the name of county
    //县名
    private String countyName;
    //the weather's of the county
    //县的天气
    private String weatherId;
    //the id of the city where the county is
    //当前县所在的市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
