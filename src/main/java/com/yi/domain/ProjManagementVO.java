package com.yi.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class ProjManagementVO {
	private int proj_no;
	private String proj_name;
	private String proj_cont;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end_date;
	private String progress;
	
	
	public int getProj_no() { 
		return proj_no;
	}
	public void setProj_no(int proj_no) {
		this.proj_no = proj_no;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public String getProj_cont() {
		return proj_cont;
	}
	public void setProj_cont(String proj_cont) {
		this.proj_cont = proj_cont;
	}
	public String getStart_date() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		if(start_date==null) {
			return null;
		}
		return date.format(start_date);
	}
	public Date getStart_dateDate() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		if(end_date==null) {
			return null;
		}
		return date.format(end_date);
	}
	public Date getEnd_dateDate() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public ProjManagementVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjManagementVO(int proj_no, String proj_name, String proj_cont, Date start_date, Date end_date,
			String progress) {
		super();
		this.proj_no = proj_no;
		this.proj_name = proj_name;
		this.proj_cont = proj_cont;
		this.start_date = start_date;
		this.end_date = end_date;
		this.progress = progress;
	}
	@Override
	public String toString() {
		return "projManagement [proj_no=" + proj_no + ", proj_name=" + proj_name + ", proj_cont=" + proj_cont
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", progress=" + progress + "]";
	}
	
	
	
}
