package com.abc.myapp.upload.dao;

import java.util.HashMap;
import java.util.List;

import com.abc.myapp.upload.model.UploadFileVO;

public interface IUploadFileRepository {
	int getMaxFileId();
	void uploadFile(UploadFileVO file);
	
	List<UploadFileVO> getFileList(String directoryName);	// 카테고리가 주어짐
	List<UploadFileVO> getAllFileList();	// 그냥 목록만 갖고 있고, 파일이 보여지게 하면 됨.
	List<UploadFileVO> getImageList(String directoryName);	// 파일을 미리보고 클릭할 수 있게
	
	UploadFileVO getFile(int fileId);
	
	String getDirectoryName(int fileId);
	void updateDirectory(HashMap<String, Object>map);
	
	void deleteFile(int fileId);
	void updateFile(UploadFileVO file);
}
