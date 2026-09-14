# Banque Misr Login Screen - Compose Basics 🌱

A simple UI clone of the Banque Misr (بنك مصر) Android application login screen. I built this mini-project to practice and solidify the **fundamentals of Jetpack Compose**, focusing on basic UI components, state management, and layout structuring as I transition from XML to modern declarative UI.

## 📱 Screenshots
|<img width="250"  alt="Screenshot_20260914_184323" src="https://github.com/user-attachments/assets/35389a88-5fbc-47f2-ad67-9c60bc37f574" />|<img width="250"  alt="Screenshot_20260914_184323" src="https://github.com/user-attachments/assets/35389a88-5fbc-47f2-ad67-9c60bc37f574" />
|
|:---:|:---:|![Uploading Screenshot_20260914_184342.png…]()

| English Layout (LTR) | Arabic Layout (RTL) |

## 🎯 What I Practiced (Compose Fundamentals)
Through building this single-screen app, I got hands-on experience with core Compose concepts:

* **Component Extraction:** Breaking down the screen into smaller, reusable composables (`Header`, `AuthForm`, `Footer`) to keep the code clean and maintainable.
* **Modifier Rules:** Understanding the critical difference between passing a parent `modifier` versus creating a new `Modifier` instance for child elements to avoid spacing conflicts.
* **Manual Spacing & Layouts:** Applying exact manual padding (`padding(top = X.dp)`) for precise UI replication and component placement.
* **Row Distribution:** Utilizing `Modifier.weight(1f)` to equally distribute the bottom menu icons across different screen sizes.

## 🛠️ Implemented Features
* **In-App Language Switcher:** Basic implementation of English (LTR) and Arabic (RTL) switching using the `AppCompatDelegate.setApplicationLocales` API.
* **Interactive Text Links:** Using `buildAnnotatedString` and `withLink` to create clickable, styled text (e.g., "Contact us").
* **State Hoisting & TextFields:** Managing `rememberTextFieldState` to toggle password visibility and dynamically enable/disable the Login button based on user input.

## 💻 Tech Stack
* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose (Material 3)
* **Architecture:** Component-based UI (Fundamentals)
* **Localization:** AndroidX AppCompat

---
*Note: This is strictly an educational project built to practice Jetpack Compose UI basics.*

