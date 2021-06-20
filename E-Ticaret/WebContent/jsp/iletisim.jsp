<%@ page contentType="text/html; charset=UTF-8" %><!DOCTYPE html">
<html>
<head>
  <title >İLETİŞİM</title>   
   <%@ include file="cssEkle.jsp"%>
       <%@ include file="jsEkle.jsp" %>
  
  
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/question.jpg'); background-size:100%; ">
<%@ include file="header.jsp" %>

<section class="mbr-section mbr-parallax-background mbr-after-navbar" id="form1-38" style="background-image: url(../images/jumbotron.jpg); padding-top: 160px; padding-bottom: 160px;">
    
    <div class="mbr-section mbr-section__container mbr-section__container--middle">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 text-xs-center">
                    <h3 class="mbr-section-title display-2" style="color:white;">İLETİŞİM</h3>
                    <small class="mbr-section-subtitle" style="color:green;"> Öneri,Soru,İstek ya da Şikayetleriniz için yazabilirsiniz.</small>
                </div>
            </div>
        </div>
    </div>
    <div class="mbr-section mbr-section-nopadding">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-lg-10 col-lg-offset-1" data-form-type="formoid">


                    <div data-form-alert="true">
                        <div hidden="" data-form-alert-success="true" class="alert alert-form alert-success text-xs-center">Mesajınız iletildi.Duyarlılığınız için teşekkür ederiz</div>
                    </div>


                    <form action="iletisimServlet" method="post" data-form-title="İLETİŞİM MESAJI">

                        <input type="hidden" value="aDRdRZEkmiep7WS+c8lv7difrmBavR3k1MnbsImwPb0EOdckicBGtu+Iqgbh5ipgswERCewwusyXFxR1NIKc8zMGblWq8HQs78+Byja3B8pqy6SVHJS42C7JJ9fQTWcc" data-form-email="true">

                        <div class="row row-sm-offset">

                        

                            <div class="col-xs-12 col-md-4">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-38-email" style="color:white;">Konu<span class="form-asterisk">*</span></label>
                                    <input type="text" class="form-control" name="konu" required autofocus data-form-field="Email" id="form1-38-email">
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="form-control-label" for="form1-38-message" style="color:white;">Mesaj</label>
                            <textarea class="form-control" name="message" rows="7" required autofocus data-form-field="Message" id="form1-38-message"></textarea>
                        </div>

                        <div><button type="submit" class="btn btn-primary" style="position: relative;left: 113%;top: 29px; ">Gönder</button></div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@ include file="footer.jsp" %>
<script src="../assets/web/assets/jquery/jquery.min.js"></script>
		<script src="../assets/tether/tether.min.js"></script>
		<script src="../assets/bootstrap/js/bootstrap.min.js"></script>
		<script src="../assets/smooth-scroll/SmoothScroll.js"></script>
		<script src="../assets/viewportChecker/jquery.viewportchecker.js"></script>
		<script src="../assets/dropdown/js/script.min.js"></script>
		<script src="../assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
		<script src="../assets/jquery-mb-ytplayer/jquery.mb.YTPlayer.min.js"></script>
		<script src="../assets/theme/js/script.js"></script>
		<script src="../assets/mobirise-slider-video/script.js"></script>
		<input name="animation" type="hidden"></body>
</html>