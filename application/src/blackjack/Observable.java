package blackjack;
/**
 * Observable interface        
 */
public interface Observable<T> {
    void addObserver(Observer<T> o);

    void removeObserver(Observer<T> o);
}
