package com.example.kmlsz.repositories;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRepoList;
    private RepositoriesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new RepositoriesAdapter();
        List<GitHubRepository> repos = new LinkedList<>();

        GitHubRepository r1 = new GitHubRepository();
        r1.setName("Repo 1");
        repos.add(r1);

        r1 = new GitHubRepository();
        r1.setName("Repo 2");
        repos.add(r1);
        mAdapter.setmData(repos);

        mRepoList = (RecyclerView) findViewById(R.id.activity_main);
        mRepoList.setLayoutManager(new LinearLayoutManager(this));
        mRepoList.setAdapter(mAdapter);


    }
}
