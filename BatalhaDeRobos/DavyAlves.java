package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class DavyAlves extends AdvancedRobot {

	int i = 0;
	
	public void run() {
		setColors(Color.MAGENTA, Color.GREEN, Color.ORANGE, Color.ORANGE, Color.ORANGE);
	
		
		while (true) {
			i++;
			if(i % 2 == 0) {
				ahead(200);
				turnRight(45);
				turnGunRight(180);
				turnGunLeft(180);
			}else {
				back(30);
				turnLeft(75);
				turnGunRight(360);
			}
			
		}
		
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);

	}
	public void onHitWall(HitWallEvent event) {
		back(100);
		turnRight(163);
	}

	public void onHitByBullet(HitByBulletEvent event) {
		ahead(1000);
		
	}
	public void onHitRobot(HitRobotEvent event) {
		turnLeft(180);
		fire(5);
		back(40);
	}


}
