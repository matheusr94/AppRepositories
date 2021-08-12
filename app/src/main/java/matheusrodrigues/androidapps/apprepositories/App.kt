package matheusrodrigues.androidapps.apprepositories

import android.app.Application
import matheusrodrigues.androidapps.apprepositories.data.di.DataModule
import matheusrodrigues.androidapps.apprepositories.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
    }
}