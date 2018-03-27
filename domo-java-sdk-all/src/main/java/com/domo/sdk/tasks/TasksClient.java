package com.domo.sdk.tasks;

import com.domo.sdk.request.RequestException;
import com.domo.sdk.request.Transport;
import com.domo.sdk.request.UrlBuilder;
import com.domo.sdk.tasks.model.Project;
import com.google.gson.reflect.TypeToken;
import okhttp3.HttpUrl;

import java.util.Collection;
import java.util.List;

public class TasksClient {
    private final UrlBuilder urlBuilder;
    private final Transport transport;
    private static final String URL_BASE = "v1/projects";

    public TasksClient(UrlBuilder urlBuilder, Transport transport) {
        this.urlBuilder = urlBuilder;
        this.transport = transport;
    }

    public List<Project> listProjects(int limit, int offset) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addQueryParameter("limit", Integer.toString(limit))
                .addQueryParameter("offset", Integer.toString(offset))
                .build();

        return transport.getJson(url, new TypeToken<List<Project>>() {
        }.getType());
    }

    public Project getPersonalProject() {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment("me")
                .build();

        return transport.getJson(url, Project.class);
    }

    public Project getProject(String id) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment(id)
                .build();

        try {
            return transport.getJson(url, Project.class);
        } catch (RequestException e) {
            if (e.getStatusCode() == 404) {
                return null;
            }

            throw e;
        }
    }

    public Project createProject(Project proj) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .build();

        return transport.postJson(url, proj, Project.class);
    }

    public Project updateProject(String id, Project proj) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment(id)
                .build();

        return transport.putJson(url, proj, Project.class);
    }

    public void deleteProject(String id) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment(id)
                .build();

        transport.deleteJson(url);
    }

    public Collection<Long> getProjectMembers(String id) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment(id)
                .addPathSegment("members")
                .build();

        return transport.getJson(url, new TypeToken<List<Long>>(){}.getType());
    }

    public void setProjectMembers(String id, Collection<Long> userIds) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment(id)
                .addPathSegment("members")
                .build();

        transport.putJson(url, userIds);
    }
}