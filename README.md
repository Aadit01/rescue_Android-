Topic:Panic

Professor: Charles Hoot
Group Member: Jing Li, Pappu Shah, Aadit Yadav, Abhishek manandhar


Uses: We build this application to help people in danger.Just by pressing the panic button, users current location can be send to Family
members at regular interval via SMS and we worked in it and it is working. The only requirment is that the phone number should be active. 




Instruction on running the App.
We initially divited projects in to two parts Login activity and panic button activity,
We didnt have time to integrate both files together so we have to open those files seperately. The important thing is both of the activity are fully FUNCTIONAL.
For login page, Go to firebaseLoginApp and it should be fairly simple running process. You can sign up, sign in, sign out and do delete account.

To run the application open firebase login folder the open the main activity
1) It will ask for the login first. Login through fire base is compulsory.
2) As soon as you get in you are taken to the seconday settings page then you can navigate to main page then you can y=use all teh navigation from there.
3) Currently we have connected the login with firebase auth.
4) For the devices we are currently running our project in Nexux 6p API 28


For the next activity Abhishek manandhar, Pappu Shah and I worked together and this is also functional. Running this app is fairly simple, Install the app in the android phone,
or run it through android studio. 
)press panic to send messages
)Press floating action button to add contacts and add contacts accordingly
)Press chat icon to edit panic messages
)view location from the location icon
)Drag the contacts bar or press it to view contacts
)panic wont send messages without adding contacts, so add it beforehand 






Layouts and their Description:  
 
User Registration: User can inpout the number and the name of just can have a contact information saved via contact list. Direct Login and details will be saved. 
 
 Panic Button: Gets activated by pressing it. after which the app sends Panic SMS to members and provides regular intervals SMS of current location. 
 
Edit Member Details: User can edit member details like add or delet contacts 
 
Back End: Java, mysql, Asp.net with c#, firebase

Risk Components: We are working with multiple APIs. Mostly consisting of Google Login Authorization and Google Map API. Likewise, we might use some more API which we are current doing research on.
Require functionality:
1)Map, Database for user login and storing the user information, 
2) Descriptions of data to be entered into the system 
3)Descriptions of operations performed by each screen
4)Security requirements
•	Admin need to login with their valid login credentials in order to access the system
•	View User: All the registered user’s details can be viewed by admin.Division of work: 

Aadit: Aadit is the project manager he is looking into both front end and the back-end and currently he is currently working in firebase Authentication.
Abhishek: Is working on google Map integration and GPS system in general for the Application> he is mostly working in the back end.
Jing Li: Is mostly working on front end of the application and he is also helping Pappu with the research. 
Pappu Sah: Is researching information on various resources we can use in this application to make it more productive  

Some of the test performed:
Login user Authentication 	    Pass
Registration for new User	    Pass
Storing data in Firebase	    Pass
Sign out User	                pass
Change Password	                Pass
Current Location				Pass
Google location coordinates	    Pass 
GPS notification 	            Pass
General App Navigation   	    Pass
App Navigation			        Pass
Send SMS with panic button press 		Pass
Powerbutton to start app        Fail
Integrating both apps           Fail

As a stand alone app, registratin app is fully functional and can be integrated with any other apps. (With limited time we couldn't integrate this app with our Panic app)
As a stand alone app, PaniButton app is fully functional at this point and can be installed in Android decivices with API 21 and Above.
We will integrate app in future.
