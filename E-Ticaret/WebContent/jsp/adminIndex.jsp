<%@page import="com.eticaret.DAO.IletisimDAO"%>
<%@ page contentType="text/html; charset=UTF-8" %>
    <%@page import="com.eticaret.model.MusteriIletisimModel" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.eticaret.model.SiparisModel"%>
	<%@page import="com.eticaret.DAO.SiparisDAO"%>
<!DOCTYPE html>
<html lang="en">

<head>
   <%@ include file="headerAdmin.jsp"%>
   <%@ include file="cssEkle.jsp"%>
   <%@ include file="jsEkle.jsp"%>
   
</head>

<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">
	<%@ include file="navbarAdmin.jsp"%>
    <div id="wrapper">
<%if(session.getAttribute("admin")==null){
	response.sendRedirect("musteriGiris");}%>
        
<br><br><br>
        <div id="page-wrapper">
        <div class="row" style="color: white;">
                <div class="col-lg-8">
                    <div class="panel panel-default">
                        
                    <div class="chat-panel panel panel-default" style="position: relative;left: 49px;">
                        <div class="panel-heading" style="color: #e1a90f;">
                            <i class="fa fa-comments fa-fw"></i>
                            İletişimden Gelenler                           
                        </div>
                        <div class="panel-body" style="color: #279021;">
                            <ul class="chat">
                                <li class="left clearfix">                                                                
                                    <div class="chat-body clearfix">
                                    <% ArrayList<MusteriIletisimModel> iletisimlist =IletisimDAO.iletisimGetir(); %>
                						<% for(MusteriIletisimModel iletisim: iletisimlist){ %>  
                                        <div class="header">                                        
                                            <strong class="primary-font"><%=iletisim.getName()%>----<%=iletisim.getSubject()%></strong>
                                            <small class="pull-right text-muted">                                             
                                            </small>
                                        </div>
                                        <p>
                                            <%=iletisim.getMessage()%>
                                        </p>
                                        <%} %>	
                                    </div>
                                    															
                                </li>                                                                                  
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <br><br><br>
        
        
            <div class="row" style="background-color: cornsilk;">
                             
                <div class="col-lg-3 col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading" >
                            <div class="row" style="    color: cornflowerblue;">
                                <div class="col-xs-3">
                                    <i class="fa fa-shopping-cart fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge" style="position: relative;left: -30px;top: 21px;"><%=SiparisDAO.siparisSayisiGetir()%></div>
                                    <div>Yeni Sipariş!</div>
                                </div>
                            </div>
                        </div>
                        <a href="siparisAdmin">
                            <div class="panel-footer" style="position: relative; top: -25px; left: 389px;">
                                <span class="pull-left">Detaylara Git</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix" style="    color: turquoise;"></div>
                            </div>
                        </a>
                    </div>
                </div>     
            </div>
            
            
            
            
            

    </div>
    </div>

   
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/raphael/raphael-min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/morrisjs/morris.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/morris-data.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>

</body>

</html>
