package com.af.carrsvt.mapper;

import com.af.carrsvt.dto.ReservationDto;
import com.af.carrsvt.entity.Reservation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T00:53:52+0700",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDto reservationToReservationDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDto reservationDto = new ReservationDto();

        reservationDto.setReservationId( reservation.getReservationId() );
        reservationDto.setCustomerId( reservation.getCustomerId() );
        reservationDto.setVehicleId( reservation.getVehicleId() );
        reservationDto.setPickupTime( reservation.getPickupTime() );
        reservationDto.setPickupLocation( reservation.getPickupLocation() );
        reservationDto.setDropoffLocation( reservation.getDropoffLocation() );
        reservationDto.setStatus( reservation.getStatus() );

        return reservationDto;
    }

    @Override
    public Reservation reservationDtoTReservation(ReservationDto reservationDto) {
        if ( reservationDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setReservationId( reservationDto.getReservationId() );
        reservation.setCustomerId( reservationDto.getCustomerId() );
        reservation.setVehicleId( reservationDto.getVehicleId() );
        reservation.setPickupTime( reservationDto.getPickupTime() );
        reservation.setPickupLocation( reservationDto.getPickupLocation() );
        reservation.setDropoffLocation( reservationDto.getDropoffLocation() );
        reservation.setStatus( reservationDto.getStatus() );

        return reservation;
    }
}
