<%-- 
    Document   : main
    Created on : May 22, 2015, 4:04:23 PM
    Author     : Maksym_Kotii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Maxon</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<!-- Bootstrap -->
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" />

	<style>

	body {
		padding-top: 20px;
	}

	.margin-base-vertical {
		margin: 40px 0;
	}

	</style>

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">

				<h1 class="margin-base-vertical">Have you ever seen the rain?</h1>

				<p>
					Someone told me long ago there's a calm before the storm. I know, It's been comin for some time.
				</p>
				<p>
					When it's over, so they say, it'll rain a sunny day. I know,	Shinin down like water.
				</p>

				<p>
					I want to know, have you ever seen the rain?
				</p>

				<form action="/mailing-list" method="post" class="margin-base-vertical">
					<p class="input-group">
						<span class="input-group-addon">@</span>
						<input type="text" class="form-control input-lg" name="email" placeholder="jonsnow@knowsnothi.ng" />
					</p>
					<p class="help-block text-center"><small>We won't send you spam. Unsubscribe at any time.</small></p>
					<p class="text-center">
						<button type="submit" class="btn btn-success btn-lg">Keep me posted</button>
					</p>
					</span>
				</form>

			</div>
		</div>
	</div>

</body>
</html>
