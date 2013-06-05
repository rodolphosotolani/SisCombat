package br.com.android.siscombat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuPrincipal extends Activity {

	private ImageButton buttonClientes;
	private ImageButton buttonAgenda;
	private ImageButton buttonJogos;
	private ImageButton buttonConfiguraçoes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);

		recuperarBotoesTela();
		setOnClickListenerButton();

	}

	private void recuperarBotoesTela() {

		buttonClientes = (ImageButton) findViewById(R.id.btnClienteMenuPrincipal);
		buttonAgenda = (ImageButton) findViewById(R.id.btnAgendaMenuPrincipal);
		buttonJogos = (ImageButton) findViewById(R.id.btnJogoMenuPrincipal);
		buttonConfiguraçoes = (ImageButton) findViewById(R.id.btnConfiguracoesMenuPrincipal);
	}

	private void setOnClickListenerButton() {

		buttonClientes.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intentClientes = new Intent(getApplicationContext(),
						ClienteConsultar.class);
				startActivity(intentClientes);
			}
		});

		buttonAgenda.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intentAgenda = new Intent(getApplicationContext(),
						AgendaConsultar.class);
				startActivity(intentAgenda);

			}
		});

		buttonJogos.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intentJogos = new Intent(getApplicationContext(),
						JogosConsultar.class);
				startActivity(intentJogos);

			}
		});

		buttonConfiguraçoes.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intentConfiguracoes = new Intent(
						getApplicationContext(), ConfiguracoesConsultar.class);
				startActivity(intentConfiguracoes);

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}

}
