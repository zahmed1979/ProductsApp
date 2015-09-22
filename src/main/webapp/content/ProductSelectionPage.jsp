<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/css.css"/>
<sj:head jqueryui="true"/>
</head>
<body>

 <form action="confirmation" method="post">
 	<s:iterator value="productsByCategory">
 	<div id="products" class="side">
    <span><b><s:property value="key"/></b></span>
 	<s:iterator value="value"> 
 	<span>
 		<input type="checkbox" name="chosenProducts" id="<s:property value="name"/>" value="<s:property value="name"/>" />
 		<label for="<s:property value="name"/>"><s:property value="name"/></label>
 	</span>	
 		</s:iterator>
 	</div>
 	 </s:iterator>
 	 
  <div id="cart">
   <span><b>Basket</b></span>
    <ul>
    </ul>
    <input type="submit" value="checkout"/>
</div>
<input type="hidden" id="customerId" name="customerId" value="<s:property value="customerId"/>">
</form>

<script>
$(document).ready(
    function(){
        $('input:checkbox').change(
            function(){
                if ($(this).is(':checked')) {
                 $('<li />').appendTo('#cart ul').text($(this).val());   
                }
                else {
                    $('#cart li:contains('+$(this).val()+')').remove();
                }
            }); 
    });
</script>
</body>
</html>