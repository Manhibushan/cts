package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="post")

public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


	private int id;
	
	private String postId;
	
	private String email;
	
	private String imgurl;
	
	private LocalDate createdate;
	
	
	
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="comment_id")
	private List<Comments> comment=new ArrayList<>();
	
	public Post(String postId, String email, String imgurl, LocalDate createdate) {
		super();
		this.postId = postId;
		this.email = email;
		this.imgurl = imgurl;
		this.createdate = createdate;
		
	}
	
	
	
	
	
	
	
	

}
