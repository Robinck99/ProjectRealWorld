<html>
    <head>
        <title>HomePage</title>
        <style>
            /* accent_color = #00FF87
            */

            body {
                width: 100%;
                height: 100%;
                background-color: #fff;
                background-image: url("img/bg.png");
                background-repeat: no-repeat;
                background-size: cover;
                overflow: hidden;
            }

            .topnav {
                width: 100%;
                height: 200px;
                margin-left: 50px;
                display: flex;
                overflow: hidden;
            }

            .tabs {
                width: 100%;
                height: 100px;
                display: flex;
                margin-top: auto;
                margin-bottom: auto;
            }

            .profile {
                width: 100px;
                height: 100px;
                float: left;
                border-radius: 50px;
                display: flex;
                margin-top: auto;
                margin-bottom: auto;
                margin-right: 20px;
                text-align: center;
            }

            .profile_img {
                width: 100px;
                height: 100px;
                border-radius: 50px;
            }

            .topnav a {
                float: left;
                color: #666666;
                background-color: #fcfcfc;
                text-align: center;
                padding: 10px 20px;
                margin: auto 5px;
                font-family: verdana;
                border-radius: 10px;
                height: 20px;
                text-decoration: none;
                font-size: 16px;
            }

            .searchbarContainer {
                margin: auto 100px auto auto;
                width: 300px ;
                border-bottom: 1px solid #fff;
                height: 30px;
            }

            .searchElement {
                border: 0px;
                width: 270px;
                float: left;
                height: 20px;
                color: white;
                text-decoration-color: white;
                background-color: transparent;
                margin-top: 5px;
                font-size: 18px;
                outline: none;
            }

            ::placeholder {
                color: white;
                font-family: verdana;
                font-size: 18px;
                text-decoration: none;
            }

            .searchLogo {
                width: 23px;
                height: 23px;
                float: right;
                outline: none;
            }

            .topnav a:hover {
                background-color: #ececec;
                color: black;
            }

            .topnav a.active {
                background-color: #00FF87;
                color: white;
            }
        </style>
    </head>
    <body>
     <div class="topnav">
        <div class="tabs">
            <div class="profile">
                <img class="profile_img" src="../img/profile.png"/>
            </div>
            <a class="active" href="#home">Home</a>
            <a href="/news">News</a>
            <a href="/contact">Contact</a>
            <a href="/aboutme">About</a>
            <div class="searchbarContainer">
                <form action="/" method="post">
                    <input class="searchElement" name="searchElement"/>
                    <input class="searchLogo" src="../img/search.png" type="image" alt="Submit"/>
                </form>
            </div>
        </div>
     </div>
    </body>
</html>
