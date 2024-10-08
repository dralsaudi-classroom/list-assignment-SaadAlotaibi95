package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
    	if (list.empty())
    		return;
    	T temp;
    	list.findFirst();
    	if(list.last())
    		return;
    	while(n > 0) {
    	temp = list.retrieve();
    	list.remove();
    	while(!list.last())
    		list.findNext();
    	list.insert(temp);
    	list.findFirst();
    	n--;
    	}
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
    	if(l1.empty())
    		return;
    	while(!l1.last())
    		l1.findNext();
    	while(!l1.first()) {
    		l2.insert(l1.retrieve());
            l1.findPrevious();    	
    	}
    	l2.insert(l1.retrieve());
    }
}
