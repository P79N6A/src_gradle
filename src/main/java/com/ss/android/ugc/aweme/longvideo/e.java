package com.ss.android.ugc.aweme.longvideo;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.u.x;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0010J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J&\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoHelper;", "", "()V", "KEY_LONG_VIDEO_MOCK", "", "getKEY_LONG_VIDEO_MOCK", "()Ljava/lang/String;", "LONG_VIDEO_MOCK", "getLONG_VIDEO_MOCK", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "checkNetWork", "", "context", "Landroid/content/Context;", "getLongVideoMockEnable", "mobLongVideoEntrance", "", "eventType", "pageType", "", "setLongVideoMockEnable", "enable", "startLongVideoPlayActivity", "startOldLongVideoPlayActivity", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53908a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final e f53909b = new e();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final String f53910c = f53910c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f53911d = f53911d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private static Aweme f53912e;

    private e() {
    }

    @Nullable
    public static Aweme a() {
        return f53912e;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f53908a, false, 56531, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53908a, false, 56531, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i a2 = i.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AppContextInfoManager.inst()");
        return c.a(a2.getContext(), f53910c, 0).getBoolean(f53911d, false);
    }

    private final boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f53908a, false, 56528, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f53908a, false, 56528, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (NetworkUtils.isNetworkAvailable(context)) {
            return true;
        } else {
            a.c(context2, (int) C0906R.string.bgf).a();
            return false;
        }
    }

    private final void a(Aweme aweme, String str, int i) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2, Integer.valueOf(i)}, this, f53908a, false, 56529, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2, Integer.valueOf(i)}, this, f53908a, false, 56529, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        new x().b(aweme2, i).a(str2).e();
    }

    private void b(@NotNull Context context, @NotNull Aweme aweme, @NotNull String str, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2, Integer.valueOf(i)}, this, f53908a, false, 56527, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f53908a, false, 56527, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str2, "eventType");
        if (a(context)) {
            a(aweme2, str2, i2);
            f53912e = aweme2;
            Intent intent = new Intent(context2, LongVideoPlayActivity.class);
            intent.putExtra("extra_event_type", str2);
            intent.putExtra("extra_page_type", i2);
            context2.startActivity(intent);
        }
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @NotNull Aweme aweme, @NotNull String str, int i) {
        boolean z;
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2, Integer.valueOf(i)}, null, f53908a, true, 56526, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53908a, true, 56526, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str2, "eventType");
        if (com.ss.android.g.a.a()) {
            f53909b.b(context2, aweme2, str2, i2);
            return;
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Integer bc = b2.bc();
            Intrinsics.checkExpressionValueIsNotNull(bc, "SettingsReader.get().isNewLongVideoActivity");
            if (bc.intValue() == 1) {
                LongVideoActivity.a aVar = LongVideoActivity.f53994b;
                Object[] objArr3 = {context2, aweme2, str2, Integer.valueOf(i)};
                if (PatchProxy.isSupport(objArr3, aVar, LongVideoActivity.a.f53999a, false, 56834, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr4 = {context2, aweme2, str2, Integer.valueOf(i)};
                    Object[] objArr5 = objArr4;
                    LongVideoActivity.a aVar2 = aVar;
                    PatchProxy.accessDispatch(objArr5, aVar2, LongVideoActivity.a.f53999a, false, 56834, new Class[]{Context.class, Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(context2, "context");
                Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
                Intrinsics.checkParameterIsNotNull(str2, "eventType");
                LongVideoActivity.a aVar3 = aVar;
                if (PatchProxy.isSupport(new Object[]{context2}, aVar3, LongVideoActivity.a.f53999a, false, 56835, new Class[]{Context.class}, Boolean.TYPE)) {
                    Object[] objArr6 = {context2};
                    LongVideoActivity.a aVar4 = aVar3;
                    z = ((Boolean) PatchProxy.accessDispatch(objArr6, aVar4, LongVideoActivity.a.f53999a, false, 56835, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else if (NetworkUtils.isNetworkAvailable(context)) {
                    z = true;
                } else {
                    a.c(context2, (int) C0906R.string.bgf).a();
                    z = false;
                }
                if (z) {
                    LongVideoActivity.a aVar5 = aVar;
                    Object[] objArr7 = {aweme2, str2, Integer.valueOf(i)};
                    if (PatchProxy.isSupport(objArr7, aVar5, LongVideoActivity.a.f53999a, false, 56836, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr8 = {aweme2, str2, Integer.valueOf(i)};
                        Object[] objArr9 = objArr8;
                        LongVideoActivity.a aVar6 = aVar5;
                        PatchProxy.accessDispatch(objArr9, aVar6, LongVideoActivity.a.f53999a, false, 56836, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        new x().b(aweme2, i2).a(str2).e();
                    }
                    f53912e = aweme2;
                    Intent intent = new Intent(context2, LongVideoActivity.class);
                    intent.putExtra("extra_aweme_id", aweme.getAid());
                    intent.putExtra("extra_event_type", str2);
                    intent.putExtra("extra_page_type", i2);
                    context2.startActivity(intent);
                }
                return;
            }
            f53909b.b(context2, aweme2, str2, i2);
        } catch (Throwable unused) {
            f53909b.b(context2, aweme2, str2, i2);
        }
    }
}
