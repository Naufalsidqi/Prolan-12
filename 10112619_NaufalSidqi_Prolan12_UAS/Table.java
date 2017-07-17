package TempatFutsal;

/**
 *
 * @author Iscariot
 */
abstract class Table {

	int rate;
	boolean wifi;
	boolean status;
    
    abstract public void statuschange();
}