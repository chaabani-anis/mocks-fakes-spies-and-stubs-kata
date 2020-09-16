package kata.domain.user;

public class UserIdDummy {
    public static UserId randomUserId() {
        return UserId.of("username");
    }
}
