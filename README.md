NENULiveBoard
=============

A Live ACM/ICPC Onsite Live Board Solution. Perfectly run during 2014 ACM-ICPC NENU campus Contest.

This project is base on object oriented Javascript and J2EE programing.

By using long connection AJAX to fetch newly changed status (JSON) from backend to provide all users the live time score board of the ACM-ICPC on site contest.

By using some features of CSS3 and HTML5, users will get a very well exprences of display the score board.

Animation is also available for showing the changes of the ranking.

License
=============
GPLv3

Additional requirement (optional): you are welcome not to remove the links to http://tiankonguse.com.
You are also welcome not to remove some of the last line of the code.

For More
=============
Read system\_guide.docx (or pdf)

由于开发环境是eclipse-j2ee。所以使用者最好也使用eclipse-j2ee来测试这个项目。

新建项目后，会提示几个包不存在的错误。

这些jar包需要自己导入。

具体方法是右击项目，properties,Java Build Path ,点击标签Libraries, Add JARs ,点击lib.

这个lib目录里面有三个jar库，分别是pc2,dbcp,javax.servlet.

然后建议使用eclipse下载tomcat，这样比较方便。


pc2 使用说明参考[这里](pc2_readme.md)

Exporting Data to ICPC
=============

Firstly, download "Export empty template" in the standing tab of you site.
Secondly, replace that xml file using regex expression, from
  .+?ReservationID="(.+?)".+?TeamName="(.+?)".+?>
to
  "\2":"\1",
Then, edit the data to json format, and you will get something like this:

var tn2id={"+18远古遗愿":"161940",
"ALPC\_ACOnFingers":"161713",
"ALPC\_Tour\_de\_Force":"161714",...};

Thridly, paste the the code above and the code following into Chrome javascript console,
you will get the final exporting xml.
<pre><code>
var result="";
for(var t=board.headTeam.nextTeam;t!=board.tailTeam;t=t.nextTeam){
  if(t.en=="BHU_sec")t.en="BHU_Sec";
	if(tn2id[t.en.xss()]==undefined){
		if(t.offical)
			console.log("error:"+t.en.xss());
		continue;
	}
	result+='<Standing LastProblemTime="'+t.lastAccptedTime+'" ProblemsSolved="'+t.accepted+'" Rank="'+t.teamRank+'" ReservationID="'+tn2id[t.en.xss()]+'" TeamName="'+t.en.xss()+'" TotalTime="'+t.penalty+'"/>';
}
</code></pre>


References
=============
this project is clone from https://github.com/winguse/NENULiveBoard .
more read [readme](<readme.md>)
