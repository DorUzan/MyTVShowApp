package com.animefanbase.mytvshowapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.animefanbase.mytvshowapp.repositories.MostPopularTVShowsRepository;
import com.animefanbase.mytvshowapp.responses.TVShowResponse;

public class MostPopularTVShowsViewModel  extends ViewModel {

    private MostPopularTVShowsRepository mostPopularTVShowsRepository;

    public MostPopularTVShowsViewModel(){

        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }

    public LiveData<TVShowResponse> getMostPopularTVShows(int page){

        return mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }

}
