package fr.lernejo.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TodoRepository implements CrudRepository<TodoEntity, Long> {

    @Override
    public <S extends TodoEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TodoEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TodoEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<TodoEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<TodoEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(TodoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TodoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
