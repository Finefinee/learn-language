void main() {
  List<int> scores = [50, 60, 70, 80, 90, 100];

  for (int i = 0; i < 5; i++) {
    print("current i = $i");
  }

  for (int score in scores) {
    print("score is $score");
  }

  for (int score in scores.where((s) => s > 50)) {
    print(score);
  }
}