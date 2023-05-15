package cn.leo.basic.common.request_util.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController<E, ID> {

    ResponseEntity<E> one(ID id);


    ResponseEntity<CollectionModel<EntityModel<E>>> all();


    ResponseEntity<?> delete(ID id);


    ResponseEntity<?> update(ID id, E entity);


    ResponseEntity<?> save(E entity);
}
