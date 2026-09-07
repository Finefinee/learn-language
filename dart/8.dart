void main() {
  var noodles = MenuItem('noodles', 9.99);

  print(noodles.price);
  print(noodles.format());

  var wonderfulPizza = Pizza(["cheeze", "ketchyup"], "good pizza", 100);

  print(wonderfulPizza.format());

  var foods = Collection<MenuItem>("Menu Items", [noodles, wonderfulPizza]);
  var randomFood = foods.randomItem();
}

class MenuItem {
  String title;
  double price;

  MenuItem(this.title, this.price);

  String format() {
    return "$title ---> $price";
  }
}

class Pizza extends MenuItem {
  List<String> toppings;

  Pizza(this.toppings, super.title, super.price);

  @override
  String format() {
    var formattedToppings = "contains :";
    for (final t in toppings) {
      formattedToppings = "$formattedToppings $t";
    }

    return "$title -> $price \n $formattedToppings";
  }
}

class Collection<T> {
  String name;
  List<T> data;

  Collection(this.name, this.data);

  randomItem() {
    data.shuffle();

    return data[0];
  }
}