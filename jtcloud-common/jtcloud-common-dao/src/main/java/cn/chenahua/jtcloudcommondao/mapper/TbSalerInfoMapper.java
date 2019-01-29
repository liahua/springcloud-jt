package cn.chenahua.jtcloudcommondao.mapper;

import cn.chenahua.jtcloudcommondao.po.TbSalerInfo;
import cn.chenahua.jtcloudcommondao.po.TbSalerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbSalerInfoMapper {
    int countByExample(TbSalerInfoExample example);

    int deleteByExample(TbSalerInfoExample example);

    int insert(TbSalerInfo record);

    int insertSelective(TbSalerInfo record);

    List<TbSalerInfo> selectByExampleWithBLOBs(TbSalerInfoExample example);

    List<TbSalerInfo> selectByExample(TbSalerInfoExample example);

    int updateByExampleSelective(@Param("record") TbSalerInfo record, @Param("example") TbSalerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TbSalerInfo record, @Param("example") TbSalerInfoExample example);

    int updateByExample(@Param("record") TbSalerInfo record, @Param("example") TbSalerInfoExample example);
}