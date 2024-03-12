
public class EmailMsgListener implements Listener {

    public EmailMsgListener(String email) {
        this.email = email;
    }

    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
        }

        }