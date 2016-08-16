package com.example.amjad.moviespro;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
  Button search,nowploaying ,toprated;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        search = (Button)findViewById(R.id.search_btn);
        nowploaying = (Button)findViewById(R.id.topviews_btn);
        toprated = (Button)findViewById(R.id.toprated_btn);
    }
    public void topRated (View view) {
            Intent intent = new Intent(MainActivity.this, TopRated.class);
            startActivity(intent);
        }
    public void topViews (View view) {
        Intent intent = new Intent(MainActivity.this, NowPlaying.class);
        startActivity(intent);
    }

    public void search (View view){
        Intent intent= new Intent(this,Search.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra("ex", message);
        startActivity(intent);
    }


}