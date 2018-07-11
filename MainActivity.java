package apparatus.com;

import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
 

public class MainActivity extends Activity implements View.OnClickListener 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//creating button link
		setContentView(R.layout.main);
		Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
		
		//adding button listener
		buttonPlay.setOnClickListener(this);
    }
	
	@Override
	public void onClick(View view) {
		Intent i;
		i = new Intent(this, GameActivity.class);
		startActivity(i);
		}
}