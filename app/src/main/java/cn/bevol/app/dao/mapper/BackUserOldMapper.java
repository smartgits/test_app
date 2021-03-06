package cn.bevol.app.dao.mapper;




import org.apache.ibatis.annotations.Param;
import cn.bevol.app.entity.model.UserBlackList;

import java.util.List;

/**
 *  
 * @author chenHaiJian
 *
 */
public interface BackUserOldMapper {
	
	List<UserBlackList> getUserBlackList();

	int insertUserBlackList(UserBlackList userBlackList);

	int insertUserBlackList2(UserBlackList userBlackList);

	int deleteBlackList(@Param("userId") long userId);

	int updateBlackList(UserBlackList userBlackList);

	UserBlackList getUserBlackById(@Param("userId") long userId);
}
