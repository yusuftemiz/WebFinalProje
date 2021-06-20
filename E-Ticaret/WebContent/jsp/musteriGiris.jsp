<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kullanıcı Girişi</title>

  <link rel="shortcut icon" href="images/logo.png" type="image/x-icon">
			    <meta charset="utf-8">
  
  <title>Kullanıcı Girişi</title>

  <%@include file="cssEkle.jsp" %>
  
  
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">
<%@include file="header.jsp" %>

<section class="mbr-section mbr-parallax-background mbr-after-navbar" id="form1-35" style="background-image: url(images/jumbotron.jpg); padding-top: 160px; padding-bottom: 160px;">
    <div class="mbr-section mbr-section__container mbr-section__container--middle">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2" style="position: relative;left: -47px;color:green;">KULLANICI GİRİŞİ</h3>
                    <small class="mbr-section-subtitle"></small>
                </div>
            </div>
        </div>
    </div>
    
    <div class="mbr-section mbr-section-nopadding">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-lg-10 col-lg-offset-1" data-form-type="formoid">
                    <div data-form-alert="true">
                        <div hidden="" data-form-alert-success="true" class="alert alert-form alert-success text-xs-center">Giriş Yaptınız Alışverişe başlayabilirsiniz :)</div>
                    </div>
                    <form action="musterilogin" method="post" data-form-title="KULLANICI GİRİŞİ">
                        <input type="hidden" value="Tdte3M1iryEBx3aVMEXj7aqQ/kmLTYlBqOH7Ucpn89S/qT2X0b5dnispMnUxs7fZjDEjkwUG8fiTtorf2sFuli8mEWy9BF0KKsUjSCIkU+G8VKwszuUVIsWBRj5GQBbL" data-form-email="true">
                        <div class="row row-sm-offset">
                       		<div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-name" style="left: 7px;position: relative;color:white;">Kullanıcı Adı<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="kullaniciAdi" required  data-form-field="kullaniciAdi" id="form1-35-usernmae">
                                </div>
                       		</div>
                       	</div>
                       
                        <div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-name" style="color:white;">Parola<span class="form-asterisk">*</span></label>
                                    <input type="password" class="form-control" name="sifre" required data-form-field="sifre" id="form1-35-password"></input>
                                </div>
                       </div>
                        
                            
<br>
                        <div><button type="submit" class="btn btn-primary" style="    position: relative;top: 103px;left: 21px;">Giriş Yap</button></div>

                    </form>
                    
               </div>
                
             </div>
   
            </div>
        </div>
</section>
<%@ include file="footer.jsp" %>
  </body>
<%@ include file="jsEkle.jsp" %>



</html>