package cn.chenahua.jtcloudproviderapiuser.service;


import cn.chenahua.jtcloudcommondao.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROVIDER-ITEMS")
public interface UserService {
    @RequestMapping("/findUser")
    User findUser(Long id);
}
