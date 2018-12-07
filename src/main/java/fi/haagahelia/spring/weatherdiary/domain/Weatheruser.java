package fi.hh.SWD4TN022.saapaivakirja.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Weatheruser {

	@Id
	@Column(name = "weatheruser_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	@Column(name = "weatheruser_name")
	private String weatherusername;
	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "weatheruser")
	private List<Weatheruser> weatherusers;

	public Weatheruser() {
	}

	public Weatheruser(Long id, String weatherusername, String name) {
		super();
		this.id = id;
		this.weatherusername = weatherusername;
		this.name = name;
	}
	
	public Weatheruser(Long id, String weatherusername, String name, List<Weatheruser> weatherusers) {
		super();
		this.id = id;
		this.weatherusername = weatherusername;
		this.name = name;
		this.weatherusers = weatherusers;
	}

	public Weatheruser(String weatherusername, String name, List<Weatheruser> weatherusers) {
		super();
		this.weatherusername = weatherusername;
		this.name = name;
		this.weatherusers = weatherusers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeatherusername() {
		return weatherusername;
	}

	public void setWeatherusername(String weatherusername) {
		this.weatherusername = weatherusername;
	}

	public List<Weatheruser> getWeatherusers() {
		return weatherusers;
	}

	public void setWeatherusers(List<Weatheruser> weatherusers) {
		this.weatherusers = weatherusers;
	}

	//If there's problems merging, don't recreate toString automatically, because questions-list must not be included to avoid endless looping
	@Override
	public String toString() {
		return "Weatheruser [id=" + id + ", weatherusername=" + weatherusername + ", name=" + name
				+ "]";
	}

}