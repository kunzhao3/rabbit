���ز���װ Eralng   http://www.erlang.org/downloads

���ز���װ��װ Rabbit MQ Server http://www.rabbitmq.com/download.html

һ��ϵͳEralng��������
ERLANG_HOME=C:\Program Files\erl3.6.5

������װrabbitmq���
"C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin\rabbitmq-plugins.bat" enable rabbitmq_management

������������
net stop RabbitMQ && net start RabbitMQ

�ģ������û������룬�󶨽�ɫ
ʹ��rabbitmqctl����̨���λ��C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin>���������û������룬��Ȩ�޵�

1���鿴�����û����û��Ľ�ɫ��
rabbitmqctl.bat list_users

2������һ���û���
rabbitmqctl.bat add_user username password

3������û�Ȩ��
rabbitmqctl.bat set_user_tags username administrator
(1) ��������Ա(administrator)
�ɵ�½�������̨(����management plugin�������)���ɲ鿴���е���Ϣ�����ҿ��Զ��û�������(policy)���в�����

(2) �����(monitoring)
�ɵ�½�������̨(����management plugin�������)��ͬʱ���Բ鿴rabbitmq�ڵ�������Ϣ(���������ڴ�ʹ�����������ʹ�������) 

(3) �����ƶ���(policymaker)
�ɵ�½�������̨(����management plugin�������), ͬʱ���Զ�policy���й���

(4) ��ͨ������(management)
���ɵ�½�������̨(����management plugin�������)���޷������ڵ���Ϣ��Ҳ�޷��Բ��Խ��й���

(5) ������
�޷���½�������̨��ͨ��������ͨ�������ߺ������ߡ�

�壬ʹ��������� http://localhost:15672 ����Rabbit Mq�Ĺ������̨