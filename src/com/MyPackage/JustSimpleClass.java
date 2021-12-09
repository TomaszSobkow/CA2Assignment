package com.MyPackage;

import java.time.LocalDate;
import java.util.Objects;

public class JustSimpleClass {

    private String myClass;
    private LocalDate date;

    public JustSimpleClass(String myClass, LocalDate date) {
        this.myClass = myClass;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JustSimpleClass that = (JustSimpleClass) o;
        return myClass.equals(that.myClass) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myClass, date);
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
