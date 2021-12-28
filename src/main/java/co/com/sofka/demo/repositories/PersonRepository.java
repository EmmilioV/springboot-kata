package co.com.sofka.demo.repositories;

import co.com.sofka.demo.entities.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
    Mono<Person> findByName(String name);
}
