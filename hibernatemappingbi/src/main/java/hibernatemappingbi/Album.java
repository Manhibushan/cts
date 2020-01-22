package hibernatemappingbi;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Entity
@Table(name="album")
public class Album {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="imgname")
	private String imgname;
	@Column(name="date")
	private LocalDate date;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "myimgid")
	private Myimage myimage;
	public Album() {
		
	}
	public Album( String imgname, LocalDate date) {
		super();
		
		this.imgname = imgname;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Myimage getMyimage() {
		return myimage;
	}
	public void setMyimage(Myimage myimage) {
		this.myimage = myimage;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", imgname=" + imgname + ", date=" + date + ", myimage=" + myimage + "]";
	}
	
	
	

}
