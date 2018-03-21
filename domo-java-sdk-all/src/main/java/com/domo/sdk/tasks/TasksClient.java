package com.domo.sdk.tasks;

import com.domo.sdk.request.Transport;
import com.domo.sdk.request.UrlBuilder;
import com.domo.sdk.tasks.model.Project;
import com.google.gson.reflect.TypeToken;
import okhttp3.HttpUrl;

import java.util.List;

public class TasksClient {
    private final UrlBuilder urlBuilder;
    private final Transport transport;
    private static final String URL_BASE ="v1/projects";

    public TasksClient(UrlBuilder urlBuilder, Transport transport) {
        this.urlBuilder = urlBuilder;
        this.transport = transport;
    }

    public List<Project> listProjects(int limit, int offset) {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addQueryParameter("limit", Integer.toString(limit))
                .addQueryParameter("offset", Integer.toString(offset))
                .build();

        return transport.getJson(url, new TypeToken<List<Project>>(){}.getType());
    }

    public Project getPersonalProject() {
        HttpUrl url = urlBuilder.fromPathSegments(URL_BASE)
                .addPathSegment("me")
                .build();

        return transport.getJson(url, Project.class);
    }
}
