package com.newegg.ec.cache.app.controller;

import com.newegg.ec.cache.app.model.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jay.H.Zou
 * @date 2018/4/28
 */

@Controller
public class IndexConttroller {

    @RequestMapping("/")
    public String accessIndex() {
        return "index";
    }

    @RequestMapping(value = "/heartbeat", method = RequestMethod.GET)
    @ResponseBody
    public Response heartBeat() {
        return Response.Success();
    }

    /**
     * TODO: 后期会移动
     */
    @RequestMapping("/pages/createCluster")
    public String accessCreateCluster() {
        return "createCluster";
    }

    /**
     * TODO: 后期会移动
     */
    @RequestMapping("/pages/managerCluster")
    public String accessManagerCluster() {
        return "managerCluster";
    }

}
