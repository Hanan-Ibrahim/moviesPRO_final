package com.example.amjad.moviespro;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;

public class SingleItemView extends Activity {
    String id;
    String title;
    String vote_average;
    String m_image;
    String overview;
    String release_date;
    String revenue;
    String genres;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollviewww);
        Intent i = getIntent();
        id = i.getStringExtra("id");
        title = i.getStringExtra("title");
        vote_average = i.getStringExtra("vote_average");
        m_image = i.getStringExtra("m_image");
        overview = i.getStringExtra("overview");
        release_date = i.getStringExtra("release_date");
        revenue = i.getStringExtra("revenue");
        genres = i.getStringExtra("genres");

        TextView txttitle = (TextView) findViewById(R.id.title);
        TextView txtrelease_date = (TextView) findViewById(R.id.release_date);
        TextView txtoverview = (TextView) findViewById(R.id.overview);
        TextView revenue = (TextView) findViewById(R.id.revenue);
       // TextView genres = (TextView) findViewById(R.id.genres);
        ImageView imgflag = (ImageView) findViewById(R.id.ivImage);


        imgflag.setImageResource(R.drawable.ic_launcher);
        //  new DownloadImageTask(imgflag).execute(m_image);
        Picasso.with(this).load(m_image).into(imgflag);


        txttitle.setText(title);
        txtrelease_date.setText(vote_average);
        txtoverview.setText("Overview : " + overview);
        txtrelease_date.setText("Release Date: " + release_date);
       // revenue.setText("Revenue: "+revenue);

    }
}
//
//private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
//    ImageView bmImage;

//    public DownloadImageTask(ImageView bmImage) {
//        this.bmImage = bmImage;
//    }
//
//    protected Bitmap doInBackground(String... urls) {
//        String urldisplay = urls[0];
//        Bitmap mIcon11 = null;
//        try {
//            InputStream in = new java.net.URL(urldisplay).openStream();
//            mIcon11 = BitmapFactory.decodeStream(in);
//        } catch (Exception e) {
//            //  Log.e("Error", e.getMessage());
//            e.printStackTrace();
//        }
//        return mIcon11;
//    }
//
//    protected void onPostExecute(Bitmap result) {
//        bmImage.setImageBitmap(result);
//    }
//
//}
//}



