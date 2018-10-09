package com.example.greendao;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.greendao.dao.DaoMaster;
import com.example.greendao.dao.DaoSession;

/**
 * Application类
 * Created by tnn on 2016/6/13.
 */
public class MyApp extends Application {

    private static DaoSession daoSession;
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        setupDatabase();
    }

    // 获取ApplicationContext
    public static Context getContext() {
        return mContext;
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //创建数据库shop.db"
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "user.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }

    public static int getUserId() {
        return 0;
    }
}
