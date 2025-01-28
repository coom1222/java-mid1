package lang.object1.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

   /* @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // obj를 UserV2 타입으로 다운캐스팅
        return id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}
