package com.example.amjad.moviespro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends Activity {
    String id;
    String title;
    String vote_average;
    String m_image;
    String position;
   // String url = "http://image.tmdb.org/t/p/w780"+m_image;
    //ImageLoader imageLoader = new ImageLoader(this);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item_view);
        Intent i = getIntent();
        id = i.getStringExtra("id");
        title = i.getStringExtra("title");
        vote_average = i.getStringExtra("vote_average");
        m_image = i.getStringExtra("poster_path");
        
        TextView txtid = (TextView) findViewById(R.id.id);
        TextView txttitle = (TextView) findViewById(R.id.title);
        TextView txtvote_average = (TextView) findViewById(R.id.vote_average);
        ImageView imgflag = (ImageView) findViewById(R.id.ivImage);

        Movies movies = new Movies();
        imgflag.setImageResource(R.mipmap.ic_launcher);
        DownloadImage downloadImage = (DownloadImage) new DownloadImage(imgflag).execute(movies.get_M_image());
        txtid.setText(id);
        txttitle.setText(title);
        txtvote_average.setText(vote_average);


    }
}