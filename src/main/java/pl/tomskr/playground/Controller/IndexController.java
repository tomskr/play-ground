package pl.tomskr.playground.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.playground.Model.Audiobooks;
import pl.tomskr.playground.Services.AudiobookService;

import java.util.Set;

@RestController
public class IndexController {

    private final AudiobookService audiobookService;

    public IndexController(AudiobookService audiobookService) {
        this.audiobookService = audiobookService;
    }

    @RequestMapping({"","/","index"})
    public Set<Audiobooks> indexPage(){
        return audiobookService.getAudiobooks();
    }
}
