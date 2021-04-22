package com.example.mvp_app_final.root;

import com.example.mvp_app_final.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ApplicationModule.class})
public interface ApplicationComponent {
        void inject(MainActivity target);
}
