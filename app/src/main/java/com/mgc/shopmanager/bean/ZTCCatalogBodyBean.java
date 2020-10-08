package com.mgc.shopmanager.bean;

public class ZTCCatalogBodyBean {
    public String word;
    public String _referer;

    @Override
    public String toString() {
        return "ZTCCatalogBodyBean{" +
                "word='" + word + '\'' +
                ", _referer='" + _referer + '\'' +
                ", sla='" + sla + '\'' +
                ", isAjaxRequest='" + isAjaxRequest + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getSla() {
        return sla;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public String getIsAjaxRequest() {
        return isAjaxRequest;
    }

    public void setIsAjaxRequest(String isAjaxRequest) {
        this.isAjaxRequest = isAjaxRequest;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String get_referer() {
        return _referer;
    }

    public void set_referer(String _referer) {
        this._referer = _referer;
    }

    public String sla = "json";
    public String isAjaxRequest="true";
    public String token="4c079329";
}
