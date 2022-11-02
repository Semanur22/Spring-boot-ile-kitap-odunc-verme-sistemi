package com.internetprogramlama.librarymanagement.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bId;

    @Column(name="kitap_ad", nullable = false)
    private String kitapAdi;

    public Book(){

    }
    public Book(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }


}
