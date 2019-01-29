package cn.chenahua.jtcloudprovideritems;


import cn.chenahua.jtcloudcommondao.mapper.TbCartMapper;
import cn.chenahua.jtcloudcommondao.po.TbCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class JtcloudProviderItemsApplicationTests {


    @Autowired
    private TbCartMapper tbCartMapper;

    @Test
    public void testMapper() {
        TbCart tbCart = tbCartMapper.selectByPrimaryKey(1L);
        System.out.println("tbCart = " + tbCart);
    }
}

