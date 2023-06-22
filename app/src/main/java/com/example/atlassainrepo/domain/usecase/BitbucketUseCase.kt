package com.example.atlassainrepo.domain.usecase

import com.example.atlassainrepo.common.Resource
import com.example.atlassainrepo.data.mappers.toMapRepo
import com.example.atlassainrepo.domain.model.BitbucketRepoList
import com.example.atlassainrepo.domain.repository.BitbucketRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class BitbucketUseCase @Inject constructor (
    private val bitbucketRepository: BitbucketRepository

) {

   operator fun invoke(): Flow<Resource<List<BitbucketRepoList>>> = flow {
       try {
           emit(Resource.Loading<List<BitbucketRepoList>>())
         val repository = bitbucketRepository.getBitbucketRepositoryList().values.map { it.toMapRepo() }

         emit(Resource.Success<List<BitbucketRepoList>>(repository))

       }catch (e:HttpException){
           emit(Resource.Error<List<BitbucketRepoList>>(e.localizedMessage ?: "An unexpected error occured"))
       }
       catch (e:IOException){
           emit(Resource.Error<List<BitbucketRepoList>>("Couldn't reach server. Check your internet connection."))
       }
   }

}
