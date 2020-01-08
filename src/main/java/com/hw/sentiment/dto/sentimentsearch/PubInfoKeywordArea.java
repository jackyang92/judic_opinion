package com.hw.sentiment.dto.sentimentsearch;

import javax.xml.bind.annotation.*;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 描述信息
 */
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PubInfoKeywordArea")
//@XmlType(propOrder = { "Keayword" })
public class PubInfoKeywordArea  {

    private String Keayword;

    public String getKeayword() {
        return Keayword;
    }
    @XmlElement(name="Keayword")
    public void setKeayword(String Keayword) {
        this.Keayword = Keayword;
    }
}
