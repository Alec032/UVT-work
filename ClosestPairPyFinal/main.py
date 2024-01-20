import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
import math


#Function to get the distance between 2 points.
def calculate_distance(point1, point2):
    return math.sqrt((point1[0] - point2[0]) ** 2 + (point1[1] - point2[1]) ** 2)


#Function to find the closest 2 points, breaks the problem down divide and conquer style to be more efficient
def find_closest_points(points):
    sorted_points = sorted(points, key=lambda x: x[0])

    #Recursive function that brute forces it if there are 3 or less points.
    def closest_pair_recursive(points):
        if len(points) <= 3:
            return min(((points[i], points[j]) for i in range(len(points))
                        for j in range(i + 1, len(points))),
                       key=lambda pair: calculate_distance(*pair))

        mid = len(points) // 2
        mid_point = points[mid]

        left_points = points[:mid]
        right_points = points[mid:]

        left_closest = closest_pair_recursive(left_points)
        right_closest = closest_pair_recursive(right_points)

        min_distance = min(calculate_distance(*left_closest), calculate_distance(*right_closest))
        strip_points = [point for point in points if abs(point[0] - mid_point[0]) < min_distance]

        strip_closest = closest_pair_in_strip(strip_points, min_distance)

        return min(left_closest, right_closest, strip_closest, key=lambda pair: calculate_distance(*pair))



    def closest_pair_in_strip(strip, d):
        strip = sorted(strip, key=lambda x: x[1])

        min_distance = d
        closest_pair = None

        for i in range(len(strip)):
            for j in range(i + 1, len(strip)):
                if strip[j][1] - strip[i][1] < min_distance:
                    distance = calculate_distance(strip[i], strip[j])
                    if distance < min_distance:
                        min_distance = distance
                        closest_pair = (strip[i], strip[j])

        # Return a large distance if no closest pair is found in the strip
        return closest_pair if closest_pair is not None else ((0, 0), (float('inf'), float('inf')))

    return closest_pair_recursive(sorted_points)


#Function to graph out the points and pair
def plot_points(points, closest_points):
    x, y = zip(*points)
    plt.scatter(x, y, color='blue', label='All Points')

    if closest_points:
        x_closest, y_closest = zip(*closest_points)
        plt.scatter(x_closest, y_closest, color='green', label='Closest Points')
        plt.plot(x_closest, y_closest, color='red', linestyle='dashed', linewidth=2, label='Closest Distance')

    plt.legend()
    plt.xlabel('X-axis')
    plt.ylabel('Y-axis')
    plt.title('Closest Points and Distance')
    plt.show()


#Main code begins here
if __name__ == "__main__":
    num_points = 0
    while num_points < 2:
        num_points = int(input("Enter the number of points: "))
        if num_points < 2:
            print(f"Enter at least 2 points.")

    points = []
    for i in range(num_points):
        x = float(input(f"Enter x-coordinate for point {i + 1}: "))
        y = float(input(f"Enter y-coordinate for point {i + 1}: "))
        points.append((x, y))

    closest_points = find_closest_points(points)

    print(f"The closest points are {closest_points} with a distance of {calculate_distance(*closest_points):.2f}")
    plot_points(points, closest_points)
