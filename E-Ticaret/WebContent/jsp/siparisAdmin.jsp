<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.eticaret.model.UrunModel" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.eticaret.DAO.UrunDAO"%>
<%@page import="com.eticaret.model.SiparisModel"%>
<%@page import="com.eticaret.DAO.SiparisDAO"%>
<%@page import="com.eticaret.DAO.KategoriDAO"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <title>Ürün İşlemleri | E-Ticaret</title>
 	<%@ include file="headerAdmin.jsp"%> 
 	 <%@ include file="cssEkle.jsp"%>
       <%@ include file="jsEkle.jsp" %>
</head>

<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">
<%if(session.getAttribute("admin")==null){
	response.sendRedirect("admin");}%>

    <div id="wrapper">

        <%@ include file="navbarAdmin.jsp"%>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header" style="color:white;">Sipariş İşlemleri</h1>
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
                                            <th>Müşteri Adı</th>
											<th>Sipariş Tarihi</th>
                                            <th>Adet</th>
                                            <th>Fiyat</th>                                    									  
											<th>Sipariş Durumu</th>
											<th>Islemler</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                     <% ArrayList<SiparisModel> siparisler = SiparisDAO.tumSiparisleriGetir();%>
                					<% for(SiparisModel siparis:siparisler){ %>
                                        <tr class="odd gradeX" style="color:black;">
                                            <td><%=SiparisDAO.musteriAdGetir(siparis.getMusteri_id())%></td>
                                            <td><%=siparis.getTarih()%></td>
                                            <td><%=siparis.getAdet()%></td>
                                            <td><%=siparis.getFiyat()%></td>
                                            <td><%=siparis.getSiparis_durumu() %></td>
                                            <td>
                                            	<a href="siparisSil?sil=<%=siparis.getId()%>" name="sil" class="btn btn-small btn-danger btn-block" style="width:30%;float:left;">Sil</a> 
                                           </td>
                                            
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
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>

</body>

</html>
