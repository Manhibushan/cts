package hibernatemappingbi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="myimg")

public class Myimage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "imgurl")
	private String imgurl;

	

	@OneToOne(mappedBy = "myimage", cascade = CascadeType.ALL)
	private Album album;



	public Myimage() {
		
	}



	public Myimage( String imgurl) {
		super();
		
		this.imgurl = imgurl;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getImgurl() {
		return imgurl;
	}



	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}



	public Album getAlbum() {
		return album;
	}



	public void setAlbum(Album album) {
		this.album = album;
	}



	@Override
	public String toString() {
		return "Myimage [id=" + id + ", imgurl=" + imgurl + ", album=" + album + "]";
	}
	
	
	
}
