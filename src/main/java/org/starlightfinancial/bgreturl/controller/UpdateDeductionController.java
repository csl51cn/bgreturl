package org.starlightfinancial.bgreturl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017-7-22.
 */
@RestController
public class UpdateDeductionController {

    @RequestMapping("/updateDeduction")
    public String UpdateDeduction(HttpServletRequest request) {
        System.out.println(request.getQueryString());
        System.out.println("Greetings from Spring Boot!");
        return "Greetings from Spring Boot!";
    }
}
