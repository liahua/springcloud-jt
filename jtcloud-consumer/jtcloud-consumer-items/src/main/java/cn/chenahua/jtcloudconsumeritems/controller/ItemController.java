package cn.chenahua.jtcloudconsumeritems.controller;


import cn.chenahua.jtcloudcommondao.po.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class ItemController {


    @RequestMapping("/{id}")
    @ResponseBody
    public TbUser findUser(Long id){

        return null;
    }
}
