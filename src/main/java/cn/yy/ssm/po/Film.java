package cn.yy.ssm.po;

public class Film {

	private int film_id;
	
	private String title;
	
	private String description;
	
	private int language_id;
  
	private Language language;
	
	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
