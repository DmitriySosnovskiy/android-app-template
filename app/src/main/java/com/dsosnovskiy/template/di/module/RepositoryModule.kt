package com.dsosnovskiy.template.di.module

import com.dsosnovskiy.template.data.IRepository
import com.dsosnovskiy.template.data.RepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, LocalDataModule::class])
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideRepository(repository: RepositoryImpl): IRepository
}