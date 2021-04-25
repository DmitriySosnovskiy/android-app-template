package com.dsosnovskiy.template.data

import com.dsosnovskiy.template.data.local.preferences.PrefManager
import com.dsosnovskiy.template.data.remote.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    val api: ApiService,
    val local: PrefManager
) : IRepository {

}