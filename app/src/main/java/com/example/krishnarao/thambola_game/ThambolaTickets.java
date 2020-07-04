package com.example.krishnarao.thambola_game;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.NumberFormat;


public class ThambolaTickets extends AppCompatActivity implements View.OnClickListener {
    static int KgkTickets[][][];
    static int LottoTickets [][][];
    TextView
            tx1, tx2, tx3, tx4, tx5,
            tx6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15, tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23, tx24, tx25, tx26,
            tx27, tx28, tx29, tx30, tx31, tx32, tx33, tx34, tx35, tx36, tx37, tx38, tx39, tx40, tx41, tx42, tx43, tx44, tx45, tx46,
            tx47, tx48, tx49, tx50, tx51, tx52, tx53, tx54, tx55, tx56, tx57, tx58, tx59, tx60, tx61, tx62, tx63, tx64, tx65, tx66,
            tx67, tx68, tx69, tx70, tx71, tx72, tx73, tx74, tx75, tx76, tx77, tx78, tx79, tx80, tx81, tx82, tx83, tx84, tx85, tx86,
            tx87, tx88, tx89, tx90, tx91, tx92, tx93, tx94, tx95, tx96, tx97, tx98, tx99, tx100, tx101, tx102, tx103, tx104,
            tx105, tx106, tx107, tx108, tx109, tx110, tx111, tx112, tx113, tx114, tx115, tx116, tx117, tx118, tx119, tx120,
            tx121, tx122, tx123, tx124, tx125, tx126, tx127, tx128, tx129, tx130, tx131, tx132, tx133, tx134, tx135, tx136,
            tx137, tx138, tx139, tx140, tx141, tx142, tx143, tx144, tx145, tx146, tx147, tx148, tx149, tx150, tx151, tx152,
            tx153, tx154, tx155, tx156, tx157, tx158, tx159, tx160, tx161, tx162;
    TextView txt0,txt1, txt2, txt3, txt4, txt5, txt6,txt7;
    TextView[][] tvs1, tvs2, tvs3, tvs4, tvs5, tvs6;
    Button b1, b2, b3, b4, b5, b6;
    EditText e1, e2, e3, e4, e5, e6;
    GridLayout g1, g2, g3, g4, g5, g6;
    boolean _KgkTickets,_lotoTickets;
    int max;


    static int test1[];
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_thambola_tickets);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        tx1 = (TextView) findViewById(R.id.txtNo1);
        tx2 = (TextView) findViewById(R.id.txtNo2);
        tx3 = (TextView) findViewById(R.id.txtNo3);
        tx4 = (TextView) findViewById(R.id.txtNo4);
        tx5 = (TextView) findViewById(R.id.txtNo5);
        tx6 = (TextView) findViewById(R.id.txtNo6);
         tx7 = (TextView) findViewById(R.id.txtNo7);
         tx8 = (TextView) findViewById(R.id.txtNo8);
         tx9 = (TextView) findViewById(R.id.txtNo9);
         tx10 = (TextView) findViewById(R.id.txtNo10);
         tx11 = (TextView) findViewById(R.id.txtNo11);
         tx12 = (TextView) findViewById(R.id.txtNo12);
         tx13 = (TextView) findViewById(R.id.txtNo13);
         tx14 = (TextView) findViewById(R.id.txtNo14);
         tx15 = (TextView) findViewById(R.id.txtNo15);
         tx16 = (TextView) findViewById(R.id.txtNo16);
         tx17 = (TextView) findViewById(R.id.txtNo17);
         tx18 = (TextView) findViewById(R.id.txtNo18);
         tx19 = (TextView) findViewById(R.id.txtNo19);
         tx20 = (TextView) findViewById(R.id.txtNo20);
         tx21 = (TextView) findViewById(R.id.txtNo21);
         tx22 = (TextView) findViewById(R.id.txtNo22);
         tx23 = (TextView) findViewById(R.id.txtNo23);
         tx24 = (TextView) findViewById(R.id.txtNo24);
         tx25 = (TextView) findViewById(R.id.txtNo25);
         tx26 = (TextView) findViewById(R.id.txtNo26);
         tx27 = (TextView) findViewById(R.id.txtNo27);
         tx28 = (TextView) findViewById(R.id.txtNo28);
         tx29 = (TextView) findViewById(R.id.txtNo29);
         tx30 = (TextView) findViewById(R.id.txtNo30);
         tx31 = (TextView) findViewById(R.id.txtNo31);
         tx32 = (TextView) findViewById(R.id.txtNo32);
         tx33 = (TextView) findViewById(R.id.txtNo33);
         tx34 = (TextView) findViewById(R.id.txtNo34);
         tx35 = (TextView) findViewById(R.id.txtNo35);
         tx36 = (TextView) findViewById(R.id.txtNo36);
         tx37 = (TextView) findViewById(R.id.txtNo37);
         tx38 = (TextView) findViewById(R.id.txtNo38);
         tx39 = (TextView) findViewById(R.id.txtNo39);
         tx40 = (TextView) findViewById(R.id.txtNo40);
         tx41 = (TextView) findViewById(R.id.txtNo41);
         tx42 = (TextView) findViewById(R.id.txtNo42);
         tx43 = (TextView) findViewById(R.id.txtNo43);
         tx44 = (TextView) findViewById(R.id.txtNo44);
         tx45 = (TextView) findViewById(R.id.txtNo45);
         tx46 = (TextView) findViewById(R.id.txtNo46);
         tx47 = (TextView) findViewById(R.id.txtNo47);
         tx48 = (TextView) findViewById(R.id.txtNo48);
         tx49 = (TextView) findViewById(R.id.txtNo49);
         tx50 = (TextView) findViewById(R.id.txtNo50);
         tx51 = (TextView) findViewById(R.id.txtNo51);
         tx52 = (TextView) findViewById(R.id.txtNo52);
         tx53 = (TextView) findViewById(R.id.txtNo53);
         tx54 = (TextView) findViewById(R.id.txtNo54);
         tx55 = (TextView) findViewById(R.id.txtNo55);
         tx56 = (TextView) findViewById(R.id.txtNo56);
         tx57 = (TextView) findViewById(R.id.txtNo57);
         tx58 = (TextView) findViewById(R.id.txtNo58);
         tx59 = (TextView) findViewById(R.id.txtNo59);
         tx60 = (TextView) findViewById(R.id.txtNo60);
         tx61 = (TextView) findViewById(R.id.txtNo61);
         tx62 = (TextView) findViewById(R.id.txtNo62);
         tx63 = (TextView) findViewById(R.id.txtNo63);
         tx64 = (TextView) findViewById(R.id.txtNo64);
         tx65 = (TextView) findViewById(R.id.txtNo65);
         tx66 = (TextView) findViewById(R.id.txtNo66);
         tx67 = (TextView) findViewById(R.id.txtNo67);
         tx68 = (TextView) findViewById(R.id.txtNo68);
         tx69 = (TextView) findViewById(R.id.txtNo69);
         tx70 = (TextView) findViewById(R.id.txtNo70);
         tx71 = (TextView) findViewById(R.id.txtNo71);
         tx72 = (TextView) findViewById(R.id.txtNo72);
         tx73 = (TextView) findViewById(R.id.txtNo73);
         tx74 = (TextView) findViewById(R.id.txtNo74);
         tx75 = (TextView) findViewById(R.id.txtNo75);
         tx76 = (TextView) findViewById(R.id.txtNo76);
         tx77 = (TextView) findViewById(R.id.txtNo77);
         tx78 = (TextView) findViewById(R.id.txtNo78);
         tx79 = (TextView) findViewById(R.id.txtNo79);
         tx80 = (TextView) findViewById(R.id.txtNo80);
         tx81 = (TextView) findViewById(R.id.txtNo81);
         tx82 = (TextView) findViewById(R.id.txtNo82);
         tx83 = (TextView) findViewById(R.id.txtNo83);
         tx84 = (TextView) findViewById(R.id.txtNo84);
         tx85 = (TextView) findViewById(R.id.txtNo85);
         tx86 = (TextView) findViewById(R.id.txtNo86);
         tx87 = (TextView) findViewById(R.id.txtNo87);
         tx88 = (TextView) findViewById(R.id.txtNo88);
         tx89 = (TextView) findViewById(R.id.txtNo89);
         tx90 = (TextView) findViewById(R.id.txtNo90);
         tx91 = (TextView) findViewById(R.id.txtNo91);
         tx92 = (TextView) findViewById(R.id.txtNo92);
         tx93 = (TextView) findViewById(R.id.txtNo93);
         tx94 = (TextView) findViewById(R.id.txtNo94);
         tx95 = (TextView) findViewById(R.id.txtNo95);
         tx96 = (TextView) findViewById(R.id.txtNo96);
         tx97 = (TextView) findViewById(R.id.txtNo97);
         tx98 = (TextView) findViewById(R.id.txtNo98);
         tx99 = (TextView) findViewById(R.id.txtNo99);
         tx100 = (TextView) findViewById(R.id.txtNo100);
         tx101 = (TextView) findViewById(R.id.txtNo101);
         tx102 = (TextView) findViewById(R.id.txtNo102);
         tx103 = (TextView) findViewById(R.id.txtNo103);
         tx104 = (TextView) findViewById(R.id.txtNo104);
         tx105 = (TextView) findViewById(R.id.txtNo105);
         tx106 = (TextView) findViewById(R.id.txtNo106);
         tx107 = (TextView) findViewById(R.id.txtNo107);
         tx108 = (TextView) findViewById(R.id.txtNo108);
         tx109 = (TextView) findViewById(R.id.txtNo109);
         tx110 = (TextView) findViewById(R.id.txtNo110);
         tx111 = (TextView) findViewById(R.id.txtNo111);
         tx112 = (TextView) findViewById(R.id.txtNo112);
         tx113 = (TextView) findViewById(R.id.txtNo113);
         tx114 = (TextView) findViewById(R.id.txtNo114);
         tx115 = (TextView) findViewById(R.id.txtNo115);
         tx116 = (TextView) findViewById(R.id.txtNo116);
         tx117 = (TextView) findViewById(R.id.txtNo117);
         tx118 = (TextView) findViewById(R.id.txtNo118);
         tx119 = (TextView) findViewById(R.id.txtNo119);
         tx120 = (TextView) findViewById(R.id.txtNo120);
         tx121 = (TextView) findViewById(R.id.txtNo121);
         tx122 = (TextView) findViewById(R.id.txtNo122);
         tx123 = (TextView) findViewById(R.id.txtNo123);
         tx124 = (TextView) findViewById(R.id.txtNo124);
         tx125 = (TextView) findViewById(R.id.txtNo125);
         tx126 = (TextView) findViewById(R.id.txtNo126);
         tx127 = (TextView) findViewById(R.id.txtNo127);
         tx128 = (TextView) findViewById(R.id.txtNo128);
         tx129 = (TextView) findViewById(R.id.txtNo129);
         tx130 = (TextView) findViewById(R.id.txtNo130);
         tx131 = (TextView) findViewById(R.id.txtNo131);
         tx132 = (TextView) findViewById(R.id.txtNo132);
         tx133 = (TextView) findViewById(R.id.txtNo133);
         tx134 = (TextView) findViewById(R.id.txtNo134);
         tx135 = (TextView) findViewById(R.id.txtNo135);
         tx136 = (TextView) findViewById(R.id.txtNo136);
         tx137 = (TextView) findViewById(R.id.txtNo137);
         tx138 = (TextView) findViewById(R.id.txtNo138);
         tx139 = (TextView) findViewById(R.id.txtNo139);
         tx140 = (TextView) findViewById(R.id.txtNo140);
         tx141 = (TextView) findViewById(R.id.txtNo141);
         tx142 = (TextView) findViewById(R.id.txtNo142);
         tx143 = (TextView) findViewById(R.id.txtNo143);
         tx144 = (TextView) findViewById(R.id.txtNo144);
         tx145 = (TextView) findViewById(R.id.txtNo145);
         tx146 = (TextView) findViewById(R.id.txtNo146);
         tx147 = (TextView) findViewById(R.id.txtNo147);
         tx148 = (TextView) findViewById(R.id.txtNo148);
         tx149 = (TextView) findViewById(R.id.txtNo149);
         tx150 = (TextView) findViewById(R.id.txtNo150);
         tx151 = (TextView) findViewById(R.id.txtNo151);
         tx152 = (TextView) findViewById(R.id.txtNo152);
         tx153 = (TextView) findViewById(R.id.txtNo153);
         tx154 = (TextView) findViewById(R.id.txtNo154);
         tx155 = (TextView) findViewById(R.id.txtNo155);
         tx156 = (TextView) findViewById(R.id.txtNo156);
         tx157 = (TextView) findViewById(R.id.txtNo157);
         tx158 = (TextView) findViewById(R.id.txtNo158);
         tx159 = (TextView) findViewById(R.id.txtNo159);
         tx160 = (TextView) findViewById(R.id.txtNo160);
         tx161 = (TextView) findViewById(R.id.txtNo161);
         tx162 = (TextView) findViewById(R.id.txtNo162);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
         g1 = (GridLayout) findViewById(R.id.Grid1);
         g2 = (GridLayout) findViewById(R.id.Grid2);
         g3 = (GridLayout) findViewById(R.id.Grid3);
         g4 = (GridLayout) findViewById(R.id.Grid4);
         g5 = (GridLayout) findViewById(R.id.Grid5);
         g6 = (GridLayout) findViewById(R.id.Grid6);
         txt0 =(TextView)findViewById(R.id.textView);
         txt1 = (TextView) findViewById(R.id.textView2);
         txt2 = (TextView) findViewById(R.id.textView3);
         txt3 = (TextView) findViewById(R.id.textView4);
         txt4 = (TextView) findViewById(R.id.textView5);
         txt5 = (TextView) findViewById(R.id.textView6);
         txt6 = (TextView) findViewById(R.id.textView7);
         txt7  =(TextView) findViewById(R.id.textView8);


        tvs1 = new TextView[][]{
                {tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9},
                {tx10, tx11, tx12, tx13, tx14, tx15, tx16, tx17, tx18},
                {tx19, tx20, tx21, tx22, tx23, tx24, tx25, tx26, tx27}};
        tvs2 = new TextView[][]{{tx28, tx29, tx30, tx31, tx32, tx33, tx34, tx35, tx36},
                {tx37, tx38, tx39, tx40, tx41, tx42, tx43, tx44, tx45},
                {tx46, tx47, tx48, tx49, tx50, tx51, tx52, tx53, tx54}};
        tvs3 = new TextView[][]{{tx55, tx56, tx57, tx58, tx59, tx60, tx61, tx62, tx63},
                {tx64, tx65, tx66, tx67, tx68, tx69, tx70, tx71, tx72},
                {tx73, tx74, tx75, tx76, tx77, tx78, tx79, tx80, tx81}};
        tvs4 = new TextView[][]{{tx82, tx83, tx84, tx85, tx86, tx87, tx88, tx89, tx90},
                {tx91, tx92, tx93, tx94, tx95, tx96, tx97, tx98, tx99},
                {tx100, tx101, tx102, tx103, tx104, tx105, tx106, tx107, tx108}};
        tvs5 = new TextView[][]{{tx109, tx110, tx111, tx112, tx113, tx114, tx115, tx116, tx117},
                {tx118, tx119, tx120, tx121, tx122, tx123, tx124, tx125, tx126},
                {tx127, tx128, tx129, tx130, tx131, tx132, tx133, tx134, tx135}};
        tvs6 = new TextView[][]{{tx136, tx137, tx138, tx139, tx140, tx141, tx142, tx143,tx144},
                {tx145, tx146, tx147, tx148, tx149, tx150, tx151, tx152, tx153},
                {tx154,tx155, tx156, tx157, tx158, tx159, tx160, tx161, tx162}};


        Object[] KgArray = (Object[]) getIntent().getExtras().getSerializable("TktsArray");

        if (KgArray != null) {
            KgkTickets = new int[KgArray.length][][];
            for (int i = 0; i < KgArray.length; i++) {
                KgkTickets[i] = (int[][]) KgArray[i];

            }

        }
        Object[]ltArray= (Object[])getIntent().getExtras().getSerializable("LottoTkts");
        if(ltArray != null){
            LottoTickets = new int [ltArray.length][][];
            for(int i=0;i<ltArray.length;i++){
                LottoTickets[i]=(int[][]) ltArray[i];
            }
        }



        {

        }

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ticket_options,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
       switch (item.getItemId()){
           case R.id._kgk:
               _KgkTickets=true;
               _lotoTickets=false;
               max= 300;
               txt0.setText("KGK Tickets of Thambola");
               return true;
           case R.id._loto:
               _lotoTickets=true;
               _KgkTickets=false;
               max = 600;
               txt0.setText("LOTO Tickets of Thambola");
               return true;
           default:
               if (super.onOptionsItemSelected(item)) return true;
               else {
                   return false;
               }
       }


        }

    public void onClick(View view){

    }



    public void showFirstTkt(View view) {
        // g1.setVisibility(View.VISIBLE);
        if(!_lotoTickets && !_KgkTickets){
            Toast.makeText(this,"Select Tickets type from Menu",Toast.LENGTH_LONG).show();
            return;
        }

        String s;
        s = e1.getText().toString();
        if (s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return;
        }
       // g1.setVisibility(View.VISIBLE);
        int tk = Integer.parseInt(e1.getText().toString()) - 1;
        if (tk < 0 || tk > max-1 || s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos From 1 to "+ max, Toast.LENGTH_LONG).show();
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                // cbs1[row][col].setVisibility(View.INVISIBLE);
                tvs1[row][col].setText("");
                tvs1[row][col].setEnabled(false);
                tvs1[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 5; col++) {
                int digit,column;
                digit =0;
                if(_KgkTickets)digit=KgkTickets[tk][row][col];
                else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                if (digit == 90) {
                    column = 8;
                } else {
                    column = digit / 10;
                }
                String str = NumberFormat.getInstance().format(digit);
                tvs1[row][column].setText(str);
                //cbs1[row][colum].setVisibility(View.VISIBLE);
                tvs1[row][column].setEnabled(true);
                // cbs1[row][colum].setTextSize(30);
            }
        }
        g1.setVisibility(View.VISIBLE);
        txt2.setVisibility(View.VISIBLE);
        e2.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
    }
    public void showSecTicket(View view){
        String s;
        s = e2.getText().toString();
        if (s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return;
        }

        int tk = Integer.parseInt(e2.getText().toString()) - 1;
        if (tk < 0 || tk > max-1) {
            Toast.makeText(this, "Enter Tkt Nos From 1 to "+ max, Toast.LENGTH_LONG).show();
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                // cbs1[row][col].setVisibility(View.INVISIBLE);
                tvs2[row][col].setText("");
                tvs2[row][col].setEnabled(false);
                tvs2[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }

        for (int row = 0; row < 3; row++) {
            int column,digit;
            digit =0;
            for (int col = 0; col < 5; col++) {
                if(_KgkTickets)digit=KgkTickets[tk][row][col];
                else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                if (digit == 90) {
                    column = 8;
                } else {
                    column = digit / 10;
                }
                String str = NumberFormat.getInstance().format(digit);
                tvs2[row][column].setText(str);

                tvs2[row][column].setEnabled(true);
            }
        }
        g2.setVisibility(View.VISIBLE);
        txt3.setVisibility(View.VISIBLE);
        e3.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);

        e3.requestFocus();


    }
        public void showThirdTicket(View view){
            String s;
            s = e3.getText().toString();
            if (s.equals("")) {
                Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
                return;
            }

            int tk = Integer.parseInt(e3.getText().toString()) - 1;
            if (tk < 0 || tk > max - 1) {
                Toast.makeText(this, "Enter Tkt Nos From 1 to " + max, Toast.LENGTH_LONG).show();
                return;
            }
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 9; col++) {
                    // cbs1[row][col].setVisibility(View.INVISIBLE);
                    tvs3[row][col].setText("");
                    tvs3[row][col].setEnabled(false);
                    tvs3[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
                }
            }

            for (int row = 0; row < 3; row++) {
                int digit,column;
                digit = 0;
                for (int col = 0; col < 5; col++) {
                    if(_KgkTickets)digit=KgkTickets[tk][row][col];
                    else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                    if (digit == 90) {
                        column = 8;
                    } else {
                        column = digit / 10;
                    }
                    String str = NumberFormat.getInstance().format(digit);
                    tvs3[row][column].setText(str);

                    tvs3[row][column].setEnabled(true);
                }


            }
            g3.setVisibility(View.VISIBLE);
            txt4.setVisibility(View.VISIBLE);
            e4.setVisibility(View.VISIBLE);
            b4.setVisibility(View.VISIBLE);

            e4.requestFocus();


        }
    public void showFourthTicket(View view){
        String s;
        s = e4.getText().toString();
        if (s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return;
        }



        int tk = Integer.parseInt(e4.getText().toString()) - 1;
        if (tk < 0 || tk > max - 1) {
            Toast.makeText(this, "Enter Tkt Nos From 1 to "+ max , Toast.LENGTH_LONG).show();
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                // cbs1[row][col].setVisibility(View.INVISIBLE);
                tvs4[row][col].setText("");
                tvs4[row][col].setEnabled(false);
                tvs4[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }

        for (int row = 0; row < 3; row++) {
            int digit,column;
            digit = 0;
            for (int col = 0; col < 5; col++) {
                if(_KgkTickets)digit=KgkTickets[tk][row][col];
                else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                if (digit == 90) {
                    column = 8;
                } else {
                    column = digit / 10;
                }
                String str = NumberFormat.getInstance().format(digit);
                tvs4[row][column].setText(str);

                tvs4[row][column].setEnabled(true);
            }
            g4.setVisibility(View.VISIBLE);
        txt5.setVisibility(View.VISIBLE);
        e5.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        e5.requestFocus();
    }
    }
    public void showFifthTicket(View view){
        String s;
        s = e5.getText().toString();
        if (s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return;
        }



        int tk = Integer.parseInt(e5.getText().toString()) - 1;
        if (tk < 0 || tk > max -1) {
            Toast.makeText(this, "Enter Tkt Nos From 1 to "+ max , Toast.LENGTH_LONG).show();
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                // cbs1[row][col].setVisibility(View.INVISIBLE);
                tvs5[row][col].setText("");
                tvs5[row][col].setEnabled(false);
                tvs5[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }

        for (int row = 0; row < 3; row++) {
            int digit,column;
            digit = 0;
            for (int col = 0; col < 5; col++) {
                if(_KgkTickets)digit=KgkTickets[tk][row][col];
                else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                if (digit == 90) {
                    column = 8;
                } else {
                    column = digit / 10;
                }
                String str = NumberFormat.getInstance().format(digit);
                tvs5[row][column].setText(str);
                tvs5[row][column].setEnabled(true);
            }
        }
        g5.setVisibility(View.VISIBLE);
        txt6.setVisibility(View.VISIBLE);
        e6.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        e6.requestFocus();
    }
    public void showSixthTicket(View view){
        String s;
        s = e6.getText().toString();
        if (s.equals("")) {
            Toast.makeText(this, "Enter Tkt Nos", Toast.LENGTH_LONG).show();
            return;
        }



        int tk = Integer.parseInt(e6.getText().toString()) - 1;
        if (tk < 0 || tk > max -1) {
            Toast.makeText(this, "Enter Tkt Nos From 1 to " + max, Toast.LENGTH_LONG).show();
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                // cbs1[row][col].setVisibility(View.INVISIBLE);
                tvs6[row][col].setText("");
                tvs6[row][col].setEnabled(false);
                tvs6[row][col].setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        }

        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 5; col++) {
                        int digit,column;
                        digit = 0;
                        if(_KgkTickets)digit=KgkTickets[tk][row][col];
                        else if (_lotoTickets)digit=LottoTickets[tk][row][col];
                        if (digit == 90) {
                            column = 8;
                        } else {
                            column = digit / 10;
                        }
                        String str = NumberFormat.getInstance().format(digit);
                g6.setVisibility(View.VISIBLE);
                tvs6[row][column].setText(str);
                tvs6[row][column].setEnabled(true);
                txt7.setVisibility(View.VISIBLE);
                txt7.requestFocus();
            }
    }


    public void showGrid(View view) {
        int col;
        int tkt;
        tkt =0;
        //tkt = Integer.parseInt(e1.getText().toString()) - 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 9; j++) {
                tvs1[i][j].setEnabled(false);
            }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int No = KgkTickets[tkt][i][j];
                if (No / 10 == 9) col = 8;
                else {
                    col = No / 10;
                }
                tvs1[i][col].setText(Integer.toString(KgkTickets[tkt][i][j]));
                tvs1[i][col].setEnabled(true);

            }
        }

    }



    public void ontxtClick(View view) {
        ColorDrawable color = (ColorDrawable) view.getBackground();
        int clr = color.getColor();

        //t1.setText(Integer.toString(clr));
        if (clr == ContextCompat.getColor(this, R.color.colorWhite)) {
            view.setBackgroundColor(getResources().getColor(R.color.aqua));
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        }


    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("ThambolaTickets Page") // TODO: Define a title for the content shown.
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

    public void showText(View view) {
        Toast.makeText(this, e1.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
