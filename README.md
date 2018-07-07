# LXKTview
一个在线课堂项目
项目入口为 Webcontent目录下的index.jsp
1. com.controller包：存放控制器类文件。
2. com.mapper包：存放对数据库操作的接口（是由MyBatis构造器生成的）
3. com.mapping包：对Mapper的具体的实现（MyBatis生成的.xml文件）。
4. com.pojo包：存放的是由数据库映射出的实体类对象。
5. com.service包：存放具体的业务类接口。
6. com.service.Imp包：业务类接口的具体实现。
7. com.config包：存放各类配置文件（具体的数据库连接信息存在jdbc.properties属性文件中）。
8. WebContent下的交互页面。

