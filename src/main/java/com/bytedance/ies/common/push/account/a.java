package com.bytedance.ies.common.push.account;

import android.content.Context;
import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f20221a;

    /* renamed from: b  reason: collision with root package name */
    private int f20222b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20223c;

    /* renamed from: d  reason: collision with root package name */
    private long f20224d;

    /* renamed from: com.bytedance.ies.common.push.account.a$a  reason: collision with other inner class name */
    public static final class C0181a {

        /* renamed from: a  reason: collision with root package name */
        public Context f20225a;

        /* renamed from: b  reason: collision with root package name */
        public int f20226b = 1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f20227c = true;

        /* renamed from: d  reason: collision with root package name */
        public long f20228d = 900;

        public C0181a(Context context) {
            this.f20225a = context;
        }
    }

    public String a() {
        return TextUtils.concat(new CharSequence[]{this.f20221a.getPackageName(), ".AccountProvider"}).toString();
    }

    private a(C0181a aVar) {
        this.f20221a = aVar.f20225a;
        this.f20222b = aVar.f20226b;
        this.f20223c = aVar.f20227c;
        this.f20224d = aVar.f20228d;
    }

    public /* synthetic */ a(C0181a aVar, byte b2) {
        this(aVar);
    }
}
