package com.webTOCFL.jpautil;

import javax.persistence.AttributeConverter;

import com.webTOCFL.entities.Part;


public class PartTypeConverter implements AttributeConverter<Part, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Part part) {
		return part.getValue();
	}

	@Override
	public Part convertToEntityAttribute(Integer value) {
		for (Part type : Part.values()) {
			if (type.getValue() == value) {
				return type;
			}
		}
		throw new IllegalArgumentException(" Illegal tagType value exception.");
	}

}
