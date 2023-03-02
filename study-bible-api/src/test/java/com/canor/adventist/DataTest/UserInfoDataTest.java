package com.canor.adventist.DataTest;

import com.adventists.biblestudies.model.UserInfo;
import java.util.Optional;

public class UserInfoDataTest {

  public static Optional<UserInfo> createUserInfo() {
    return Optional.of(
      new UserInfo(
        null,
        "Name user",
        (long) 12345678,
        "useremail@gmail.com",
        true,
        false,
        true
      )
    );
  }

  public static Optional<UserInfo> createExistentUserInfoEmail() {
    return Optional.of(
      new UserInfo(
        null,
        "Name user",
        (long) 12345678,
        "useremail@gmail.com",
        true,
        false,
        true
      )
    );
  }
}
