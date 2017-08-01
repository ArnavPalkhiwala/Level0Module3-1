package variables_and_conditionals;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		String howDizzy = JOptionPane.showInputDialog("How dizzy do you want the tortoise from 1-10?");
		 if (howDizzy == "1") {
		dance(1);
		}
		 else if (howDizzy == "2") {
				dance(2);
				}
		 else if (howDizzy == "3") {
				dance(3);
				}
		 else if (howDizzy == "4") {
				dance(4);
		} else if (howDizzy == "5") {
					dance(5);
		} else if (howDizzy == "6") {
						dance(6);
		} else if (howDizzy == "7") {
						dance(7);
		} else if (howDizzy == "8") {
						dance(8);
		} else if (howDizzy == "9") {
						dance(9);
		} else if (howDizzy == "10") {
						dance(10);
					}
		// 1. Use the dance method to make the Tortoise spin.
		//	Tortoise.turn(360);
	dance(10);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
