package com.animefanbase.mytvshowapp.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.animefanbase.mytvshowapp.utilities.database.TVShowDatabase;
import com.animefanbase.mytvshowapp.models.TVShow;
import com.animefanbase.mytvshowapp.repositories.TVShowDetailsRepository;
import com.animefanbase.mytvshowapp.responses.TVShowDetailsResponse;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class TVShowDetailsViewModel extends AndroidViewModel {

    private TVShowDetailsRepository tvShowDetailsRepository;
    private TVShowDatabase tvShowDatabase;

    public  TVShowDetailsViewModel(@NonNull Application application){
        super(application);
        tvShowDetailsRepository = new TVShowDetailsRepository();
        tvShowDatabase = TVShowDatabase.getTvShowDatabase(application);

    }

    public LiveData<TVShowDetailsResponse> getTVShowDetails(String tvShowId) {
        return tvShowDetailsRepository.getTVShowDetails(tvShowId);

    }

    public Completable addToWatchlist(TVShow tvShow){
        return tvShowDatabase.tvShowDao().addToWatchlist(tvShow);
    }

    public Flowable<TVShow> getTCShowFromWatchlist(String tvShowId) {
        return tvShowDatabase.tvShowDao().getTVShowFromWatchlist(tvShowId);
    }

    public Completable removeTVShowFromWatchlist(TVShow tvShow) {
        return tvShowDatabase.tvShowDao().removeFromWatchlist(tvShow);
    }
}
