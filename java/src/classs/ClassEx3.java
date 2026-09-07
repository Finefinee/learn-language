package amiddle.classs;

public class ClassEx3 {

    public static void main(String[] args) {

        MovieReview3[] movieReviews = new MovieReview3[2];

        MovieReview3 movieReview1 = new MovieReview3("인셉션", "인생은 무한 루프");
        MovieReview3 movieReview2 = new MovieReview3("어바웃 타임", "인생은 무한 루프");
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for (MovieReview3 movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.getTitle() + ", 리뷰: " + movieReview.getReview());
        }

    }


    public static class MovieReview3 {
        public MovieReview3(String title, String review) {
            this.title = title;
            this.review = review;
        }

        private String title;
        private String review;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getReview() {
            return review;
        }

        public void setReview(String review) {
            this.review = review;
        }

        public void showMovieReview() {
            System.out.printf("제목: %s, 리뷰: %s", this.title, this.review);
        }
    }
}