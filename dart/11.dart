import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

void main() async {
  final message = await fetchMessage();
  print(message.message);
}

Future<Message> fetchMessage() async {

  var uri = Uri.http('localhost:8000', '/');

  final http.Response response = await http.get(uri);

  Map<String, dynamic> data = convert.jsonDecode(response.body);

  return Message(data["message"]);

  // NaN === NaN
  // false
  // JavaScript
  // is
  // trash
  // Delete from your code

}

class Message {
  String message;

  Message(this.message);
}
