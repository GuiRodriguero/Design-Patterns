package br.com.ex1WithBuilder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe que representa um Request na nossa chain.
 * LeaveApplication é uma abstração de um pedido de afastamento dentro do contexto de uma empresa
 */
public class LeaveApplication {

    private Type type;

    private Status status;

    private LocalDate from;

    private LocalDate to;

    private String processedBy;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int getNoOfDays() {
        return Period.between(from, to).getDays();
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void approve(String approverName) {
        this.status = Status.APPROVED;
        this.processedBy = approverName;
    }

    public void reject(String approverName) {
        this.status = Status.REJECTED;
        this.processedBy = approverName;
    }

    public static LeaveApplicationBuilder getBuilder() {
        return new LeaveApplicationBuilder();
    }

    @Override
    public String toString() {
        return type + " leave for " + getNoOfDays() + " day(s) " + status + " by " + processedBy;
    }
}
