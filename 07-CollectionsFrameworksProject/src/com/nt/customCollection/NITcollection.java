package com.nt.customCollection;

import java.util.Arrays;

public class NITcollection {
	private Object[] elementData;
	private int elementCount;

	public NITcollection() {
		elementData = new Object[10];
		elementCount = 0;
	}

	public void add(Object obj) {
		if (size() == capasity()) {
			increaseSize();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}

	public int size() {
		return elementCount;
	}

	public int capasity() {
		return elementData.length;
	}

	public Object get(int index) {
		if (index < 0 || index > size() - 1)
			throw new IndexOutOfBoundsException(index);
		return elementData[index];
	}

	public void increaseSize() {
		// create new aray with double size
		Object[] nextArray = new Object[capasity() * 2];
		// copy value old to new array
		for (int i = 0; i < elementData.length; i++) {
			nextArray[i] = elementData[i];
		}
		// copy array memory ref
		elementData = nextArray;
	}

	public boolean contains(Object obj) {
		if (obj == null) {
			for(int i=0;i<elementData.length;i++) {
				if(obj==elementData[i])
					return true;
			}
		} else {
			for (Object objd : elementData) {
				if (obj.equals(objd))
					return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sb.append(elementData[i]);
			sb.append(", ");
		}
		int start = sb.lastIndexOf(", ");
		int end = start + 2;
		sb.delete(start, end);
		return sb.toString();
	}
}
