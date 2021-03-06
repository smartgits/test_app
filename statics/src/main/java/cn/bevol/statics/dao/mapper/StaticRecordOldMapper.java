package cn.bevol.statics.dao.mapper;

import java.util.List;

import cn.bevol.statics.entity.model.StaticRecord;
import cn.bevol.statics.dao.db.Paged;

public interface StaticRecordOldMapper {

	int insert(StaticRecord record);
	int insertOrUpdate(StaticRecord record);
	int selectTotal(Paged<StaticRecord> paged);
	/***
	 * 没有修改过的
	 * @param paged
	 * @return
	 */
	int selectNoAgainTotal(Paged<StaticRecord> paged);
	/***
	 * 没有修改过的集合
	 * @return
	 */
	List<StaticRecord> staticRecordByAgainPage(Paged<StaticRecord> paged);
	
	List<StaticRecord> staticRecordByPage(Paged<StaticRecord> paged);
	
	List<StaticRecord> recordTotal();
	int update(StaticRecord record);
	
}
