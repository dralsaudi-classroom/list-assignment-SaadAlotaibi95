package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        if (list.empty())
    		return;
    	T temp;
    	while(n > 0) {
    	list.findFirst();
    	if(list.last())
    		return;
    	temp = list.retrieve();
    	list.remove();
    	while(!list.last())
    		list.findNext();
    	list.insert(temp);
    	n--;
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.
    }
}
