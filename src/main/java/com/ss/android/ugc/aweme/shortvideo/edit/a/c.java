package com.ss.android.ugc.aweme.shortvideo.edit.a;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u001aJ\u0014\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010!\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/autoenhance/AutoEnhanceController;", "", "activity", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "lightDetectNeeded", "", "(Lcom/ss/android/ugc/aweme/base/AmeActivity;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Z)V", "getActivity", "()Lcom/ss/android/ugc/aweme/base/AmeActivity;", "setActivity", "(Lcom/ss/android/ugc/aweme/base/AmeActivity;)V", "getLightDetectNeeded", "()Z", "setLightDetectNeeded", "(Z)V", "mAutoEnhanceData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/autoenhance/AutoEnhanceControlOp;", "mLightDetectLiveData", "getModel", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "setModel", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "changeStatus", "", "toStatus", "getLightDetectObserver", "Landroid/arch/lifecycle/Observer;", "init", "setAutoEnhanceLiveData", "autoEnhanceData", "setLightDetectLiveData", "lightDetectData", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66940a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<b> f66941b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<Boolean> f66942c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public AmeActivity f66943d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public cb f66944e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f66945f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/autoenhance/AutoEnhanceController$Companion;", "", "()V", "LIGHT_STATUS_DARK", "", "LIGHT_STATUS_NOT_DARK", "LIGHT_STATUS_NOT_KNOWN", "TAG", "", "debutTestLogger", "", "context", "Landroid/content/Context;", "logString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66946a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@Nullable Context context, @NotNull String str) {
            Context context2;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{context, str2}, this, f66946a, false, 76715, new Class[]{Context.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, str2}, this, f66946a, false, 76715, new Class[]{Context.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "logString");
            com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
            if (b2.f3306d) {
                if (context != null) {
                    context2 = context.getApplicationContext();
                } else {
                    context2 = null;
                }
                com.bytedance.ies.dmt.ui.d.a.b(context2, str2, 1).a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    public static final class b<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f66948b;

        public b(c cVar) {
            this.f66948b = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f66947a, false, 76716, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f66947a, false, 76716, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (this.f66948b.f66944e.autoEnhanceType == 0 && bool != null) {
                cb cbVar = this.f66948b.f66944e;
                if (!bool.booleanValue()) {
                    i = 2;
                }
                cbVar.autoEnhanceType = i;
                MutableLiveData<b> mutableLiveData = this.f66948b.f66941b;
                if (mutableLiveData != null) {
                    mutableLiveData.postValue(new b(this.f66948b.f66944e.autoEnhanceOn, this.f66948b.f66944e.autoEnhanceType, false, 4));
                }
                a aVar = c.g;
                Context context = this.f66948b.f66943d;
                StringBuilder sb = new StringBuilder("receive light detect value,  ");
                if (bool.booleanValue()) {
                    str = "is dark light ";
                } else {
                    str = "is not dark light";
                }
                sb.append(str);
                aVar.a(context, sb.toString());
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f66940a, true, 76714, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f66940a, true, 76714, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        g.a(context2, str2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66940a, false, 76710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66940a, false, 76710, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f66944e.autoEnhanceOn = z;
        MutableLiveData<b> mutableLiveData = this.f66941b;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(new b(this.f66944e.autoEnhanceOn, this.f66944e.autoEnhanceType, false, 4));
        }
    }

    public c(@NotNull AmeActivity ameActivity, @NotNull cb cbVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(ameActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(cbVar, "model");
        this.f66943d = ameActivity;
        this.f66944e = cbVar;
        this.f66945f = z;
    }
}
