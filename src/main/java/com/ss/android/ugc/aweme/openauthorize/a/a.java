package com.ss.android.ugc.aweme.openauthorize.a;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0016j\b\u0012\u0004\u0012\u00020\u0003`\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/entity/CheckLoginResponse;", "", "clientKey", "", "qqConceal", "", "wxConceal", "needBindMobile", "(Ljava/lang/String;ZZZ)V", "getClientKey", "()Ljava/lang/String;", "setClientKey", "(Ljava/lang/String;)V", "getNeedBindMobile", "()Z", "setNeedBindMobile", "(Z)V", "getQqConceal", "setQqConceal", "getWxConceal", "setWxConceal", "getAuthorizeBannedPlatform", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58350a;

    /* renamed from: f  reason: collision with root package name */
    public static final C0655a f58351f = new C0655a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f58352b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f58353c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58354d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58355e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/entity/CheckLoginResponse$Companion;", "", "()V", "parse", "Lcom/ss/android/ugc/aweme/openauthorize/entity/CheckLoginResponse;", "clientKey", "", "jsonObject", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.openauthorize.a.a$a  reason: collision with other inner class name */
    public static final class C0655a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58356a;

        private C0655a() {
        }

        public /* synthetic */ C0655a(byte b2) {
            this();
        }
    }

    public a(@NotNull String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "clientKey");
        this.f58352b = str;
        this.f58353c = z;
        this.f58354d = z2;
        this.f58355e = z3;
    }
}
