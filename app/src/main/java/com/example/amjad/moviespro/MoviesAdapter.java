package com.example.amjad.moviespro;


import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
public class MoviesAdapter extends ArrayAdapter<Movies> {
    ArrayList<Movies> movieList;
    LayoutInflater vi;
    int Resource;
    ViewHolder holder;

    public MoviesAdapter(Context context, int resource, ArrayList<Movies> objects) {
        super(context, resource, objects);
        vi = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Resource = resource;
        movieList = objects;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            holder = new ViewHolder();
            v = vi.inflate(Resource, null);
            holder.m_image = (ImageView) v.findViewById(R.id.ivImage);
            holder.title = (TextView) v.findViewById(R.id.title);
            holder.id = (TextView) v.findViewById(R.id.id);
            holder.vote_average = (TextView) v.findViewById(R.id.vote_average);
            holder.revenue=(TextView) v.findViewById(R.id.revenue);
            holder.genres=(TextView) v.findViewById(R.id.genres);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.m_image.setImageResource(R.mipmap.ic_launcher);
      //  new DownloadImageTask(holder.m_image).execute(movieList.get(position).getM_image());
        Picasso.with(this.getContext())
                .load(movieList.get(position).getM_image())
                .into(holder.m_image);


        holder.title.setText("Title :"+movieList.get(position).getTitle());
        holder.id.setText("ID : "+movieList.get(position).getId());
        holder.vote_average.setText("vote: " + movieList.get(position).getVote_average());
    //    holder.revenue.setText("revenue : "+movieList.get(position).getRevenue());
//        holder.genres.setText("genres: "+movieList.get(position).getGenres());
//        holder.release_date.setText("release date: "+movieList.get(position).getRelease_date());
        return v;

    }

    static class ViewHolder {
        public ImageView m_image;
        public TextView title;
        public TextView id;
        public TextView vote_average;
        public TextView overview;
        public TextView release_date;
        public TextView revenue;
        public TextView genres;


    }

//    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
//        ImageView bmImage;
//
//        public DownloadImageTask(ImageView bmImage) {
//            this.bmImage = bmImage;
//        }
//
//        protected Bitmap doInBackground(String... urls) {
//            String urldisplay = urls[0];
//            Bitmap mIcon11 = null;
//            try {
//                InputStream in = new java.net.URL(urldisplay).openStream();
//                mIcon11 = BitmapFactory.decodeStream(in);
//            } catch (Exception e) {
//              //  Log.e("Error", e.getMessage());
//                e.printStackTrace();
//            }
//            return mIcon11;
//        }
//
//        protected void onPostExecute(Bitmap result) {
//            bmImage.setImageBitmap(result);
//        }
//
//    }
}