package com.itvdn.lesson7.services;

import com.itvdn.lesson7.dto.RequestBodyDTO;
import com.itvdn.lesson7.dto.RequestBodyResponse;
import org.springframework.stereotype.Service;

@Service
public class RequestBodyService {

    public RequestBodyResponse doSmth(RequestBodyDTO requestBodyDTO) {
        String nameWithId = requestBodyDTO.getName() + requestBodyDTO.getId();
        return new RequestBodyResponse(nameWithId);
    }
}
