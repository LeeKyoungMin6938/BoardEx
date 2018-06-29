package a.b.exam.one;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class MyRepository {
	@Autowired
	private SqlSession sql;
	
	public List<String> getAll(){
		List<String> countryList = sql.selectList("SqlSampleMapper.selectSample");		
		return countryList;
	}
}
