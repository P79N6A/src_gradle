package com.ss.android.ugc.aweme.main.h;

import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public interface e {
    UserResponse a(String str, List<com.ss.android.http.a.b.e> list) throws Exception;

    AvatarUri a(String str, int i, String str2, List<com.ss.android.http.a.b.e> list) throws Exception;

    User a(String str) throws Exception;

    void a(String str, int i) throws Exception;

    void b(String str) throws Exception;
}
