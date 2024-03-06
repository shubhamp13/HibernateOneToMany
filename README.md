Certainly! Here's a README file for your mini project using Hibernate with JPA:

---

# Employee Company Management System

This Java mini project implements a simple Employee Company Management System using Hibernate with JPA (Java Persistence API). It allows users to perform CRUD (Create, Read, Update, Delete) operations on employee and company data stored in a MySQL database.

## Features

- **Create Company:** Users can add new company records to the database by providing company name, ID, and domain.
- **Create Employee:** Users can add new employee records to the database by providing employee name, ID, contact number, email, address, and associated company ID.
- **Update Company Details:** Users can modify information of existing companies such as name and domain.
- **Update Employee Details:** Users can modify information of existing employees such as name, contact number, email, and address.
- **Delete Company:** Users can remove company records from the database by providing the company ID.
- **Delete Employee:** Users can remove employee records from the database by providing the employee ID.
- **Fetch Company Details:** Users can retrieve details of a specific company by providing the company ID.
- **Fetch Employee Details:** Users can retrieve details of a specific employee by providing the employee ID.

## Prerequisites

To run this project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL database server
- Hibernate ORM with JPA support
- Any Java IDE or text editor

## Setup

1. **Clone the Repository:**
   ```
   git clone https://github.com/shubhamp13/HibernateOneToOne.git
   ```

2. **Setup Database:**
   - Create a MySQL database named `employee_company`.
   - Execute the SQL scripts provided in the `sql` folder to create the necessary tables.

3. **Configure Hibernate with JPA:**
   - Update the `persistence.xml` file located in the `src/main/resources/META-INF` directory with your database connection details.

4. **Build and Run the Project:**
   ```
   mvn clean install
   java -cp target/dependency/*:target/employee-company-management-system.jar controller.EmployeeCompany
   ```

## Usage

- Upon running the application, you will be presented with a menu displaying various options.
- Choose the appropriate option corresponding to the operation you wish to perform (e.g., save company details, save employee details, etc.).
- Follow the prompts to input the required information for each operation.
- The application will execute the selected operation and provide appropriate feedback.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Feel free to customize this README further based on your project's specific requirements or add any additional information you deem necessary.
