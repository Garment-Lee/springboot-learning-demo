package com.ligf.springboot.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Java对象序列化和反序列化工具类
 * @author garment
 *
 */
public class RedisObjectSerializer implements RedisSerializer<Object>{
	
	private Converter<Object, byte[]> serializer = new SerializingConverter();
	
	private Converter<byte[], Object> deserializer = new DeserializingConverter(); 
	
	private byte[] EMPTY_BYTE_ARRAY = new byte[0];

	@Override
	public byte[] serialize(Object t) throws SerializationException {
		// TODO Auto-generated method stub
		//序列化对象
		if (t == null) {
			return EMPTY_BYTE_ARRAY;
		}
		return serializer.convert(t);
	}

	@Override
	public Object deserialize(byte[] bytes) throws SerializationException {
		// TODO Auto-generated method stub
		//反序列化对象
		if (bytes == null || bytes.length == 0) {
			return null;
		}
		return deserializer.convert(bytes);
	}

}
