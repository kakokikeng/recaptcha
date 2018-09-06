package com.yk.recaptcha.service;

import com.t4f.gaea.dto.Result;
import com.yk.recaptcha.dto.RecaptchaDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;



@Service
public interface RecaptchaService {


    Mono<Result> validate(RecaptchaDTO recaptchaDTO);

    Mono<byte[]> imageValidateCode(String keyId);

    Mono<String> getKey(String exChars);

}
