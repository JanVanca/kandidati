package sk.janvanca.ObceVolby.dto;

import java.util.Objects;

public class NamesDto {
    private Integer id;
    private String name;
    private Character gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamesDto namesDto = (NamesDto) o;
        return Objects.equals(id, namesDto.id) && Objects.equals(name, namesDto.name) && Objects.equals(gender, namesDto.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender);
    }

    @Override
    public String toString() {
        return "NamesDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
