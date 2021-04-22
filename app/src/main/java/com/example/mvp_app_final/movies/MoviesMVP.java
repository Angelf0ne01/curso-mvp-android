package com.example.mvp_app_final.movies;


import io.reactivex.rxjava3.core.Observable;
import com.example.mvp_app_final.movies.ViewModel;
public interface MoviesMVP {

    interface View{
        void updateData(ViewModel viewModel);

        void showSnackBar(String s);
    }

    interface Presenter{

        void loadData();

        void rxJavaUnsuscribe();

        void setView(MoviesMVP.View view);


    }

    interface Model{
        Observable<ViewModel> result();
    }
}
