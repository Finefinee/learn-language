void main() {
  final String greeting = greet(name: "mario");
  print(greeting);
}

greet({required String name, int? age}) {
  if (age != null) {
    return "hello my name is ${name} and I am ${age} years old";
  } else {
    return "hello my name is ${name}";
  }
}