<%@ page contentType="text/html; charset=UTF-8" %><!DOCTYPE html>

<%@page import="com.eticaret.DAO.KategoriDAO"%>
<%@page import="com.eticaret.model.KategoriModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.eticaret.model.MusteriModel"%>


<section id="menu-10" style="background: #000000;">
				<nav class="navbar navbar-dropdown bg-color transparent navbar-fixed-top" style=" position: relative; left: 80px;">
					<div class="container" >

						<div class="mbr-table" >
							<div class="mbr-table-cell">

								<div class="navbar-brand">
									
										<a class="navbar-caption" href="index">E-Ticaret</a>
									</div>

								</div>
								<div class="mbr-table-cell">

									<button class="navbar-toggler pull-xs-right hidden-md-up" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
									#
									</button>

									<ul class="nav-dropdown collapse pull-xs-right nav navbar-nav navbar-toggleable-sm" id="exCollapsingNavbar">

										<li class="nav-item nav-btn"><a class="nav-link link" href="index" >ANASAYFA</a></li>
										<%ArrayList<KategoriModel> kategoriler2=KategoriDAO.tumKatagoriler();%>

										<%for(KategoriModel kategori:kategoriler2) { %>
							          		<li class="nav-item nav-btn"><a class="nav-link link" href="<%=kategori.getKategoriAdi().toLowerCase()%>"><%=kategori.getKategoriAdi()%></a></li>
							    				<%if(kategori.getKategoriAdi()=="ÇOK SATILANLAR"){%>
							    					<li class="nav-item nav-btn"><a class="nav-link link" href="<%="coksatilanlar"%>"><%=kategori.getKategoriAdi()%></a></li>
							    			<%}%>
							    		<%} %>


										<li class="nav-item">
											<a class="nav-link link" href="iletisim" aria-expanded="false">İLETİŞİM</a>
										</li>

									<% // MUSTERİ GİRİŞ YAPMIŞSA İSİM Ve SEPET = KAYIT OL VE GİRİŞ YAP YERİNE GÖRÜNECEK%>

								<% if(session.getAttribute("musteri") != null){

											MusteriModel musteri=(MusteriModel)session.getAttribute("musteri");

											if(musteri.getMusteriKullaniciAdi()!=null){%>
												<li class="nav-item"><a class="nav-link link" href="cart" aria-expanded="false">SEPET</a></li>

											<%}}else{%>

												<li class="nav-item"><a class="nav-link link" href="musteriGiris" aria-expanded="false">GİRİŞ</a></li>

											<% } %>

								<% if(session.getAttribute("musteri") != null){
											MusteriModel musteri=(MusteriModel)session.getAttribute("musteri");
											if(musteri.getMusteriKullaniciAdi()!=null){%>
												<li class="nav-item"><a class="nav-link link" href="cikis" aria-expanded="false"><%=musteri.getMusteriKullaniciAdi() %></a></li>
								<%}} else{ %>

												<li class="nav-item nav-btn" >

													<a class="nav-link btn " href="musteriKayit" style="color: #7FFFD4;">

														<span class="etl-icon icon-profile-male mbr-iconfont mbr-iconfont-btn" ></span>

															KAYIT OL

													</a>
												</li>

								<%}%>




									</ul>
									<button hidden="" class="navbar-toggler navbar-close" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
										Hızlı Menu
									</button>
								</div>
							</div>
						</div>
					</nav>
				</section>
