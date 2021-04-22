package com.example.mvp_app_final.movies;


import com.example.mvp_app_final.http.apimodel.Result;

import io.reactivex.rxjava3.core.Observable;

public interface MoviesRepository {

    Observable<Result> getResolverData();

    Observable<String> getCountryData();
}
