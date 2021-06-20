<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title></title>
  <link rel="shortcut icon" href="images/logo.png" type="image/x-icon">  
  <title>Kullanıcı Girişi</title>
		<%@ include file="cssEkle.jsp" %>
  
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/wallpapar4.jpg');">
		<%@ include file="header.jsp" %>



<section class="mbr-section mbr-parallax-background mbr-after-navbar" id="form1-35" style="background-image: url(images/jumbotron.jpg); padding-top: 160px; padding-bottom: 160px;">
    
    <div class="mbr-section mbr-section__container mbr-section__container--middle">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center" style="    position: relative;
    top: -60px;
    left: -35px;">
                    <h3 class="mbr-section-title display-2" style="color:white;">KULLANICI KAYDI</h3>
                </div>
            </div>
        </div>
    </div>
    
    <div class="mbr-section mbr-section-nopadding">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-lg-10 col-lg-offset-1" data-form-type="formoid" >


                    <div data-form-alert="true">
                        <div hidden="" data-form-alert-success="true" class="alert alert-form alert-success text-xs-center">Tebrikler.Kaydınız Tamamlandı.Şimdi alışverişe başlayabilirsiniz.</div>
                    </div>

<!-- BURADA JAVA SINIFINA GÖNDERİYOR FORMU ACTİON="BURADA JAVA SINIFININ @WEBSERVLETİSMİVAR" -->
                    <form action="musterikayit" method="post" data-form-title="KULLANICI GİRİŞİ" style= "position: relative;left: -273px; top: -77px;">
                        <div class="row row-sm-offset">

                            <div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-name" style="color:white;">İsim Soyisim<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="isim" required autofocus data-form-field="isim" id="form1-35-name">
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-email" style="color:white;">Email<span class="form-asterisk">*</span></label>
                                    <input type="email" class="form-control" name="mail" required autofocus data-form-field="mail" id="form1-35-email">
                                </div>
                            </div>

                            <div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-phone" style="color:white;">Telefon</label>
                                    <input type="text" class="form-control" name="telefon" autofocus required   data-form-field="telefon" id="form1-35-phone">
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="form-control-label" for="form1-35-message" style="color:white;">Adres</label>
                            <textarea class="form-control" name="adres" required autofocus  rows="7"  data-form-field="adres" id="form1-35-address"></textarea>
                        </div>
                        
                       <div class="col-xs-12 col-md-4" style="position: relative;
    left: 308px;">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-name" style="color:white;">Kullanıcı Adı<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="kullaniciAdi" required autofocus data-form-field="kullaniciAdi" id="form1-35-username">
                                </div>
                       </div>
                        <div class="col-xs-12 col-md-4" style="position: relative;
    top: 87px;">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-35-name" style="color:white;">Parola<span class="form-asterisk">*</span></label>
                                    <input type="password" class="form-control" name="sifre" required autofocus data-form-field="sifre" id="form1-35-password">
                                </div>
                       </div>
                        
                            
<br>
                        <div><button type="submit" class="btn btn-primary" style="position: relative;top: 199px;left:20px;">Tamamla</button></div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@ include file="footer.jsp" %>
<%@ include file="jsEkle.jsp" %>

		
		   </body>
</html>