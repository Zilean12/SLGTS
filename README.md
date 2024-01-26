# Smart Lighting Green Technology Solution

This project involves using Internet of Things (IoT) technology to create an energy-efficient lighting system. The solution integrates smart devices and sensors to optimize lighting based on environmental conditions and user preferences. It aims to reduce energy consumption, promote sustainability, and enhance user experience.

## Control Panel

### User Preferences Form

Adjust the brightness and color temperature using the sliders in the control panel. Click the "Save Preferences" button to store your settings.

```html
<form id="userPreferencesForm">
    <label for="brightness">Set Brightness:</label>
    <input type="range" id="brightness" name="brightness" min="0" max="100" value="50">
    <span id="brightnessValue">50</span>

    <label for="colorTemperature">Set Color Temperature:</label>
    <input type="range" id="colorTemperature" name="colorTemperature" min="2000" max="7000" value="4000">
    <span id="colorTemperatureValue">4000K</span>

    <button type="button" onclick="saveUserPreferences()">Save Preferences</button>
</form>
