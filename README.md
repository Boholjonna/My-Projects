# I saved all the projects I created in this repository. 


------------------------------------------------------------------
# Here is the overview of the Library Management System we created 

#Lib.IT
===

#Library Management System Functionalities
* USER INTERFACE
  - Users can't sign up or create an account on their own since this library was made exclusive.
  - Users can borrow and reserve books, anytime, but if the books are available, they can not reserve, however, they are encouraged to borrow it. Thus, they can only reserve when the books are all borrowed.
  - Each time the user borrows or reserves a book, its date of borrow is tracked.
  - Every user can borrow books, within seven days period only, thus after seven days they will need to return it. The librarian will send them notification to return the book, with a specific date in the library, before the day of return. If the user fails to return the book within that day, the user will be charged of fee. Every book is charged with Php 10 pesos for every overdue week. If the user has an overdue book, he will not be able to access his account. A small window will appear when he logs in to his account that he has an overdue book. He needs to pay for it by gcash, or go to the physical library and pay to the librarian. Once the user pays and free of charge, his due dates will be extended by 7 days for every overdue book and he can already access his acoount.
  - Each user has reservation number when they reserve the same book. Each reservation number adheres to timeline accordingly. When a user cancels reservation of the same book, other user's reservation number will update accordingly.
  - The user also has account settings in which he can update his contact informations but not username, password and ID number since it is created and given by the admin.
  - The user can also track his own history, from borrowing, reserving, requesting the librarian to return, and cancelling reservation, of book/s, and also his history of paid overdues.
  - The user also can update his own profile picture to another photo.

* LIBRARIAN INTERFACE
  - The librarian can view total number of books and book counts.
  - The librarian can add or remove books, and the books count updates accordingly. If the book title already exists, it will not allow to add it again but it can increment  the book count for that book title. If the book title does not exist, it can be added to the books.
  - The librarian can view return requests from the user. Once the user will go to the library and return the books to the librarian, then the librarian will confirm that the user returns the book. The user will be removed from the borrowing list, since he already returned the book.
  - The librarian can view those users who have overdue books, including its overdue dates, name of the user and the amount payable.
  - The librarian can confirm user payments if they can only pay in cash, and user overdue dates will be extended as well.
  - The librarian also can check payment history, wether online or personal payments, the amount of payment, name of the user and the date paid.
  - The librarian can check total earnings from overdue books.
  - The librarian can view book reservations, the name of the user who reserved it, and the date of reservation. Once the books is available, the librarian can send notification to the earlier users who reserved the book. The notification is to update the user that the reserved book is already available, and the user is given specific date for him to go to the library and borrow the book, if he fails to be in the library in that specific date, his reservation will automatically be cancelled and other user's reservation number will also update accordingly.

* ADMIN INTERFACE
  - The admin can add and remove user and librarian accounts.
  - The admin can view earnings and earning history just as the librarian can
  - The admin can generate analytics, specifically the percentage of books, its cateogory, how many times it is borrowed, total number of books, book counts, how many users and librarians and the top 5 most borrowed books.
  - The admin can also access librarian interface

------------------------------------------------------------------------------------------------------------------------------------

  **Description: A library management system created in Java that manages a physical library. A final requirement for Object Oriented Programming.**

Developers:
---

> **♡ [Jonna Bohol](https://github.com/Boholjonna)**

> **♡ [Mikaela Vianca Molina](https://github.com/mikaelaMolina)**

> **♡ [Joanne Georfo](https://github.com/georfojoanne)**

> **♡ [Barbie Kyle Igot](https://github.com/igotbarbiekyle)**

> **♡ [Christine Joy Cortuna](https://github.com/cortunachristinejoy)**

> **♡ [Cryzza Nel Belotindos](https://github.com/BelotindosCryzzaNel)**


Technologies Used:
---

- **Java**

- **Laragon**

- **Canva**

Project Preview
---

**● Log-in**

![1](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/0a3b5159-a58d-4e29-a42e-d5f1ea847ac7)

**● User Interface**

![2](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/fff563fc-00fe-423c-9951-3dc314323ae6)

**● Librarian Interface**

![3](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/93464080-2253-437f-88b5-aa8a52570c03)


**● Admin Interface**

![4](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/f4e645f4-a201-488f-9b51-bf41d074eac2)

**● Overdue Books Warning and Payment windows**

![5](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/2977ec9f-c742-450e-b6b4-38d7e83d00fc)


![6](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/c2e50af5-2f68-4f62-a20a-529fa371445b)

![7](https://github.com/georfojoanne/OOP_LIBRARY_MANAGEMENT_SYSTEM/assets/159901143/cf48b79b-795e-479e-a814-128dfa9312d2)


How to run this program:
---

- This application/system uses Java and is made in Apache Netbeans, it uses MySQL using Laragon as its database.


Step 1: Download and Install Laragon
---

- Go to the [Laragon website](https://laragon.org/download/).

- Once downloaded, run the installer and make sure to follow the instructions on running the database.

Step 2: Set Up Laragon
---

- Open Laragon and click the **Start All** button to start all services.

- Click on the "Menu" button in the Laragon interface.
Select "Database" and then "phpMyAdmin."

- In phpMyAdmin, click on the "Databases" tab. Click "Create."

- Select the newly created database from the list on the left.

- Click on the "Import" tab.

- Click "Choose File" and navigate to the provided database file.

- Ensure the format is set to "SQL" and click "Go" to import the file.

- A message will confirm the import was successful.

Step 3: Opening the Project and Utilizing the Database
---

- Open the system in your preferred development environment most preferably Apache Netbeans.

- Locate the project file directory and update the database configuration/connection string to match the database created in phpMyAdmin. The connection string should include the hostname, port number, database name, username, and password.

Step 4: Build and Run
---

- Build the app/system and ensure that all dependencies are resolved and there are no compilation errors.

- When the build is confirmed to be successful, run the system and it should connect to the database configured.

