package com.dsosnovskiy.template.di.component

import com.dsosnovskiy.template.di.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface AppComponent {

}