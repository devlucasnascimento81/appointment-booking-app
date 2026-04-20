package com.devlucasnascimento.agendador_horarios.infrastructure.repository;

import com.devlucasnascimento.agendador_horarios.infrastructure.repository.entity.AppointmentEntity;
import com.devlucasnascimento.agendador_horarios.service.AppointmentService;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

    AppointmentEntity findByserviceTypeAndDateTimeAppointmentBetween(String service, LocalDateTime startDateTime, LocalDateTime endDateTime);

    @Transactional
    void deleteByDateTimeAppointmentAndClient(LocalDateTime dateTimeAppointment, String client);

    AppointmentEntity findByDateTimeAppointmentBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    AppointmentEntity findByDateTimeAppointmentAndClient(LocalDateTime dateTimeAppointment, String client);
}
