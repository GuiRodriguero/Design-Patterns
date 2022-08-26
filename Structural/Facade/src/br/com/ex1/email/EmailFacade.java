package br.com.ex1.email;

import br.com.ex1.Order;

/**
 * Este é o nosso Facade, ele provê métodos simplificados para que possamos usar no nosso código alvo
 */
public class EmailFacade {
	
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
