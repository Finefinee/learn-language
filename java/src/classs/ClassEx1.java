package amiddle.classs;

public class ClassEx1 {

    public static void main(String[] args) {
        MovieReview1 movieReview1 = new MovieReview1();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview1 movieReview2 = new MovieReview1();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview1[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview1 movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }

    public static class MovieReview1 {
        String title;
        String review;
    }
}
