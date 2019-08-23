package com.meizu.cloud.pushsdk.handler.a.b;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class d {

    /* renamed from: a  reason: collision with root package name */
    String f27206a;

    /* renamed from: b  reason: collision with root package name */
    String f27207b;

    /* renamed from: c  reason: collision with root package name */
    String f27208c;

    /* renamed from: d  reason: collision with root package name */
    String f27209d;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f27210a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f27211b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f27212c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f27213d;

        public a a(String str) {
            this.f27210a = str;
            return this;
        }

        public d a() {
            return new d(this);
        }

        public a b(String str) {
            this.f27211b = str;
            return this;
        }

        public a c(String str) {
            this.f27212c = str;
            return this;
        }

        public a d(String str) {
            this.f27213d = str;
            return this;
        }
    }

    public d() {
    }

    public d(a aVar) {
        this.f27206a = !TextUtils.isEmpty(aVar.f27210a) ? aVar.f27210a : "";
        this.f27207b = !TextUtils.isEmpty(aVar.f27211b) ? aVar.f27211b : "";
        this.f27208c = !TextUtils.isEmpty(aVar.f27212c) ? aVar.f27212c : "";
        this.f27209d = !TextUtils.isEmpty(aVar.f27213d) ? aVar.f27213d : "";
    }

    public static a a() {
        return new a();
    }

    public String b() {
        c cVar = new c();
        cVar.a(PushConstants.TASK_ID, this.f27206a);
        cVar.a("seq_id", this.f27207b);
        cVar.a("push_timestamp", this.f27208c);
        cVar.a("device_id", this.f27209d);
        return cVar.toString();
    }

    public String c() {
        return this.f27206a;
    }

    public String d() {
        return this.f27207b;
    }

    public String e() {
        return this.f27208c;
    }

    public String f() {
        return this.f27209d;
    }
}
