# CarBookingCLIApp2 🚗

## Description
App for car rental company. This app allows administrators to see users, available cars and booked cars, and to make a booking.

## App structure
App is written in java language, version 17. Structured in packages which contain POJOs with appropriate service and DAO classes. Data is stored in arrays.


## App walktrough

### Main menu

When you run app, you are presented with this main menu:

![Screenshot from 2023-05-23 23-35-23](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/8d9815a3-5db7-4c85-bea0-516ed0db8124)


If you enter number out of range you are presented with message and main menu to try again.

![Screenshot from 2023-05-23 23-38-27](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/4c06a127-42ee-4323-ad84-befd5b81e899)


If you enter some string, you are presented with message and main menu to try again.

![Screenshot from 2023-05-23 23-40-24](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/ec889f4f-009e-46ea-895c-c222737635b9)


### 6 - View All Users

When you insert `6` you get all users and return back to main menu.

![Screenshot from 2023-05-23 23-41-29](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/edce0e22-760e-4392-a8f7-ec979b0c2351)

Users have unique id and name.


### 5 - View Available Electric Cars

When you insert `5` you get all available electric cars printed and return back to main menu.

![Screenshot from 2023-05-23 23-43-36](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/e4941360-2c3a-45cc-b881-7439de9c5912)

Cars have regNumber, rentalPricePerDay, brand, isElectric and isAvailable fields. Note that isAvailable field is not printed here.
If there are no electric cars available, you get this message and return to main menu.

![Screenshot from 2023-05-23 23-45-05](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/a0f055d9-5b81-4d64-a169-753ec7d360b7)


### 4 - View Available Cars

When you insert `4` you get all available cars printed and return back to main menu.

![Screenshot from 2023-05-23 23-46-36](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/c550a54b-42ad-41f9-bf9c-67458c95d748)

If there are no cars available, you get this message and return to main menu.

![Screenshot from 2023-05-23 23-47-52](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/b271f361-73bc-47bb-b2c0-a29a9c606aff)


### 3 - View All Bookings

When you insert `3` you get all car bookings printed and return back to main menu.

![Screenshot from 2023-05-23 23-50-05](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/fa54c742-3cc7-447a-b690-370a61519e41)

If there are no car bookings, you get this message and return to main menu.

![Screenshot from 2023-05-23 23-50-49](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/84a08e7f-d853-44bc-98d9-5cfc5dd72114)


### 2 - View All User Booked Cars

When you insert `2` you get all users printed and message to select user id for which you want to check bookings or if you want to return to main menu, insert `0`.

![Screenshot from 2023-05-23 23-59-34](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/e705c666-8e70-4c9d-a133-c1bec52b8b7d)

If you enter invalid user id, you get this message.

![image](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/0c77346a-7aa9-4d7c-b338-86608f45d6b1)

When you enter correct user id you get users bookings, if available.

![Screenshot from 2023-05-24 00-02-36](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/2f10ba2b-f5ec-4df6-ba86-c38dd24c5343)

And this message if no bookings are available. Than you are returned to main menu.

![Screenshot from 2023-05-24 00-03-38](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/eea234c1-0bf3-4317-becf-5d5da678f247)


### 1 - Book Car

When you insert `1` you get all users printed and message to choose user id for which you want to book a car or enter `0` to return to main menu.

![Screenshot from 2023-05-24 00-06-45](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/4958e979-41de-4ac8-863a-e32d7b0f08ae)

If you enter correct user id you get the available cars printed, and message to enter car reg number in order to book that car or enter `0` to return to main menu.

![Screenshot from 2023-05-24 00-07-49](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/2262aee7-7405-495f-b9e7-1adc107e7fc2)

Than you enter car reg number and get message that book was successfull, if car reg numebr is correct, and return to main menu.

![Screenshot from 2023-05-24 00-09-25](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/77ab8c45-3e13-4231-82f2-9abd4f30519b)

Than you can validate your booking by viewing all bookings, view all user booked cars, view available cars and view available electric cars (if the car that was booked is electric car).

If you enter incorrect user id you get this message.

![Screenshot from 2023-05-24 00-10-42](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/19aa0bde-56e5-4dad-b22c-b47395d250bd)

And if you enter incorrect cars reg number you get this.

![Screenshot from 2023-05-24 00-11-38](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/42295f37-0cf8-44b0-b3ed-c6421ef1f437)

If there are no available cars for booking, upon entering `1` to book a car, you will get this message and return to main menu.

![Screenshot from 2023-05-24 00-12-47](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/15e90275-b788-4916-be3f-9dcab2147fc5)


### 7 -Exit Application

When you insert '7' you exit app.

![Screenshot from 2023-05-24 00-14-45](https://github.com/akibaz/CarBookingCLIApp2/assets/47009156/170bb8b6-d384-4b63-9807-dd7cebd4e054)


## Last words

Thats all folks. 😜
