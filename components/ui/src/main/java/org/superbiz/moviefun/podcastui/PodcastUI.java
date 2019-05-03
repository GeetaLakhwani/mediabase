package org.superbiz.moviefun.podcastui;


<<<<<<< HEAD:components/ui/src/main/java/org/superbiz/moviefun/podcastsui/PodcastUI.java
public class PodcastUI implements Serializable {
=======




public class PodcastUI  {
>>>>>>> 4b51944f9d620e9ca7fc8b26d77e8b731d1244cc:components/ui/src/main/java/org/superbiz/moviefun/podcastui/PodcastUI.java

    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private String url;

    private Long id;

    public PodcastUI() {
    }

    public PodcastUI(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
