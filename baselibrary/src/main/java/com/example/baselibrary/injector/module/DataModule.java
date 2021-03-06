package com.example.baselibrary.injector.module;

import android.content.Context;
import android.content.SharedPreferences;


import com.example.baselibrary.injector.scope.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZQ on 2017/2/8.
 */
@Module
public class DataModule {
    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(@ForApplication Context context) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }
}
