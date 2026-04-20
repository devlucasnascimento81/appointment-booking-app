package com.devlucasnascimento.agendador_horarios.controller;

import com.devlucasnascimento.agendador_horarios.infrastructure.repository.entity.AppointmentEntity;
import com.devlucasnascimento.agendador_horarios.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<AppointmentEntity> appointmentSave(@RequestBody AppointmentEntity appointment) {
        return ResponseEntity.accepted().body(appointmentService.saveAppointment(appointment));
    }

    @DeleteMapping
    public ResponseEntity<Void> appointmentDelete(@RequestParam String client, @RequestParam LocalDateTime localDateTime){

        appointmentService.deleteAppointment(localDateTime, client);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<AppointmentEntity> getDayAppointment(@RequestParam LocalDate date){
        return ResponseEntity.ok().body(appointmentService.getDayAppointment(date));
    }

    @PutMapping
    public ResponseEntity<AppointmentEntity> updateAppoitment(@RequestBody AppointmentEntity appointment,@RequestParam String client, @RequestParam LocalDateTime localDateTime){

        return ResponseEntity.accepted().body(appointmentService.updateAppointment(appointment,client,localDateTime));
    }
}
