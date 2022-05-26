package in.nisha.image_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView androidimage;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private int result;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
        initListeners();
    }

        private void addViews()
        {
            androidimage = findViewById(R.id.androidimage);
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
        }




    private void initListeners()
    {
        button1.setOnClickListener(new BtnsnackListener());
        button2.setOnClickListener(new BtndishListener());
        button3.setOnClickListener(new BtncolddrinkListener());
        button4.setOnClickListener(new BtnhotdrinkListener());


    }

     private class BtnsnackListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent intentobj = new Intent(MainActivity.this, Picture.class);
            intentobj.putExtra("img1",R.drawable.snack1);
            intentobj.putExtra("img2",R.drawable.snack2);
            intentobj.putExtra("img3",R.drawable.snack3);
            intentobj.putExtra("img4",R.drawable.snack4);

//            startActivity(intentobj);
             startActivityForResult(intentobj,1);

        }
    }

       private class BtndishListener implements View.OnClickListener {

            @Override
            public void onClick(View v)
            {
                Intent intentobj = new Intent(MainActivity.this, Picture.class);

                intentobj.putExtra("img1",R.drawable.dish1);
                intentobj.putExtra("img2",R.drawable.dish2);
                intentobj.putExtra("img3",R.drawable.dish3);
                intentobj.putExtra("img4",R.drawable.dish4);

//                startActivity(intentobj);
                startActivityForResult(intentobj,1);


            }
    }

        private class BtncolddrinkListener implements View.OnClickListener {

            @Override
            public void onClick(View v) {


                Intent intentobj = new Intent(MainActivity.this, Picture.class);
                intentobj.putExtra("img1",R.drawable.colddrink1);
                intentobj.putExtra("img2",R.drawable.colddrink2);
                intentobj.putExtra("img3",R.drawable.colddrink3);
                intentobj.putExtra("img4",R.drawable.colddrink4);

//                startActivity(intentobj);
                startActivityForResult(intentobj,1);



            }
        }


         private class BtnhotdrinkListener implements View.OnClickListener {

            @Override
            public void onClick(View v) {

                Intent intentobj = new Intent(MainActivity.this, Picture.class);
                intentobj.putExtra("img1",R.drawable.hotdrink1);
                intentobj.putExtra("img2",R.drawable.hotdrink2);
                intentobj.putExtra("img3",R.drawable.hotdrink3);
                intentobj.putExtra("img4",R.drawable.hotdrink4);

//                startActivity(intentobj);
                startActivityForResult(intentobj,1);



            }


        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data==null)
        {
            return;
        }
        Bundle bundle = data.getExtras();
        result=bundle.getInt("result");
        androidimage.setImageResource(result);
    }
}


