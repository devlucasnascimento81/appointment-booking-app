package com.devlucasnascimento.agendador_horarios.service;

import com.devlucasnascimento.agendador_horarios.infrastructure.repository.AppointmentRepository;
import com.devlucasnascimento.agendador_horarios.infrastructure.repository.entity.AppointmentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentEntity saveAppointment(AppointmentEntity appointment) {
        //salva o agendamento, verificando se há disponibilidade...

        LocalDateTime appointmentTime = appointment.getDateTimeAppointment();
        LocalDateTime endTime = appointment.getDateTimeAppointment().plusHours(1);

        AppointmentEntity scheduled = appointmentRepository.findByserviceTypeAndDateTimeAppointmentBetween(appointment.getServiceType(),
                appointmentTime, endTime);


        if (Objects.nonNull(scheduled)) {
            throw new RuntimeException("Horario já preenchido");
        }
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(LocalDateTime appointmentDateTime, String client) {
        // deleta os agendamentos pela data e hora do cliente.

        appointmentRepository.deleteByDateTimeAppointmentAndClient(appointmentDateTime, client);
    }

    public AppointmentEntity getDayAppointment(LocalDate date) {
        //busca agendamentos diário.
        LocalDateTime firstDayTime = date.atStartOfDay();
        LocalDateTime lastDayTime = date.atTime(23, 59, 59);

        return appointmentRepository.findByDateTimeAppointmentBetween(firstDayTime, lastDayTime);
    }

    public AppointmentEntity updateAppointment(AppointmentEntity appointment, String client, LocalDateTime dateTimeAppointment) {
        //altera os agendamentos.
        AppointmentEntity schedule = appointmentRepository.findByDateTimeAppointmentAndClient(dateTimeAppointment, client);

        if (Objects.nonNull(schedule)) {
            throw new RuntimeException("Horario não está preenchido");
        }

        schedule.setId(schedule.getId());
        return appointmentRepository.save(appointment);
    }

}
