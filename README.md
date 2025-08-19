# Research Assistant Backend

Spring Boot backend service for the Research Assistant Chrome Extension. This service integrates with Google Gemini AI to provide text summarization and research suggestions.
  
## Demo Video

[![Watch the video](https://img.youtube.com/vi/otuJlxIWG94/hqdefault.jpg)](https://youtu.be/otuJlxIWG94)

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- Google Gemini API key

## Setup

1. Clone the repository
```bash
git clone <your-repo-url>
cd research-assistant-backend
```

2. Configure your API credentials in `src/main/resources/application.yaml`:
```yaml
gemini:
  api:
    url: https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=
    key: YOUR_GEMINI_API_KEY
```

3. Build the project
```bash
./mvnw clean install
```

4. Run the application
```bash
./mvnw spring-boot:run
```

The server will start on `http://localhost:8080`

## API Endpoints

### POST /api/research/process

Process text content for summarization or suggestions.

**Request Body:**
```json
{
  "content": "Text to process",
  "operation": "summarize" | "suggest"
}
```

**Response:**
```
Plain text response with processed content
```

## Project Structure

```
src/main/java/com/deepresearch/assistant/
├── ResearchAssistantApplication.java    # Main Spring Boot application
├── ResearchController.java              # REST API controller
├── ResearchService.java                 # Business logic for AI processing
├── ResearchRequest.java                 # Request DTO
└── GeminiResponse.java                  # Response DTO for Gemini API
```

## Technologies Used

- Spring Boot 3.x
- Spring WebFlux (WebClient)
- Lombok
- Jackson (JSON processing)
- Google Gemini AI API

## Development

To run in development mode with hot reload:
```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

## Building for Production

```bash
./mvnw clean package
java -jar target/research-assistant-*.jar
```

## CORS Configuration

The backend is configured to accept requests from all origins (`*`) for development purposes. Update the `@CrossOrigin` annotation in `ResearchController.java` for production use.
