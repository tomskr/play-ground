package pl.tomskr.playground.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tomskr.playground.Model.Audiobooks;

@Repository
public interface AudiobookRepository extends CrudRepository<Audiobooks, Long> {
}
