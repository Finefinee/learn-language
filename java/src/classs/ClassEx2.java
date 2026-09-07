package amiddle.classs;

public class ClassEx2 {

    public static void main(String[] args) {
        MovieReview2[] movieReviews = new MovieReview2[2];

        movieReviews[0] = new MovieReview2();
        movieReviews[0].title = "인셉션";
        movieReviews[0].review = "인생은 무한 루프";

        movieReviews[1] = new MovieReview2();
        movieReviews[1].title = "어바웃 타임";
        movieReviews[1].review = "인생 시간 영화!";

        for (MovieReview2 movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }

    static class MovieReview2 {
        String title;
        String review;
    }
}

