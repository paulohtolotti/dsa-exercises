import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Rank implements Comparable<Rank> { 

    // Classe que faz a comparação baseada no idioma e não no Unicode
    private static final Collator COLLATOR = Collator.getInstance(new Locale("pt", "BR"));

    public String word;
    public Integer frequency;
 
    public Rank(String word) {
        this.word = word;
        frequency = 1;
    }

    public void updateFrequency() {
        frequency++;
    }

    public String getWord() {
        return word;
    }

    public Integer getFrequency() {
        return frequency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((word == null) ? 0 : word.hashCode());
        result = prime * result + frequency;
        return result;
    }

    @Override
    public String toString() {
        return "[" + word + ", " + frequency + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rank other = (Rank) obj;
        if (word == null) {
            if (other.word != null)
                return false;
        } else if (!word.equals(other.word))
            return false;
        if (frequency != other.frequency)
            return false;
        return true;
    }

    @Override
    public int compareTo(Rank other) {
        return Comparator
        .comparingInt(Rank::getFrequency)
        .reversed()
        .thenComparing(Rank::getWord, COLLATOR::compare)
        .compare(this, other);
    }

}
