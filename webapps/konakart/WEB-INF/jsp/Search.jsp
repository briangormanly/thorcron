<%--
//
// (c) 2012 DS Data Systems UK Ltd, All rights reserved.
//
// DS Data Systems and KonaKart and their respective logos, are 
// trademarks of DS Data Systems UK Ltd. All rights reserved.
//
// The information in this document is free software; you can redistribute 
// it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
// 
// This software is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
--%>
<%@include file="Taglibs.jsp" %>
<% com.konakart.al.KKAppEng kkEng = (com.konakart.al.KKAppEng) session.getAttribute("konakartKey");%>
<% boolean useSolr = kkEng.isUseSolr();%>
<% boolean showCookieWarning = !kkEng.isAgreedCookies();%>

<%if (useSolr) { %>						
	<script type="text/javascript">	
	/*
	 * Autocomplete widget
	 */
	$(function() {
		$( "#search-input" ).autocomplete({
			source: function(request, response) {
				if (document.getElementById('kk_portlet_id'))  {
					AUI().ready('liferay-portlet-url', function(A) { 
				        var renderURL = Liferay.PortletURL.createResourceURL();
				        renderURL.setParameter("struts.portlet.action", "/SuggestedSearch.action");
				        renderURL.setPortletId(document.getElementById('kk_portlet_id').value);
				        renderURL.setWindowState("exclusive");
						renderURL.setParameter("term", request.term);
						
						$.ajax({
						type : 'POST',
						timeout : '20000',
						scriptCharset : "utf-8",
						contentType : "application/json; charset=utf-8",
						url : renderURL.toString(),
						dataType : 'json',
						data : null,
					       success: function(result, textStatus, jqXHR) {					         
					      		response(result);
					      }
					    });
					});	
				} else {
				     $.ajax({
				 		type : 'POST',
						timeout : '20000',
						scriptCharset : "utf-8",
						contentType : "application/json; charset=utf-8",
						url : "SuggestedSearch.action",
						dataType : 'json',
						data : '{"term":"' + request.term + '"}',
				        success: function(result, textStatus, jqXHR) {					         
				       		response(result);
				       }
				     });
				}
			   },
			minLength: 1,
			select: function( event, ui ) {
				document.getElementById('kk_key').value = ui.item.id;
				document.getElementById('search-input').value = ui.item.value;
				self.kkSearch();
			}
		}).data( "autocomplete" )._renderItem = function( ul, item ) {
	           return $( "<li></li>" )
	               .data( "item.autocomplete", item )
	               .append( "<a>"+ item.label + "</a>" )
	               .appendTo( ul );
		};
		
		$("#search-input").keydown(function (e){
		    if(e.keyCode == 13){
		    	var key = document.getElementById('kk_key').value;
		    	if (key == null || key == '') {
		    		self.kkSearch();
				}
		    }
		});
	});	
	</script>
	
	<!-- For posting suggested search query -->
	<form action="" id='ssForm' method="post">
		<input id="searchText" name="searchText" type="hidden"/>
		<input id="manuId" name="manuId" type="hidden"/>
		<input id="catId" name="catId" type="hidden"/>
	</form>
<% } %>	

<%if (showCookieWarning) { %>	
	<div id="cookie-container">
		<div id="cookie-warning">
			<div id="cookie-warning-text">
				<kk:msg  key="cookie.warning"/><div id="cookie-warn-button" class="button small-rounded-corners"><kk:msg  key="common.continue"/></div>
			</div>
		</div>
	</div>
<% } %>

<div id="header-container">
	<div id="header">
		<div id="logo">
			<a href="Welcome.action">Thorcron</a>
		</div>
		<div id="search">
			<%if (useSolr) { %>						
				<input type="text" id="search-input" class="rounded-corners-left" name="searchText" onkeydown="javascript:kkKeydown();">
				<input id="kk_key" type="hidden"/>
				<a id="search-button" class="rounded-corners-right" onclick="javascript:kkSearch();"><kk:msg  key="suggested.search.search"/></a>
			<% } else { %>	
				<form action="QuickSearch.action" id="quickSearchForm" method="post">
					<input type="text" id="search-input" class="rounded-corners-left" name="searchText">
					<a id="search-button" class="rounded-corners-right" onclick="javascript:document.getElementById('quickSearchForm').submit();"><kk:msg  key="suggested.search.search"/></a>
				</form>	
            <% } %>
		</div>
		<a id="adv-search-link" href="AdvancedSearch.action"><kk:msg  key="header.advanced.search"/></a>
 	</div>
</div>