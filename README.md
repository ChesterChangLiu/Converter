# Converter

This software project is a Converter. 
The goal is to display a user interface and convert the user’s input centimetres value in feet and meters.

Featuring Software Design Pattern: 
* Model View Controller (MVC)
* Observer design pattern 
* Command design pattern

## Control/Rules

The application displays an interface with a JMenuBar and a JPanel. 
The JPanel contains three views: 
* yellow view where the user can input a value in centimetres
* green view where the input value is displayed in feet
* orange view where the input value is displayed in metres

### Update model & Save input centimetres
The JMenuBar comprises a JMenu named "Update model", a JMenuItem called "Save input centimetres" is included in the JMenu

1. In the yellow view, the user can input a value that they want to convert in centimetres
2. Next clicks "Update model" then selects "Save input centimetres" to request the value be saved.
3. Input value converted in feet is displayed in the green view, while the input value converted in meters is displayed in the orange view
