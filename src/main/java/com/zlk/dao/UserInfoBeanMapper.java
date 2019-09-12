package com.zlk.dao;
import com.zlk.bean.UserInfoBean;

public interface UserInfoBeanMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfoBean record);

    int insertSelective(UserInfoBean record);

    UserInfoBean selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfoBean record);

    int updateByPrimaryKey(UserInfoBean record);
}
