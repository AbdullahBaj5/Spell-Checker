/* 
    Abdullah Mohammed Bajaman
    abajaman0002@stu.kau.edu.sa
    CPCS204
    ZA1 
    Spell Checker 
    10 / July / 2020  
 */
package spellchecker;


public class englishWord {
    private String word;
    private englishWord left;
    private englishWord right; 

    public englishWord(String word) {
        this.word = word;
    }

    public englishWord() {
    }

    public englishWord(String word, englishWord left) {
        this.word = word;
        this.left = left;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public englishWord getLeft() {
        return left;
    }

    public void setLeft(englishWord left) {
        this.left = left;
    }

    public englishWord getRight() {
        return right;
    }

    public void setRight(englishWord right) {
        this.right = right;
    }

    public englishWord(String word, englishWord left, englishWord right) {
        this.word = word;
        this.left = left;
        this.right = right;
    }
}
