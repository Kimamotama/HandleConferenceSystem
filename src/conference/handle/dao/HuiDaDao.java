package conference.handle.dao;

import java.util.List;

import conference.handle.bean.HuiDa;

public interface HuiDaDao {
	   boolean insert(String sql,HuiDa hd);
	   //返回状态
	   boolean delete(String sql,int aid,String meet_title);
	   //id查询,oid或者qid，返回集合，可多，可少
	   List<HuiDa> find(String sql,int qid,String meet_title);
	   //查询所有回答1
	   List<HuiDa> findAll();
	   List<HuiDa> find(String sql,HuiDa hd);
}
