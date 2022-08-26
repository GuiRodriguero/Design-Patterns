package br.com.ex1;

import br.com.ex1.email.EmailFacade;

public class Main {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		
		boolean result = facade.sendOrderEmail(order);
		
		System.out.println("br.com.ex1.Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

	/*Este é o método qure precisávamos antes de criar a EmailFacade, podemos perceber que o código da Regra de Negócio
	Tinha um forte Coupling com as classes de criação de Email, o que foi reduzido via Facade.
	Caso o único propósito do Facade seja diminuir o Coupling, o que pode ser feito, no lugar, é usar o Abstract Factory
	(pattern que cria kits de objetos para determinados cenários)
	*/

//	private static boolean sendOrderEmailWithoutFacade(br.com.ex1.Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email br.com.ex1.email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(br.com.ex1.email);
//	}
	
}
