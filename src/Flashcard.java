public class Flashcard {
    // 9 private data fields
    private String front;
    private String back;
    private String deckName;
    private String hint;
    private int difficulty;
    private int timesReviewed;
    private int timesCorrect;
    private boolean starred;
    private boolean showingFront;

    // ==== Constructors ====
    public Flashcard(String front, String back, String deckName) {
        this.front = front;
        this.back = back;
        this.deckName = deckName;
        this.hint = "";
        this.difficulty = 1;
        this.timesReviewed = 0;
        this.timesCorrect = 0;
        this.starred = false;
        this.showingFront = true;
    }

    public Flashcard(){
        this("Blank front", "Blank back", "General");
    }
    // ===== Getters and setters =====
    public String getFront() {return front; }
    public void setFront(String front) { this.front = front;}

    public String getBack() { return back; }
    public void setBack(String back) {this.back = back; }

    public String getDeckName() { return deckName; }
    public void setDeckName(String deckName) { this.deckName = deckName; }

    public String getHint() { return hint; }
    public void setHint(String hint) { this.hint = hint; }

    public int getDifficulty() { return difficulty; }
    public void setDifficulty(int difficulty) {
        if (difficulty >= 1 && difficulty <= 5) {
            this.difficulty = difficulty;
        }
    }

    public int getTimesReviewed() { return timesReviewed; }
    public void setTimesReviewed(int timesReviewed) {
        if (timesReviewed >= 0) {
            this.timesCorrect = timesCorrect;
        }
    }

    public boolean isStarred() { return starred; }
    public void setStarred(boolean starred) { this.starred = starred; }

    public boolean isShowingFront() { return showingFront; }
    public void setShowingFront(boolean showingFront) {this.showingFront = showingFront; }

    // ===== Behavior methods =====
    public void flip() {
        showingFront = !showingFront;
    }

    public String getCurrentSide() {
        return showingFront ? front : back;
    }

    public boolean checkAnswer(String answer) {
        timesReviewed++;
        if (answer.equalsIgnoreCase(back)) {
            timesCorrect++;
            return true;
        }
        return false;
    }

    public double getAccuracy() {
        if (timesReviewed == 0) {
            return 0.0;
        }
        return (double) timesCorrect / timesReviewed * 100;
    }

    public void toggleStar() {
        starred = !starred;
    }
    public boolean isMastered() {
        return timesReviewed >= 5 && getAccuracy() >= 80;
    }


@Override
    public String toString() {
        return "[" + deckName + "] " + front + " -> " + back + " | hint: " + hint + difficulty
                + " | reviewed: " + timesReviewed
                + " | correct: " + timesCorrect
                + " | starred: " + starred;
}

@Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if(!(other instanceof Flashcard)) {
            return false;
        }
        Flashcard card = (Flashcard) other;
        return front.equals(card.front) && back.equals(card.back);
}
}




























