package fi.hh.SWD4TN022.saapaivakirja.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Weather {

	@Id
	@Column(name="weather_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="weather_text")
	private String weathertext;
	
	@Column(name="location")
	private String location;
	
	@Column(name="weatherdate")
	private Date date;
	
//	@ManyToOne
//	@JsonIgnore
//	@JoinColumn(name = "question_Id")
//	private Question question;	

	/**
	 * 
	 */
	public Weather() {
	}
	
	/**
	 * @param id
	 * @param weathertext
	 * @param location
	 * @param date
	 */
	public Weather(Long id, String weathertext, String location, Date date) {
		super();
		this.id = id;
		this.weathertext = weathertext;
		this.location = location;
		this.date = date;
	}

	/**
	 * @param weathertext
	 * @param location
	 */
	public Weather(String weathertext, String location) {
		super();
		this.weathertext = weathertext;
		this.location = location;
	}
		

	/**
	 * @param id
	 * @param weathertext
	 * @param location
	 */
	public Weather(Long id, String weathertext, String location) {
		super();
		this.id = id;
		this.weathertext = weathertext;
		this.location = location;

	}	

	/**
	 * @param weathertext
	 * @param location
	 * @param date
	 */
	public Weather(String weathertext, String location, Date date) {
		super();
		this.weathertext = weathertext;
		this.location = location;
		this.date = date;
	}	

	/**
	 * @param location
	 * @param date
	 */
	public Weather(String location, Date date) {
		super();
		this.location = location;
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the weathertext
	 */
	public String getWeathertext() {
		return weathertext;
	}

	/**
	 * @param weathertext the weathertext to set
	 */
	public void setWeathertext(String weathertext) {
		this.weathertext = weathertext;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}	

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weather [id=" + id + ", weathertext=" + weathertext
				+ ", location=" + location + ", date=" + date + "]";
	}
	
}
