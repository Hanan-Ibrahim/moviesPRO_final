package com.example.amjad.moviespro;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class SingleItemView extends Activity {
    String id;
    String title;
    String vote_average;
    String m_image;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item_view);
        Intent i = getIntent();
        id = i.getStringExtra("id");
        title = i.getStringExtra("title");
        vote_average = i.getStringExtra("vote_average");
        m_image = i.getStringExtra("m_image");
        
        TextView txtid = (TextView) findViewById(R.id.id);
        TextView txttitle = (TextView) findViewById(R.id.title);
        TextView txtvote_average = (TextView) findViewById(R.id.vote_average);
        ImageView imgflag = (ImageView) findViewById(R.id.ivImage);


        imgflag.setImageResource(R.drawable.ic_launcher);
        new DownloadImageTask(imgflag).execute(m_image);
        txtid.setText(id);
        txttitle.setText(title);
        txtvote_average.setText(vote_average);


    }


private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    ImageView bmImage;

    public DownloadImageTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            //  Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        bmImage.setImageBitmap(result);
    }

}
}