package emergencydialer.com.emergencydialler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnpolice,btnambulance,btnfire,btnwomen,btncyber,btnterr,btnblood,btnaids;
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    TextView con;

    public void police(View view)
    {
        callIntent.setData(Uri.parse("tel:100"));
        startActivity(callIntent);

    }

    public void ambulance(View view)
    {
        callIntent.setData(Uri.parse("tel:102"));
        startActivity(callIntent);
    }

    public void fire(View view)
    {
        callIntent.setData(Uri.parse("tel:101"));
        startActivity(callIntent);
    }

    public void women(View view)
    {
        callIntent.setData(Uri.parse("tel:1091"));
        startActivity(callIntent);
    }

    public void  cyber(View view)
    {
        callIntent.setData(Uri.parse("tel:2382600"));
        startActivity(callIntent);
    }

    public void terr(View view)
    {
        callIntent.setData(Uri.parse("tel:09656000100"));
        startActivity(callIntent);
    }

    public void blood(View view)
    {
        callIntent.setData(Uri.parse("tel:1910"));
        startActivity(callIntent);
    }

    public void aids(View view)
    {
        callIntent.setData(Uri.parse("tel:1097"));
        startActivity(callIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con=(TextView)findViewById(R.id.contact);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Contact.class);

                startActivity(i);
            }
        });

    }
}
