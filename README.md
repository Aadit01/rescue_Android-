Topic:Rescue
Professor: Charles Hoot
Group Member: Jing Li, Pappu Shah, Aadit Yadav, Abhishek manandhar

Uses: We build this application to help people in danger. User can connect to nearest hospital, police station
and fire station. Just by pressing the panic button, users current location can be send to Family
members at regular interval SMS and automatically dial 911.

For the first milestone we worked on: 
1)the first page is the login page. Login doesn't work at this point.
2) You can click on skip to go to the main page
3)All the main activity has there own personal page
4) We are currently looking into google map API integration.
5)Working with user login page.

Layouts and their Description:  
 
User Registration: Basic Details of the user with details of 3 Family Members details such as Name & Phone No. Direct Login and details will be saved. 
 
 Panic Button: Gets activated by pressing home button n times or shouting "Panic", after which the app sends Panic SMS to members and dials 911 automatically, and a loud Alarm will be triggered and at regular intervals SMS of current location. 
 
Edit Member Details: User can edit member details. 
 
Hospital: View nearest Hospital with the use of Google Place API and display on a map with directions and with contact details. 
 
Police Station: View nearest Hospital with the use of Google Place API and display on a map with directions and with contact details. 
 
Fire Station: View nearest Fire Station with the use of Google Place API and display on a map with directions and with contact details. 
Front End: Android 
Back End: Java, mysql, Asp.net with c#, firebase

Risk Components: We are working with multiple APIs. Mostly consisting of Google Login Authorization and Google Map API. Likewise, we might use some more API which we are current doing research on.
Require functionality:
1)Map, Database for user login and storing the user information, 
2) Descriptions of data to be entered into the system 
3)Descriptions of operations performed by each screen
4)Security requirements
�	Admin need to login with their valid login credentials in order to access the system
�	View User: All the registered user�s details can be viewed by admin.Division of work: 

Aadit: Aadit is the project manager he is looking into both front end and the back-end and currently he is currently working in firebase Authentication.
Abhishek: Is working on google Map integration and GPS system in general for the Application> he is mostly working in the back end.
Jing Li: Is mostly working on front end of the application and he is also helping Pappu with the research. 
Pappu Sah: Is researching information on various resources we can use in this application to make it more productive  

Some of the test performed:
Login user Authentication 	Pass
Registration for new User	Pass
Storing data in Firebase	Pass
Sign out User	            pass
Change Password	            Fail
Google Map Integration      Fail
Current Location	        Fail 
GPS notification 	        Fail
General App Navigation   	Pass


