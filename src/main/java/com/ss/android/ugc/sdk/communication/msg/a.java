package com.ss.android.ugc.sdk.communication.msg;

import android.content.ComponentName;
import android.os.Bundle;
import com.ss.android.ugc.sdk.communication.d;
import com.ss.android.ugc.sdk.communication.msg.base.c;
import java.util.UUID;

public final class a {

    /* renamed from: com.ss.android.ugc.sdk.communication.msg.a$a  reason: collision with other inner class name */
    public static class C0826a extends com.ss.android.ugc.sdk.communication.msg.base.b {

        /* renamed from: a  reason: collision with root package name */
        public final String f77791a;

        /* renamed from: b  reason: collision with root package name */
        public final String f77792b;

        /* renamed from: c  reason: collision with root package name */
        public final String f77793c;

        public final ComponentName a() {
            String a2 = d.a(b());
            return new ComponentName(a2, a2 + ".iesapi.AuthActivity");
        }

        public C0826a(Bundle bundle) {
            super(bundle);
            this.f77791a = bundle.getString("KEY_TOKEN");
            this.f77792b = bundle.getString("KEY_USER_NAME");
            this.f77793c = bundle.getString("KEY_USER_AVATAR");
        }

        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putString("KEY_TOKEN", this.f77791a);
            bundle.putString("KEY_USER_NAME", this.f77792b);
            bundle.putString("KEY_USER_AVATAR", this.f77793c);
        }

        public C0826a(String str, String str2, String str3, String str4) {
            super(UUID.randomUUID().toString(), 0, str);
            this.f77791a = str2;
            this.f77792b = str3;
            this.f77793c = str4;
        }
    }

    public static class b extends c {
        public b(Bundle bundle) {
            super(bundle);
        }

        public b(C0826a aVar, int i, String str) {
            super(aVar.c(), 0, aVar.f77797d, i, str);
        }
    }
}
