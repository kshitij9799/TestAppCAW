# TestAppCAW

## 📱 Overview
**TestAppCAW** is an Android application developed as part of a technical assessment for the **Product Developer (Android SDK)** role. The app demonstrates integration with a REST API using Retrofit, local data storage with Room, and clean architectural practices.

---
## 🚀 Features
- **API Integration:** Retrieves data from an external API.
- **Local Storage:** Saves data using Room Database.
- **MVVM Architecture:** Ensures separation of concerns and maintainability.
- **RecyclerView Implementation:** Displays data efficiently.
- **hilt Integration:** helps in dependency injection.
- **Firebase Integration:** Monitors crash analytics and network performance.

---
## 🛠️ Tech Stack
- **Kotlin** – Primary programming language.
- **Retrofit** – For API communication.
- **Room Database** – For local storage.
- **Firebase Crashlytics & Performance Monitoring** – For monitoring app stability and performance.
- **ViewModel & LiveData** – For managing UI-related data.
- **Coroutines** – For handling asynchronous tasks.

---
## ⚡️ Getting Started
### 1. To Clone the repository
Run command : 
git clone https://github.com/kshitij9799/TestAppCAW.git

---
## 🎨 Design Decisions
### 1. Bottom Navigation for Task Management
- Implemented a **Bottom Navigation Menu** with two options:
    - **Completed Tasks:** Displays a list of tasks that have been marked as completed.
    - **Pending Tasks:** Shows a list of tasks that are yet to be completed.

### 2. Pending Tasks – Online & Offline Mode
- **Toggle Options for Task Source:**
    - **Offline Mode:** Retrieves and displays tasks stored locally using **Room Database**.
    - **Online Mode:** Fetches publicly available mock API data using **Retrofit** to provide real-time task updates.

### 3. Clean and Modular Architecture
- Applied **MVVM Architecture** to ensure clear separation of concerns between UI, business logic, and data sources.
- Maintained modularity to facilitate future scalability and maintenance.

### 4. Offline Data Persistence
- Used **Room Database** to store task data locally, ensuring data availability in offline scenarios.
- Proper synchronization is maintained when switching between online and offline modes.
  
---
**firebase crashlytics**
<img width="930" alt="image" src="https://github.com/user-attachments/assets/198e0700-16d4-4ca2-a04d-166bc19b66a8" />

---
**network performance**
<img width="919" alt="image" src="https://github.com/user-attachments/assets/90a1a993-60c4-4c66-a053-e59e65e4c9c9" />

---
**screen recording of the crash**
[crash screen recording.webm](https://github.com/user-attachments/assets/35788b4f-3346-4901-b164-bf482addd5fa)
**crashlytics of this crash**
<img width="917" alt="image" src="https://github.com/user-attachments/assets/cde12846-c74c-4c6e-b43d-064f2a587017" />




