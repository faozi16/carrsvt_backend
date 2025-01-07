package com.af.carrsvt.mapper;

import com.af.carrsvt.dto.ReservationDto;
import com.af.carrsvt.entity.Reservation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-06T17:28:31+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDto reservationToReservationDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDto reservationDto = new ReservationDto();

        reservationDto.setCustomerId( reservation.getCustomerId() );
        reservationDto.setDropoffLocation( reservation.getDropoffLocation() );
        reservationDto.setPickupLocation( reservation.getPickupLocation() );
        reservationDto.setPickupTime( reservation.getPickupTime() );
        reservationDto.setReservationId( reservation.getReservationId() );
        reservationDto.setStatus( reservation.getStatus() );
        reservationDto.setVehicleId( reservation.getVehicleId() );

        return reservationDto;
    }

    @Override
    public Reservation reservationDtoTReservation(ReservationDto reservationDto) {
        if ( reservationDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setCustomerId( reservationDto.getCustomerId() );
        reservation.setDropoffLocation( reservationDto.getDropoffLocation() );
        reservation.setPickupLocation( reservationDto.getPickupLocation() );
        reservation.setPickupTime( reservationDto.getPickupTime() );
        reservation.setReservationId( reservationDto.getReservationId() );
        reservation.setStatus( reservationDto.getStatus() );
        reservation.setVehicleId( reservationDto.getVehicleId() );

        return reservation;
    }
}
