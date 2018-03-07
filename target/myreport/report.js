$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ecare.feature");
formatter.feature({
  "line": 1,
  "name": "to login in ecare application",
  "description": "",
  "id": "to-login-in-ecare-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login into ecare and change the PIN for user",
  "description": "",
  "id": "to-login-in-ecare-application;login-into-ecare-and-change-the-pin-for-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should click on NOT NOW button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on account settings link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on login details link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on change button for PIN change",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter New PIN number",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Confirm PIN number",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click on save button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "PIN saved updated message reflected",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User logout to application",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User close the browser tarun",
  "keyword": "And "
});
formatter.match({
  "location": "Ecare2.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 17601923445,
  "error_message": "org.openqa.selenium.UnhandledAlertException: Modal dialog present: To display the webpage again, the web browser needs to\nresend the information you\u0027ve previously submitted.\n\nIf you were making a purchase, you should click Cancel to\navoid a duplicate transaction. Otherwise, click Retry to display\nthe webpage again.\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027E0383602\u0027, ip: \u002710.38.216.249\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{browserAttachTimeout\u003d0.0, ie.enableFullPageScreenshot\u003dtrue, enablePersistentHover\u003dtrue, ie.forceCreateProcessApi\u003dfalse, ie.forceShellWindowsApi\u003dfalse, pageLoadStrategy\u003dnormal, ignoreZoomSetting\u003dfalse, ie.fileUploadDialogTimeout\u003d3000.0, version\u003d11, platform\u003dWINDOWS, nativeEvents\u003dtrue, ie.ensureCleanSession\u003dfalse, elementScrollBehavior\u003d0.0, ie.browserCommandLineSwitches\u003d, requireWindowFocus\u003dfalse, browserName\u003dinternet explorer, initialBrowserUrl\u003dhttp://localhost:26442/, javascriptEnabled\u003dtrue, ignoreProtectedModeSettings\u003dfalse, enableElementCacheCleanup\u003dtrue, unexpectedAlertBehaviour\u003ddismiss}]\nSession ID: bf9bfe64-dafa-43a6-b733-03f9470368a9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createUnhandledAlertException(ErrorHandler.java:196)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:157)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:694)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:925)\r\n\tat stepdefinations.Ecare2.open_chrome_and_start_application(Ecare2.java:26)\r\n\tat ✽.Given Open chrome and start application(ecare.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Ecare2.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_should_click_on_NOT_NOW_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_click_on_account_settings_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_click_on_login_details_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_click_on_change_button_for_PIN_change()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_enter_New_PIN_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_Confirm_PIN_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.pin_saved_updated_message_reflected()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_logout_to_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ecare2.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});