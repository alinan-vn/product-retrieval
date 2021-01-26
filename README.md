# Creating a Product -- HCL ASSESSMENT

## Description
A simple application that populates product data into your mysql database, shows the products on a home page, and gives an option to create and add a product to the database which also shows up in the home page

## Steps
1. Run the ProductCreatorApplication.java file located in the src/main/java/com/hcl/productcreator folder.
2. Open your browser and go to http://localhost:8080/home 
3. Go to http://localhost:8080/createProduct to go to the form to create a product
4. After creating your product, go back to http://localhost:8080/home to view the complete list of products as well as your newly added product

## Requirements
-  Eclipse as the IDE
- Apache Tomcat as the web server
- JSP pages for the front end
- Servlets for backend processing
- Hibernate to store data into the database
- Show an add product form in JSP
- Handle the form submission in a servlet. Validate it for any missing information
- Add the product information into the database using Hibernate
- Set up Hibernate configuration files using XML for the product table
- A class has to be created to store product data. This class will be linked to Hibernate via an hbm.xml file
- The servlet will put the form data into the product class and then pass the product class into Hibernate to add into the database
- The step-by-step process involved in completing this task should be documented