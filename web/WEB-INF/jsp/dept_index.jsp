<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
	<div class="container">
		<!-- Content here -->
		<h1>pageIndex:${pageIndex}, pageSize:${pageSize}</h1>
		<a class="btn btn-primary" href="add" role="button">Add
			Departments</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">name</th>
					<th scope="col">loc</th>
					<th scope="col">操作</th>
				</tr>
			</thead>
			<tbody id="dept_tbody">

			</tbody>
		</table>
		<nav aria-label="...">
			<ul class="pagination" id="dept_page">
				<li id="page_pre" class="page-item"><a class="page-link" href="index?pageIndex=${pageIndex-1}&pageSize=${pageSize}"
					tabindex="-1" aria-disabled="true">Previous</a></li>
				
				<li id ="page_next" class="page-item"><a class="page-link" href="index?pageIndex=${pageIndex+1}&pageSize=${pageSize}">Next</a></li>
			</ul>
		</nav>
	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	<!-- Load JsRender latest version, from www.jsviews.com: -->
	<script src="https://www.jsviews.com/download/jsrender.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js"
		integrity="sha384-L2pyEeut/H3mtgCBaUNw7KWzp5n9+4pDQiExs933/5QfaTh8YStYFFkOzSoXjlTb"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script type="text/javascript">
	var pageIndex = ${pageIndex};
	var pageSize = ${pageSize};
	
		window.onload = function() {
			$.ajax({
				url : "page?pageIndex="+pageIndex+"&pageSize="+pageSize,
				success : function(result) {
					//获取模板
					jsRenderTpl = $.templates('#dept_table'),
					//模板与数据结合
					finalTpl = jsRenderTpl(result);
					$("#dept_tbody").html(finalTpl);
					//分页信息
					var page_num="";
					for(i=1;i <= result.pagination.totalCountPage; i++){
						if(pageIndex == i){
							page_num = page_num + ' <li class="page-item active" aria-current="page"><a class="page-link" href="#">'+i+' <span class="sr-only">(current)</span></a></li>';
						}else{
							page_num = page_num + '<li class="page-item"><a class="page-link" href="index?pageIndex='+ i + '&pageSize=' + pageSize + '">'+i+'</a></li>';
						}
					}
					$("#page_pre").after(page_num);
					
					initPage(pageIndex, result.pagination.totalCountPage);
				}
			});
		}
		
		function initPage(pageIndex, totalCountPage){
			 // 如果当前页是最后一页的话，下一页置灰
		    if (pageIndex == totalCountPage) {
		        $("#page_next").addClass("disabled");
		    } else {
		        $("#page_next").removeClass("disabled");
		    }

		    // 如果当前页是第一页的话，上一页置灰
		    if (pageIndex == 1) {
		        $("#page_pre").addClass("disabled");
		    } else {
		        $("#page_pre").removeClass("disabled");
		    }
		}
	</script>
	<script type="text/x-jsrender" id="dept_table">
    {{for pageData}}
        <tr>
            <td>{{:deptno}}</td>
            <td>{{:dname}}</td>
            <td>{{:loc}}</td>
            <td>修改 &nbsp; 删除</td>
        </tr>
    {{/for}}
    </script>
</body>
</html>