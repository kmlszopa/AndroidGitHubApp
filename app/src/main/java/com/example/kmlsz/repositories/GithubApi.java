package com.example.kmlsz.repositories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by kmlsz on 22.11.2016.
 */

public interface GithubApi {
    @GET("users/{user}/repos")
    Call<List<GithubRepository>> listRepositories(@Path("user") String user);
}
