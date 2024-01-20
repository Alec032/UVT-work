# ClosestPairPy Documentation
Made by:Vraja Mihai Alexandru Ovidiu

## Introduction
ClosestPairPy is a Python program designed to find the pair of closest points among a given set of 2D points. The algorithm employs a divide-and-conquer approach to efficiently compute the closest points. Additionally, the program includes a visualization feature using Matplotlib to display the input points and the identified closest pair.

## Usage
To use the ClosestPairPy, follow these steps:
1. Run the script in a Python environment.
2. Enter the number of points when prompted.
3. Input the x and y coordinates for each point.
4. The program will output the closest points and their distance.
5. A graphical representation of the points and the closest pair will be displayed.

## Functions

### calculate_distance(point1, point2)
Calculates the Euclidean distance between two points in a 2D plane.

### find_closest_points(points)
Finds the closest pair of points from a given set of 2D points using a divide-and-conquer algorithm.

### closest_pair_recursive(points)
Recursive function used within `find_closest_points` to find the closest pair efficiently.

### closest_pair_in_strip(strip, d)
Helper function to find the closest pair within a specified strip of points.

### plot_points(points, closest_points)
Generates a scatter plot using Matplotlib to visualize the input points and the identified closest pair.

## Main Code
The main code initializes the program, collects user input for points, and executes the core functionalities.

Dependencies
Matplotlib: A 2D plotting library for generating visualizations.