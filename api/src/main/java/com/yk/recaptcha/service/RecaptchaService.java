package com.yk.recaptcha.service;

import com.t4f.gaea.dto.Result;
import com.yk.recaptcha.dto.RecaptchaDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


/**
 *
 *  @Author yikang
 *  @Date 2018/9/6
*/
@Service
public interface RecaptchaService {

    /**
     *  验证码进行验证
     * @param recaptchaDTO 验证信息
     * @return
     *  @Author yikang
     *  @Date 2018/9/6
    */
    Mono<Result> validate(RecaptchaDTO recaptchaDTO);

    /**
     *  生成图片验证码
     * @param keyId 之前获得的key
     * @return
     *  @Author yikang
     *  @Date 2018/9/6
    */
    Mono<byte[]> imageValidateCode(String keyId);

    /**
     *  获得验证码的key
     * @param exChars 排除的字符
     * @return
     *  @Author yikang
     *  @Date 2018/9/6
    */
    Mono<String> getKey(String exChars);

}
