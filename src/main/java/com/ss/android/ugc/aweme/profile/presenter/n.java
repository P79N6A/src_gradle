package com.ss.android.ugc.aweme.profile.presenter;

import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.User;

public interface n extends o {
    void a();

    void a(int i);

    void a(int i, int i2);

    void a(int i, String str);

    void a(UrlModel urlModel);

    void a(User user);

    void a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user);

    void a(boolean z, boolean z2, boolean z3);

    void b();

    void b(int i);

    void b(@Nullable User user);

    void b(Exception exc);

    void b(String str);

    void b(boolean z);

    void b(boolean z, boolean z2, boolean z3);

    void c(int i);

    void c(User user);

    void c(String str);

    void c(boolean z);

    void d(int i);

    void d(User user);

    void d(String str);

    void d(boolean z);

    void e(int i);

    void e(User user);

    void e(boolean z);

    boolean e();

    void f(int i);

    void f(User user);

    void g(int i);

    void g(User user);

    String getUserId();

    void h(int i);

    void i(int i);

    void setUser(User user);
}
