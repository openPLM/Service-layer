package com.plmgo.model;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Document(collection = "colors")
public record Color(ObjectId _id, String name, String hexValue, Date createdOn, Date modifiedOn) {}
