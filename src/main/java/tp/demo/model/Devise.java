package tp.demo.model;

public class Devise {

    private String code;
    private String nom;
    private Double change;

    public Devise() {
    }

    public Devise(String code, String nom, Double change) {
        this.code = code;
        this.nom = nom;
        this.change = change;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Devise{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", change=" + change +
                '}';
    }
}
