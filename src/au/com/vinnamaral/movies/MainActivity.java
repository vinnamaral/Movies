package au.com.vinnamaral.movies;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button btnCadastrar;
	private Button btnListar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
		btnListar = (Button) findViewById(R.id.btnListar);
		
		btnCadastrar.setOnClickListener(this);
		btnListar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		try {
			if (view == btnCadastrar) {
				//startActivity(new Intent(getBaseContext(), NovaVendaActivity.class));
			} else if (view == btnListar) {
				//startActivity(new Intent(getBaseContext(), NovaVendaActivity.class));
			} 
		} catch (Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}

}
