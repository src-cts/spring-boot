package com.cts.poc.microservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.poc.microservice.dto.DeleteObject;
import com.cts.poc.microservice.dto.GetObject;
import com.cts.poc.microservice.dto.PostObject;
import com.cts.poc.microservice.dto.PutObject;

@RestController
@RequestMapping(value = "/poc/api")
public class MicroserviceController {

	@RequestMapping(value = "/getobject", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GetObject getObjects(@RequestParam(name = "message", required = false) String messageQueryParam) {

		if (null != messageQueryParam) {
			return new GetObject(messageQueryParam);
		}
		return new GetObject("Get object invoked");
	}

	@RequestMapping(value = "/postobject", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostObject postObjects(@RequestBody(required = false) PostObject postObjBodyParam) {
		PostObject postLocalObj = new PostObject();
		if (postObjBodyParam != null && postObjBodyParam.getMessage() != null) {
			postLocalObj.setMessage(postObjBodyParam.getMessage());
			postLocalObj.setMethodType(postObjBodyParam.getMethodType());
			return postLocalObj;
		}

		postLocalObj.setMessage("Post object invoked");
		return postLocalObj;
	}

	@RequestMapping(value = "/putobject", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public PutObject putObjects(@PathVariable(name = "message") String messageObjPathParam) {
		if (null != messageObjPathParam) {
			return new PutObject(messageObjPathParam);
		}
		return new PutObject("Put object invoked");
	}

	@RequestMapping(value = "/deleteobject", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public DeleteObject deleteObjects(@RequestHeader(name = "message", required = false) String messageObjHeaderParam) {
		if (null != messageObjHeaderParam) {
			return new DeleteObject(messageObjHeaderParam);
		}
		return new DeleteObject("Delete object invoked");
	}

}
