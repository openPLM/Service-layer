package com.plmgo.repository;

import com.plmgo.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ColorRepository  extends MongoRepository<Color, String> {
}
