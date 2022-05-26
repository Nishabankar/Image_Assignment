package in.nisha.image_assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Picture extends Activity {
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private  int imageid1,imageid2,imageid3,imageid4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_layout);


        addImageView();
        initListener();
        extractInput();
    }
    private void extractInput(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();


        imageid1=bundle.getInt("img1");
        imageid2=bundle.getInt("img2");
        imageid3=bundle.getInt("img3");
        imageid4=bundle.getInt("img4");

        img1.setImageResource(imageid1);
        img2.setImageResource(imageid2);
        img3.setImageResource(imageid3);
        img4.setImageResource(imageid4);



    }
    private void addImageView(){
        img1=findViewById(R.id.imageid1);
        img2=findViewById(R.id.imageid2);
        img3=findViewById(R.id.imageid3);
        img4=findViewById(R.id.imageid4);
    }

    private void initListener(){
        img1.setOnClickListener(new SnackClick());
        img2.setOnClickListener(new DishClick());
        img3.setOnClickListener(new ColddrinkClick());
        img4.setOnClickListener(new HotdrinkClick());
    }

    private class SnackClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
         Intent resultIntent=new Intent();
         resultIntent.putExtra("result",imageid1);
         setResult(1,resultIntent);
         finish();
        }
    }

    private  class DishClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",imageid2);
            setResult(1,resultIntent);
            finish();

        }
    }

    private class ColddrinkClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",imageid3);
            setResult(1,resultIntent);
            finish();
        }
    }

    private class HotdrinkClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",imageid4);
            setResult(1,resultIntent);
            finish();

        }
    }


}
