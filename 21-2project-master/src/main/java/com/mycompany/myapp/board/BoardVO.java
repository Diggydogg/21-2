package com.mycompany.myapp.board;

public class BoardVO {
	
	private int seq;
	/*
	private String title;
	private String writer;
	private String content;
	*/
	private String date;
	private String weather;
	private float temp;
	private float sensTemp;
	private float humidity;
	private float wind;
	private String img;
	
	
	
	
	
	
	public int getSeq() {
		return seq;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getSensTemp() {
		return sensTemp;
	}
	public void setSensTemp(float sensTemp) {
		this.sensTemp = sensTemp;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getWind() {
		return wind;
	}
	public void setWind(float wind) {
		this.wind = wind;
	}
	
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getImg(String img) {
		return img;
	}

	
	
	/*
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	*/
	
	
}
