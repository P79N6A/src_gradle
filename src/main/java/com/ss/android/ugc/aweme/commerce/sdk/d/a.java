package com.ss.android.ugc.aweme.commerce.sdk.d;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/shareperference/CommerceSharePref;", "", "()V", "firstJumpToJD", "", "firstJumpToKaola", "firstJumpToTaobao", "isFirstJumpToJD", "()Z", "setFirstJumpToJD", "(Z)V", "isFirstJumpToKaola", "setFirstJumpToKaola", "isFirstJumpToTaobao", "setFirstJumpToTaobao", "mSharedPreferences", "Landroid/content/SharedPreferences;", "get", "", "key", "init", "", "context", "Landroid/content/Context;", "loadCache", "put", "object", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37717a;

    /* renamed from: f  reason: collision with root package name */
    public static a f37718f;
    public static final C0489a g = new C0489a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f37719b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37720c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37721d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37722e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/shareperference/CommerceSharePref$Companion;", "", "()V", "AWEME_USER", "", "KEY_FIRST_JUMP_TO_JD", "KEY_FIRST_JUMP_TO_KAOLA", "KEY_FIRST_JUMP_TO_TAOBAO", "sInstance", "Lcom/ss/android/ugc/aweme/commerce/sdk/shareperference/CommerceSharePref;", "getsInstance", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.d.a$a  reason: collision with other inner class name */
    public static final class C0489a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37723a;

        private C0489a() {
        }

        @Nullable
        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f37723a, false, 29562, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f37723a, false, 29562, new Class[0], a.class);
            }
            if (a.f37718f == null) {
                synchronized (a.class) {
                    if (a.f37718f == null) {
                        a.f37718f = new a((byte) 0);
                    }
                }
            }
            return a.f37718f;
        }

        public /* synthetic */ C0489a(byte b2) {
            this();
        }
    }

    private a() {
        this.f37720c = true;
        this.f37721d = true;
        this.f37722e = true;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f37717a, false, 29560, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f37717a, false, 29560, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        SharedPreferences sharedPreferences = this.f37719b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj2 instanceof Boolean) {
            if (edit != null) {
                edit.putBoolean(str2, ((Boolean) obj2).booleanValue());
            }
        } else if (edit != null) {
            edit.putString(str2, obj.toString());
        }
        if (edit != null) {
            edit.apply();
        }
    }
}
