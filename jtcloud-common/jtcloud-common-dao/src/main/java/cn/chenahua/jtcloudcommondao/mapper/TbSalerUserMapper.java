package cn.chenahua.jtcloudcommondao.mapper;

import cn.chenahua.jtcloudcommondao.po.TbSalerUser;
import cn.chenahua.jtcloudcommondao.po.TbSalerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbSalerUserMapper {
    int countByExample(TbSalerUserExample example);

    int deleteByExample(TbSalerUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSalerUser record);

    int insertSelective(TbSalerUser record);

    List<TbSalerUser> selectByExample(TbSalerUserExample example);

    TbSalerUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSalerUser record, @Param("example") TbSalerUserExample example);

    int updateByExample(@Param("record") TbSalerUser record, @Param("example") TbSalerUserExample example);

    int updateByPrimaryKeySelective(TbSalerUser record);

    int updateByPrimaryKey(TbSalerUser record);
}