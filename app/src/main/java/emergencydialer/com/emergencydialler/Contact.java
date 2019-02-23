package emergencydialer.com.emergencydialler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends Activity {
    Button btnSend;
    EditText body,name;
    String sbody,sname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btnSend=(Button)findViewById(R.id.send);
        body=(EditText)findViewById(R.id.edtBody);
        name=(EditText)findViewById(R.id.edtName);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //WHATSAPP SEND
                sname=name.getText().toString();
                sbody=body.getText().toString();
                sbody=sname+ " : " +sbody;
                String no="917485994073";

                Intent i=new Intent("android.intent.action.MAIN");
                i.putExtra(i.EXTRA_TEXT,sbody);
                i.putExtra("jid",no+"@s.whatsapp.net");
                i.setAction(i.ACTION_SEND);
                i.setPackage("com.whatsapp");
                i.setType("text/plain");
                startActivity(i);

            }
        });

    }

}
