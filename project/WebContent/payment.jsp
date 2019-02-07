<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Online gaming site payment</title>
  <link rel = "stylesheet" type = "text/css" href = "payment.css" />
</head>
<div class="container">

<div class="row">
<script src="payment/payment.js">
function validate()
{ 
	 var cardNumber = document.form.cardNumber.value;
 	var cardExpiry = document.form.cardExpiry.value;
 	var cardCVC = document.form.cardCVC.value; 
 	var couponCode = document.form.couponCode.value;
 	//var conpassword= document.form.conpassword.value;
 
 	if (cardNumber==null || cardNumber=="")
	 { 
		 alert("Card Number cannot be blank"); 
 		return false; 
 	}
 	else if (cardExpiry==null || cardExpiry=="")
 	{ 
 		alert("Card expiry can't be blank"); 
 		return false; 
 	}
 	else if (cardCVC==null || cardCVC=="")
 	{ 
 	alert("Card CVC can't be blank"); 
	 return false; 
 	}
 	else if(couponCode.length<3)
 	{ 
 		alert("Coupon code must be at least 6 characters long."); 
 	return false; 
	 } 
	 else if (password!=conpassword)
	 { 
 		alert("Confirm Password should match with the Password"); 
 		return false; 
	 } 
 } 

</script>
<!-- You can make it whatever width you want. I'm making it full width
on <= small devices and 4/12 page width on >= medium devices -->
<div class="col-xs-12 col-md-4">


<!-- CREDIT CARD FORM STARTS HERE -->
<div class="panel panel-default credit-card-box">
<div class="panel-heading display-table" >
<div class="row display-tr" >
	<h3 class="panel-title display-td" >Payment Details</h3>
	
	<div class="display-td" >                            
		<img class="img-responsive pull-right" src="http://i76.imgup.net/accepted_c22e0.png">
	</div>
	<h1>pay here 25$</h1>
</div>                    
</div>
<div class="panel-body">
<form name="form" id="payment-form" action ="paymentFinish.jsp" action = "DownloadFile" method = "GET" onsubmit = "return validate()">
	<div class="row">
		<div class="col-xs-12">
			<div class="form-group">
				<label for="cardNumber">CARD NUMBER</label>
				<div class="input-group">
					<input type="tel" class="form-control" name="cardNumber" placeholder="Valid Card Number" autocomplete="cc-number" required autofocus />
					<span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
				</div>
		</div>                            
	</div>
</div>
<div class="row">
		<div class="col-xs-7 col-md-7">
			<div class="form-group">
			<label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
			<input type="tel" class="form-control" name="cardExpiry" placeholder="MMYY" autocomplete="cc-exp"required />
		</div>
</div>
<div class="col-xs-5 col-md-5 pull-right">
	<div class="form-group">
		<label for="cardCVC">CV CODE</label>
		<input type="tel" class="form-control"name="cardCVC" placeholder="CVC"autocomplete="cc-csc"required/>
	</div>
</div>
</div>
		<div class="row">
		<div class="col-xs-12">
		<div class="form-group">
			<label for="couponCode">COUPON CODE</label>
			<input type="text" class="form-control" name="couponCode" />
		</div>
</div>                        
</div>
		<div class="row">
		<div class="col-xs-12">
		<button class="btn btn-success btn-lg btn-block" type="submit" >Pay Here</button>

	</div>
	</div>
		<div class="row" style="display:none;">
		<div class="col-xs-12">
		<p class="payment-errors"></p>
	</div>
	</div>
	<table>
	 <tr>
 	<td><%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%></td>
 	</tr>
 	</table>
</form>
</div>
</div>            


</div>            

</div>
</div>

<script type="text/javascript" src="https://js.stripe.com/v2/"></script>
	
</body> 
</html>


