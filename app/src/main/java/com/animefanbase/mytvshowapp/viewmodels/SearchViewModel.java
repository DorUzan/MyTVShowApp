package com.animefanbase.mytvshowapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.animefanbase.mytvshowapp.repositories.SearchTVShowRepository;
import com.animefanbase.mytvshowapp.responses.TVShowResponse;

public class SearchViewModel extends ViewModel {

    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel(){
        searchTVShowRepository = new SearchTVShowRepository();

    }

    public LiveData<TVShowResponse> searchTVShow(String query, int page){
        return searchTVShowRepository.searchTVShow(query, page);
    }
}
