# javaW Web login with account authentication with MySQL
1. 创建一个简单的登录界面，实现注册，登录功能。用MySQL实现账户验证。  

2. 依赖的jar包有：  
commons-dbutils-1.7.jar  
mysql-connector-java-5.1.48.jar  
mchange-commons-java-0.2.19.jar  
itcast-tools-1.4.2.jar  
javax.servlet-api-3.1.0.jar   
postgresql-42.2.8.jar  
c3p0-0.9.5.5.jar  
jstl-1.2.jar  

3. 数据库设计：  
安装local MySQL, database: testing, table: account  
table columns: name(PK), password

4. 数据库配置：  
修改文件c3p0-config.xml，更改文件中的XXXX为自己本地数据库的对应数据