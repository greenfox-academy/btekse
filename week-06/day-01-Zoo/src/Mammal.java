class Mammal extends Animal {

  Mammal(String name) {
    super(name);
  }

  String wantChild() {
    return "wants a child from somebody!";
  }
}