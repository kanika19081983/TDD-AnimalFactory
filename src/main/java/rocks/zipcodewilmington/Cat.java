package rocks.zipcodewilmington;

import java.util.Date;

public class Cat {
    private String catName;
    private Date birthDate;
 private Integer ID;
 private String catSpeak;
    public Cat(String catName, Date birthDate, Integer ID, String catSpeak) {
        this.catName = catName;
        this.birthDate = birthDate;
        this.ID = ID;
        this.catSpeak = catSpeak;

    }

    public Cat() {
    }

    public String getCatName() {
        return catName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Integer getID() {
        return ID;
    }

    public String getCatSpeak() {
        return catSpeak;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setCatSpeak(String catSpeak) { this.catSpeak = catSpeak;

    }


}





