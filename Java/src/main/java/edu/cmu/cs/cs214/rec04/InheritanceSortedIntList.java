package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    private int totalAdded;

    public InheritanceSortedIntList() {
        totalAdded = 0;
    }

    @Override
    public boolean add(int val) {
        totalAdded++;
        return super.add(val);
    }

    @Override
    public boolean addAll(IntegerList l) {
        //totalAdded += l.size();
        return super.addAll(l);
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}