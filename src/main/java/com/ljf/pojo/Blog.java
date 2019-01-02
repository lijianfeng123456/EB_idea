package com.ljf.pojo;

import java.io.Serializable;

/**
 * 3、对操作的对象实现序列化，为二级缓存底层生成数据实现拷贝对象用的，而并非直接将内存中的地址直接返给你
 * 
 * @author ljf
 *
 */
public class Blog implements Serializable{
	private int id;
	private String title;
	private String abstractcontent;
	private int type;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbstractcontent() {
		return abstractcontent;
	}
	public void setAbstractcontent(String abstractcontent) {
//		Map map=new HashMap();
		this.abstractcontent = abstractcontent;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", abstractcontent=" + abstractcontent + ", type=" + type + "]";
	}
	
	
	
}
