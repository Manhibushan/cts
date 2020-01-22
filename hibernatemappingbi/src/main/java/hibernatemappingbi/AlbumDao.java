package hibernatemappingbi;

import java.io.IOException;
import java.util.List;



public interface AlbumDao {
	public Album create(Album album)throws IOException;
	
	public Album findbyId(Integer id);
	public Album update(Integer id) throws IOException;
	public void delete(Integer id);

}
