<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>员工登录</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">
    <link rel="stylesheet" href="../../static/css/my.css">
  </head>
  <body>
  <br>
  <br>
  <br>
  <div class="m-container-small m-padded-tb-massive" style="max-width: 30em !important;">
    <div class="ui container">
      <div class="ui middle aligned center aligned grid">
        <div class="column">
          <h2 class="ui teal image header">
            <div class="content">
              员工后台登录
            </div>
          </h2>
          <form class="ui large form" action="/login" method="post">
            <div class="ui segment" style="background: rgba(0,0,0,0)">
              <div class="field">
                <div class="ui left icon input">
                  <i class="user icon" style="color: gray !important;"></i>
                  <input type="text" name="name" placeholder="请输入用户名">
                </div>
              </div>
              <div class="field">
                <div class="ui left icon input">
                  <i class="lock icon" style="color: gray !important;"></i>
                  <input type="password" name="password" placeholder="请输入密码" style="color: black !important;">
                </div>
              </div>
              <div class="field" style="text-align: left;">
                <img class="ui" id="verificationCode" src="/getVerifyCode">
                <a href="#" onclick="verificationCode()" style="margin-left: 20px;">看不清楚？点击更换</a>
              </div>
              <div class="field">
                <div class="ui left icon input">
                  <i class="spinner icon" style="color: gray !important;"></i>
                  <input type="text" name="verificationCode" style="color: black !important;" placeholder="验证码">
                </div>
              </div>
              <button class="ui fluid large teal submit button">登 录</button>
            </div>
            <div class="ui mini error message"  style="color: red !important;">{{message}}</div>


          </form>
        </div>
      </div>
    </div>
  </div>
  <canvas  id="bgcanvas" style="position: fixed; top: 0px; left: 0px; z-index: -1; opacity: 0.7;" ></canvas>
  <canvas id="c_n1" style="position: fixed; top: 0px; left: 0px; z-index: -1; opacity: 0.7;"></canvas>
  </body>
  <script src="../../static/js/bg.js"></script>
  <script color="0,255,255" src="../../static/js/canvas-nest.min.js"></script>
  <script src="../../static/js/jquery-3.2.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js"></script>
  <script>
    $('#newBlogs-list').load("/footer/newBlogs");
    $('.ui.form').form({
      fields: {
        userName: {
          identifier: 'userName',
          rules: [{
            type: 'empty',
            prompt: '请输入用户名'
          }]
        },
        password: {
          identifier: 'password',
          rules: [{
            type: 'empty',
            prompt: '请输入密码'
          }]
        },
        verificationCode: {
          identifier: 'verificationCode',
          rules: [{
            type: 'empty',
            prompt: '请输入验证码'
          }]
        }
      }
    });
    function verificationCode() {
      $("#verificationCode").attr("src","/getVerifyCode?time="+new Date().getTime());
    }
  </script>
  </body>
</html>
