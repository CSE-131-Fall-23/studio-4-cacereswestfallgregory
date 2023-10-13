package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StdDraw.setPenColor(50, 100, 130);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.3);
		
		Color purple = new Color(100,0,100);
		StdDraw.setPenColor(purple);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		StdDraw.filledCircle(0.25, 0.5, 0.15);
		StdDraw.filledCircle(0.75, 0.5, 0.15);

		Color lightpurple = new Color(100,5,85);
		StdDraw.setPenColor(lightpurple);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.filledCircle(0.25, 0.5, 0.1);
		StdDraw.filledCircle(0.75, 0.5, 0.1);
		
		Color lighterpurple = new Color(100,0,75);
		StdDraw.setPenColor(lighterpurple);
		StdDraw.filledCircle(0.5, 0.5, 0.05);
		StdDraw.filledCircle(0.25, 0.5, 0.05);
		StdDraw.filledCircle(0.75, 0.5, 0.05);


	}
}