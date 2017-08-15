package zard.xx.gly.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by XX on 2017/8/16.
 *
 * Class of Province
 * “省的实体类”
 * LitePal make it must extends from "DataSupport"
 *LitePal的实体类必须继承自DataSupport
 */
public class Province extends DataSupport {

    private int id;
    //the name of province
    //省名
    private String provinceName;
    //the code of province
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
