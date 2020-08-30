package com.mimu.simple.single.server.model;
import java.io.Serializable;
import java.util.Objects;

public class SchoolSchoolInfo implements Serializable {
    private int id;
    private int serial;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolSchoolInfo that = (SchoolSchoolInfo) o;
        return id == that.id &&
                serial == that.serial &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial, name, address);
    }

    @Override
    public String toString() {
        return "SchoolSchoolInfo{" +
                "id=" + id +
                ", serial=" + serial +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
