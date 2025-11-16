package defaultmethod.ex1;

import java.util.List;

public class NotifierMainV1 {

    static void main() {
        List<Notifier> notifiers = List.of(new EmailNotifier(), new SMSNotifier(), new AppPushNotifier());
        notifiers.forEach(n -> n.notify("서비스 가입을 환영합니다."));
    }

}
