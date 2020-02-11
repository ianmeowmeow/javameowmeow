package javameowmeow;

public interface Database_Interface {
	int IsExist(String path);
	DataRow ReadRow(long ID);
	DataRow[] SearchByColumn(String column);
	int AddData(DataRow dat);
	int RemoveData(long ID);
}