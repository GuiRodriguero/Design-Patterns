package br.com.workshop;

import java.time.LocalDate;

/**
 * Builder para a classe {@link LeaveApplication}
 */
public class LeaveApplicationBuilder implements ApplicationBuilder {

    private Type type;
    private LocalDate from;
    private LocalDate to;
    private LeaveApplication application;

    public LeaveApplicationBuilder() {
    }

    @Override
    public ApplicationBuilder withType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public ApplicationBuilder from(LocalDate from) {
        this.from = from;
        return this;
    }

    @Override
    public ApplicationBuilder to(LocalDate to) {
        this.to = to;
        return this;
    }

    @Override
    public LeaveApplication build() {
        this.application = new LeaveApplication(type, from, to);
        return this.application;
    }

    @Override
    public LeaveApplication getApplication() {
        return application;
    }

}
