# Enjour Your Holiday
Enjoy Your Holiday - Is is One Stop solution for your memoriable Vacation. Right from Weather Guide / List of Accomodation / Attractions / Resturaents / Forex Converstions / Holiday planner with your country holiday list, we take care of all of it.


## UX - Requirements
## 1. Strategy Plane
  	* The target audiance Holiday seekers planning on a small budget Vacation. This Website  displays some trending tours and adventorous places.
		
		* Get potential travellers and tourism industry on a single potal to facilitate efficient and effective Travel Planning and Smooth Execution.

  	* Boost the tourism/hospitality industry with travellers from around the world by showcasing the potential places within budget of everyone to spend ones holiday.
	
	##### Epics (high level User Stories would include)
		1. As a Holiday Seeker, I want to view various potential holiday locations, so that I can select one.
		2. As a Holiday Seeker, I want to view various details of potential holiday locations, so that I can be prepared.
		3. As a Holiday Seeker, I want to view various adventorous holiday location, so that I can select one.
		4. As a Holiday Seeker, I want to view weather , Forex, my native country holiday, so that I can plan in advance.
		5. As a Holiday Seeker, I want to Contact Travel Agent, so that I can proceed with getting further informations.
		6. As a Holiday Seeker, I want to Download Holiday Brocher, so that I can get an Idea of the travel agent sevices.

#### User Needs Objectives :-
 	* Providing a browser-based front end application where potential travelers can get info on  Weather, search for list of Accomodation / Attractions / Resturaents / Forex Converstions /  holiday list of local country and some potential destinations withinthe budget reach of many.
	
#### Business Objectives :-
	1. Automating a currently manual process of visitng a travel agent office, and allowing travel inquiries and applications from the Internet.
	2. Decreasing the time to process the travel enquire from approximately 30 minutes to 5 minutes. 
	 This will help TravelIndia Company to dramatically increase the volumes of travel booking processed to meet its business plan.
	3. Providing online travel status. This will allow TravelIndia customercare to rapidly and accurately respond to customer inquiries both prior to and during the travel of the customer.
	4. Need to convert most of the enquiries to a travel candidate, using a contatc us page and live  chat.
	5. Some quotes to make user select our travel packages over our competitors we need to have some  catchy and compelling headlines.  
	6. The steps between user selecting a package and making payment should be minimal. 
	7. An online survey form to collect questionnaire from users on What makes a good holiday travel   booking experience? 

## 2. Scope Plane
 	The TravelIndia application is designed to provide the following features for current production release:
	1. An administration system for the employees of TravelIndia corporation to add new locations and packages
	2. A registration system for potential travellers / Tour Guide / Travel Agent
	3. A system for Travel agents and Guides to view packages and dates allocated to them
	4. Timely and accurate weather information to travelers, guide and the TravelIndia corporation


###	Features off the table for current release -
	1. Adding services / Travel Pacakages to shopping cart and Online payment
	2. Admin login features such as, to add new tour Packages and applying sesonal discounts on particular packages
	3. Approve / Reject  / Block paticular guide based on cutomer complaints
	4. Sign-In / Sign-Up
	5. Tour Guide / Travel Agent Login to view their allocated tours 
	6. To show we are an expert in conducting tours around in and around India the website should host some Video tutorials on travel precautions, checklist, testimonials and frequently asked questions, and sending invite to signedup users on upcomming webinars.
	
####	The current release would be in 3 months duration , consisting of 3 sprints.
	
		Sprint 1 - Landing Page , Sign Up/ Sign-In page (only page design not email validation for sign -in) / Trending Tours page 
		
		Sprint 2 - Connect Google Maps / Places and weather guide API 
		
		Sprint 3 - Frequently asked questions, Contact Us page (with emailJS API), Travel Essentials page with Forex calculation API, Search dynamically for weather of a place using OpenWeather MapAPI , Search Holiday list of a particular country dynamically based on Country code and year. 
	
## 3. Structure Plane
	The website should focus on visual appeal and be intuitive to target wide group of customer base ranging from teen to seniors, newly weds to couples with families.

	User Friendly navbar and footer across all pages. Multiple windows allow different information to be displayed simultaneously on the user's screen.
	
	Typical features could include:
	Displaying Trending Tours, Adventrous tours, Contact Us , Some APIs to fetch dynamic data (weather, attractions , Resturaents, Accomodations , Forex, Holiday Calander)

### Interoperability and fully functional on Mozilla / IE and Chrome
### Compatability for responsive Desktop / Laptop / IPad / Mobile (iPhone 6/7/8 , Galaxy s5, moto G4 Version)


## 4. Skeleton Plane
#### Interface Design
		Home Page, Weather Update , explore by state name, FAQs , Contact Us.And Footer contains About US, 

#### Navigation Design
		User can navigate from any of these pages  Home Page, 4 pages of the Trending tours, Adventure Tours, FAQs , Contact Us, Travel Essentials SignIn-SignUp. (All pages interlinked using navbar)
		
#### Information Design
		Icons for HomePage, FAQs page.

		Why choose us also has 4 icons for 4 reasons.

		To maintian minimum content and large images, incorporate a heroimage to motivate a person to register to travel.And 4 reasons quotes in Home page to compel user to select us over our competitors
	

		“Travel isn’t always pretty. It isn’t always comfortable. Sometimes it hurts, it even breaks your heart.
		But that’s okay. We’ll take care the journey, be with your throughout and make sure it leaves good marks on your memory, on your consciousness, on your heart, and on your body. You take something with you. Hopefully, you leave something good behind.”

## 5. Surface Plane
### List of Use Cases:
Ideal new user flow would be represented by the following use case (Actor represent an ideal future user)

	#### Use Case 1 -  Trending Tours page
		Actor: Enters the Application url
		System: Loads the landing page with Hero Image with motivating quotue 
		Actor: Clicks on Trending tours menu in the navbar
		System: displays the page with the 4 trending tours on our website
		System: displays picture of the city, short description, video of places to visit, weather of the city on that day, top attractions / places to visit, restaurants, Accomodations (latest data from API dynamically) 

	#### Use Case 2 - Contact Up Page
		Actor: click ContactUS in the nav bar
		Sytem: Directs user to ContactUS page
		Actor: Fills the ContactUs Page with his/ her detais and needed information and clicks on submit
		System: Sends the mail to the Travel Agent with details filled in the form
	
	#### Use Case 3 - FAQs page
		Actor: clicks on FAQs icon in navbar
		System: System displays Frequently asked Questions of travellers
	
	#### Use Case 4 - Adventure Tours page
		Actor: clicks on Adventure Tours in navbar
		System: System displays popular adventures in tabular format

	#### Use Case 5 - Travel Essentials (Forex calculator)
		Actor: clikcs on Travel Essentials Page
		System: displayes three sections - Forex calculator /  Holiday list of a company / Weather details based city 
		Actor: enters a currency code and amount needed to convert 
		System: displays the total in INR after conversion for that day

	#### Use Case 6 - Travel Essentials (Holiday Calender)
		Actor: clikcs on Travel Essentials Page
		System: displayes three sections - Forex calculator /  Holiday list of a company / Weather details based city 
		Actor: enters a country code and year 
		System: displays the Holidays of that year for that country

	#### Use Case 7 - Travel Essentials (Weather Guide)
		Actor: clikcs on Travel Essentials Page
		System: displayes three sections - Forex calculator /  Holiday list of a company / Weather details based city 
		Actor: enters a city name 
		System: displays the weather of that city for that day


### Wire Frame and UX design

#### link to wireframe of Desktop/ Tab and mobile view
![location page wireframe]
(https://github.com/baddipudiDebora/Interactive-Front-End-Design-Project/blob/master/Docs/WireFrames-%20Travel%20India-converted.pdf)


## Features

### Existing Features
  1. View landing page and customer testimonials 
	2. A Trending tour page with details of City, Picture, Video, Google Map, Dynamic data of weather, attractions, Resturaents, Accomodations
	3. An Adventrous tour pacakages page to display various locations detials, picture and short description.
	4. Contact Us page to get intouch with TravelIndia corporation
	5. FAQs page

### Features Left to Implement
1. Sign-In / Sign/Up
2. Add travel package to cart
3. Live chat with customer service
4. Online payment for booking
5. Admin login
6. Tour guide login

### Technologies Used
* The project uses HTML to add content to the website.
* The project used CSS to style the content.
* The project used BootStrap 4  to have reusable CSS styling and make tyhe site responsive.
* Icons / Images were taken from Font-Awesome website
* Styling was taken from Google fonts 
* Used JQuery to simplify DOM manipulation.
* APIs 	(to fetch data dynamically)
	- Google Maps
	- emailJS
	- OpenWeatherMap
	- API for Attractions / Restaurants / Accomodations by APIDojo.net
	- Forex calculator
	- Holiday Calander


## Testing

#### XML Validator  - Verified
* Used HTML Validator from W3Schools and attached each page results


### CSS Validator – Verified 
* Used CSS Validator from W3Schools and attached each page results

Test Strategy includes UI testing and API testing. For UI testing some are manual and some UI features are Automated using Selenium. API testing is tested using Protactor with Jasmine.

### Manual Testing
Testing has been performed to verify and validate the software as per the requirements.
Manual Testing performed for the below
 #### Test senarios 

1. Test to check if  all the pages layout is as perthe wireframes from the UX design
2. Test to check functionality of index (home) page
3. Test to check functionality of TrendingTours page (4 locations pages - Ooty / Delhi / Kankayakumari / Lei Ladakh)
4. Test to check functionality of FAQs page
5. Test to check functionality of ContactUs Page
6. Test to check functionality of TravelEssentials page
7. Test to check if the website is responsive on different devices
8. Test to check system displays appropriate error message whne user enteres invalid data

Manual testing for data generated by API and Screenshots can be found here
![Manual Testing Screenshots] (https://github.com/baddipudiDebora/Interactive-Front-End-Design-Project/blob/master/Testing/Manual%20Testing/Manual%20Testing%20of%20API%20Data.docx)

### Automated unit testing using open source tool selenium to test the below features
1.	Check if all the pages link is functional by clicking on the link and checking the title of the page

please find the automaton setup and scripts resourses here 
![Automation testing resources] (https://github.com/baddipudiDebora/Interactive-Front-End-Design-Project/tree/master/Testing/Automation%20Testing)

### API testing using PostMan or Protactor with Jasmine is work in progress, will update once completed

 
## How your project looks and works on different browsers and screen sizes
  -  The website is designed with bootstrap and is tested for responsiveness on Desktop / Laptop /Tablet /Mobile View.

 - Please check the attached Wireframes PDF on different devises from the UX requirements section

 - Please check the attached Screenshots on different devices
![Screenshots on Tab] (https://github.com/baddipudiDebora/Interactive-Front-End-Design-Project/blob/master/Docs/Screenshots%20in%20Laptop%20%2C%20Tab%20and%20mobile%20view.docx)

###    It has been tested for iphone6/7/8 , also in iPad. 
  ##### please refer Github link below.
  ![Screenshots on Mobile view] (https://github.com/baddipudiDebora/Mini-Project/blob/master/Screenshots%20of%20mobile%20and%20tab%20testing.pdf)


## Any interesting bugs or problems you discovered during your testing, even if you haven't addressed them yet.
- though i have added a loop to check for undefined - still displaying undefined in kanyakumari restaurants list fetched from API
![Bug 1](https://github.com/baddipudiDebora/Interactive-Front-End-Design-Project/blob/master/Testing/Manual%20Testing/undefined%20Restuarent%20Kanyakumari.JPG)

## Deployment
Code was written in replit and pushed on regular basis to github account.



#### the published github page is below

![The GitHub Page URL] (https://baddipudidebora.github.io/Interactive-Front-End-Design-Project/)

## Credits
### Content
    Most of the text was copied from the Wikipedia of the locations
 

## Acknowledgements
    I received inspiration for this project  and snippets from the below websites
    
https://www.travelpulse.com/news/travel-agents/4-content-ideas-for-your-travel-agent-website.html

https://www.scenicsuitcase.com/types-of-vacations/

https://www.tutorialrepublic.com/snippets/gallery.php?tag=carousel

https://www.holidify.com/collections/historical-places-in-india

http://www.thrillophilia.com/blog/bucket-list-ideas-for-adventure-travellers-in-india/

https://mdbootstrap.com/
