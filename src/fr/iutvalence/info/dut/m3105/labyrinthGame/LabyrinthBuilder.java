package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.io.BufferedReader;
import java.util.Set;

public class LabyrinthBuilder
{
	private int height;
	private int width ;
	private Position exitPosition;
	private Set<Position> ForbiddenCells;
	
	public LabyrinthBuilder()
	{
		this.height = 0;
		this.width = 0;
		this.exitPosition = null;
		this.ForbiddenCells = null;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public void setExitPosition(Position exitPosition) 
	{
		this.exitPosition = exitPosition;
	}

	public void addForbiddenCell(Position forbiddenCell) 
	{
		ForbiddenCells.add(forbiddenCell);
	}
	
	public Labyrinth getLabyrinth()
	{
		if(this.height!=0 && this.width!=0 && this.exitPosition!=null && this.ForbiddenCells!=null)
			return new Labyrinth(this.height,this.width,this.ForbiddenCells,this.exitPosition);
	}
}
