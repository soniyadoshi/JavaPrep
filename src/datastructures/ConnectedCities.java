package datastructures;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConnectedCities {
	
	List<FlightInfo> cities = new LinkedList<>();
	List<String> connectedCities = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectedCities ct = new ConnectedCities();
		
		if (args != null && args.length != 3) {
			System.out.println(" This program needs 3 arguments ");
			return;
		}
		String s = args[0];
		String d = args[1];
		String path = args[2];
		
		if (s.equalsIgnoreCase(d)) {
			System.out.println("CONNECTED");
			return;
		}
		ct.buildStructure(s, d, path);
		
	}
	
	protected void buildStructure(String s, String d, String path) {

		try {
			ClassLoader loader = getClass().getClassLoader();
			File file = new File(loader.getResource(path).getFile());
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String temp[] = line.split(",");
				String f = temp[0].trim();
				String t = temp[1].trim();
				cities.add(new FlightInfo(f, t));
			}
			findConnections(s, d);
//			System.out.println(" Connected cities :: " + connectedCities.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please use file name as connections.txt");
			e.printStackTrace();
		}
	}

	private void findConnections(String from, String to) {
		FlightInfo f = matched(from, to);
		if (f != null) {
			System.out.println("CONNECTED");
			connectedCities.add(f.getFrom());
			connectedCities.add(f.getTo());
			return;
		} 
		f = findFrom(from);
		if (f != null && !f.isMarked()) {
			f.setMarked(true);
			connectedCities.add(f.getFrom());
			findConnections(f.getTo(), to);
		} else {
			System.out.println("NOT CONNECTED");
		}
	}
	
	private FlightInfo matched(String s, String d) {
		for (FlightInfo info : cities) {
			if (s.equalsIgnoreCase(info.getFrom()) && d.equalsIgnoreCase(info.getTo()) && !info.isMarked()) {
				info.setMarked(true);
				return info;
			}
		}
		return null;
	}

	private FlightInfo findFrom(String from) {
		for (FlightInfo info : cities) {
			if (info.getFrom().equalsIgnoreCase(from)) {
				return info;
			}
		}
		return null;
	}
	
	class FlightInfo {

		private String from;
		private String to;
		private boolean marked;

		public FlightInfo(String from, String to) {
			this.from = from;
			this.to = to;
			this.marked = false;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public boolean isMarked() {
			return marked;
		}

		public void setMarked(boolean marked) {
			this.marked = marked;
		}

		@Override
		public String toString() {
			return "fileInfo{" + "to='" + to + '\'' + ", from='" + from + '\'' + ", marked=" + marked + '}';
		}

	}

}
