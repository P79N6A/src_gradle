package com.ss.android.ugc.aweme.app.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.d;
import com.ss.android.ugc.aweme.im.service.model.e;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.api.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/SettingService;", "Lcom/ss/android/ugc/aweme/story/api/ISettingService;", "()V", "getAdaptationParams", "Lcom/ss/android/ugc/aweme/story/api/model/AdaptationParams;", "getPlanAInputIcon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getPlanAInputText", "", "isDuoshanRedpackageShow", "", "isImEnable", "isPlanAOpen", "isPlanBOpen", "isXPlanOpen", "wrapperSendMessageSyncXIcon", "", "imageView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "type", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aa implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34268a;

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f34268a, false, 23670, new Class[0], Boolean.TYPE)) {
            return false;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23670, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34268a, false, 23667, new Class[0], a.class)) {
            return com.ss.android.ugc.aweme.profile.a.a().i;
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23667, new Class[0], a.class);
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34268a, false, 23668, new Class[0], Boolean.TYPE)) {
            return b.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23668, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f34268a, false, 23669, new Class[0], Boolean.TYPE)) {
            return b.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23669, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f34268a, false, 23671, new Class[0], Boolean.TYPE)) {
            return b.d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23671, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r1 == null) goto L_0x004d;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.base.model.UrlModel f() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f34268a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r7 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r4 = 0
            r5 = 23672(0x5c78, float:3.3172E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f34268a
            r5 = 0
            r6 = 23672(0x5c78, float:3.3172E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r8 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            return r0
        L_0x0026:
            com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy r0 = com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy.inst()
            java.lang.String r1 = "SettingsManagerProxy.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.global.config.settings.a r0 = r0.getCommonSettingsWatcher()
            java.lang.String r1 = "SettingsManagerProxy.inst().commonSettingsWatcher"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.im.service.model.d r0 = r0.a()
            java.lang.String r1 = "SettingsManagerProxy.ins…SettingsWatcher.imSetting"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.im.service.model.e r0 = r0.f52883f
            if (r0 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.im.service.model.f r1 = r0.p
            if (r1 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.f52891b
            if (r1 != 0) goto L_0x0057
        L_0x004d:
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.im.service.model.f r0 = r0.p
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.f52892c
            return r0
        L_0x0056:
            r1 = 0
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.aa.f():com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    @Nullable
    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f34268a, false, 23673, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34268a, false, 23673, new Class[0], String.class);
        }
        SettingsManagerProxy inst = SettingsManagerProxy.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SettingsManagerProxy.inst()");
        com.ss.android.ugc.aweme.global.config.settings.a commonSettingsWatcher = inst.getCommonSettingsWatcher();
        Intrinsics.checkExpressionValueIsNotNull(commonSettingsWatcher, "SettingsManagerProxy.inst().commonSettingsWatcher");
        d a2 = commonSettingsWatcher.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "SettingsManagerProxy.ins…SettingsWatcher.imSetting");
        e eVar = a2.f52883f;
        if (eVar != null) {
            return eVar.t;
        }
        return null;
    }

    public final void a(@NotNull RemoteImageView remoteImageView, int i) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, 13}, this, f34268a, false, 23674, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, 13}, this, f34268a, false, 23674, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(remoteImageView2, "imageView");
        b.a().wrapperSendMessageSyncXIcon(remoteImageView2, 13);
    }
}
