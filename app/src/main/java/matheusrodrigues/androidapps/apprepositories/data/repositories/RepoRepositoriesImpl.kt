package matheusrodrigues.androidapps.apprepositories.data.repositories

import kotlinx.coroutines.flow.flow
import matheusrodrigues.androidapps.apprepositories.core.RemoteException
import matheusrodrigues.androidapps.apprepositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoriesImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException){
            throw RemoteException(ex.message?: "Não foi possível fazer sua pesquisa no momento!")

        }


    }
}