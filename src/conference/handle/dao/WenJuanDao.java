package conference.handle.dao;

import java.util.List;

import conference.handle.bean.WenJuan;

public interface WenJuanDao {
	 //插入的同时返回问卷信息
	   boolean insert(String sql,WenJuan wj);
	   //返回状态
	   boolean delete(String sql,int oid,String meet_title);
	   //id查询,oid或者qid，返回集合，可多，可少
	   List<WenJuan> find(String sql,int oid,String meet_title);
	   //查询所有问卷1
	   List<WenJuan> findAll();
	   List<WenJuan> find(String sql,WenJuan wj);
}
