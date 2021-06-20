<%@page import="com.eticaret.model.MusteriModel"%>
<%@page import="com.eticaret.DAO.GirisDAO"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.eticaret.model.UrunModel" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.eticaret.DAO.UrunDAO"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Müşteri İşlemleri | E-Ticaret</title>
 	<%@ include file="headerAdmin.jsp"%> 
 	 	  <%@ include file="cssEkle.jsp"%>
 	  <%@ include file="jsEkle.jsp"%> 
 	</head>

<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">
<%if(session.getAttribute("admin")==null){
	response.sendRedirect("musteriGiris");}%>

    <div id="wrapper">

        <%@ include file="navbarAdmin.jsp"%>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header" style="color:white;">Müşteri İşlemleri</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example" style="color:white;">
								
                                    <thead>
                                        <tr>
                                            <th>İsim</th>
											<th>Mail</th>
                                            <th>Şifre</th>                                            
											<th>İşlemler</th>
                                        </tr>
                                    </thead>
                                    <tbody style="color:black;">
                                    <% ArrayList<MusteriModel> musteriler = GirisDAO.tumMusterilerGetir();%>
                					<% for(MusteriModel musteri: musteriler){ %>
                                        <tr class="odd gradeX">
                                            <td><%=musteri.getMusteriIsim() %></td>
                                            
                                            <td><%=musteri.getMusteriMail()%></td>
                                            <td class="center"><%=musteri.getMusteriSifre()%></td>
                                           
											<td><a href="musteriSil?sil=<%=musteri.getMusteriId()%>" name="sil" class="btn btn-small btn-danger btn-block" style="width:30%;float:left;">Sil</a></td>
                                        </tr>
									<%} %>
                                        
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/metisMenu/dist/metisMenu.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
   

</body>

</html>
