RabbitMQ Server��Ҫ����Eralng���ԣ����Ե�һ��Ҫ

���ز���װ Eralng   ���ص�ַ��http://www.erlang.org/downloads

Ȼ��

���ز���װ��װ RabbitMQ Server ����http://www.rabbitmq.com/download.html

��󼸲�����
һ������Eralngϵͳ��������
ERLANG_HOME=C:\Program Files\erl3.6.5

ע�⣺���� C:\Program Files\erl3.6.5 ��Eralng�İ�װĿ¼

������װrabbitmq���
"C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin\rabbitmq-plugins.bat" enable rabbitmq_management

ע�⣺���� C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5 ��RabbitMQ Server�İ�װĿ¼

������������
net stop RabbitMQ && net start RabbitMQ

�ģ������û������룬�󶨽�ɫ
ʹ��rabbitmqctl����̨���λ��C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.5\sbin���������û������룬��Ȩ�޵�

1���鿴�����û����û��Ľ�ɫ��
rabbitmqctl.bat list_users

2������һ���û���
rabbitmqctl.bat add_user username password

ע�⣺username���û�����password������

3������û�Ȩ��
rabbitmqctl.bat set_user_tags username administrator

ע�⣺username���û�����administrator���û�Ȩ�޵Ľ�ɫ�������û�Ȩ�޵Ľ�ɫ����
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