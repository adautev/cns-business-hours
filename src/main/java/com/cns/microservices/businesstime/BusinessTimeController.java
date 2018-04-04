package com.cns.microservices.businesstime;
import com.cns.microservices.businesstime.dto.BusinessTimeValidationRequest;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.dhatim.businesshours.BusinessHours;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class BusinessTimeController {
    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)

    public boolean ValidateBusinessTimeSlot(@JsonSerialize(using = LocalDateTimeSerializer.class)
                                            @RequestBody
                                            BusinessTimeValidationRequest date) {
        BusinessHours validator = new BusinessHours(date.businessTimeDefinition);
        return validator.isOpen(date.date);
    }
}
