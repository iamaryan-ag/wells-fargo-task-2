package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue()
    private Long appointmentId;

    @Column(nullable = false)
    private LocalDateTime appointmentDateTime;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customer;

    public Appointment() {
    }

    public Appointment(LocalDateTime appointmentDateTime, Advisor advisor, Customer customer) {
        this.appointmentDateTime = appointmentDateTime;
        this.advisor = advisor;
        this.customer = customer;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
