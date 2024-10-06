Online Food Delivery Full Stack Application
Overview
This full-stack online food delivery platform is designed to bring restaurants and food enthusiasts together. It offers a seamless experience for restaurant owners to register and manage their establishments, while allowing customers to browse menus, place orders, and track their delivery status. With a focus on scalability, security, and a user-friendly interface, this platform is built using modern technologies to handle the growing demand of online food delivery services.

Technologies Used

Backend:

Spring Boot 3: Provides a solid foundation for REST API development and business logic.
PostgreSQL: Relational database used for storing user, order, and restaurant data.
JWT (JSON Web Tokens): For secure authentication and session management.
Spring Security: Manages role-based access control and secures the application.
Stripe API: Integrated for secure payment processing, allowing users to pay for their orders seamlessly.

Frontend:

React 18: JavaScript library used to build the interactive user interface.
MUI: React component library used for creating a modern and professional UI.
Tailwind CSS: A utility-first CSS framework for efficient styling and responsive design.
Redux: For centralized state management across the application.
React Router DOM: Handles navigation and routing between various pages within the application.

Key Features

Multi-vendor Support:
The platform allows multiple restaurants to register, offering a variety of cuisines and dishes. Restaurant owners can manage their own menus, view orders, and update availability through a personalized admin panel.

Admin Panels:
Restaurant Owner Panel: Each restaurant owner gets access to an admin panel tailored to their needs. They can update menus, view orders, and track their sales.
Platform Super Admin Panel: A separate admin panel is provided for platform administrators to manage all restaurants, users, and orders. The super admin can approve new restaurant registrations and handle overall platform maintenance.
Role-based Access Control:
The system features secure and efficient role-based access control using Spring Security. Different types of users—customers, restaurant owners, and platform administrators—are granted appropriate access based on their roles, ensuring that sensitive data and functionalities are protected.

User-Friendly Features:

Add to Favorites: Users can save their favorite dishes or restaurants for easy access later.
Carousel Display: A dynamic carousel feature on the homepage displays featured dishes, trending restaurants, and promotional offers.
Add to Cart and Remove from Cart: Users can easily add or remove items from their shopping cart and adjust quantities as needed, providing a smooth ordering experience.
Real-time Order Updates: Once an order is placed, customers receive real-time updates on their order status, from preparation to delivery.

Robust Security Measures:

Authentication: The platform uses JWT tokens for secure authentication. User sessions are protected, and sensitive information is encrypted.
Password Reset via Email: Implemented secure password reset functionality using Spring Mail and Gmail's SMTP service. Users can request password resets via email, and admins can manage user authentication.

Stripe Payment Integration: The platform is integrated with Stripe, allowing users to pay for their meals directly through the application. Payments are secure, and users are notified of successful transactions in real-time.
