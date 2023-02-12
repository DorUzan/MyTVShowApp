package com.animefanbase.mytvshowapp.listeners;

import com.animefanbase.mytvshowapp.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist (TVShow tvShow, int position);

}
