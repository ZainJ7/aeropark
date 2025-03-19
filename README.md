# Notes of what I did -

Started by setting up the Spring Boot project using Java 17. I included the necessary dependencies for Spring Web, JPA, and Thymeleaf using the spring initializer. Did a quick check in the Spring documentation to make sure everything was in place for a web app setup.

Next, I set up the MySQL database, created the aeroparker database and customers table, matching the schema from the task. I added the right data types for each column and made sure the id field auto-increments. Also, added the @CreationTimestamp for the registered field so it auto-generates when a new record is created.

Then I moved on to the entity class. I created a Customer class and mapped it to the customers table. Added getters and setters for all fields. Followed the JPA docs to make sure the annotations were correct.

For the repository, I used CrudRepository to handle the basic database operations. I also added a custom query to check if an email address already exists in the database, which seemed like a good idea to prevent duplicates.

For the form handling, I wrote the controller that shows the registration form and handles form submissions. On the form submission, I made sure to convert the email to lowercase to avoid issues with case sensitivity. I also added some server-side validation to make sure required fields weren’t empty. If the validation fails, it goes to an error page with a message. If everything is fine, it saves the customer and shows a success page.

I wrote a simple validation method to check that the mandatory fields are filled. It collects all the missing fields and sends them back to the user in an error message.

For the frontend, I kept it simple with Thymeleaf. The registration form uses standard HTML form fields, and I added a bit of CSS to make it neat and easy to use. It’s not overly styled, but it works well enough for the purpose.

The success page just shows a message saying "Thank you for registering" and includes the user’s name, so they know the form was submitted successfully.

I didn’t go overboard with extra features, but I did ensure the email is stored in a case-insensitive way by converting it to lowercase before saving it. I also added basic HTML5 validation on the client side and server-side checks for the required fields.

I relied a lot on Spring and MySQL docs to make sure I was following best practices and handling things correctly. I also checked out Thymeleaf and JPA docs when I was working on the form and entity mapping.
