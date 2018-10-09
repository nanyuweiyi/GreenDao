package com.example.greendao.dao;

import com.example.greendao.MyApp;

import java.util.List;

public class CardInfoManager {

    /**
     * 添加数据，如果有重复则覆盖
     *
     * @param cardInfo
     */
    public static void insert(CardInfo cardInfo){
        MyApp.getDaoInstant().getCardInfoDao().insertOrReplace(cardInfo);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void delete(long id){
        MyApp.getDaoInstant().getCardInfoDao().deleteByKey(id);
    }

    /**
     * 删除数据
     */
    public static void deleteAll(){
        MyApp.getDaoInstant().getCardInfoDao().deleteAll();
    }

    /**
     * 更新数据
     *
     * @param cardInfo
     */
    public static void update(CardInfo cardInfo){
        MyApp.getDaoInstant().getCardInfoDao().update(cardInfo);
    }

    /**
     * 查询数据
     */
    public static List<CardInfo> queryAll(){
        return MyApp.getDaoInstant().getCardInfoDao().loadAll();
    }

    /**
     * 查询条件为ID=id的数据
     *
     * @return
     */
    public static List<CardInfo> query(int id) {
        return MyApp.getDaoInstant().getCardInfoDao().queryBuilder().where(CardInfoDao.Properties.Id.eq(id)).list();
    }


}
