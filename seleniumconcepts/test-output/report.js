$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFile.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoketest"
    }
  ]
});
formatter.scenario({
  "line": 16,
  "name": "Landing page navigation",
  "description": "",
  "id": "login-functionality;landing-page-navigation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Positivetest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user navigates to \"https://www.next.co.uk/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the user clicks on the landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user get the screenshot of the page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.next.co.uk/",
      "offset": 23
    }
  ],
  "location": "GlueCodes.the_user_navigates_to(String)"
});
formatter.result({
  "duration": 11374496000,
  "status": "passed"
});
formatter.match({
  "location": "GlueCodes.the_user_clicks_on_the_landing_page()"
});
formatter.result({
  "duration": 30082667300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"header-logo\"]\"}\n  (Session info: chrome\u003d81.0.4044.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-8V32ODS\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.122, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: C:\\Users\\gsant\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59799}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 822e8a399870f810e56904d7b7acfd6d\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"header-logo\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat cucumber_BDD.GlueCodes.the_user_clicks_on_the_landing_page(GlueCodes.java:85)\r\n\tat ✽.Then the user clicks on the landing page(TestFile.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GlueCodes.the_user_get_the_screenshot_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 22,
  "name": "To check the endtoend functionality of the application",
  "description": "",
  "id": "login-functionality;to-check-the-endtoend-functionality-of-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@NegativeTest"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user navigates to \"https://www.next.co.uk/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the use clicks on the men shopping page link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.next.co.uk/",
      "offset": 23
    }
  ],
  "location": "GlueCodes.the_user_navigates_to(String)"
});
formatter.result({
  "duration": 13865398300,
  "status": "passed"
});
formatter.match({
  "location": "GlueCodes.the_use_clicks_on_the_men_shopping_page_link()"
});
formatter.result({
  "duration": 8446695500,
  "status": "passed"
});
});