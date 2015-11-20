package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args)
	{
			
		LabyrinthBuilder LabyBui = new LabyrinthBuilder();
		LabyBui.setWidth(4);
		LabyBui.setHeight(4);
		
		LabyBui.addForbiddenCell(new Position(2,0));
		LabyBui.addForbiddenCell(new Position(3,0));
		LabyBui.addForbiddenCell(new Position(0,1));
		LabyBui.addForbiddenCell(new Position(0,2));
		LabyBui.addForbiddenCell(new Position(1,2));
		LabyBui.addForbiddenCell(new Position(3,2));
		LabyBui.addForbiddenCell(new Position(3,3));
		
		LabyBui.setExitPosition(new Position(3,1));
		RobotArtificialIntelligence RAI = RobotArtificialIntelligence.makeRAI("Dumb");
	}
}
