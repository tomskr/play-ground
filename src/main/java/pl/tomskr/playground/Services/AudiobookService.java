package pl.tomskr.playground.Services;

import org.springframework.stereotype.Service;
import pl.tomskr.playground.Model.Audiobooks;
import pl.tomskr.playground.Repository.AudiobookRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AudiobookService {

    private AudiobookRepository audiobookRepository;

    public AudiobookService(AudiobookRepository audiobookRepository) {
        this.audiobookRepository = audiobookRepository;
        bootAudiobookDb();
    }

    public void bootAudiobookDb(){
        audiobookRepository.saveAll(Arrays.asList(
                new Audiobooks("Soulship","Nathan"),
                new Audiobooks("Western Hero", "HR"),
                new Audiobooks("ChallengerCall", "Nathan")
        ));
    }

    public Set<Audiobooks> getAudiobooks(){
        Set<Audiobooks> audiobooksSet = new HashSet<>();
        audiobookRepository.findAll().iterator().forEachRemaining(audiobooksSet::add);
        return audiobooksSet;
    }
}
