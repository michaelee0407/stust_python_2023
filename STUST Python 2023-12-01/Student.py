class Student:
    # Constructor
    def __init__(self, name, age, student_id, gpa):
        self.name = name
        self.age = age
        self.student_id = student_id
        self.gpa = gpa

    # Getter methods
    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def get_student_id(self):
        return self.student_id

    def get_gpa(self):
        return self.gpa

    # Setter methods
    def set_name(self, name):
        self.name = name

    def set_age(self, age):
        self.age = age

    def set_student_id(self, student_id):
        self.student_id = student_id

    def set_gpa(self, gpa):
        self.gpa = gpa

    # Display method
    def display_student_info(self):
        print("Name:", self.name)
        print("Age:", self.age)
        print("Student ID:", self.student_id)
        print("GPA:", self.gpa)

# Example of usage
if __name__ == "__main__":
    # Creating a new student object
    student1 = Student("John Doe", 20, "S12345", 3.5)

    # Displaying student information
    print("Student Information:")
    student1.display_student_info()

    # Modifying student information
    student1.set_age(21)
    student1.set_gpa(3.8)

    # Displaying updated information
    print("\nUpdated Student Information:")
    student1.display_student_info()
