package com.devlucasnascimento.agendador_horarios.infrastructure.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agendamento")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceType;
    private String product;
    private LocalDateTime dateTimeAppointment;
    private String client;
    private String clientPhoneNumber;
    private LocalDateTime insertDate = LocalDateTime.now();
}
