package com.example.testappcaw.di // Correct package!

import android.content.Context
import androidx.room.Room
import com.example.testappcaw.db.AppDatabase
import com.example.testappcaw.db.TaskDao
import com.example.testappcaw.util.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "testappcaw_database"
        ).build()
    }

    @Provides
    fun provideUserDao(appDatabase: AppDatabase): TaskDao {
        return appDatabase.taskDao()
    }

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }


}