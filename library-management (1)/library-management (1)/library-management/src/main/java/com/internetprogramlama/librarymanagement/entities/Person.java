package com.internetprogramlama.librarymanagement.entities;


import javax.persistence.*;

@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="ad_soyad",nullable = false)
    private String adSoyad;

    @Column(name="email")
    private String email;
    @Column(name="tc")
    private Long tc;

    @Column(name="tel_no")
    private Long telNo;

    public Person() {

    }
    public Person( String adSoyad, String email, Long tc, Long telNo) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.tc = tc;
        this.telNo=telNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public Long getTelNo() {
        return telNo;
    }

    public void setTelNo(Long telNo) {
        this.telNo = telNo;
    }
}
