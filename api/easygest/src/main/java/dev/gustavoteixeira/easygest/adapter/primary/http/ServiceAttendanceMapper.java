package dev.gustavoteixeira.easygest.adapter.primary.http;

import dev.gustavoteixeira.easygest.model.serviceattendance.ServiceAttendance;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface ServiceAttendanceMapper {

    ServiceAttendance toServiceAttendance(ServiceAttendanceDto serviceAttendanceDto);

}
