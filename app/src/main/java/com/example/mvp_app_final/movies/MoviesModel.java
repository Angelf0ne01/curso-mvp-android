package com.example.mvp_app_final.movies;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;

public class MoviesModel  implements  MoviesMVP.Model{
    private  MoviesRepository repository;

    public MoviesModel(MoviesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(repository.getResolverData(), repository.getCountryData(), new BiFunction<Result, String, ViewModel>() {
            @Override
            public ViewModel apply(Result result, String country)   {
                return new ViewModel(result.toString(),country);
            }
        });
    }
}
