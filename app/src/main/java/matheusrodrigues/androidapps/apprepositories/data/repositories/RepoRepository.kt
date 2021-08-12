package matheusrodrigues.androidapps.apprepositories.data.repositories

import kotlinx.coroutines.flow.Flow
import matheusrodrigues.androidapps.apprepositories.data.model.Repo

interface RepoRepository {

    suspend fun listRepositories(user: String): Flow<List<Repo>>
}