package com.yk.recaptcha.dto;

import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author yikang
 * @Date 2019-09-25
 **/
@Data
public class Result<T> {

    private T data;
    private String message;
    private boolean success;
}
