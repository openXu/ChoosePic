package com.openxu.choosepic.bean;

/**
 * GridView��ÿ��item����ݶ���
 * 
 * @author len
 *
 */
public class ImageBean {
	/**
	 * �ļ��еĵ�һ��ͼƬ·��
	 */
	private String topImagePath;
	/**
	 * �ļ�����
	 */
	private String folderName; 
	/**
	 * �ļ����е�ͼƬ��
	 */
	private int imageCounts;
	
	//���ļ��е�·��
	private String  fa_filepath;
	
	public String getTopImagePath() {
		return topImagePath;
	}
	public void setTopImagePath(String topImagePath) {
		this.topImagePath = topImagePath;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public int getImageCounts() {
		return imageCounts;
	}
	public void setImageCounts(int imageCounts) {
		this.imageCounts = imageCounts;
	}
	public String getFa_filepath() {
		return fa_filepath;
	}
	public void setFa_filepath(String fa_filepath) {
		this.fa_filepath = fa_filepath;
	}
	
}
