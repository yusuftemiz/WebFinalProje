<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.eticaret.model.UrunModel" %>
<%@page import="com.eticaret.DAO.UrunDAO" %>
<%@page import="java.util.ArrayList" %>

    
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sepetim | E-Ticaret</title>
     <%@ include file="cssEkle.jsp"%>
       <%@ include file="jsEkle.jsp" %>
    <%@ include file="header.jsp"%>
       
    
<link rel="stylesheet" type="text/css" href="assets/css/cart.css">
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">

<br><br><br><br><br><br><br><br>
	<section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
				  <li><a href="index">Home</a></li>
				  <li class="active">Sepetim</li>
				</ol>
			</div>
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu" style="color:white;">
							<td class="image">Ürün</td>
							<td class="description">Açıklama</td>
							<td class="price">Fiyat</td>														
							<td></td>
						</tr>
					</thead>
					<tbody>
					<%if(session.getAttribute("cart")!=null){%>
						<%ArrayList<UrunModel> urun=(ArrayList<UrunModel>)session.getAttribute("cart");%>
						<%int i=0;%>
						<%int toplam=0;%>
						<%for(UrunModel urun2:urun) { %>
						<%toplam+=urun2.getUrunFiyat();%>						
						<tr>
							<td class="cart_product" >
								<a href=""><img src="resimgetir?urunResim=<%=urun2.getUrunId()%>" alt="" style="height: 50px;width:50px;"/></a>
							</td>
							<td class="cart_description" style="color:white;">
								<h4><a href=""><%=urun2.getUrunAd()%></a></h4>
								<p><%=urun2.getUrunAciklama()%></p>
							</td>
							<td class="cart_price" style="color:white;">
								<p><%=urun2.getUrunFiyat()%> TL</p>
							</td>														
							<td class="cart_delete">
								<a class="cart_quantity_delete" href="sepettencikar?urunid=<%=i%>"><i class="fa fa-times">Sepetten Çıkar</i></a>
							</td>
						</tr>
							<%i++;
							}
						}%>						
						
					</tbody>
				</table>   
				             
			</div>
		</div>
		
	</section> <!--/#cart_items-->
	
	<div style="padding-left:1300px">
	
	<a href="siparisTamamla" class="btn btn-default check_out" >Satın Al</a>
	</div><br><br><br><br>
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<%@ include file="footer.jsp"%>
	

    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.scrollUp.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/price-range.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>