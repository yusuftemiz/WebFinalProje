<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.eticaret.model.KategoriModel"%>
<%@ page import="java.util.ArrayList" %>
<%@page import="com.eticaret.DAO.KategoriDAO" %>
    <div class="container">
        <div class="row" style="    position: relative;
    left: 1000px;
    top: 200px;
    width: 489px;">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading" style="font-size: 68px;">
                        <h3 class="panel-title">Ürün Güncelleyin</h3>
                    </div> 
                    <div class="panel-body" style="    position: relative;
    top: -52px;">
                        <form role="form" action="urunGuncelle" method="post"  enctype="multipart/form-data">
                            
                            <fieldset>                                
                                <div class="form-group">                                   
									<select class="form-control" name="formKategori" style="    width: 415px;height: 46px;">
										<option value="1">ELEKTRONİK</option>
										<option value="3">EV</option>
										<option value="6">KİTAP</option>
									</select>
                                </div>
							
								<div class="form-group" style="color: orange;">
                                    <input class="form-control" placeholder="Ürün Adı" name="urunAd" type="text" autofocus style="    width: 415px;
    height: 44px;">
                                </div>
                                
								<div class="form-group">
                                    <input class="form-control" placeholder="Açıklama" name="urunAciklama" type="text" autofocus style="    width: 415px;
    height: 44px;">
                                </div>
								<div class="form-group">
                                    <input class="form-control" style="    width: 415px;
    height: 44px;" placeholder="Fiyat" name="urunFiyat" type="text" autofocus>
                                </div>
								<div class="form-group">
                                   <input class="form-control" style="    width: 415px;
    height: 44px;" placeholder="Stok" name="urunStok" type="text" autofocus>
                                </div>
                                <div class="form-group">
									Resim Yükle<input type="file" style="    width: 221px; height: 56px; position: relative;left: 108px;color: chocolate;" name="UrunResim">
								</div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button type="submit" style="width: 134px;
    height: 53px;
    position: relative;
    left: 133px;
    background-color: yellowgreen;
    border-color: aquamarine;
    color: blue;" class="btn btn-lg btn-success btn-block">Ürün Güncelle</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>