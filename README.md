# Simeioma - Student Notes Application

A full-stack notes application built with Spring Boot, HTML/CSS/JavaScript, and H2 database.

## Features

- User registration & login with session management
- Create, read, update, delete notes (CRUD)
- Real-time search by note title
- Auto-capture timestamp on note creation
- Geolocation tracking (latitude/longitude)
- Hover to view note location coordinates

## Tech Stack

- **Backend**: Spring Boot 4.0.3, Java 17, Maven
- **Database**: H2 (in-memory)
- **Frontend**: HTML5, CSS3, Bootstrap 5, Vanilla JavaScript
- **API**: REST with CORS enabled

## Quick Start

### Build
```bash
.\mvnw.cmd clean package -DskipTests
```

### Run
```bash
java -jar target\simeioma-0.0.1-SNAPSHOT.jar
```

Access at: `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/users/register` | Register user |
| POST | `/users/login` | Login user |
| POST | `/users/logout` | Logout user |
| GET | `/notes` | Get all notes |
| POST | `/notes` | Create note |
| PUT | `/notes/{id}` | Update note |
| DELETE | `/notes/{id}` | Delete note |

## Usage

1. **Register** - Create new account (username min 3 chars, password min 6 chars)
2. **Login** - Sign in to dashboard
3. **Create Note** - Add title & content, allow location when prompted
4. **Search** - Type in search bar to filter notes by title
5. **Edit** - Click Edit button to modify note
6. **Delete** - Click Delete button to remove note
7. **Logout** - Click Logout button

## Database

- **Users**: ID, Username, Password
- **Notes**: ID, Title, Content, Username, Created_At, Latitude, Longitude, Location

## Configuration

Edit `src/main/resources/application.properties` to change database or port.

## Troubleshooting

**Port already in use:**
```bash
netstat -ano | findstr :8080
taskkill /PID <PID> /F
```

**Build fails:**
```bash
java -version  # Ensure Java 17+
.\mvnw.cmd clean
.\mvnw.cmd package -DskipTests
```

**Location not working:**
- Allow browser location permission
- Check F12 → Console for errors

---

**Version**: 0.0.1 | **Created**: March 6, 2026
