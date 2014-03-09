board http://127.0.0.1:8080/BoardWeb/index.jsp
pc2 bin/pc2team.bat
注册时 用户名必须是小写字母，大写字母，数字和英文下划线。

teamID
password

提交代码时，代码文件的名字必须是小写字母，大写字母，数字和英文下划线。
提交代码时，代码文件的扩展名必须是 .cpp 或 .java.


pc2 使用说明

1.启动 pc2server 
用户名: server1,密码空。
server 运行即可，不需要干什么。

2.启动 pc2admin
用户名:root, 密码空。
启动 admin 后默认建了一个比赛，如果需要开始一个新的比赛，请在启动server前 reset 一下。
admin 启动后，需要添加 board帐号，用于获得榜的数据。
还需要添加 judge 帐号，用于判题以及设置自动判题。
还需要添加 team 帐号，用于队伍提交代码。

关于 team 的密码，可以使用固定格式的文件导入。
具体格式可以把帐号到出来，然后自己分析一下就知道了(注意，分隔符是TAB键，而不是空格)。

3.启动 judge 帐号
登录后，使用 admin 帐号设置自动判题。

4.启动 board 帐号
启动后设置监听程序。

5.team 帐号登录。

