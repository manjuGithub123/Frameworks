package com.springwiringproject.spring5;

public class Kodcls {
Trainer tr=new Trainer();

public Kodcls() {
	super();
	// TODO Auto-generated constructor stub
}

public Kodcls(Trainer tr) {
	super();
	this.tr = tr;
}

public Trainer getTr() {
	return tr;
}

public void setTr(Trainer tr) {
	this.tr = tr;
}

@Override
public String toString() {
	return "Kodcls [tr=" + tr + "]";
}

}
