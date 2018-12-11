package com.ssmbuild.domain;

/**
 * 〈用户实体〉
 *
 * @author xiaoyue
 * @create 2018/12/11 10:47
 * @since 1.0.0
 */
public class User {
	
	private String name;
	private int age;
	private int sex;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSex() {
		return sex;
	}
	
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append(", sex=").append(sex);
		sb.append('}');
		return sb.toString();
	}
}