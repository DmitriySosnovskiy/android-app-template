package com.dsosnovskiy.template

import okhttp3.mockwebserver.MockWebServer
import javax.inject.Inject

class BaseTest {

    lateinit var mockedServer: MockWebServer

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


}