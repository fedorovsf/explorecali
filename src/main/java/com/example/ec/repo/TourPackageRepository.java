package com.example.ec.repo;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(@Param("name") String name);

    @RestResource(exported = false)
    @Override
    <S extends TourPackage> S save(S entity);

    @RestResource(exported = false)
    @Override
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities);

    @RestResource(exported = false)
    @Override
    void deleteById(String s);

    @RestResource(exported = false)
    @Override
    void delete(TourPackage entity);

    @RestResource(exported = false)
    @Override
    void deleteAll(Iterable<? extends TourPackage> entities);

    @RestResource(exported = false)
    @Override
    void deleteAll();
}
