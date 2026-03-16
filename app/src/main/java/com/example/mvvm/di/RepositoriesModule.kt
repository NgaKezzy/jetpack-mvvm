//package com.example.mvvm.di
//
//import com.example.mvvm.domain.repository.MainLog
//import com.example.mvvm.data.repository.MainLogImpl
//import com.example.mvvm.domain.repository.Store
//import com.example.mvvm.data.repository.StoreImpl
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//abstract class RepositoriesModule {
//    @Binds
//    @Singleton
//    abstract  fun  bindMainLog(mainLogImpl: MainLogImpl): MainLog
//
//      @Binds
//    @Singleton
//    abstract  fun  bindStore(storeImpl: StoreImpl): Store
//}