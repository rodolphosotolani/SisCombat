package br.com.android.siscombat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AgendaConsultar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agenda_consultar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.agenda_consultar, menu);
		return true;
	}

}
