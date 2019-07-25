package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit {

    private LocalDate date;
    private String descriptino;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescriptino() {
        return descriptino;
    }

    public void setDescriptino(String descriptino) {
        this.descriptino = descriptino;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
