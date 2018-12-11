package fi.haagahelia.spring.weatherdiary.domain;

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
	private Long weatherid;
	
	/**
	 * @param weatherdate
	 * @param location
	 * @param temperature
	 * @param description
	 */
	public Weather(Date weatherdate, String location, String temperature,
			String description) {
		super();
		this.weatherdate = weatherdate;
		this.location = location;
		this.temperature = temperature;
		this.description = description;
	}

	@Column(name="weatherdate")
	private Date weatherdate;	
	
	@Column(name="location")
	private String location;
	
	@Column(name="temperature")
	private String temperature;
	
	@Column(name="description")
	private String description;
	
	/**
	 * 
	 */
	public Weather() {
	}
	
	/**
	 * @param id
	 * @param description
	 * @param location
	 * @param date
	 */
	public Weather(Long id, String description, String location, Date date) {
		super();
		this.weatherid = id;
		this.description = description;
		this.location = location;
		this.weatherdate = date;
	}

	/**
	 * @param description
	 * @param location
	 */
	public Weather(String description, String location) {
		super();
		this.description = description;
		this.location = location;
	}
		

	/**
	 * @param id
	 * @param description
	 * @param location
	 */
	public Weather(Long id, String description, String location) {
		super();
		this.weatherid = id;
		this.description = description;
		this.location = location;

	}	

	/**
	 * @param description
	 * @param location
	 * @param date
	 */
	public Weather(String description, String location, Date date) {
		super();
		this.description = description;
		this.location = location;
		this.weatherdate = date;
	}	

	/**
	 * @param location
	 * @param date
	 */
	public Weather(String location, Date date) {
		super();
		this.location = location;
		this.weatherdate = date;
	}
	
	/**
	 * @return the weatherid
	 */
	public Long getWeatherid() {
		return weatherid;
	}

	/**
	 * @param weatherid the weatherid to set
	 */
	public void setWeatherid(Long weatherid) {
		this.weatherid = weatherid;
	}

	/**
	 * @return the weatherdate
	 */
	public Date getWeatherdate() {
		return weatherdate;
	}

	/**
	 * @param weatherdate the weatherdate to set
	 */
	public void setWeatherdate(Date weatherdate) {
		this.weatherdate = weatherdate;
	}

	/**
	 * @param weathertext the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the id
	 */
	public String getDescription() {
		return description;
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
		return weatherdate;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.weatherdate = date;
	}
	
	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weather [id=" + weatherid + ", description=" + description
				+ ", location=" + location + ", temperature=" + temperature+ ", date=" + weatherdate + "]";
	}
	
}
