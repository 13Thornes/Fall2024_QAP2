Welcome to my second QAP from my final semester at Keyin College. For this QAP we were instructed to create an API for a golf tournament that involes a database for it's membership and tournamnets.

To run this application:

1. Clone this repo onto your computer
2. Make sure postman and docker desktop are running
3. Go to mySQLWorkbench and create a new schema titled golf_db
4. go into src-main-resources and click on the application.properties file
5. change the datasource.password field to be the password on your local system
6. click on the m in the top right corner of your intelij screen to access the maven menu
7. Navigate the menu from Fall2024_QAP2-Lifecycle and double click on package to create a jar file
8. Open up a terminal and run the the command docker build -t golf_tournament_api .
   This will create the docker image for you in docker desktop
9. Run the command docker compose up
   This will create the docker container that will now be running your application



Testing in Postman:

MEMBERS:

POSTING a member:

1. Use the dropdown menu to select the word POST
2. In the box for the URL, paste http://localhost:8080/member
3. Select the Body option below the URL box
4. Select the raw option under body
5. Add a member by adding text into the textbox using the following format:
   {
        "memberName": "John Doe",
        "memberAddress": "123 Main St New York, NY, 25473",
        "memberEmail": "jdoe@mail.com",
        "memberPhoneNumber": "9023851127",
        "membershipStartDate": "2022/12/07",
        "durationOfMembership": 1
    }
6. Click on send to submit the data into the database
   a window on the bottom of your screen will pop up showing that the member was assigned an ID and added to the database


UPDATING a member:

1. Use the dropdown menu to select the word PUT
2. In the box for the URL, paste this URL while replacing the 1 with the ID number you want to update http://localhost:8080/member/1
3. Select the Body option below the URL box
4. Select the raw option under body
5. Update a member by updating the member information in the textbox using the following format:
    {
        "memberName": "John Doe",
        "memberAddress": "123 Main St New York, NY, 25473",
        "memberEmail": "jdoe@mail.com",
        "memberPhoneNumber": "9023851127",
        "membershipStartDate": "2022/12/07",
        "durationOfMembership": 1
    }
7. Click on send to submit the data into the database
   a window on the bottom of your screen will pop up showing the member with the updated information



GET ALL members:

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste http://localhost:8080/members
3. Click on send to query for all members
   The window on the bottom of your screen will display all members currently in the database

   

GET member by id

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL while replacing the 1 with the ID number you want to search http://localhost:8080/member/1
3. Click on send to query for that member
   The window on the bottom of your screen will display the member you searched for
   

GET member by memberName

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL: http://localhost:8080/byname
3. Under the GET, click on the params tab
4. In the box under Key, type in memberName
5. In the box under value type in the exact value you're searching for keeping in mind that spaces and capital letters count. For example: John Doe
6. Click on send to query for that member
   The window on the bottom of your screen will display the member you searched for
   

GET member by memberPhoneNumber

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL: http://localhost:8080/byphonenumber
3. Under the GET, click on the params tab
4. In the box under Key, type in memberPhoneNumber
5. In the box under value type in the exact value you're searching for. It will be a 10 digit code with no spaces or special characters. For example: 9023851127
6. Click on send to query for that member
   The window on the bottom of your screen will display the member you searched for



TOURNAMENTS:



POSTING a tournament:

1. Use the dropdown menu to select the word POST
2. In the box for the URL, paste http://localhost:8080/tournament
3. Select the Body option below the URL box
4. Select the raw option under body
5. Add a tournament by adding text into the textbox using the following format:
    {
        "id": 1,
        "startDate": "2024/12/12",
        "endDate": "2024/12/14",
        "location": "New York",
        "entryFee": 50.0,
        "cashPrizeAmount": 500.0,
        "participatingMembers": [
            {
                "id": 3,
                "memberName": "Clint Eastwood",
                "memberAddress": "78 West Ave Phoenix, AZ, 67356",
                "memberEmail": "ceastwood@mail.com",
                "memberPhoneNumber": "9537193567",
                "membershipStartDate": "2022/07/25",
                "durationOfMembership": 2
            },
            {
                "id": 1,
                "memberName": "John Doe",
                "memberAddress": "123 Main St New York, NY, 25473",
                "memberEmail": "jdoe@mail.com",
                "memberPhoneNumber": "9023851127",
                "membershipStartDate": "2022/12/07",
                "durationOfMembership": 1
            },
            {
                "id": 2,
                "memberName": "Sam Jones",
                "memberAddress": "45 East Ave Chicago, IL, 12398",
                "memberEmail": "sjones@mail.com",
                "memberPhoneNumber": "2851730298",
                "membershipStartDate": "2021/08/14",
                "durationOfMembership": 3
            }
        ]
    }
6. **NOTE** ensure you are only entering members that you already have in your database
7. Click on send to submit the data into the database
   a window on the bottom of your screen will pop up showing that the tournamnet was assigned an ID and added to the database


UPDATING a tournament:

1. Use the dropdown menu to select the word PUT
2. In the box for the URL, paste this URL while replacing the 1 with the ID number you want to update http://localhost:8080/tournament/1
3. Select the Body option below the URL box
4. Select the raw option under body
5. Update a tournament by updating the tournament information in the textbox using the following format:
    {
        "startDate": "2024/12/12",
        "endDate": "2024/12/14",
        "location": "New York",
        "entryFee": 50.0,
        "cashPrizeAmount": 500.0,
        "participatingMembers": [
            {
                "id": 3,
                "memberName": "Clint Eastwood",
                "memberAddress": "78 West Ave Phoenix, AZ, 67356",
                "memberEmail": "ceastwood@mail.com",
                "memberPhoneNumber": "9537193567",
                "membershipStartDate": "2022/07/25",
                "durationOfMembership": 2
            },
            {
                "id": 1,
                "memberName": "John Doe",
                "memberAddress": "123 Main St New York, NY, 25473",
                "memberEmail": "jdoe@mail.com",
                "memberPhoneNumber": "9023851127",
                "membershipStartDate": "2022/12/07",
                "durationOfMembership": 1
            },
            {
                "id": 2,
                "memberName": "Sam Jones",
                "memberAddress": "45 East Ave Chicago, IL, 12398",
                "memberEmail": "sjones@mail.com",
                "memberPhoneNumber": "2851730298",
                "membershipStartDate": "2021/08/14",
                "durationOfMembership": 3
            }
        ]
    }
6. **NOTE** ensure you are only entering members that you already have in your database
7. Click on send to submit the data into the database
   a window on the bottom of your screen will pop up showing the tournament with the updated information


GET ALL tournaments:

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste http://localhost:8080/tournaments
3. Click on send to query for all tournaments
   The window on the bottom of your screen will display all tournaments currently in the database


GET tournament by id

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL while replacing the 1 with the ID number you want to search http://localhost:8080/tournament/1
3. Click on send to query for that tournament
   The window on the bottom of your screen will display the tournament you searched for


GET tournament by location

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL: http://localhost:8080/bylocation
3. Under the GET, click on the params tab
4. In the box under Key, type in location
5. In the box under value type in the exact value you're searching for keeping in mind that spaces and capital letters count. For example: New York
6. Click on send to query for tournaments
   The window on the bottom of your screen will display any tournaments in that location


GET tournament by startDate

1. Use the dropdown menu to select the word GET
2. In the box for the URL, paste this URL: http://localhost:8080/bystartdate
3. Under the GET, click on the params tab
4. In the box under Key, type in startDate
5. In the box under value type in the exact value you're searching for. It will be in YYYY/MM/DD format. For example: 2025/02/14
6. Click on send to query for tournaments
   The window on the bottom of your screen will display the tournaments with that start date





