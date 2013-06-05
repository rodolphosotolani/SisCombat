package br.com.android.siscombat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ClienteConsultar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cliente_consultar);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cliente_consultar, menu);
		return true;
	}

}
