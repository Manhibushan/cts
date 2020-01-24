package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.sql.SQLException;

public interface PostDao {
	public Post createpost(Post post);
	public void postdelete(int id)throws SQLException;
	public void commmenttdelete(int id)throws SQLException;
	
	

}
