package pl.maikeru.cgol;
/**
 *
 * @author maikeru
 */
public interface Playable {
    public Boolean[][] toArray();
    public void nextState();
    public void resetState();
}
