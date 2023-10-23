# Lambda - Educational System

## Project Overview

This document provides an overview of the Lambda educational system, outlining its components and requirements. Lambda is built on the following technologies:

- **Backend**: [Spring Framework](https://spring.io/) (SpringBoot, SpringCloud)
- **Authentication**: [Keycloak](https://www.keycloak.org/)
- **Frontend**: [React](https://react.dev/)

For guidance on using Git with this project, please refer to [GIT MD](GITHUB_SEGED.md).

## Prerequisites

Before getting started with the Lambda project, ensure that you have the following prerequisites installed:

- Java 17 or later
- Node 20 or later
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [VSCode](https://code.visualstudio.com/) with the Java extension

## How to Open the Project

1. Clone the project repository by copying the HTTPS clone URL from GitHub.
2. Use the following command to clone the repository or update your local copy: git clone <repository_url>
3. Open the project using IntelliJ IDEA or open IntelliJ IDEA and select "Open Project."
1. In IntelliJ IDEA, load the Maven project by clicking on "Load Maven Project" in the bottom right corner.

## How to Run the Project

You can run each service by executing the main application file for that service. Here are the general steps to run the project:

1. Start by launching the Eureka Server and the API gateway.

2. For each service, navigate to the service's main application file and run the main method.

### Services Overview

- **Authentication and User Management** (Keycloak provider)
- **Forum Service**
  - Features:
    - CRUD operations for Posts, Messages, and Responses
    - Upvoting and Downvoting
    - Sharing functionality
- **News Service**
  - Features:
    - CRUD operations for Posts
    - Upvoting and Downvoting
    - Sharing and linking capabilities
- **Quiz Service**
  - Features:
    - CRUD operations for Tests and Questions
    - Student management
    - Sharing and linking
    - Automated grading
- **Tasks Service**
  - Features:
    - CRUD operations for Tasks and Comments
    - Grading functionality
- **Messaging Service**
  - Features:
    - CRUD operations for sending and listing messages
    - Real-time communication via WebSocket and Socket.IO

- **File Management Service** (Possible integration with Google Drive)
- **Kreta API Integration**

