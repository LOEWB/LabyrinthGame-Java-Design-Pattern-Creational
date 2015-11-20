package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.io.BufferedReader;
import java.io.Reader;

public class LabyrinthReader extends BufferedReader
{
	private LabyrinthBuilder builder;
	public LabyrinthReader(Reader arg0, int arg1)
	{
		super(arg0, arg1);
		builder = null;
	}

	public Labyrinth readLabyrinth(Reader reader)
	{
		
	}
}
