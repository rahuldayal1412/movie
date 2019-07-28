package com.example.android.movie.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android.movie.Models.Movie;
import com.example.android.movie.DetailsActivity;
import com.example.android.movie.R;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.android.movie.Utils.Constants.SELECTED_MOVIE_TO_SEE_DETAILS;

public class CustomMoviesAdapter extends RecyclerView.Adapter<CustomMovieViewHolder> implements RecyclerViewClickListener {

    private List<Movie> dataList;
    private Context context;
    private RecyclerViewClickListener mListener;

    public CustomMoviesAdapter(Context context, List<Movie> dataList, RecyclerView recyclerView) {
        this.context = context;
        this.dataList = dataList;
        this.mListener = this;

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
    }

    @NonNull
    @Override
    public CustomMovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid_movie_item, parent, false);
        return new CustomMovieViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomMovieViewHolder holder, int position) {
        holder.bindMovie(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void setData(List<Movie> movies) {
        this.dataList = movies;
        notifyDataSetChanged();
    }

    public void clear() {
        this.dataList.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<Movie> movies) {
        this.dataList.addAll(movies);
        notifyDataSetChanged();
    }


    @Override
    public void onClick(View view, int position) {
        Movie movie = dataList.get(position);
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(SELECTED_MOVIE_TO_SEE_DETAILS, movie);
        context.startActivity(intent);
    }
}

