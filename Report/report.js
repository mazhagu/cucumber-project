$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "checking the booking functionality of Adactin Hotel Application",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user checking the login page with valid username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-hotel-application;user-checking-the-login-page-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid user name in the field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid password in the field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 2151044500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_valid_user_name_in_the_field()"
});
formatter.result({
  "duration": 308565200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_valid_password_in_the_field()"
});
formatter.result({
  "duration": 280544601,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 973486100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "user checking the hotel availability with mandatory fields",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-hotel-application;user-checking-the-hotel-availability-with-mandatory-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user redirected to search hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter the location detail",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter the hotel name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter the room type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enter the no.of.rooms needed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enter the Check in Date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enter the checkout date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter the no of adults",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enter the no of childs",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click the checkbox to conform rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_stepdefinition.user_redirected_to_search_hotel_page()"
});
formatter.result({
  "duration": 26259201,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_location_detail()"
});
formatter.result({
  "duration": 1137138200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_hotel_name()"
});
formatter.result({
  "duration": 593222500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_room_type()"
});
formatter.result({
  "duration": 598555399,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_no_of_rooms_needed()"
});
formatter.result({
  "duration": 769371201,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_Check_in_Date()"
});
formatter.result({
  "duration": 670671501,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_checkout_date()"
});
formatter.result({
  "duration": 599775700,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_no_of_adults()"
});
formatter.result({
  "duration": 739896500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_no_of_childs()"
});
formatter.result({
  "duration": 650204400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 851943701,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_checkbox_to_conform_rooms()"
});
formatter.result({
  "duration": 296011901,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_continue_button()"
});
formatter.result({
  "duration": 873052601,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "user conform the rooms with payment options",
  "description": "",
  "id": "checking-the-booking-functionality-of-adactin-hotel-application;user-conform-the-rooms-with-payment-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user redirected to payment page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user enter the first name",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user enter the last name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enter the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enter the credit card no",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user enter the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user enter the expiry date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user enter the cvv no",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click the book now buttom",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user click the my litenary button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_stepdefinition.user_redirected_to_payment_page()"
});
formatter.result({
  "duration": 361693301,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_first_name()"
});
formatter.result({
  "duration": 200813300,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_last_name()"
});
formatter.result({
  "duration": 287689699,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_billing_address()"
});
formatter.result({
  "duration": 301019900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_credit_card_no()"
});
formatter.result({
  "duration": 396266099,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_credit_card_type()"
});
formatter.result({
  "duration": 565184100,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_expiry_date()"
});
formatter.result({
  "duration": 1953005600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_enter_the_cvv_no()"
});
formatter.result({
  "duration": 358556200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_book_now_buttom()"
});
formatter.result({
  "duration": 338766000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_stepdefinition.user_click_the_my_litenary_button()"
});
formatter.result({
  "duration": 6359268000,
  "status": "passed"
});
});