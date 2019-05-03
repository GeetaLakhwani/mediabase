package org.superbiz.moviefun.podcasts;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PodcastRepository extends CrudRepository<Podcast, Long> {
    Optional<Podcast> findById(Long id);

<<<<<<< HEAD:components/podcasts/src/main/java/org/superbiz/moviefun/podcasts/PodcastRepository.java



=======
>>>>>>> 4b51944f9d620e9ca7fc8b26d77e8b731d1244cc:components/podcasts/src/main/java/org/superbiz/moviefun/podcast/PodcastRepository.java
}
