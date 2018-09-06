package com.yk.recaptcha.dto;


/**
 * @author yikang
 */
public class RecaptchaDTO {

    private String key;
    private String verifyCode;

    public RecaptchaDTO(String key, String verifyCode) {
        this.key = key;
        this.verifyCode = verifyCode;
    }

    public RecaptchaDTO() {
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
