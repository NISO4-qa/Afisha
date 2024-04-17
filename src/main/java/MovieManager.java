public class MovieManager {
    private String[] movies = new String[0];
    private int amount;

    public MovieManager() {
        this.amount = 5;
    }

    public MovieManager(int amount) {
        this.amount = amount;
    }

    public void addFilm(String movie) {
        String[] tmp = new String[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        String[] reversed = new String[movies.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < amount) {
            resultLength = movies.length;
        } else {
            resultLength = amount;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
