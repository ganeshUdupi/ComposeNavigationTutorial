# Jetpack Compose Navigation Example

## Overview
This project demonstrates a simple implementation of navigation in an Android application using Jetpack Compose. The app consists of three screens: Registration, Login, and Main. Navigation between these screens is handled using the Jetpack Compose Navigation component.

## Structure

- **MainActivity**: The main entry point of the app. It sets up the app's content using Jetpack Compose.
- **App Composable**: The central composable function that sets up the navigation using a `NavHost` and `NavController`.
- **RegistrationScreen**: A composable screen that displays a "Registration" text. Navigates to the Main screen when clicked.
- **LoginScreen**: A composable screen that displays a "Login" text.
- **MainScreen**: A composable screen that displays a "Main" text. Navigates to the Login screen when clicked.

## Navigation Flow

1. The app starts at the Registration screen.
2. Clicking on the "Registration" text navigates to the Main screen.
3. Clicking on the "Main" text navigates to the Login screen.

## How to Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or physical device.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
