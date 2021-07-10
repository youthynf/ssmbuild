## 配置文件主要作用说明
#### 1、pom.xml：依赖导入配置文件

- 引入项目依赖：Junit，数据库驱动，连接池，servlet，jsp，mybatis，spring，mybatis-spring，spring-mvc，aop等；

- 配置资源过滤文件，避免打包时被忽略；

#### 2、web.xml：web配置文件
- 配置servlet：配置servlet-class、初始化参数contextConfigLocation指向applicationContext.xml，以及servlet-mapping；

- 配置encodingFilter，解决乱码问题;

#### 3、applicationContext.xml：spring总的配置文件
- 导入整合mvc配置文件：spring-dao.xml，spring-mvc.xml，spring-service.xml;

#### 4、spring-dao.xml：spring的dao层配置文件，核心作用是整合mybatis

- 关联数据库文件database.properties;

- 数据库连接池;

- 注册SqlSessionFactory对象;

- 注册扫描Dao接口包，动态实现Dao接口注入到spring容器中;

#### 5、spring-mvc.xml：spring的mvc相关配置文件
- 开启SpringMVC注解驱动;

- 静态资源过滤，默认servlet配置;

- 扫描web相关的bean，即扫描Controller；

- 注册视图解析器；

#### 6、spring-service.xml：spring的service相关配置文件
- 扫描service相关的bean；

- 注册对应的serviceImpl的bean；

- 注册事务管理器；

- 配置aop相关事务；

#### 7、database.properties：数据库连接配置文件
- 记录数据连接相关信息

#### 8、mybatis-config.xml：mybatis核心配置文件
- 配置mybatis日志输出；

- 根据包路径起别名，别名模式是类名小写；

- 绑定注册每个mapper；
