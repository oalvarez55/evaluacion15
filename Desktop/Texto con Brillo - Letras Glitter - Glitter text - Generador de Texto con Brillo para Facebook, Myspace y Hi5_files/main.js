// JavaScript Document
var set = 1;
var arrpath = new Array();
var arrimg = new Array();
var url = "http://www.textoconbrillo.net/";
$(document).ready(function() {
	generate_code( $("#text_form").val() );	
	$("#text_form").keyup(function() {
		generate_code( $("#text_form").val() );	
	});
	$(".opt").change(function() {
		if ( $("#text_form").val() != "" )					  
			generate_code( $("#text_form").val() );						  
	});
	$("#images_cats").change(function() {
		var p = 0;
		var cat = $(this).val();
		
		$.ajax({   
   			type: 'POST',
   			url: 'index.php',
   			data: 'cmd=change_cat_images&cat='+cat+'&p='+ p,
   			success: function(msg){	
				result = eval('('+msg+')');
				$("#table_images").html(result.data);
				
				str = '<tr><td width="40">Pages: </td>';		
				for (i = 0; i < result.pages; i++)
					str += '<td width="15"><a href="#" onclick="change_images_pages('+i+');return false;" title="Texto con Brillo, pagina '+i+'">'+(i+1)+'</a></td>';
				str += '</tr>';
				$("#table_images_pages").html(str);
			}
		});							  
	});
	
	$(".sets_pages").click(function() {
		var p = $(this).attr("alt");
		
		$.ajax({   
   			type: 'POST',
   			url: 'index.php',
   			data: 'cmd=go_page_sets&p='+ p,
   			success: function(msg){	
				$("#table_sets").html(msg);
			}
		});
		
		return false;
	});
});

function change_images_pages(p) {
	var cat = $("#images_cats").val();
		
	$.ajax({   
   		type: 'POST',
   		url: 'index.php',
   		data: 'cmd=go_page_images&cat='+cat+'&p='+ p,
   		success: function(msg){	
			$("#table_images").html(msg);
		}
	});
		
	return false;	
}

function select_letter_set(setid) {
	set = setid;
	if ($("#text_form").val() != "")
		generate_code( $("#text_form").val() );
	return false;
}

function add_movement(str) {
	var speed;
	var dir = $("#direction").val();
	switch ( $("#speed").val() ) {
		case "slow": speed = 3; break;
		case "medium": speed = 9; break;
		case "fast": speed = 18; break;
	}
	
	return '<marquee width="100%" behavior="scroll" direction="'+dir+'" scrollamount="'+speed+'">' + str + '</marquee>';
}

function add_img(image) {
	arrpath.push( $("#images_cats").val() );
	arrimg.push(image);
	
	var str = $("#text_form").val();
	$("#text_form").val( str + '*');
	generate_code( $("#text_form").val() );
	
	return false;
}

function generate_code(text) {
	str = "";
	code = "";
	var ii = 0;
	
	for(i = 0; i < text.length; i++) {
		ch = text.charAt(i).toLowerCase();
		if (ch == '*') {
			str += "<img border='0' alt='empty' src="+url+"images/iconos/"+arrpath[ii]+"/"+arrimg[ii]+">";
			ii++;	
		}
		else if(ch < 'a' || ch > 'z')
			str += "<img border='0' alt='empty' src="+url+"images/empty.gif width=20 height=1>";
		else
			str += "<img border='0' alt='" + ch + "' src='"+url+"texto/brillo" + set + "/" + ch + ".gif'>";
	}
	
	var cnt = arrimg.length;
	for (i = ii; i < cnt; i++) {
		arrimg.pop();
		arrpath.pop();
	}
	
	if ( $("#movement").val() == "yes" )
		str = add_movement(str);
	
	code = '<a style="border:0" href="http://www.textoconbrillo.net/" target="_blank" title="Texto con brillo">' + str + '</a>';
		
	str += "<div style='position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;'>";
	str += "<table cellpadding=0 cellspacing=0 border=0 width=100% height=100%>";
	str += "<tr><td><img src="+url+"images/empty.gif width=200 height=10></td></tr>";
	str += "</table>";
	str += "</div>";
		
	$("#text_display").html( str );
	$("#txt_code_display").val( code );
	$("#code_display").css("display", "block")
}