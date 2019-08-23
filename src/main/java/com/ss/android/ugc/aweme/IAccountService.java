package com.ss.android.ugc.aweme;

import a.i;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
public interface IAccountService {

    @Retention(RetentionPolicy.CLASS)
    public @interface AccountType {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ActionProgress {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ActionResult {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ActionType {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ViewPage {
    }

    public interface a {
        void a(@AccountType int i, boolean z, int i2, @Nullable User user);
    }

    public interface b {
        i<Bundle> a(@Nullable Bundle bundle);

        com.ss.android.ugc.aweme.account.model.f a();

        void a(String str);

        i<Bundle> b(@Nullable Bundle bundle);

        void b(String str);

        i<Bundle> c(@Nullable Bundle bundle);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Activity f31560a;

        /* renamed from: b  reason: collision with root package name */
        public String f31561b;

        /* renamed from: c  reason: collision with root package name */
        public String f31562c;
        @NonNull

        /* renamed from: d  reason: collision with root package name */
        public Bundle f31563d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public h f31564e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public f f31565f;
        @Nullable
        public g g;
        @Nullable
        public e h;
        public boolean i;

        private c(d dVar) {
            Bundle bundle;
            this.f31560a = dVar.f31567b;
            this.f31561b = dVar.f31568c;
            this.f31562c = dVar.f31569d;
            if (dVar.f31570e == null) {
                bundle = new Bundle();
            } else {
                bundle = dVar.f31570e;
            }
            this.f31563d = bundle;
            this.f31564e = dVar.f31571f;
            this.f31565f = dVar.g;
            this.g = dVar.h;
            this.h = dVar.i;
            this.i = dVar.j;
            if (!TextUtils.isEmpty(this.f31561b)) {
                this.f31563d.putString("enter_from", this.f31561b);
            }
            if (!TextUtils.isEmpty(this.f31562c)) {
                this.f31563d.putString("enter_method", this.f31562c);
            }
        }

        /* synthetic */ c(d dVar, byte b2) {
            this(dVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31566a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f31567b;

        /* renamed from: c  reason: collision with root package name */
        public String f31568c;

        /* renamed from: d  reason: collision with root package name */
        public String f31569d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f31570e;

        /* renamed from: f  reason: collision with root package name */
        public h f31571f;
        public f g;
        public g h;
        public e i;
        public boolean j;

        public final c a() {
            if (!PatchProxy.isSupport(new Object[0], this, f31566a, false, 19463, new Class[0], c.class)) {
                return new c(this, (byte) 0);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f31566a, false, 19463, new Class[0], c.class);
        }

        public final d a(@NonNull Activity activity) {
            this.f31567b = activity;
            return this;
        }

        public final d b(@Nullable String str) {
            this.f31569d = str;
            return this;
        }

        public final d a(@Nullable Bundle bundle) {
            this.f31570e = bundle;
            return this;
        }

        public final d a(@Nullable f fVar) {
            this.g = fVar;
            return this;
        }

        public final d a(@Nullable g gVar) {
            this.h = gVar;
            return this;
        }

        public final d a(@Nullable h hVar) {
            this.f31571f = hVar;
            return this;
        }

        public final d a(@Nullable String str) {
            this.f31568c = str;
            return this;
        }

        public final d a(boolean z) {
            this.j = z;
            return this;
        }
    }

    public interface e {
    }

    public interface f {
        boolean a(@ActionType int i, @Nullable Object obj);
    }

    public interface g {
        void a(@ViewPage int i, @ActionProgress int i2, @Nullable String str);
    }

    public interface h {
        void a(@ActionType int i, @ActionResult int i2, @Nullable Object obj);
    }

    void addLoginOrLogoutListener(@NonNull a aVar);

    IAgeGateService ageGateService();

    m bindService();

    com.ss.android.ugc.aweme.account.login.authorize.f<?> getAuthSdkInstance(String str);

    Class<? extends Activity> getThirdPartyCustomLoginActivity(String str);

    void initAuthSdk(String str, String str2);

    o interceptorService();

    @Deprecated
    void login(@NonNull c cVar);

    p loginService();

    q passwordService();

    r proAccountService();

    void removeLoginOrLogoutListener(@NonNull a aVar);

    s rnAndH5Service();

    @Deprecated
    void setLoginMob(String str);

    IAccountUserService userService();
}
