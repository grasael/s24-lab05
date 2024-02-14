package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    private SortedIntList sortedIntList;
    private int total;

    public DelegationSortedIntList() {
        sortedIntList = new SortedIntList();
        total = 0;
    }

    @Override
    public boolean add(int num) {
        total++;
        return sortedIntList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        total += list.size();
        return sortedIntList.addAll(list);
    }

    public int getTotalAdded() {
        return total;
    }

    @Override
    public boolean remove(int num) {
        return sortedIntList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }

    @Override
    public int get(int index) {
        return sortedIntList.get(index);
    }

    @Override
    public int size() {
        return sortedIntList.size();
    }
}