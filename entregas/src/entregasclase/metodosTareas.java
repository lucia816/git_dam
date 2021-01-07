package entregasclase;

import java.util.*;
import java.io.*;

public class metodosTareas {
	private String tareas;
	private String titulo;
	private boolean estado;
	private String tarea;

	public void metodosTareas (String titulo, boolean estado, Date fecha) {
		this.titulo = titulo;
		this.estado = estado;
	}

	public void setestado(boolean estado) {
		this.estado = estado;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String gettitulo(String titulo) {
		return this.titulo;
	}

	public boolean getestado(boolean estado) {
		return false;
	}

}
