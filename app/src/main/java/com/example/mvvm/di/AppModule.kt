//package com.example.mvvm.di
//
//import android.app.Application
//import android.content.Context
//import android.content.SharedPreferences
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//class AppModule {
//    @Singleton
//    @Provides
//    fun  providerSharedPreferences(@ApplicationContext context: Context): SharedPreferences{
//        return  context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
//    }
//}