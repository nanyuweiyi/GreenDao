# GreenDao
GreenDao3.0使用

1、引入依赖

    implementation 'org.greenrobot:greendao:3.2.2'
    implementation 'org.greenrobot:greendao-generator:3.2.2'
    
    ```
    //greendao配置
    greendao {
        //版本号，升级时可配置
        schemaVersion 1
        targetGenDir 'src/main/java' //生成文件路径
    }
    ```
    
2、实现Bean类，然后在AndroidStudio导航栏找到Build  点击Make Project,自动生成相关类
    
