$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario1.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Evaluate Broken Images"
    }
  ],
  "line": 5,
  "name": "Broken images check",
  "description": "",
  "id": ";broken-images-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I see the images",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can evaluate the broken images",
  "keyword": "Then "
});
formatter.match({
  "location": "brokenImageSteps.i_launch_the_website()"
});
formatter.result({
  "duration": 7871597496,
  "status": "passed"
});
formatter.match({
  "location": "brokenImageSteps.i_see_the_images()"
});
formatter.result({
  "duration": 2038415734,
  "status": "passed"
});
formatter.match({
  "location": "brokenImageSteps.i_can_evaluate_the_broken_images()"
});
formatter.result({
  "duration": 4336646621,
  "status": "passed"
});
formatter.uri("Scenario2.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Evaluate Basic Auth"
    }
  ],
  "line": 4,
  "name": "Basic Auth check",
  "description": "",
  "id": ";basic-auth-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch authorization page with user credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I can see authorization success page",
  "keyword": "Then "
});
formatter.match({
  "location": "basicAuthSteps.authPage()"
});
formatter.result({
  "duration": 8004860356,
  "status": "passed"
});
formatter.match({
  "location": "basicAuthSteps.successVerification()"
});
formatter.result({
  "duration": 3126731336,
  "status": "passed"
});
formatter.uri("Scenario3.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Evaluate Slider"
    }
  ],
  "line": 5,
  "name": "Slider check",
  "description": "",
  "id": ";slider-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I move slider to max",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I evaluate max position",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I move slider to min",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I evaluate min position",
  "keyword": "Then "
});
formatter.match({
  "location": "sliderSteps.launchWeb()"
});
formatter.result({
  "duration": 6531500602,
  "status": "passed"
});
formatter.match({
  "location": "sliderSteps.moveMax()"
});
formatter.result({
  "duration": 3153868229,
  "status": "passed"
});
formatter.match({
  "location": "sliderSteps.evaluateMax()"
});
formatter.result({
  "duration": 77005403,
  "status": "passed"
});
formatter.match({
  "location": "sliderSteps.moveMin()"
});
formatter.result({
  "duration": 3747730084,
  "status": "passed"
});
formatter.match({
  "location": "sliderSteps.evaluateMin()"
});
formatter.result({
  "duration": 997956163,
  "status": "passed"
});
formatter.uri("Scenario4.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Evaluate Mouse hover details"
    }
  ],
  "line": 5,
  "name": "Mouse hover check",
  "description": "",
  "id": ";mouse-hover-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on the picture",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I evaluate the details of picture",
  "keyword": "Then "
});
formatter.match({
  "location": "mouseHoverSteps.launchWeb()"
});
formatter.result({
  "duration": 6447024714,
  "status": "passed"
});
formatter.match({
  "location": "mouseHoverSteps.mouseHoverPic()"
});
formatter.result({
  "duration": 6433937234,
  "status": "passed"
});
formatter.match({
  "location": "mouseHoverSteps.Details()"
});
formatter.result({
  "duration": 959690664,
  "status": "passed"
});
});