package com.example.krishnarao.thambola_game;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.net.Uri;
import android.preference.DialogPreference;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Locale;
import java.util.Random;

import static com.example.krishnarao.thambola_game.R.anim.slide_out_left;

public class PlayGameActivity extends AppCompatActivity {

    static int arr[] = new int[90];
    static TextView[] o1;
    String s = new String("");
    StringBuilder _upDates = new StringBuilder();
    public Boolean talk = true;
    public int count;
    static String numCalls[];
    static int NumAdresses[][][];
    Button bUpdates,newGame;
    TextToSpeech tts;
    MediaPlayer mediaPlayer;
    Button Play ;

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
    TextView t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40;
    TextView t41, t42, t43, t44, t45, t46, t47, t48, t49, t50, t51, t52, t53, t54, t55, t56, t57, t58, t59, t60;
    TextView t61, t62, t63, t64, t65, t66, t67, t68, t69, t70, t71, t72, t73, t74, t75, t76, t77, t78, t79, t80;
    TextView t81, t82, t83, t84, t85, t86, t87, t88, t89, t90;
    TextView tBoard;
    static int num;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text;
    final int mark = -1;
    static int _fr, _to, _max;
    String jaldi, corner, star, fstLine, secLine, thrdLine, flHouse, flHouse2;
    static boolean _ef, _cor, _str, _l1, _l2, _l3, _fh, _fh2, _otherTkts, _kgkTkts, _lotoTkts;
    static int Tkts[][][];
    static int LottoTickets[][][];
    static int KokaTkts[][][];
    ToneGenerator elert,beep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);


        setVariables();
        // loadNumAdresses();


        bUpdates = (Button) findViewById(R.id.btnUpdates);
        Play = (Button) findViewById(R.id.play);
        tBoard = (TextView) findViewById(R.id.txtBoard);
        t1 = (TextView) findViewById(R.id.text1);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        t4 = (TextView) findViewById(R.id.text4);
        t5 = (TextView) findViewById(R.id.text5);
        t6 = (TextView) findViewById(R.id.text6);
        t7 = (TextView) findViewById(R.id.text7);
        t8 = (TextView) findViewById(R.id.text8);
        t9 = (TextView) findViewById(R.id.text9);
        t10 = (TextView) findViewById(R.id.text10);
        t11 = (TextView) findViewById(R.id.text11);
        t12 = (TextView) findViewById(R.id.text12);
        t13 = (TextView) findViewById(R.id.text13);
        t14 = (TextView) findViewById(R.id.text14);
        t15 = (TextView) findViewById(R.id.text15);
        t16 = (TextView) findViewById(R.id.text16);
        t17 = (TextView) findViewById(R.id.text17);
        t18 = (TextView) findViewById(R.id.text18);
        t19 = (TextView) findViewById(R.id.text19);
        t20 = (TextView) findViewById(R.id.text20);
        t21 = (TextView) findViewById(R.id.text21);
        t22 = (TextView) findViewById(R.id.text22);
        t23 = (TextView) findViewById(R.id.text23);
        t24 = (TextView) findViewById(R.id.text24);
        t25 = (TextView) findViewById(R.id.text25);
        t26 = (TextView) findViewById(R.id.text26);
        t27 = (TextView) findViewById(R.id.text27);
        t28 = (TextView) findViewById(R.id.text28);
        t29 = (TextView) findViewById(R.id.text29);
        t30 = (TextView) findViewById(R.id.text30);
        t31 = (TextView) findViewById(R.id.text31);
        t32 = (TextView) findViewById(R.id.text32);
        t33 = (TextView) findViewById(R.id.text33);
        t34 = (TextView) findViewById(R.id.text34);
        t35 = (TextView) findViewById(R.id.text35);
        t36 = (TextView) findViewById(R.id.text36);
        t37 = (TextView) findViewById(R.id.text37);
        t38 = (TextView) findViewById(R.id.text38);
        t39 = (TextView) findViewById(R.id.text39);
        t40 = (TextView) findViewById(R.id.text40);
        t41 = (TextView) findViewById(R.id.text41);
        t42 = (TextView) findViewById(R.id.text42);
        t43 = (TextView) findViewById(R.id.text43);
        t44 = (TextView) findViewById(R.id.text44);
        t45 = (TextView) findViewById(R.id.text45);
        t46 = (TextView) findViewById(R.id.text46);
        t47 = (TextView) findViewById(R.id.text47);
        t48 = (TextView) findViewById(R.id.text48);
        t49 = (TextView) findViewById(R.id.text49);
        t50 = (TextView) findViewById(R.id.text50);
        t51 = (TextView) findViewById(R.id.text51);
        t52 = (TextView) findViewById(R.id.text52);
        t53 = (TextView) findViewById(R.id.text53);
        t54 = (TextView) findViewById(R.id.text54);
        t55 = (TextView) findViewById(R.id.text55);
        t56 = (TextView) findViewById(R.id.text56);
        t57 = (TextView) findViewById(R.id.text57);
        t58 = (TextView) findViewById(R.id.text58);
        t59 = (TextView) findViewById(R.id.text59);
        t60 = (TextView) findViewById(R.id.text60);
        t61 = (TextView) findViewById(R.id.text61);
        t62 = (TextView) findViewById(R.id.text62);
        t63 = (TextView) findViewById(R.id.text63);
        t64 = (TextView) findViewById(R.id.text64);
        t65 = (TextView) findViewById(R.id.text65);
        t66 = (TextView) findViewById(R.id.text66);
        t67 = (TextView) findViewById(R.id.text67);
        t68 = (TextView) findViewById(R.id.text68);
        t69 = (TextView) findViewById(R.id.text69);
        t70 = (TextView) findViewById(R.id.text70);
        t71 = (TextView) findViewById(R.id.text71);
        t72 = (TextView) findViewById(R.id.text72);
        t73 = (TextView) findViewById(R.id.text73);
        t74 = (TextView) findViewById(R.id.text74);
        t75 = (TextView) findViewById(R.id.text75);
        t76 = (TextView) findViewById(R.id.text76);
        t77 = (TextView) findViewById(R.id.text77);
        t78 = (TextView) findViewById(R.id.text78);
        t79 = (TextView) findViewById(R.id.text79);
        t80 = (TextView) findViewById(R.id.text80);
        t81 = (TextView) findViewById(R.id.text81);
        t82 = (TextView) findViewById(R.id.text82);
        t83 = (TextView) findViewById(R.id.text83);
        t84 = (TextView) findViewById(R.id.text84);
        t85 = (TextView) findViewById(R.id.text85);
        t86 = (TextView) findViewById(R.id.text86);
        t87 = (TextView) findViewById(R.id.text87);
        t88 = (TextView) findViewById(R.id.text88);
        t89 = (TextView) findViewById(R.id.text89);
        t90 = (TextView) findViewById(R.id.text90);
        Play = (Button) findViewById(R.id.play);
        tts = new TextToSpeech(this,new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status){
               int result= tts.setLanguage(Locale.US);

            }
        });
        //Toast.makeText(this, String.valueOf(_rd), Toast.LENGTH_LONG).show();

        o1 = new TextView[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23,
                t24, t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40, t41, t42, t43, t44, t45, t46, t47, t48, t49, t50,
                t51, t52, t53, t54, t55, t56, t57, t58, t59, t60, t61, t62, t63, t64, t65, t66, t67, t68, t69, t70,
                t71, t72, t73, t74, t75, t76, t77, t78, t79, t80, t81, t82, t83, t84, t85, t86, t87, t88, t89, t90};
        numCalls = new String[]{"", "At the bigining", "One little duck", "Monkey on the tree", "Shut the door", "Jack's alive", "Tom's Trick", "One hockey stick",
                "One fat lady", "Dinner time ", "A big fat hen", "Two Legs eleven", "One dozen", "Bakers dozen", "Valentine’s day", "Rugby team",
                "Sweet sixteen", "Dancing queen", "Now you can vote", "Goodbye teens", "One score", "Key of the door", "Two little ducks", "Thee and me",
                "Two dozen", "Duck and dive", "Pick and mix", "Gateway to heaven", "Over weight", "In your prime", "Dirty Gertie", "Get up and run",
                "Buckle my Shoe", "Two little fleas", "Ask for more", "Jump and jive", "Three dozen", "A flea in heaven", "Christmas cake", "All the steps",
                "Two score", "Time for fun", "That famous street in Manhattan", "Down on your knees", "All the fours", "Halfway there", "Up to tricks",
                "Four and seven", "Four dozen", "Rise and shine", "Half a century", "Tweak of the thumb", "Weeks in a year", "The joker", "Clean the floor",
                "All the fives", "Was she worth it", "All the beans", "Make them wait", "Brighton line", "Five dozen", "Bakers bun", "Tickety boo",
                "Tickle me", "The Beatles number", "Old age pension", "All the sixes", "Made in heaven", "Check your weight", "Either way up",
                "Three score and ten", "Lucky one", "Lucky two", "Lucky three", "Lucky four", "Lucky five", "Lucky six", "Lucky seven", "Lucky eight",
                "Lucky nine", "Gandhi's breakfast", "Stop and run", "Fat lady with a duck", "Fat lady with a flea", "Seven dozen", "Staying alive",
                "Between the sticks", "Fat lady with a crutch", "Two fat ladies", "All but one", "End of the line"};

        Tkts = new int[600][3][5];
//        if (!_otherTkts) {
//            bUpdates.setVisibility(View.INVISIBLE);
//
//        }
        if (_otherTkts) {
           
            bUpdates.setVisibility(View.INVISIBLE);
        }
        // Toast.makeText(this,"Lotto is  "+ Boolean.toString(_loto),Toast.LENGTH_SHORT).show();

        if (_kgkTkts) {
            Object[] kgkArray = (Object[]) getIntent().getExtras().getSerializable("kgkTks");
            if (kgkArray != null) {
                KokaTkts = new int[kgkArray.length][][];
                for (int i = 0; i < kgkArray.length; i++) {
                    KokaTkts[i] = (int[][]) kgkArray[i];
                }

            }

            copyKokaToTkts();


        }
        if (_lotoTkts) {
            Object[] lotoArray = (Object[]) getIntent().getExtras().getSerializable("lottoTkts");
            if (lotoArray != null) {
                LottoTickets = new int[lotoArray.length][][];
                for (int i = 0; i < lotoArray.length; i++) {
                    LottoTickets[i] = (int[][]) lotoArray[i];
                }
            }

            copyLotoToTks();
        }



        //Toast.makeText(this, Integer.toString(LottoTickets[599][2].length),Toast.LENGTH_LONG).show();
        loadNumAdresses();
        //Toast.makeText(this,Integer.toString(NumAdresses[90][74][0]),Toast.LENGTH_LONG).show();

        final Button play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (count == 90) {
                    Toast.makeText(getApplication(), "All Nos Over", Toast.LENGTH_LONG).show();
                    return;
                }

                TextView Number = (TextView) findViewById(R.id.Number);
                Integer num = new PlayGameActivity().createRandomNumber();
                //tts.speak(numCalls[num]+num,TextToSpeech.QUEUE_FLUSH,null);
                markNewArray(num);
                Number.setText(Integer.toString(num));
                count++;
                tBoard.setText(Integer.toString(count));
               Toast toast = Toast.makeText(getApplicationContext(),numCalls[num], Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                toast.show();
                o1[num - 1].setBackgroundResource(R.drawable.rounded_txtview);
               mediaPlayerStop();
                mediaPlayer = MediaPlayer.create(PlayGameActivity.this,R.raw.beep);
                mediaPlayer.start();


                if (_ef) jaldiCount();
                if (_cor) cornerCount();
                if (_str) starCount();
                if (_l1) firstLineCount();
                if (_l2) secondLineCount();
                if (_l3) thirdLineCount();
                if (!_fh && _fh2) SecondfullHouseCount();
                if (_fh) fullHouseCount();

            }

        });
        newGame = (Button)findViewById(R.id.btnNew);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            newGameDialog();
            }

        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }
    public void onPause(){
        if(tts !=null){
            tts.stop();
            tts.shutdown();
            super.onPause();
        }
    }

    public void setVariables() {
        Intent in = this.getIntent();
        // in.getBooleanExtra("kgkr",_rd);

        Bundle b = in.getExtras();
        if (b != null) {
            _fr = b.getInt("frm");
            _to = b.getInt("to");
            _ef = b.getBoolean("jaldi");
            _cor = b.getBoolean("corner");
            _str = b.getBoolean("star");
            _l1 = b.getBoolean("fLine");
            _l2 = b.getBoolean("sLine");
            _l3 = b.getBoolean("tLine");
            _fh = b.getBoolean("fHouse");
            _fh2 = b.getBoolean("fHouse2");
            _otherTkts = b.getBoolean("Kgk");
            _kgkTkts = b.getBoolean("koka");
            _lotoTkts = b.getBoolean("ltoTkts");
            _max = b.getInt("Max");
              /*  if (_loto) {
                    Object[] myArray = (Object[]) getIntent().getExtras().getSerializable("lottoTkts");
                    //  Object[] myArray = (Object[]) getIntent().getExtras().getSerializable("activeTkts");
                    if (myArray != null) {
                        LottoTickets = new int[myArray.length][][];
                        for (int i = 0; i < myArray.length; i++) {
                            LottoTickets[i] = (int[][]) myArray[i];
                        }
                    }
                }*/


        }
    }

    public void loadNumAdresses() {
        NumAdresses = new int[91][100][3];
        int digit, inst;
        inst = 0;
        for (int tkt = 0;tkt <_max; tkt++) {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 5; col++) {
                    digit = Tkts[tkt][row][col];
                    switch (NumAdresses[digit][inst][0] = tkt) {
                    }
                    NumAdresses[digit][inst][1] = row;
                    NumAdresses[digit][inst][2] = col;
                }
            }
            if ((tkt + 1) % 6 == 0) inst++;

        }
    }

    public int createRandomNumber() {
        final int mark = -1;
        Random rm = new Random();
        do {
            num = rm.nextInt(90) + 1;
        } while (arr[num - 1] == mark);
        count++;
        arr[num - 1] = mark;
        return num;
    }

    protected final void createDialog(final int id, String message, String title, final StringBuffer sb) {

        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle(title);
        final AlertDialog.Builder builder = adb.setMessage(message);

        adb.setCancelable(false); //ds'nt allow program to run unless dialogue dismissed
        adb.setPositiveButton("Responded OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                //gen.setEnabled(true);
                switch (id) {
                    case (1):
                        _ef = false;
                        _upDates.append("Early Five           :"+sb);
                        _upDates.append("\n");

                        if (!_cor && !_str && !_l1 && !_l2 && !_l3 && !_fh && !_fh2 ) {

                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;

                        // corner four
                    case (2): {
                        _cor = false;
                        _upDates.append("Corner Four       :"+sb);
                        _upDates.append("\n");
                        if (!_ef && !_str && !_l1 && !_l2 && !_l3 && !_fh && !_fh2 ) {

                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }

                        break;
                        //star five
                    }
                    case (3): {
                        _str = false;
                        _upDates.append("Star Five             :"+ sb);
                        _upDates.append("\n");
                        if (!_ef && !_cor && !_l1 && !_l2 && !_l3 && !_fh && !_fh2 ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;
                        //first line
                    }
                    case (4): {
                        _l1 = false;
                        _upDates.append( "First Line            :"+sb);
                        _upDates.append("\n");
//                        _upDates.append("First Line:     ");
//                        _upDates.append(sb);
                        // _upDates.append("\n");
                        if (!_ef && !_cor && !_str && !_l2 && !_l3 && !_fh && !_fh2  ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }

                        break;
                        //2nd line
                    }
                    case (5): {
                        _l2 = false;
                        _upDates.append( "Second Line       :"+sb);
                       /* _upDates.append("Second Line :");
                        _upDates.append(sb);*/
                        _upDates.append("\n");
                        if (!_ef && !_cor && !_str && !_l1 && !_l3 && !_fh && !_fh2 ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;
                        //third line
                    }
                    case (6): {
                        _l3 = false;
                        _upDates.append( "Third Line          :"+ sb);

                        _upDates.append("\n");
                        if (!_ef && !_cor && !_str && !_l1 && !_l2 && !_fh && !_fh2 ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;
                        //full house
                    }
                    case (7): {
                        _fh = false;
                        _upDates.append( "Full House         :" +sb);
                        _upDates.append("\n");
                        if (!_ef && !_cor && !_str && !_l1 && !_l2 && !_l3 && !_fh2 ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;
                        //2ndfull house
                    }
                    case (8): {
                        _fh2 = false;
                        _upDates.append( "2nd Full House :"+ sb);
                        _upDates.append("\n");
                        if (!_ef && !_cor && !_str && !_l1 && !_l2 && !_l3 && !_fh && !_fh2 ) {
                            Toast.makeText(getApplicationContext(), "All Events Over", Toast.LENGTH_LONG).show();
                        }
                        break;
                    }
                }
            }
        });

        adb.setNegativeButton("No Response! Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                //      gen.setEnabled(true);


                Toast.makeText(getApplicationContext(), "Tkts: " + sb + "No Response Canceled", Toast.LENGTH_LONG).show();


            }
        });
        AlertDialog dialog = adb.create();
        // dialog.getWindow().setBackgroundDrawableResource(R.color.trans);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(lp);
        dialog.show();
        elert = new ToneGenerator(AudioManager.STREAM_ALARM,500);
        elert.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT);

    }

    protected final void newGameDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final AlertDialog.Builder builder1 = builder;
        builder1.setTitle("New Game");
        builder1.setMessage("Are You Sure! You want to Quit this Game?");
        builder1.setIcon(android.R.drawable.ic_dialog_alert);
        builder1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent in = new Intent(PlayGameActivity.this, MainActivity.class);
                startActivity(in);
                overridePendingTransition(R.anim.slide_in_right, slide_out_left);
                finish();
                // onBackPressed();
            }
        });
        builder1.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }


        });
        builder.show();
    }
    public void showUpdates(View view) {

        AlertDialog.Builder su = new AlertDialog.Builder(this);
        su.setTitle("Results Update");
        su.setMessage(_upDates);
        su.setPositiveButton("OK", null);
        su.show();
    }


    boolean hasNumInStar(int tk) {
        boolean b = false;

        for (int i = 0; i < 3; i += 2) {
            for (int j = 0; j < 5; j += 4) {
                if (Tkts[tk][i][j] == num * mark) b = true;
            }
        }
        if (Tkts[tk][1][2] == num * mark) b = true;
        return b;
    }

    boolean hasNumInTicket(int tk) {
        boolean b = false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                if (Tkts[tk][i][j] == num * mark) b = true;
        return b;
    }

    boolean hasNumInCorner(int tk) {
        boolean b = false;

        for (int i = 0; i < 3; i += 2)
            for (int j = 0; j < 5; j += 4)
                if (Tkts[tk][i][j] == num * mark) b = true;
        return b;


    }

    boolean hasNumInLines(int tkt, int line) {

        boolean b = false;
        for (int i = 0; i < 5; i++)
            if (Tkts[tkt][line][i] == num * mark) b = true;
        return b;

    }

    public void jaldiCount() {

        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Early Five";
        for (int i = _fr - 1; i < _to; i++) {
            int jc = 0; //count
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if (0 > Tkts[i][j][k]) {
                        jc++;
                    }
                }
            }
            if (jc == 5 && hasNumInTicket(i)) {
                sb.append(Integer.toString(i + 1) + " ");
            }
        }
        if (sb.length() > 0) {
            // gen.setEnabled(
            // else);
            //Toast.makeText(getApplicationContext(), "Tkts: " + sb + " Wins early Five", Toast.LENGTH_LONG).show()
            setText("Tickets: " + sb + "Wins Early Five");


            // gen.setEnabled(false);
            // _notify();

            createDialog(1, getText(), ttl, sb);
            jaldi = sb.toString();
            // notify();
            //   _upDates.append("Early Five:  ");
            // _upDates.append(sb);
            //   _upDates.append("\n");

            //Log.i("Krishna", jaldi);
            // Toast.makeText(getApplicationContext(), jaldi.toString(), Toast.LENGTH_LONG).show();


        }
    }

    public void cornerCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Corner Four";
        for (int i = _fr - 1; i < _to; i++) {
            int jc = 0;
            for (int j = 0; j < 3; j += 2) {
                for (int k = 0; k < 5; k += 4) {
                    if (0 > Tkts[i][j][k]) {
                        jc++;
                    }
                }
            }
            if (jc == 4 && hasNumInCorner(i)) sb.append(Integer.toString(i + 1) + " ");
        }
        if (sb.length() > 0) {
            setText("Tickets: " + sb + "Wins Corner Four");
            //  Toast.makeText(getApplicationContext(), "Tkts: " + sb1 + " Wins Corner Four", Toast.LENGTH_LONG).show();
            // _notify();
            createDialog(2, getText(), ttl, sb);
            corner = sb.toString();
         /*   _upDates.append("Corner Four:  ");
            _upDates.append(sb1);
            _upDates.append("\n");*/

        }
    }

    // select the ticket for the star  event
    public void starCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Star Five ";
        for (int i = _fr - 1; i < _to; i++) {
            int sc = 0;
            for (int j = 0; j < 3; j += 2) {
                for (int k = 0; k < 5; k += 4) {
                    if (Tkts[i][j][k] < 0) {
                        sc++;
                    }
                }
            }

            if (sc == 4 && Tkts[i][1][2] < 0 && hasNumInStar(i)) {
                sb.append(Integer.toString(i + 1) + " ");
            }
        }
        if (sb.length() > 0) {
            // Toast.makeText(getApplicationContext(), "Tkts: " + sb + " Wins Star Five", Toast.LENGTH_LONG).show();
            //_str = false;
            //Log.i("Krishna", jaldi );

            setText("Tickets: " + sb + "Wins Star Five");
            createDialog(3, getText(), ttl, sb);
            star = sb.toString();
           /* _upDates.append("Star Five:  ");
            _upDates.append(sb);
            _upDates.append("\n");*/

        }
    }

    // select the ticket for the first line  event
    public void firstLineCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie First Line ";
        for (int i = _fr - 1; i < _to; i++) {
            int lc = 0;
            for (int j = 0; j < 5; j++) {
                if (Tkts[i][0][j] < 0) {
                    lc++;
                }
            }
            if (lc == 5 && hasNumInLines(i, 0)) {
                sb.append(Integer.toString(i + 1) + " ");
            }
        }
        if (sb.length() > 0) {
            // Toast.makeText(getApplicationContext(), "Tkts: " + msg + " Wins First Line", Toast.LENGTH_LONG).show();
            // _l1 = false;

            setText("Tickets: " + sb + "Wins First Line");
            createDialog(4, getText(), ttl, sb);
            fstLine = sb.toString();
          /*  _upDates.append("First Line:  ");
            _upDates.append(sb);
            _upDates.append("\n");*/
        }
    }

    // select the ticket for the second line  event
    public void secondLineCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Second Line ";
        for (int i = _fr; i < _to; i++) {
            int lc = 0;
            for (int j = 0; j < 5; j++) {
                if (Tkts[i][1][j] < 0) {
                    lc++;
                }
            }
            if (lc == 5 && hasNumInLines(i, 1)) {
                sb.append(Integer.toString(i + 1) + " ");
            }
        }
        if (sb.length() > 0) {
            //  Toast.makeText(getApplicationContext(), "Tkts: " + msg + " Wins Second Line", Toast.LENGTH_LONG).show();
            // _l2 = false;

            setText("Tickets: " + sb + "Wins Second Line");
            createDialog(5, getText(), ttl, sb);
            secLine = sb.toString();
          /*  _upDates.append("Second Line:  ");
            _upDates.append(sb);
            _upDates.append("\n"); */
        }
    }

    // select the ticket for the 3rd line  event
    public void thirdLineCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Third Line ";
        for (int i = _fr - 1; i < _to; i++) {
            int lc = 0;
            for (int j = 0; j < 5; j++) {
                if (Tkts[i][2][j] < 0) {
                    lc++;

                }

            }
            if (lc == 5 && hasNumInLines(i, 2)) {
                sb.append(Integer.toString(i + 1) + " ");
            }

        }
        if (sb.length() > 0) {
            // Toast.makeText(getApplicationContext(), "Tkts: " + msg + " Wins Third Line", Toast.LENGTH_LONG).show();
            // _l3 = false;
            // thrdLine = msg;
            setText("Tickets: " + sb + "Wins Third Line");
            createDialog(6, getText(), ttl, sb);
            thrdLine = sb.toString();
         /*  _upDates.append("Third Line:  ");
           _upDates.append(sb);
            _upDates.append("\n");*/

        }

    }

    // select the ticket for the 1st fullhouse  event
    public void fullHouseCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie Full House ";
        for (int i = _fr - 1; i < _to; i++) {
            int jc = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if (Tkts[i][j][k] < 0) {
                        jc++;
                    }
                }
            }
            if (jc == 15 && hasNumInTicket(i)) sb.append(Integer.toString(i + 1) + " ");

        }
        if (sb.length() > 0) {
            // Toast.makeText(getApplicationContext(), "Tkts: " + sb + " Wins First Full House", Toast.LENGTH_LONG).show();
            // _fh = false;
            //Log.i("Krishna", jaldi );
            // jaldi = sb.toString();
            setText("Tickets: " + sb + "Wins Full house");
            createDialog(7, getText(), ttl, sb);
            flHouse = sb.toString();
           /* _upDates.append("Full House:  ");
            _upDates.append(sb);
            _upDates.append("\n"); */

        }

    }

    // select the ticket for the 2nd FullHouse  event
    public void SecondfullHouseCount() {
        StringBuffer sb = new StringBuffer();
        String ttl = "Hoseie 2nd FullHouse ";
        for (int i = _fr - 1; i < _to; i++) {
            int jc = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    if (Tkts[i][j][k] < 0) {
                        jc++;
                    }
                }
            }
            if (jc == 15 && hasNumInTicket(i)) sb.append(Integer.toString(i + 1) + " ");

        }
        if (sb.length() > 0) {
            // Toast.makeText(getApplicationContext(), "Tkts: " + sb + " Wins Second Full House", Toast.LENGTH_LONG).show();
            // _fh2 = false;
            //Log.i("Krishna", fh2 );

            setText("Tickets: " + sb + "Wins Second full house");
            createDialog(8, getText(), ttl, sb);
            flHouse2 = sb.toString();
          /*  _upDates.append("2nd Full House:  ");
            _upDates.append(sb);
            _upDates.append("\n"); */
            //btnResult.setVisibility(View.VISIBLE);

        }
    }

    public void markNewArray(int digit) {
        int a, b, c;
        for (int n = formatFromTo(_fr - 1); n < formatFromTo(_to) + 1; n++) {
            a = NumAdresses[digit][n][0];
            b = NumAdresses[digit][n][1];
            c = NumAdresses[digit][n][2];
            // Tkts[a][b][c] = Tkts[a][b][c] * mark;
            Tkts[a][b][c] *= mark;

        }
    }

    int formatFromTo(int no) {
        int n;
        if (no < 6) {
            n = 0;
        } else {
            n = (no - 1) / 6;
        }
        return n;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("PlayGame Page") // TODO: Define a title for the content shown.
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

    @Override
    public void onBackPressed() {

    }

    public void copyKokaToTkts() {

        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 5; k++)
                    Tkts[i][j][k] = KokaTkts[i][j][k];

        }
    }

    public void copyLotoToTks() {
        for (int i = 0; i < 600; i++) {
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 5; k++)
                    Tkts[i][j][k] = LottoTickets[i][j][k];
        }
    }
    public void click(){
        mediaPlayer = MediaPlayer.create(this,R.raw.click_x);
        mediaPlayer.start();
        mediaPlayer.release();
        mediaPlayer= null;

    }
    private void mediaPlayerStop(){
        if(mediaPlayer !=null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }

}
