package com.example.krishnarao.thambola_game;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.krishnarao.thambola_game.R.anim.slide_out_left;

public class ThambolaOptions extends AppCompatActivity {
    static int KgkTkts[][][];
    static int LottoTkts [][][];
    Button enter, goWelcome;
    TextView frTxt, toTxt, viewtxt;

    RadioGroup rg;
    RadioButton rd1,rd2, rd3;
    CheckBox chkEf, chkPr, chkCor, chkStr, chkFl, chkSl, chk, chkTl, chkFh, ch2Fh;
    public int frm, t,max;
    public boolean jld, cr, str, fl, sl, tl, fh, fh2, otherTks, kgkTkts, ltoTkts;
    public Bundle b = new Bundle();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thambola_options);

         frTxt = (EditText) findViewById(R.id.txtFrom);
         toTxt = (EditText) findViewById(R.id.txtTo);
         enter = (Button) findViewById(R.id.enter);

        chkEf = (CheckBox) findViewById(R.id.chkEf);
         chkCor = (CheckBox) findViewById(R.id.chkCf);
         chkStr = (CheckBox) findViewById(R.id.chkSf);

         chkFl = (CheckBox) findViewById(R.id.chkL1);
         chkSl = (CheckBox) findViewById(R.id.chkL2);
         chkTl = (CheckBox) findViewById(R.id.chkL3);
         chkFh = (CheckBox) findViewById(R.id.chkFh);
        ch2Fh = (CheckBox) findViewById(R.id.chk2ndFh);
         rd1 = (RadioButton) findViewById(R.id.rdoKgk);
         rd2 = (RadioButton) findViewById(R.id.rdoOthers);
         rd3 = (RadioButton) findViewById(R.id.rdoLotto);
         goWelcome = (Button) findViewById(R.id.btnHome);


        Object[] KgkArray = (Object[]) getIntent().getExtras().getSerializable("Kgkarray");

        if (KgkArray != null) {
            KgkTkts = new int[KgkArray.length][][];
            for (int i = 0; i < KgkArray.length; i++) {
                KgkTkts[i] = (int[][]) KgkArray[i];
            }
        }
        final Object[]LottoArray = (Object[])getIntent().getExtras().getSerializable("LottoArray");
            if(LottoArray != null){
                LottoTkts = new int [LottoArray.length][][];
                for (int i = 0;i<LottoArray.length;i++) LottoTkts[i] = (int[][]) LottoArray[i];
            }
        /*if(KgkTkts !=null)
            Toast.makeText(this, Integer.toString(KgkTkts.length), Toast.LENGTH_SHORT).show();
        if(LottoTkts !=null)
            Toast.makeText(this, Integer.toString(LottoTkts.length), Toast.LENGTH_SHORT).show();*/


       // Toast.makeText(this,String.valueOf(LottoTkts.length),Toast.LENGTH_SHORT ).show();

         rd2 = (RadioButton) findViewById(R.id.rdoOthers);
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putBoolean("Kgk", otherTks);
                otherTks =true;

                enter.setEnabled(true);
                b.putBoolean("Kgk", otherTks);

            }
        });
        rd1 = (RadioButton) findViewById(R.id.rdoKgk);
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enter.setEnabled(true);
               kgkTkts= true;
                ltoTkts=false;
                otherTks =true;
                max=300;
            }
        });
        rd3 = (RadioButton)findViewById(R.id.rdoLotto);
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enter.setEnabled(true);

                   ltoTkts = true;
                   kgkTkts = false;
                   otherTks =true;
                   max = 600;


            }
        });

        goWelcome.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, slide_out_left);

            }
        });





        enter.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                if(rd1.isChecked()||rd3.isChecked()) {
                    if (playWithAppTkts()) return;
                    sendIntentWithAppTkts();
                }else{
                    sendIntentWithAppTkts();
                }

                //f = Integer.parseInt(frTxt.getText().toString());
                //t = Integer.parseInt(toTxt.getText().toString());
                // Toast.makeText(getApplication(), "ALL Entries Made,Click 'Go to Main'", Toast.LENGTH_LONG).show();
                // Intent in = new Intent();
                // in.putExtras(b);
                {

                }


            }

        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void sendIntentWithAppTkts() {
        Intent intent = new Intent(getApplicationContext(), PlayGameActivity.class);
        intent.putExtras(b);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private boolean playWithAppTkts() {
        if (!chkEf.isChecked() && !chkCor.isChecked() && !chkStr.isChecked() && !chkFl.isChecked() && !chkSl.isChecked() && !chkTl.isChecked() && !chkFh.isChecked() && !ch2Fh.isChecked()) {
            Toast.makeText(getApplicationContext(), "Please Select Events", Toast.LENGTH_LONG).show();
            return true;
        }


        String s, s1;

        s = frTxt.getText().toString();
        s1 = toTxt.getText().toString();
        if (s.equals("") || s1.equals("")) {
            Toast.makeText(getApplicationContext(), "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return true;
        }

        frm = Integer.parseInt(s);
        t = Integer.parseInt(s1);
        if (frm < 1 || t > max) {
            Toast.makeText(getApplicationContext(), "Enter Tkt Nos From 1 to 300", Toast.LENGTH_LONG).show();
            return true;
        }
        if (frm > t)
            Toast.makeText(getApplicationContext(), "From Should not be More than To", Toast.LENGTH_LONG).show();

        // sendArray();
        // CGlobals g = new CGlobals();
        jld = (chkEf.isChecked());
        //g.setPr(chkPr.isChecked());
        cr = (chkCor.isChecked());
        str = (chkStr.isChecked());
        fl = (chkFl.isChecked());
        sl = (chkSl.isChecked());
        tl = (chkTl.isChecked());
        fh = (chkFh.isChecked());
        fh2 = (ch2Fh.isChecked());

                /*
                rd = (rd1.isChecked());
                Bundle b = new Bundle();
                */
        b.putInt("frm", frm);
        b.putInt("to", t);
        b.putBoolean("jaldi", jld);
        b.putBoolean("corner", cr);
        b.putBoolean("star", str);
        b.putBoolean("fLine", fl);
        b.putBoolean("sLine", sl);
        b.putBoolean("tLine", tl);
        b.putBoolean("fHouse", fh);
        b.putBoolean("koka",kgkTkts);
        b.putBoolean("fHouse2", fh2);
    //    b.putBoolean("Kgk", rd);
        b.putBoolean("ltoTkts",ltoTkts);
        b.putInt("Max",max);
        if(kgkTkts) b.putSerializable("kgkTks", KgkTkts);
        if(ltoTkts) b.putSerializable("lottoTkts", LottoTkts);
        return false;
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("ThambolaOptions Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }



}
