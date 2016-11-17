package org.donie.web.controller;

import org.donie.web.vo.Foo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

/**
 * Created by donie on 2016/11/16.
 */
@Controller
public class FooController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    @ResponseBody
    public Foo findById(@PathVariable long id) {
        return
                new Foo(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public Foo test() {
        return
                new Foo(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    @RequestMapping("/home")
    public String home() {
       return "home";
    }
    @RequestMapping("/interception")
    public String interception() {
        return "interception";
    }


}
