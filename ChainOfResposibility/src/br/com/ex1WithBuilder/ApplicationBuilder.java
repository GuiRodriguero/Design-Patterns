package br.com.ex1WithBuilder;

import java.time.LocalDate;

public interface ApplicationBuilder {
    ApplicationBuilder withType(Type type);
    ApplicationBuilder from(LocalDate from);
    ApplicationBuilder to(LocalDate to);

    LeaveApplication build();
    LeaveApplication getApplication();
}
