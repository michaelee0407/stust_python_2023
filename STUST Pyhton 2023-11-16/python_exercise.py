class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def __str__(self):
    return f"Name: {self.name}\nAge = {self.age}"    

p1 = Person("John", 36)

print(p1)
