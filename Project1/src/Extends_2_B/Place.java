package Extends_2_B;

import java.util.ArrayList;
import java.util.List;
public class Place {

	private double lat;
	private double lon;
	private double alt;
	private double pi;
	private double wLat;
	private double wLon;
	private double wAlt;
//	ArrayList<List<String>> Place_table=new ArrayList<List<String>>();;
	
	public Place(List<String> row){
		this.lat=Double.parseDouble(row.get(0));
		this.lon=Double.parseDouble(row.get(1));
		this.alt=Double.parseDouble(row.get(2));
		this.pi=Double.parseDouble(row.get(18));
		this.wLat=this.pi*this.lat;
		this.wLon=this.pi*this.lon;
		this.wAlt=this.pi*this.alt;
		
//		Place_table.add(""+this.lat);
		
//		return this.Place_table
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public double getAlt() {
		return alt;
	}

	public double getPi() {
		return pi;
	}

	public double getwLat() {
		return wLat;
	}

	public double getwLon() {
		return wLon;
	}

	public double getwAlt() {
		return wAlt;
	}
	
}
