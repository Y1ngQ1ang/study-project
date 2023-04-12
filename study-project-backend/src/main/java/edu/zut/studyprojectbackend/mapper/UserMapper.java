package edu.zut.studyprojectbackend.mapper;

import edu.zut.studyprojectbackend.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author y1ngq1ang
 */
@Mapper
public interface UserMapper {
    @Select("select * from db_account where username = #{text} or #{text}")
    Account findAccountByNameOrEmail(String text);
}
