package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.splash.c;
import com.ss.android.ugc.aweme.feed.adapter.h;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.y.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@Deprecated
public final class AwemeSettingManager extends o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63783a;

    /* renamed from: b  reason: collision with root package name */
    Gson f63784b;

    class UpdateSettingTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Object obj;

        @NotNull
        public f type() {
            return f.BACKGROUND;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: a.i} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run(@org.jetbrains.annotations.NotNull android.content.Context r19) {
            /*
                r18 = this;
                r8 = r18
                r9 = 1
                java.lang.Object[] r1 = new java.lang.Object[r9]
                r10 = 0
                r1[r10] = r19
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r6[r10] = r2
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 72040(0x11968, float:1.0095E-40)
                r2 = r18
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0036
                java.lang.Object[] r1 = new java.lang.Object[r9]
                r1[r10] = r19
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                r4 = 0
                r5 = 72040(0x11968, float:1.0095E-40)
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                r6[r10] = r0
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0036:
                java.lang.String r0 = "UpdateSettingTask"
                com.ss.android.ugc.aweme.framework.a.a.a((java.lang.String) r0)
                java.lang.Object r0 = r8.obj
                boolean r0 = r0 instanceof com.google.gson.JsonElement
                if (r0 == 0) goto L_0x03f2
                java.lang.Object r0 = r8.obj
                r1 = r0
                com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
                r3.<init>()
                java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
                r4.<init>()
                java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
                r5.<init>()
                com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy r0 = com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy.inst()     // Catch:{ Throwable -> 0x006c }
                com.google.gson.Gson r0 = r0.getGson()     // Catch:{ Throwable -> 0x006c }
                java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings> r6 = com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings.class
                java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.Class<T>) r6)     // Catch:{ Throwable -> 0x006c }
                r2.set(r0)     // Catch:{ Throwable -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r0 = move-exception
                r3.set(r0)
            L_0x0070:
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r0 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this     // Catch:{ Throwable -> 0x0090 }
                com.google.gson.Gson r0 = r0.f63784b     // Catch:{ Throwable -> 0x0090 }
                if (r0 != 0) goto L_0x007e
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r0 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this     // Catch:{ Throwable -> 0x0090 }
                com.google.gson.Gson r6 = com.ss.android.ugc.aweme.app.api.u.a()     // Catch:{ Throwable -> 0x0090 }
                r0.f63784b = r6     // Catch:{ Throwable -> 0x0090 }
            L_0x007e:
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r0 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this     // Catch:{ Throwable -> 0x0090 }
                com.google.gson.Gson r0 = r0.f63784b     // Catch:{ Throwable -> 0x0090 }
                java.lang.Object r6 = r8.obj     // Catch:{ Throwable -> 0x0090 }
                com.google.gson.JsonElement r6 = (com.google.gson.JsonElement) r6     // Catch:{ Throwable -> 0x0090 }
                java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings> r7 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.class
                java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r6, (java.lang.Class<T>) r7)     // Catch:{ Throwable -> 0x0090 }
                r4.set(r0)     // Catch:{ Throwable -> 0x0090 }
                goto L_0x0094
            L_0x0090:
                r0 = move-exception
                r5.set(r0)
            L_0x0094:
                com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy r0 = com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy.inst()
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                java.lang.Object r2 = r2.get()
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r2 = (com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings) r2
                java.lang.String r1 = r1.toString()
                r0.notifySettingsChange(r3, r2, r1)
                java.lang.Object r0 = r4.get()
                com.ss.android.ugc.aweme.setting.model.AwemeSettings r0 = (com.ss.android.ugc.aweme.setting.model.AwemeSettings) r0
                java.lang.Object r1 = r5.get()
                if (r1 == 0) goto L_0x00d2
                java.lang.Object r0 = r5.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                com.ss.android.ugc.aweme.global.config.settings.SettingsUtil.a(r0)
                java.lang.Object r0 = r5.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.String r1 = "AwemeSettingManager"
                java.lang.Object r2 = r8.obj
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.global.config.settings.SettingsUtil.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
                return
            L_0x00d2:
                java.lang.String r1 = "AwemeSettingManager"
                java.lang.Object r2 = r8.obj
                java.lang.String r2 = r2.toString()
                r3 = 0
                com.ss.android.ugc.aweme.global.config.settings.SettingsUtil.a((java.lang.Throwable) r3, (java.lang.String) r1, (java.lang.String) r2)
                if (r0 != 0) goto L_0x00e1
                return
            L_0x00e1:
                com.ss.android.ugc.aweme.setting.model.AwemeSettings$GlobalTips r1 = r0.globalTips
                if (r1 == 0) goto L_0x00fa
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r1 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this
                com.ss.android.ugc.aweme.setting.model.AwemeSettings$GlobalTips r2 = r0.globalTips
                r1.f63996f = r2
                com.ss.android.ugc.aweme.base.sharedpref.f r1 = com.ss.android.ugc.aweme.base.sharedpref.e.e()
                java.lang.String r2 = "place_holder"
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r4 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this
                com.ss.android.ugc.aweme.setting.model.AwemeSettings$GlobalTips r4 = r4.f63996f
                java.lang.String r4 = r4.search_tips
                r1.b((java.lang.String) r2, (java.lang.String) r4)
            L_0x00fa:
                com.ss.android.ugc.aweme.setting.AwemeSettingManager r1 = com.ss.android.ugc.aweme.setting.AwemeSettingManager.this
                r1.a((com.ss.android.ugc.aweme.setting.model.AwemeSettings) r0)
                com.ss.android.ugc.aweme.main.c.h r1 = new com.ss.android.ugc.aweme.main.c.h
                r1.<init>()
                com.ss.android.ugc.aweme.utils.bg.a(r1)
                com.ss.android.ugc.aweme.d.a.a r1 = com.ss.android.ugc.aweme.d.a.a.a()
                com.ss.android.ugc.aweme.d.a.e r2 = r0.thirdPlatformLoginSettings
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.d.a.a.f41045a
                r14 = 0
                r15 = 25647(0x642f, float:3.5939E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.d.a.e> r5 = com.ss.android.ugc.aweme.d.a.e.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r4 == 0) goto L_0x013f
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.d.a.a.f41045a
                r14 = 0
                r15 = 25647(0x642f, float:3.5939E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.d.a.e> r4 = com.ss.android.ugc.aweme.d.a.e.class
                r2[r10] = r4
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0179
            L_0x013f:
                r1.f41047b = r2
                if (r2 == 0) goto L_0x0145
                r1.f41048c = r9
            L_0x0145:
                com.ss.android.ugc.aweme.d.a.b r2 = r1.b()
                if (r2 == 0) goto L_0x015f
                com.ss.android.ugc.aweme.d.a.a$1 r2 = new com.ss.android.ugc.aweme.d.a.a$1
                com.ss.android.ugc.aweme.d.a.b r4 = r1.b()
                int r4 = r4.f41060d
                long r4 = (long) r4
                com.ss.android.ugc.aweme.d.a.b r6 = r1.b()
                int r6 = r6.f41059c
                r2.<init>(r4, r6)
                r1.f41049d = r2
            L_0x015f:
                com.ss.android.ugc.aweme.d.a.b r2 = r1.c()
                if (r2 == 0) goto L_0x0179
                com.ss.android.ugc.aweme.d.a.a$2 r2 = new com.ss.android.ugc.aweme.d.a.a$2
                com.ss.android.ugc.aweme.d.a.b r4 = r1.c()
                int r4 = r4.f41060d
                long r4 = (long) r4
                com.ss.android.ugc.aweme.d.a.b r6 = r1.c()
                int r6 = r6.f41059c
                r2.<init>(r4, r6)
                r1.f41050e = r2
            L_0x0179:
                com.ss.android.ugc.aweme.zhima.c r1 = com.ss.android.ugc.aweme.zhima.c.a()
                r1.a(r0)
                java.util.ArrayList<java.lang.String> r1 = r0.httpsList
                boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
                if (r2 != 0) goto L_0x018b
                com.ss.android.common.util.NetworkUtils.setNoHttpWhiteList(r1)
            L_0x018b:
                com.ss.android.ugc.aweme.setting.model.AwemeSettings$FreeFlowCard r1 = r0.freeFlowCard
                if (r1 == 0) goto L_0x03ae
                com.ss.android.ugc.aweme.freeflowcard.b r2 = com.ss.android.ugc.aweme.freeflowcard.b.a()
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46017(0xb3c1, float:6.4484E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings$FreeFlowCard> r5 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.FreeFlowCard.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r4 == 0) goto L_0x01c8
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46017(0xb3c1, float:6.4484E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings$FreeFlowCard> r3 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.FreeFlowCard.class
                r1[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x03ae
            L_0x01c8:
                int r4 = r1.dialogType
                r2.h = r4
                java.lang.String r4 = r1.dialogUrl
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46020(0xb3c4, float:6.4488E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x0202
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46020(0xb3c4, float:6.4488E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0213
            L_0x0202:
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 == 0) goto L_0x020f
                java.lang.String r4 = ""
                r2.f48577b = r4
                r2.l = r9
                goto L_0x0213
            L_0x020f:
                r2.f48577b = r4
                r2.l = r9
            L_0x0213:
                java.lang.String r4 = r1.settingsTitle
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46025(0xb3c9, float:6.4495E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x0249
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46025(0xb3c9, float:6.4495E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0253
            L_0x0249:
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x0253
                r2.m = r9
                r2.f48581f = r4
            L_0x0253:
                java.lang.String r4 = r1.settingsUrl
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46022(0xb3c6, float:6.449E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x0289
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46022(0xb3c6, float:6.449E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0291
            L_0x0289:
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x0291
                r2.f48578c = r4
            L_0x0291:
                java.lang.String r4 = r1.dialogTitle
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46023(0xb3c7, float:6.4492E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x02c7
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46023(0xb3c7, float:6.4492E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x02de
            L_0x02c7:
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x02de
                int r5 = r4.length()
                r6 = 20
                if (r5 <= r6) goto L_0x02dc
                java.lang.String r4 = r4.substring(r10, r6)
                r2.f48579d = r4
                goto L_0x02de
            L_0x02dc:
                r2.f48579d = r4
            L_0x02de:
                java.lang.String r4 = r1.dialogContent
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46024(0xb3c8, float:6.4493E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x0314
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46024(0xb3c8, float:6.4493E-41)
                java.lang.Class[] r4 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r2
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0345
            L_0x0314:
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x0345
                int r5 = r2.h
                if (r5 != 0) goto L_0x0330
                int r5 = r4.length()
                r6 = 12
                if (r5 <= r6) goto L_0x032d
                java.lang.String r4 = r4.substring(r10, r6)
                r2.f48580e = r4
                goto L_0x0345
            L_0x032d:
                r2.f48580e = r4
                goto L_0x0345
            L_0x0330:
                int r5 = r2.h
                if (r5 != r9) goto L_0x0345
                int r5 = r4.length()
                r6 = 8
                if (r5 <= r6) goto L_0x0343
                java.lang.String r4 = r4.substring(r10, r6)
                r2.f48580e = r4
                goto L_0x0345
            L_0x0343:
                r2.f48580e = r4
            L_0x0345:
                java.lang.String r1 = r1.dialogSlogan
                r2.g = r1
                boolean r1 = com.ss.android.g.a.a()
                if (r1 != 0) goto L_0x03ae
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46019(0xb3c3, float:6.4486E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class<a.i> r17 = a.i.class
                r12 = r2
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x037b
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.freeflowcard.b.f48576a
                r14 = 0
                r15 = 46019(0xb3c3, float:6.4486E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class<a.i> r17 = a.i.class
                r12 = r2
                r16 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                r3 = r1
                a.i r3 = (a.i) r3
                goto L_0x03a0
            L_0x037b:
                com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
                boolean r1 = r1.b()
                if (r1 == 0) goto L_0x038e
                com.ss.android.ugc.aweme.freeflowcard.data.a r1 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                a.i r3 = r1.a((int) r10)
                goto L_0x03a0
            L_0x038e:
                com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
                boolean r1 = r1.c()
                if (r1 == 0) goto L_0x03a0
                com.ss.android.ugc.aweme.freeflowcard.data.a r1 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                a.i r3 = r1.a((int) r9)
            L_0x03a0:
                if (r3 == 0) goto L_0x03ab
                com.ss.android.ugc.aweme.freeflowcard.b$1 r1 = new com.ss.android.ugc.aweme.freeflowcard.b$1
                r1.<init>()
                r3.a((a.g<TResult, TContinuationResult>) r1)
                goto L_0x03ae
            L_0x03ab:
                r2.b()
            L_0x03ae:
                com.ss.android.ugc.aweme.live.e r1 = com.ss.android.ugc.aweme.live.e.f53369b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.live.e.f53368a
                r14 = 0
                r15 = 55393(0xd861, float:7.7622E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings> r3 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x03e4
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.live.e.f53368a
                r14 = 0
                r15 = 55393(0xd861, float:7.7622E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings> r3 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x03ed
            L_0x03e4:
                if (r0 == 0) goto L_0x03ed
                boolean r1 = r0.canLive
                if (r1 == 0) goto L_0x03ed
                com.ss.android.ugc.aweme.story.live.c.a((boolean) r9)
            L_0x03ed:
                org.json.JSONObject r0 = r0.mFusionFuelSdkSettings
                com.rocket.android.api.FusionFuelSdk.injectSettings(r0)
            L_0x03f2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.AwemeSettingManager.UpdateSettingTask.run(android.content.Context):void");
        }

        UpdateSettingTask(Object obj2) {
            this.obj = obj2;
        }
    }

    public final void a(SharedPreferences.Editor editor, AwemeSettings awemeSettings) {
        an<Integer> anVar;
        an<Integer> anVar2;
        String str;
        SharedPreferences.Editor editor2 = editor;
        AwemeSettings awemeSettings2 = awemeSettings;
        if (PatchProxy.isSupport(new Object[]{editor2, awemeSettings2}, this, f63783a, false, 72038, new Class[]{SharedPreferences.Editor.class, AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor2, awemeSettings2}, this, f63783a, false, 72038, new Class[]{SharedPreferences.Editor.class, AwemeSettings.class}, Void.TYPE);
            return;
        }
        boolean z = awemeSettings2.isTargetBindingUser;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, n.f33102a, true, 21355, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, n.f33102a, true, 21355, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            n.e().edit().putBoolean("is_target_binding_user", z).apply();
        }
        String str2 = awemeSettings2.hotsoonDownloadUrl;
        if (PatchProxy.isSupport(new Object[]{str2}, null, n.f33102a, true, 21360, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, n.f33102a, true, 21360, new Class[]{String.class}, Void.TYPE);
        } else {
            n.e().edit().putString("hotsoon_download_url", str2).apply();
        }
        SharePrefCache.inst().getRefreshZhima().b(editor2, Integer.valueOf(awemeSettings2.refreshZhima));
        SharePrefCache.inst().getUseNewFFmpeg().b(editor2, Boolean.valueOf(awemeSettings2.useNewFFmpeg));
        SharePrefCache.inst().getUseLiveWallpaper().b(editor2, Integer.valueOf(awemeSettings2.useLiveWallpaper));
        SharePrefCache.inst().getNewAnchorShowBubble().b(editor2, Boolean.valueOf(awemeSettings2.newAnchorShowBubble));
        SharePrefCache.inst().getHotsoonDownloadUrl().b(editor2, awemeSettings2.hotsoonDownloadUrl);
        if (awemeSettings2.shoppingConfig != null) {
            x.a().N().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.enable));
            SharePrefCache.inst().getEnableShoppingUser().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.enableUser));
            SharePrefCache.inst().getEnableFloatVideo().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.enableFloatVideo));
            SharePrefCache.inst().getOrderShareIntroUrl().b(editor2, awemeSettings2.shoppingConfig.orderShareIntroUrl);
            if (awemeSettings2.shoppingConfig.liveConfig != null) {
                SharePrefCache.inst().getCommerceLiveCompatibleOld().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.liveConfig.commerceLiveCompatibleOld));
                SharePrefCache.inst().getDisableTaobao().b(editor2, Integer.valueOf(awemeSettings2.shoppingConfig.liveConfig.disableTaobao));
            }
            if (awemeSettings2.shoppingConfig.newbieHelp != null) {
                SharePrefCache.inst().getNewbieHelpShopUrl().b(editor2, awemeSettings2.shoppingConfig.newbieHelp.shopUrl);
            }
            SharePrefCache.inst().getEnableLawWindow().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.lawWindow));
            SharePrefCache.inst().getDisableWant().b(editor2, Boolean.valueOf(awemeSettings2.shoppingConfig.disableWant));
        }
        if (awemeSettings2.feConfigs != null) {
            if (awemeSettings2.feConfigs.businessEC != null) {
                if (awemeSettings2.feConfigs.businessEC.pageHome != null) {
                    SharePrefCache.inst().getReactAddShopUrl().b(editor2, awemeSettings2.feConfigs.businessEC.pageHome);
                }
                if (awemeSettings2.feConfigs.businessEC.pageEShopToolbox != null) {
                    SharePrefCache.inst().getReactEShopToolboxUrl().b(editor2, awemeSettings2.feConfigs.businessEC.pageEShopToolbox);
                }
            }
            if (!(awemeSettings2.feConfigs.starAtlasOrder == null || awemeSettings2.feConfigs.starAtlasOrder.publish == null)) {
                SharePrefCache.inst().getStarAtlasOrderWebUrl().b(editor2, awemeSettings2.feConfigs.starAtlasOrder.publish);
            }
            if (!(awemeSettings2.feConfigs.mpTab == null || awemeSettings2.feConfigs.mpTab.publish == null)) {
                SharePrefCache.inst().getMpTab().b(editor2, awemeSettings2.feConfigs.mpTab.publish);
            }
            if (awemeSettings2.feConfigs.live != null) {
                SharePrefCache.inst().getMerchPickerUrl().b(editor2, awemeSettings2.feConfigs.live.merchPickerUrl);
            }
            if (awemeSettings2.feConfigs.seeding != null) {
                SharePrefCache.inst().getShopWishListUrl().b(editor2, awemeSettings2.feConfigs.seeding.shopWishListUrl);
            }
        }
        if (awemeSettings2.oldStyleChallengeIds == null) {
            x.a().i().b(editor2, new HashSet());
        } else {
            x.a().i().b(editor2, awemeSettings2.oldStyleChallengeIds);
        }
        x a2 = x.a();
        if (PatchProxy.isSupport(new Object[0], a2, x.f2698a, false, 22404, new Class[0], an.class)) {
            anVar = (an) PatchProxy.accessDispatch(new Object[0], a2, x.f2698a, false, 22404, new Class[0], an.class);
        } else {
            if (a2.f2701d == null) {
                a2.f2701d = new an<>("forbid_download_local", 0);
            }
            anVar = a2.f2701d;
        }
        anVar.b(editor2, Integer.valueOf(awemeSettings2.forbidDownloadLocal));
        x.a().J().b(editor2, awemeSettings2.negativeShareEntry);
        x a3 = x.a();
        if (PatchProxy.isSupport(new Object[0], a3, x.f2698a, false, 22410, new Class[0], an.class)) {
            anVar2 = (an) PatchProxy.accessDispatch(new Object[0], a3, x.f2698a, false, 22410, new Class[0], an.class);
        } else {
            if (a3.f2702e == null) {
                a3.f2702e = new an<>("feed_display_inner_msg_platform", 0);
            }
            anVar2 = a3.f2702e;
        }
        anVar2.b(editor2, Integer.valueOf(awemeSettings2.feedDisplayInnerMsgPlatform));
        SharePrefCache.inst().getNetworkLibTypeItem().b(editor2, Integer.valueOf(awemeSettings2.netWorkLibType));
        Gson gson = new Gson();
        SharePrefCache.inst().getAdLandingPageConfig().b(editor2, gson.toJson((Object) awemeSettings2.adLandingPageConfig));
        SharePrefCache.inst().getDownloadSdkConfig().b(editor2, gson.toJson(awemeSettings2.downloadSdkConfig));
        SharePrefCache.inst().getUploadContactsPolicyCaption().b(editor2, awemeSettings2.upload_contacts_policy_caption);
        SharePrefCache.inst().getUploadContactsPolicyText().b(editor2, awemeSettings2.upload_contacts_policy_text);
        SharePrefCache.inst().getUploadContactsPolicyPic().b(editor2, awemeSettings2.upload_contacts_policy_pic);
        SharePrefCache.inst().getUploadContactsPolicyTimes().b(editor2, Integer.valueOf(awemeSettings2.upload_contacts_policy_times));
        SharePrefCache.inst().getUploadContactsPolicyInterval().b(editor2, Integer.valueOf(awemeSettings2.upload_contacts_policy_interval));
        SharePrefCache.inst().getFollowFeedAsDefault().b(editor2, Integer.valueOf(awemeSettings2.followFeedAsDefault));
        SharePrefCache.inst().getOpenForward().b(editor2, Integer.valueOf(awemeSettings2.openForward));
        AwemeSettings.UpdateUserConfig updateUserConfig = awemeSettings2.updateUserConfig;
        if (updateUserConfig != null) {
            SharePrefCache.inst().getUpdateUserPosition().b(editor2, Integer.valueOf(updateUserConfig.updateUserPosition));
            SharePrefCache.inst().getUpdateUserTipContent().b(editor2, updateUserConfig.updateUserPolicyContent);
            SharePrefCache.inst().getIsEnableUpdateUserDialog().b(editor2, Boolean.valueOf(updateUserConfig.enableUpdateUserDialog));
            SharePrefCache.inst().getUpdateUserFrequency().b(editor2, Integer.valueOf(updateUserConfig.updateUserFrequency));
        }
        if (awemeSettings2.defaultAvatarUrls != null && !awemeSettings2.defaultAvatarUrls.isEmpty()) {
            SharePrefCache.inst().getDefaultAvatarUrl().b(editor2, new HashSet(awemeSettings2.defaultAvatarUrls));
        }
        AwemeSettings.CompleteProfilePolicy completeProfilePolicy = awemeSettings2.completeProfilePolicy;
        if (completeProfilePolicy != null) {
            SharePrefCache.inst().getCompleteProfilePolicyTimes().b(editor2, Integer.valueOf(completeProfilePolicy.times));
            SharePrefCache.inst().getCompleteProfilePolicyInterval().b(editor2, Integer.valueOf(completeProfilePolicy.interval));
        }
        AwemeSettings.ProfilePerfection profilePerfection = awemeSettings2.profilePerfection;
        if (profilePerfection != null) {
            SharePrefCache.inst().getProfilePerfectionAvatar().b(editor2, Float.valueOf(profilePerfection.avatar));
            SharePrefCache.inst().getProfilePerfectionNickname().b(editor2, Float.valueOf(profilePerfection.nickname));
            SharePrefCache.inst().getProfilePerfectionShortId().b(editor2, Float.valueOf(profilePerfection.shortId));
            SharePrefCache.inst().getProfilePerfectionGender().b(editor2, Float.valueOf(profilePerfection.gender));
            SharePrefCache.inst().getProfilePerfectionBirthday().b(editor2, Float.valueOf(profilePerfection.birthday));
            SharePrefCache.inst().getProfilePerfectionSchool().b(editor2, Float.valueOf(profilePerfection.school));
            SharePrefCache.inst().getProfilePerfectionSignature().b(editor2, Float.valueOf(profilePerfection.signature));
            SharePrefCache.inst().getProfilePerfectionLocation().b(editor2, Float.valueOf(profilePerfection.location));
        }
        if (awemeSettings2.hotSearchWitch != null) {
            SharePrefCache.inst().getIsHotSearchBillboardEnable().b(editor2, Boolean.valueOf(awemeSettings2.hotSearchWitch.isHotSearchBillboardEnable));
            SharePrefCache.inst().getIsHotSearchMusicalBillboardEnable().b(editor2, Boolean.valueOf(awemeSettings2.hotSearchWitch.isHotSearchMusicBillboardEnable));
            SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().b(editor2, Boolean.valueOf(awemeSettings2.hotSearchWitch.isHotSearchAwemeBillboardEnable));
            SharePrefCache.inst().getIsHotSearchPositiveEnergyBillboardEnable().b(editor2, Boolean.valueOf(awemeSettings2.hotSearchWitch.isHotSearchPositiveEnergyBillboardEnable));
            x.a().W().b(editor2, Boolean.valueOf(awemeSettings2.hotSearchWitch.isHotSearchStarBillboardEnable));
        }
        SharePrefCache.inst().getHotSearchWordsShowInterval().b(editor2, Integer.valueOf(awemeSettings2.hotSearchWordShowIntervals));
        SharePrefCache.inst().getIsEnableLocalMusicEntrance().b(editor2, Boolean.valueOf(awemeSettings2.enableLocalMusicEntrance));
        SharePrefCache.inst().getProfileCompletionThreshold().b(editor2, Float.valueOf(awemeSettings2.profileCompletionThreshold));
        SharePrefCache.inst().getIsPrivateAvailable().b(editor2, Boolean.valueOf(awemeSettings2.isPrivateAvailable));
        SharePrefCache.inst().getIsTargetBindingUser().b(editor2, Boolean.valueOf(awemeSettings2.isTargetBindingUser));
        AwemeSettings.FreeFlowCard freeFlowCard = awemeSettings2.freeFlowCard;
        if (freeFlowCard != null) {
            SharePrefCache.inst().getDialogUrl().b(editor2, freeFlowCard.dialogUrl);
            SharePrefCache.inst().getDialogTitle().b(editor2, freeFlowCard.dialogTitle);
            SharePrefCache.inst().getDialogContent().b(editor2, freeFlowCard.dialogContent);
            SharePrefCache.inst().getDialogType().b(editor2, Integer.valueOf(freeFlowCard.dialogType));
            SharePrefCache.inst().getDialogSlogan().b(editor2, freeFlowCard.dialogSlogan);
        }
        SharePrefCache.inst().getEnableUploadPC().a(Boolean.valueOf(awemeSettings2.enableUploadPC));
        AwemeSettings.AdCouponConfig adCouponConfig = awemeSettings2.adCouponConfig;
        SharePrefCache.inst().getShowCouponItem().b(editor2, Boolean.valueOf(adCouponConfig == null || adCouponConfig.show == 1));
        an<String> searchTrendBannerUrl = SharePrefCache.inst().getSearchTrendBannerUrl();
        if (awemeSettings2.searchTrendBannerUrl == null) {
            str = "";
        } else {
            str = UrlModel.toJsonString(awemeSettings2.searchTrendBannerUrl);
        }
        searchTrendBannerUrl.b(editor2, str);
        SharePrefCache.inst().getMusicBillboardRuleUrl().b(editor2, awemeSettings2.musicBillboardRuleUrl == null ? "" : awemeSettings2.musicBillboardRuleUrl);
        SharePrefCache.inst().getStarBillboardRuleUrl().b(editor2, awemeSettings2.starBillboardRuleUrl == null ? "" : awemeSettings2.starBillboardRuleUrl);
        SharePrefCache.inst().getShowAdIntroItem().b(editor2, Boolean.valueOf(awemeSettings.getAdIntroForAdversitserFlag()));
        SharePrefCache.inst().getAdIntroUrlItem().b(editor2, awemeSettings2.adIntroLandingpageUrl);
        a a4 = a.a();
        boolean z2 = awemeSettings2.defaultSecondTab;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, a4, a.f76939a, false, 62688, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, a4, a.f76939a, false, 62688, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            b.b().a((Context) k.a(), "default_second_tab", z2);
        }
        if (awemeSettings2.friendTabSettings != null) {
            a.a();
            b.b().a((Context) k.a(), "default_follow_tab", awemeSettings2.friendTabSettings.defaultFollowTab);
            a.a();
            b.b().a((Context) k.a(), "friend_tab_desc", awemeSettings2.friendTabSettings.friendTabDesc);
        }
        if (awemeSettings2.feConfigCollection != null) {
            AwemeSettings.FeConfigCollection feConfigCollection = awemeSettings2.feConfigCollection;
            if (!(feConfigCollection == null || feConfigCollection.ringtone == null)) {
                SharePrefCache.inst().getMusicRingtoneScheme().b(editor2, awemeSettings2.feConfigCollection.ringtone.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.teenageProtection == null)) {
                SharePrefCache.inst().getTeenagerProtectionScheme().a(awemeSettings2.feConfigCollection.teenageProtection.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.douyincard == null)) {
                SharePrefCache.inst().getDouyinCardScheme().b(editor2, awemeSettings2.feConfigCollection.douyincard.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.billboardStar == null)) {
                SharePrefCache.inst().getBillboardStarScheme().b(editor2, awemeSettings2.feConfigCollection.billboardStar.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.billboardFans == null)) {
                SharePrefCache.inst().getBillboardFansScheme().b(editor2, awemeSettings2.feConfigCollection.billboardFans.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.brandRank == null)) {
                SharePrefCache.inst().getBrandScheme().b(editor2, awemeSettings2.feConfigCollection.brandRank.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.guardianParent == null)) {
                SharePrefCache.inst().getGuardianParentScheme().a(awemeSettings2.feConfigCollection.guardianParent.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.guardianChild == null)) {
                SharePrefCache.inst().getGuardianChildScheme().a(awemeSettings2.feConfigCollection.guardianChild.schema);
            }
            if (!(feConfigCollection == null || feConfigCollection.judgementClause == null)) {
                SharePrefCache.inst().getJudgementClauseScheme().a(awemeSettings2.feConfigCollection.judgementClause.schema);
            }
        }
        if (!(awemeSettings2.feConfigs == null || awemeSettings2.feConfigs.poiConfig == null || TextUtils.isEmpty(awemeSettings2.feConfigs.poiConfig.poiDetail))) {
            SharePrefCache.inst().getPoiErrorReport().b(editor2, awemeSettings2.feConfigs.poiConfig.poiDetail);
        }
        if (!(awemeSettings2.feConfigs == null || awemeSettings2.feConfigs.goodsReport == null || TextUtils.isEmpty(awemeSettings2.feConfigs.goodsReport.publish))) {
            SharePrefCache.inst().getPreviewGoodReport().b(editor2, awemeSettings2.feConfigs.goodsReport.publish);
        }
        if (awemeSettings2.followTabGuideStruct != null) {
            String string = k.g().getString(C0906R.string.afv);
            if (!TextUtils.isEmpty(awemeSettings2.followTabGuideStruct.getFollowTabGuideWord())) {
                string = awemeSettings2.followTabGuideStruct.getFollowTabGuideWord();
            }
            b.b().a((Context) k.a(), "follow_tab_bubble_guide_word", string);
            b.b().a((Context) k.a(), "follow_tab_bubble_guide_time", awemeSettings2.followTabGuideStruct.getFollowTabGuideTime());
        }
        SharePrefCache.inst().getHitRankActivityStatus().b(editor2, Integer.valueOf(awemeSettings2.hitRankActivityStatus));
        SharePrefCache.inst().getHitRankActivityStarBackground().b(editor2, awemeSettings2.hitRankActivityStarBackgroud);
        SharePrefCache.inst().getHitRankActivityProfileBackground().b(editor2, awemeSettings2.hitRankActivityProfileBackground);
        b.b().a((Context) k.a(), "last_setting_version", awemeSettings2.settingVersion);
        c(awemeSettings2);
        h a5 = h.a();
        List<AwemeSettings.DeviceInfo> list = awemeSettings2.forceUseTextureviewDevices;
        if (PatchProxy.isSupport(new Object[]{list}, a5, h.f44945a, false, 40534, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, a5, h.f44945a, false, 40534, new Class[]{List.class}, Void.TYPE);
        } else {
            a5.f44947b = list;
            if (list != null) {
                b.b().a((Context) k.a(), "force_use_textureview", (Object) list);
            }
        }
        b.b().a((Context) k.a(), "request_user_info", awemeSettings2.requestUserInfoForStart);
        b.b().a(k.g(), "force_orange_activity_info_use_api", awemeSettings2.orangeActivityInfoUseApi);
        com.ss.android.ugc.aweme.commercialize.splash.a a6 = com.ss.android.ugc.aweme.commercialize.splash.a.a();
        boolean z3 = awemeSettings2.awesomeSplashFilterEnable;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z3 ? (byte) 1 : 0)}, a6, com.ss.android.ugc.aweme.commercialize.splash.a.f39437a, false, 31982, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z3)}, a6, com.ss.android.ugc.aweme.commercialize.splash.a.f39437a, false, 31982, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.splash.a.f39438b != null) {
            c cVar = com.ss.android.ugc.aweme.commercialize.splash.a.f39438b;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z3)}, cVar, c.f39451a, false, 32009, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z3)}, cVar, c.f39451a, false, 32009, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (cVar.f39455d != null) {
                cVar.f39455d.edit().putBoolean("awesome_splash_filter_enable", z3).apply();
            }
        }
        b.b().a((Context) k.a(), "aweme_switch_1", awemeSettings2.awemeSwitch1On);
        b.b().a((Context) k.a(), "aweme_switch_2", awemeSettings2.awemeSwitch2On);
        b.b().a((Context) k.a(), "is_hot_start_gps", awemeSettings2.enableHotStartGps);
        b.b().a((Context) k.a(), "star_atlas_notice_enable", awemeSettings.isStarAtlasNoticeEnable());
        b.b().a((Context) k.a(), "star_atlas_url_default", awemeSettings.getStarAtlasUrl());
        b.b().a((Context) k.a(), "star_atlas_url_redirect", awemeSettings.getStarAtlasRedirectUrl());
        b.b().a(k.g(), "most_display_times", awemeSettings.getMostDisplayTimes());
        b.b().a(k.g(), "one_display_intervals", awemeSettings.getDisplayIntervals());
        b.b().a(k.g(), "display_duration", awemeSettings.getDisplayDuration());
        editor.apply();
    }

    private void c(AwemeSettings awemeSettings) {
        AwemeSettings awemeSettings2 = awemeSettings;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{awemeSettings2}, this, f63783a, false, 72039, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings2}, this, f63783a, false, 72039, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(awemeSettings2.notSupportDouDevices)) {
            Iterator<AwemeSettings.DeviceInfo> it2 = awemeSettings2.notSupportDouDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AwemeSettings.DeviceInfo next = it2.next();
                if (Build.BRAND.equalsIgnoreCase(next.brand) && Build.DEVICE.equalsIgnoreCase(next.device)) {
                    z = false;
                    break;
                }
            }
            Context context = GlobalContext.getContext();
            if (context != null) {
                try {
                    ((com.ss.android.ugc.aweme.main.b) com.ss.android.ugc.aweme.base.sharedpref.c.a(context, com.ss.android.ugc.aweme.main.b.class)).b(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f63783a, false, 72037, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f63783a, false, 72037, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!(obj2 instanceof Exception)) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new UpdateSettingTask(obj2)).a();
        }
        com.ss.android.ugc.aweme.live.settings.a aVar = com.ss.android.ugc.aweme.live.settings.a.f53535b;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.live.settings.a.f53534a, false, 55949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.live.settings.a.f53534a, false, 55949, new Class[0], Void.TYPE);
            return;
        }
        aVar.f53536c.querySettings().a(com.ss.android.ugc.aweme.live.settings.b.f53538b);
    }

    public final void a(int i, Context context) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), context}, this, f63783a, false, 72036, new Class[]{Integer.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), context}, this, f63783a, false, 72036, new Class[]{Integer.TYPE, Context.class}, Void.TYPE);
            return;
        }
        super.a(i, context);
    }
}
