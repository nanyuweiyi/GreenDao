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
    
2、实现Bean类（数据库实体模型），然后在AndroidStudio导航栏找到Build  点击Make Project,自动生成相关类


注解解析:
@Entity 标记该类为数据库实体模型,指示GreendDao生成代码

@Id(autoincrement = true) 配置id自动增长

@Unique 字段约束,保证值唯一

@NotNull 字段不允许为空

@Property(nameInDb = "username") 设置该列名非默认,采用自定义

@Transient 设置该键在数据库中排除

    
