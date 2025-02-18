package com.ontimize.tuppereats.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IProductAllergicService {

	// PRODUCT Allergic
		public EntityResult productAllergicQuery(Map<String, Object> keyMap, List<String> attrList)
				throws OntimizeJEERuntimeException;

		public EntityResult productAllergicInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

		public EntityResult productAllergicUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
				throws OntimizeJEERuntimeException;

		public EntityResult productAllergicDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
