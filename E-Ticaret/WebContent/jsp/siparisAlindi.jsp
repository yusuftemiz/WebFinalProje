<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.eticaret.DAO.UrunDAO"%>
<%@page import="com.eticaret.model.KategoriModel"%>
<%@page import="java.util.ArrayList" %>
<%@page import="com.eticaret.DAO.KategoriDAO" %>
<%@page import="com.eticaret.model.UrunModel" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <%@ include file="header.jsp"%>
          <%@ include file="cssEkle.jsp"%>
       <%@ include file="jsEkle.jsp" %>
   
</head><!--/head-->

<body >
																			
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center"></h2>
						<h2 style="text-align:center;">Siparişiniz Alınmıştır.</h2>
					</div>																																					
				</div>
		<%@ include file="urunListesi.jsp" %>
	
	
	<%@ include file="footer.jsp"%>

  
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.scrollUp.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/price-range.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>