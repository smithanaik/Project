
# ProjectNuggets
# WomenSecurityApp
 Description:
This App Is A Comprehensive Platform Designed To Address The Safety And Security Concerns Of Women. It Offers A Range Of Features Including Incident Tracking, User Registration, Authentication, Profile Management, Safety Tips, Complaint Registration,Admin Page And More


## Pages and Functionalities

### Home Page:
- **Emergency Button**: Allows users to make direct calls to the nearest police station in emergencies.
- **Latest Women's Incidents in India**: Displays recent incidents involving women in India.
- **Navigation Bar**: Includes options to navigate to the Sign Up, Sign In.

### Sign Up Page:
- **Email Confirmation Authentication**:
Before Users Can Register, The System Verifies Their Email Address By Sending An OTP (One-Time Password). Upon Successful Verification, Users Can Proceed With The Registration Process, Which Includes Providing Detailed Information Such As Username, Email, Aadhar Card Number, And Contact Details. The Registration Process Also Involves Real-Time Validation And Confirmation Emails.
- **Form Fields**: Users can fill in details such as Full Name, Email Address, Contact Number, etc., to create an account.
- **Validation**: Ensure all required fields are filled correctly, with format validation for email addresses and phone numbers.
  -**AJAX Validation**:
Contact Number: Utilize AJAX To Check If The Provided Contact Number Already Exists In The Database.
Aadhaar Card Number: Use AJAX To Verify Whether The Entered Aadhaar Card Number Is Already Registered.

### Sign In Page:

- **Form Fields**: Registered Users Can Securely Sign In Using Their Email And Password. Forgot Password Functionality Is Available With Email Verification And Password Reset.

### Profile Page:
- **Navigation Bar**: Includes two buttons for safety and complaint reporting.
- **User Profile**: Displayed on the right side,  user image.
- **User Options**: When clicking on the user's name, options are provided to edit profile,change password,delete the user's account, along with the option to logout.
    
### Edit profile Button: Allows the user to open the update page:
- **Navigation Bar**: Includes a Home button that redirects to the main profile page.
- **Update Form**: Allows the user to modify their personal information.
- **Save Changes Button**: Enables the user to save the updated information.
- **Options**: Allow the user to navigate back to the main profile page or perform other actions.
### Change password: 
Users Can Change Their Password By Providing Their Old Password Along With A New Password And Confirming The New Password.
- **Password Validation**:
The New Password Must Be Different From The Old Password.
The New Password And Confirmed Password Must Match.

  ### Delete Account Button:
- Deletes the user's account. After deletion, the main index page will open.
- ### Logout Button:
-  Logs the user out from their profile and redirects them to the main page.

### Safety Tips Page:
- **Navigation Bar**: Includes a Home button that redirects to the main profile page.
- **Options**: Allow the user to navigate back to the main profile page or perform other actions.
- **Information**: Provides guidance on protecting women in critical situations, including safety measures and precautions.

### Complaint Reporting Page:
- **Navigation Bar**: Includes a Home button that redirects to the main profile page.
- **History**: Users can view their complaint history, including previously reported incidents.
- **Options**: Allow the user to navigate back to the main profile page or perform other actions.
- **Form Fields**: Users can report incidents by providing details such as Type of Incident, Date and Time, Location, and Description.
- Additionally, Users Are Provided With The Option To Download A PDF Copy Of Their Registered Complaint For Reference.
### Admin Page:
-The Admin Page Offers Comprehensive Management Functionalities For User Details And Complaint Records, With Authentication Via Email Verification, OTP, And Password.
- **User Management**: Admins Can Oversee And Edit User Details In A Tabular Format, Enabling Efficient Updates As Needed.
- **Complaint History**: Access A Detailed List Of All Registered Complaints, Including Incident Details And Timestamps.
- **Complaint Status Editing:** Modify Complaint Statuses To Reflect The Current Resolution Stage.
- **Complaint Copy Download** :Download PDF Copies Of Registered Complaints For Reference Or Further Action

  ## Technologies Used
- Frontend: HTML, CSS, JavaScript ,AJAX
- Backend:  Java ,Spring MVC ,JPA
- Database:  MySQL.
- Security: Passwords Are Encrypted Using Advanced Techniques, With Spring Security Employed For Authentication And Authorization
- Email Integration:Java Mail Sender Techniques Are Utilized For Email Notifications ,Email confrimation Authentication ,admin login OTP And Password Reset Functionalities
- Documentation: Documented Project Functionalities And Setup Instructions For Ease Of Understanding And Replication.

## How to Run and Usage

### Cloning the Repository
To run the WomenSecurityApp project:
- Clone the repository to your local machine: Use Git to clone the project repository onto your computer.

### Backend Setup
- **Database Configuration:** Create a database named "womensecurity" and define the following four tables:
    - **Table 1: womendetails**
        - Columns: id (int AI PK), username (varchar(255)), aadharcardnumber (bigint), contactNumber (bigint), altContactNumber (bigint), email (varchar(255)), country (varchar(255)), state (varchar(255)), presentplace (varchar(255)), pincode (int), password (varchar(255)), imagePath (varchar(255)), otp (varchar(45))
    - **Table 2: complaints**
        - Columns: id (int AI PK), name (varchar(255)), incidentTiming (datetime), place (varchar(255)), aboutIncident (text), contactNumber (bigint), email (varchar(255)), complaintNumber (int), status (varchar(45))
    - **Table 3: email_validation**
        - Columns: id (int AI PK), email (varchar(255)), otp (varchar(45)), created_at (timestamp)
    - **Table 4: admin_detailes**
        - Columns: admin_Id (int AI PK), admin_Name (varchar(255)), admin_emailId (varchar(255)), admin_password (varchar(200)), login_otp (varchar(45))

### Mail Configuration
- **Mail Settings:** Configure mail settings by locating the `MailConfiguration.java` class in the backend server. Set the email ID and password for sending emails. Additionally, locate the `MailSending.java` class and set the email ID for sending emails. For more information on obtaining the email password, refer to your email service provider's documentation or support resources. You can also refer to [this guide](https://www.tothenew.com/blog/step-by-step-guide-sending-emails-in-spring-boot/) for more details.

### Apache Tomcat Setup
- **Tomcat Server:** Install and configure Apache Tomcat server on your machine. Follow the official documentation or relevant tutorials for detailed instructions.

### Default Admin Credentials
- Email: admin@example.com
- Password: Passw0rd! (contains one capital letter, one small letter, one special character, one digit, and length between 8 to 20 characters)

### Running the Application
- **Deployment:** Deploy the application to Apache Tomcat server and navigate to its URL in your web browser.
- **Navigation:** Use the provided links and buttons within the application to navigate between different pages or sections.
- **Data Input:** Fill in the required details accurately within the application interface.

  
## Home Page view
 <img width="1366" height="548" alt="image" src="https://github.com/user-attachments/assets/b6279aec-30f2-46c1-b1a8-82e60e75c516" />

##  SignIn Page view
 <img width="1366" height="604" alt="image" src="https://github.com/user-attachments/assets/21aca8b0-2ad8-4e63-a6bc-fa61a3dc6cc9" />

## SignUP Page view
<img width="1366" height="589" alt="image" src="https://github.com/user-attachments/assets/ae7f6d0d-0a6e-4e07-a3d3-f8c560d115bd" />

## forgot password page view
<img width="1366" height="601" alt="image" src="https://github.com/user-attachments/assets/1f5cb66a-d6f1-4232-9e49-487a5d5fc984" />

## User profile Page view
<img width="1366" height="592" alt="image" src="https://github.com/user-attachments/assets/a728f281-6323-40d3-ba71-865f25ba63dc" />

## Edit Profile page view
<img width="1366" height="585" alt="image" src="https://github.com/user-attachments/assets/fb7c1849-4cf5-4fcd-894e-41f0aaec5f18" />
  
## change password Page view
<img width="1366" height="599" alt="image" src="https://github.com/user-attachments/assets/c0522f00-daea-42c3-b8dd-35e3b98ab02e" />

## Delete Page view
<img width="1366" height="599" alt="image" src="https://github.com/user-attachments/assets/55f6aa28-cfc4-4677-87ad-96451adf11f8" />

## Safety Page view
<img width="1366" height="588" alt="image" src="https://github.com/user-attachments/assets/9a1e2e9b-1807-4403-8768-929e47f67039" />

## complaint page view
<img width="1366" height="589" alt="image" src="https://github.com/user-attachments/assets/d6c511d0-d275-46f3-af41-a7a5f83f4b3b" />

## complaint register successfull page
<img width="1356" height="593" alt="image" src="https://github.com/user-attachments/assets/77dc9eb7-69b4-4afb-94e4-75f04a27cb79" />

## complaint history page view
<img width="1366" height="592" alt="image" src="https://github.com/user-attachments/assets/c1b33e81-8d86-4092-b44a-730860fd74d4" />

## compliant pdf Page view
<img width="1018" height="565" alt="image" src="https://github.com/user-attachments/assets/8de52213-23d2-4978-ad0b-e147e7bb7b33" />

## admin main Page view
<img width="1366" height="599" alt="image" src="https://github.com/user-attachments/assets/9f839803-a442-4c72-905f-e694b597f96f" />

## user deatil Page view
<img width="1366" height="599" alt="image" src="https://github.com/user-attachments/assets/bae8813f-daee-4b10-b780-d2d55142472b" />

## admin compliant status edit Page view
<img width="1366" height="599" alt="image" src="https://github.com/user-attachments/assets/f4209b1d-a39f-42bc-b1fd-00d4026f0ac8" />

## Email Verification OTP Meassage 
<img width="1308" height="597" alt="image" src="https://github.com/user-attachments/assets/c5dc3034-293f-47d7-be36-abfafe62966b" />

##  Register Email Meassge 
<img width="1306" height="591" alt="image" src="https://github.com/user-attachments/assets/8e7f5087-a817-40f3-99e7-8943f09068bd" />

##  Rest Password Email OTP meaasge 
<img width="1304" height="600" alt="image" src="https://github.com/user-attachments/assets/f5873258-e68d-44f6-a539-2566ede41dc7" />

##   Password Change successful Email  
<img width="1298" height="589" alt="image" src="https://github.com/user-attachments/assets/f61638cd-fa68-43ab-86e8-6dce67cfc214" />
