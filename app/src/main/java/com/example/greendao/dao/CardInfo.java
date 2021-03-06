package com.example.greendao.dao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "CARD_INFO".
 */
@Entity
public class CardInfo {

    @Id
    private Long id;

    @NotNull
    private String card;
    private Integer num;

    @Generated(hash = 543519054)
    public CardInfo(Long id, @NotNull String card, Integer num) {
        this.id = id;
        this.card = card;
        this.num = num;
    }

    @Generated(hash = 555217359)
    public CardInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getNum() {
        return this.num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


}
