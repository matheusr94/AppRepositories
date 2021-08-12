package matheusrodrigues.androidapps.apprepositories.data.repositories

import kotlinx.coroutines.flow.flow
import matheusrodrigues.androidapps.apprepositories.data.model.Repo
import matheusrodrigues.androidapps.apprepositories.data.services.GitHubService

class RepoRepositoriesImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)

    }
}