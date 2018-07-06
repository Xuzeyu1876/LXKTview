var xmlHttp;
var username;
var emp;
var content;

function getPath(){
	var curWwwPath=window.document.location.href;

	  //获取主机地址之后的目录，如： myproj/view/my.jsp

	  var pathName=window.document.location.pathname;

	  var pos=curWwwPath.indexOf(pathName);

	  //获取主机地址，如： http://localhost:8083

	  var localhostPaht=curWwwPath.substring(0,pos);

	  //获取带"/"的项目名，如：/myproj

	  var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);

	 　//得到了 http://localhost:8083/myproj

	  var realPath=localhostPaht+projectName;
	  return realPath
}

function creatXMLHttp(){
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
}

function submitComment(){
	content = document.getElementById("content").vlaue;
	
	creatXmlHttp();
	xmlHttp.onreadystatechange = submitPostCallBack;
	xmlHttp.open("POST","",true);
	xmlHttp.send("content="+encodeURI(content));
}

function submitPostCallback(){
	if(xmlHttp.readyState == 4){
		createNewPost(xmlHttp.responseText);
	}
}

function creatNewPost(postId){
	document.getElementById("content").vlaue="";
	
}

function creatDiv(className,text){
	var newDiv = document.creatElement("div");
	newDiv.className = className;
	newDic.innerHtml=text;
	return newDiv;
}

