/**
 * a sub class from shape
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */
public interface Selectable{
 public boolean getSelected();
 public void setSelected( boolean s);
 public Shape contains( int x, int y);
}