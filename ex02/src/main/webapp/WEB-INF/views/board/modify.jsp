<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@include file="../includes/header.jsp"%>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Modify/Delete</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            수정/삭제
                        </div>
                        <!-- /.panel-heading -->
                        <form>
                        <div class="panel-body">
                        		<div class="form-group">
									<label>BNO</label>
									<input class="form-control" name="bno" readonly="readonly" value='<c:out value="${board.bno}"/>'>
                               	</div>
                            
                            	<div class="form-group">
									<label>Title</label>
									<input class="form-control" name="title" value='<c:out value="${board.title}"/>'>
                               	</div>
                               	<div class="form-group">
                                    <label>Content</label>
                                    <textarea rows="5" cols="50" class="form-control" name="content"><c:out value="${board.content}"/></textarea>
								</div>
                               	<div class="form-group">
									<label>Writer</label>
									<input class="form-control" name="writer" value='<c:out value="${board.writer}"/>'>
                               	</div>
                               	<button class="btn btn-default" data-oper="modify">확인</button>
                                <button class="btn btn-info" data-oper="list">취소</button>
                        </div>
                        </form>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
<script>

$(document).ready(function(){
	
	var formObj = $("form");
	
	$(".btn").click(function(e){
		
		e.preventDefault();
		
		var operation = $(this).data("oper");
		
		console.log(operation);
		console.log("${board.bno}");
		
		if(operation === "list"){
			self.location ="/board/list";
		}

		else if(operation === "modify"){
			formObj.attr("action","/board/modify")
			.attr("method", "post");
			formObj.submit();
		}
	
	})	
});
</script>

<%@include file="../includes/footer.jsp"%>
