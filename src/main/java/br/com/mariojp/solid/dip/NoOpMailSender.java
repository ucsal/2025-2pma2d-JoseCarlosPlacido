package br.com.mariojp.solid.dip;

public class NoOpMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("[DRY RUN] Email para: " + to);
        System.out.println("[DRY RUN] Assunto: " + subject);
    }
}