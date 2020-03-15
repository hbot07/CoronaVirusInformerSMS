import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class SmsSender {

    private static final String ACCOUNT_SID =
            PrivateInfo.ACCOUNT_SID;
    private static final String AUTH_TOKEN =
            PrivateInfo.AUTH_TOKEN;

    public static void send(String messageBody) {

        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message
                    .creator(new PhoneNumber(PrivateInfo.to), // to
                            new PhoneNumber(PrivateInfo.from), // from
                            messageBody)
                    .create();
            System.out.println(message.getSid());
        }catch(Exception e)
        {
            System.out.println("Did you add your information to PrivateInfo.java correctly ?");
        }
    }
}