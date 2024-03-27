package com.springwiringproject.spring5;

public class Trainer {
int trainerid;
String trainername;
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
public Trainer(int trainerid, String trainername) {
	super();
	this.trainerid = trainerid;
	this.trainername = trainername;
}
public int getTrainerid() {
	return trainerid;
}
public void setTrainerid(int trainerid) {
	this.trainerid = trainerid;
}
public String getTrainername() {
	return trainername;
}
public void setTrainername(String trainername) {
	this.trainername = trainername;
}
@Override
public String toString() {
	return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + "]";
}



}
