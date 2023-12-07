<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
    </head>
    <body>
    <div>
        <center>
            <h1>Get Heat Condition Rating</h1>
            <h3>Please enter the data below:</h3>
            <form action="/heat-info" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required><br>

                <label for="quantity">Quantity:</label>
                <input type="text" id="quantity" name="quantity" required><br>

                <button type="submit">OK</button>
            </form>
        </center>
    </div>
    </body>
</html>
