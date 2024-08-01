package com.example.bug.common;


import org.springframework.http.HttpStatus;

import com.example.bug.common.CoreModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class ResponseModel extends CoreModel{
	
	private HttpStatus statusCode;
	private String title;
	private String description;
	private String assignedTo;
	private String status;
    private String priority;


}
