# springboot-https

# 说明，本项目除了暴露了https端口以外，还额外暴露了一个http端口。

## 第一步：生成证书
//生成证书的命令
> keytool -genkey -alias tomcat -keyalg RSA -keystore /home/gzr/tomcat.keystore 
+ -alias:指定证书的别名
- -keyalg：指定证书的算法
* -keystore：指定证书生成的地址（目录需要提前建好，否则会报错）

## 第二步将生成好的证书放到项目中，
我是将证书放到resource下的META-INF下

## 第三步配置springboot的application.yml文件
参考本项目的配置

## 第四步 在本项目的spring.boot.httpsSpringbootHttpCnf类中有配置的http的端口
为常量 HTTP_PORT，可根据需要更改。

## 第五步启动项目

## 第六步访问验证
* 访问http://ip:1667/https-request/test 会提示需要tls
* 访问https://ip:1667/https-request/test 会得到返回结果：
>{
    "result": "请求成功"
>}







