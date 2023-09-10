
# oj-backend-microservice

#### 介绍
​	基于Spring Boot + Spring Cloud 微服务 + MQ + Docker（+ Vue 3 ）的编程题目在线判题系统。系统能够根据管理员 预设的题目用例对用户提交的代码进行执行和评测，自主实现的代码沙箱可作为独立服务供其他开发者调用。

#### 软件架构


​	项目划分:

​	注册中心：Nacos

​	    **微服务网关**（oj-backend-gateway）：Gateway 聚合所有的接口，统一接受处理前端的请求

​	公共模块：

​		**common**公共模块（oj-backend-common）：全局异常处理器、请求响应封装类、公用的工具类等

​		**model** 模型模块（oj-backend-model）：很多服务公用的实体类

​		**公用接口**模块（oj-backend-service-client）：只存放接口，不存放实现（多个服务之间要共享的接口）

​	业务功能：

​		**用户服务**（oj-backend-user-service：8102 端口）：注册,登录，用户管理

​		**题目服务**（oj-backend-question-service：8103 端口）：创建题目（管理员），删除题目（管理员），修改题目（管理员），搜索题目（用户），在线做题（题目详情页），题目提交

​		**判题服务**（oj-backend-judge-service，8104 端口，较重的操作）：执行判题逻辑，错误处理（内存溢出、安全性、超时），自主实现 代码沙箱（安全沙箱），开放接口（提供一个独立的新服务）



