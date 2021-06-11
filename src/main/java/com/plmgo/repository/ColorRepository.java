package com.plmgo.repository;

import com.plmgo.model.Color;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends MongoRepository<Color, ObjectId> {

}
