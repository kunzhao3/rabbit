RabbitMQ Server需要依赖Eralng语言，所以第一步要

下载并安装 Eralng   下载地址：http://www.erlang.org/downloads

然后

下载并安装安装 RabbitMQ Server 下载http://www.rabbitmq.com/download.html

最后几步如下
一，设置Eralng系统环境变量
ERLANG_HOME=C:\Program Files\erl3.6.5

注意：其中 C:\Program Files\erl3.6.5 是Eralng的安装目录

二，安装rabbitmq插件
"C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin\rabbitmq-plugins.bat" enable rabbitmq_management

注意：其中 C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5 是RabbitMQ Server的安装目录

三，重启服务
net stop RabbitMQ && net start RabbitMQ

四，创建用户，密码，绑定角色
使用rabbitmqctl控制台命令（位于C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin）来创建用户，密码，绑定权限等

1，查看已有用户及用户的角色：
rabbitmqctl.bat list_users

2，新增一个用户：
rabbitmqctl.bat add_user username password

注意：username是用户名，password是密码

3，添加用户权限
rabbitmqctl.bat set_user_tags username administrator

注意：username是用户名，administrator是用户权限的角色，其中用户权限的角色如下
(1) 超级管理员(administrator)
可登陆管理控制台(启用management plugin的情况下)，可查看所有的信息，并且可以对用户，策略(policy)进行操作。

(2) 监控者(monitoring)
可登陆管理控制台(启用management plugin的情况下)，同时可以查看rabbitmq节点的相关信息(进程数，内存使用情况，磁盘使用情况等) 

(3) 策略制定者(policymaker)
可登陆管理控制台(启用management plugin的情况下), 同时可以对policy进行管理。

(4) 普通管理者(management)
仅可登陆管理控制台(启用management plugin的情况下)，无法看到节点信息，也无法对策略进行管理。

(5) 其他的
无法登陆管理控制台，通常就是普通的生产者和消费者。

五，使用浏览器打开 http://localhost:15672 访问Rabbit Mq的管理控制台