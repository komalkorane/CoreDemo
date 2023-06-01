package com.object.equals;

public class EqualDemo {

	String name;
	int no;

	public EqualDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EqualDemo(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "EqualDemo [name=" + name + ", no=" + no + "]";
	}

	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj instanceof EqualDemo) {
			EqualDemo e = (EqualDemo)obj;
			if (name.equals(e.name) && e.no == no)
				return true;
			else
				return false;
		} else
			return false;
	}
}
