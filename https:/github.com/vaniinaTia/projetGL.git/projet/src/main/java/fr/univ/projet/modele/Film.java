package fr.univ.projet.modele;

public class Film {
	private int id;
	private String Titre;
	private String Genre;
	private String Pays;
	private String resume;
	private Roles roles;
	
	public Film(int id, String titre, String genre, String pays, String resume,
			Roles roles) {
		super();
		this.id = id;
		Titre = titre;
		Genre = genre;
		Pays = pays;
		this.resume = resume;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
	
	

}
