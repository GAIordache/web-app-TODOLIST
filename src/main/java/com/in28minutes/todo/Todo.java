package com.in28minutes.todo;

public class Todo {
	private String name;

	
	public Todo(String pName) {
		super();
		name = pName;
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		name = pName;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
