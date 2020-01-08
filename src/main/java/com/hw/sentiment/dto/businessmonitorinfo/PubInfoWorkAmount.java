package com.hw.sentiment.dto.businessmonitorinfo;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 按业务统计的全国舆情数目信息区
 */
@XmlRootElement(name = "PubInfoWorkAmount")
public class PubInfoWorkAmount {
    private String PubInfoDepartmentWorkType;
    private String CountryPubInfoWorkAmount;
    private List<CountryPubInfoWorkID> CountryPubInfoWorkIDArea;
    private List<CountryPubInfoWorkEmotion> CountryPubInfoWorkEmotionArea;
    private String ProvinceNum;
    private List<ProvincePubInfoWorkAmountArea> ProvincePubInfoWorkAmountArea;

    public String getPubInfoDepartmentWorkType() {
        return PubInfoDepartmentWorkType;
    }
    @XmlElement(name = "PubInfoDepartmentWorkType")
    public void setPubInfoDepartmentWorkType(String pubInfoDepartmentWorkType) {
        PubInfoDepartmentWorkType = pubInfoDepartmentWorkType;
    }

    public String getCountryPubInfoWorkAmount() {
        return CountryPubInfoWorkAmount;
    }
    @XmlElement(name = "CountryPubInfoWorkAmount")
    public void setCountryPubInfoWorkAmount(String countryPubInfoWorkAmount) {
        CountryPubInfoWorkAmount = countryPubInfoWorkAmount;
    }

    public List<CountryPubInfoWorkID> getCountryPubInfoWorkIDArea() {
        return CountryPubInfoWorkIDArea;
    }
    @XmlElement(name = "CountryPubInfoWorkIDArea")
    public void setCountryPubInfoWorkIDArea(List<CountryPubInfoWorkID> countryPubInfoWorkIDArea) {
        CountryPubInfoWorkIDArea = countryPubInfoWorkIDArea;
    }

    public List<CountryPubInfoWorkEmotion> getCountryPubInfoWorkEmotionArea() {
        return CountryPubInfoWorkEmotionArea;
    }
    @XmlElement(name = "CountryPubInfoWorkEmotionArea")
    public void setCountryPubInfoWorkEmotionArea(List<CountryPubInfoWorkEmotion> countryPubInfoWorkEmotionArea) {
        CountryPubInfoWorkEmotionArea = countryPubInfoWorkEmotionArea;
    }

    public String getProvinceNum() {
        return ProvinceNum;
    }
    @XmlElement(name = "ProvinceNum")
    public void setProvinceNum(String provinceNum) {
        ProvinceNum = provinceNum;
    }

    public List<ProvincePubInfoWorkAmountArea> getProvincePubInfoWorkAmountArea() {
        return ProvincePubInfoWorkAmountArea;
    }
    @XmlElement(name = "ProvincePubInfoWorkAmountArea")
    public void setProvincePubInfoWorkAmountArea(List<ProvincePubInfoWorkAmountArea> provincePubInfoWorkAmountArea) {
        ProvincePubInfoWorkAmountArea = provincePubInfoWorkAmountArea;
    }
}
