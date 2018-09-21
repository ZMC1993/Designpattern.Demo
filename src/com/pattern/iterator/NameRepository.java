package com.pattern.iterator;

public class NameRepository implements Container {
	private String[] names= {"name1","name2","name3","name4","name5"};
	
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameItretor();
	}

	private class NameItretor implements Iterator{
		private int index;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<names.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return names[index++];
		}
		
	}
}
