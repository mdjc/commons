package com.github.mdjc.commons.json;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {
	@Override
	public void serialize(LocalDate date, JsonGenerator generator, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		generator.writeString(date.toString());
	}
}