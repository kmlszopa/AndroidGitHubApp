package com.example.kmlsz.repositories;

/**
 * Created by kmlsz on 21.11.2016.
 */

public class GithubRepository {
    private long id;
    private String name;
    private String htmlUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

}
