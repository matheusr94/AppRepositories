package matheusrodrigues.androidapps.apprepositories.domain

import kotlinx.coroutines.flow.Flow
import matheusrodrigues.androidapps.apprepositories.core.UseCase
import matheusrodrigues.androidapps.apprepositories.data.model.Repo
import matheusrodrigues.androidapps.apprepositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}