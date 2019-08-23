package com.ss.android.ugc.aweme.app.services;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/DuoshanService;", "Lcom/ss/android/ugc/aweme/story/api/IDuoshanService;", "()V", "getDuoshanActivitySchemeType", "", "()Ljava/lang/Integer;", "getDuoshanDownloadText", "", "isDuoshanActivityOpen", "", "openDuoshan", "", "context", "Landroid/content/Context;", "scheme", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "callback", "Lcom/ss/android/ugc/aweme/story/api/IDuoshanService$DialogCallback;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34282a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/app/services/DuoshanService$openDuoshan$1", "Lcom/ss/android/ugc/aweme/im/service/callbacks/CommonDialogCallback;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onDismiss", "onShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends com.ss.android.ugc.aweme.im.service.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.a f34284b;

        a(b.a aVar) {
            this.f34284b = aVar;
        }

        public final void a(@Nullable DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f34283a, false, 23621, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f34283a, false, 23621, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            super.a(dialogInterface);
            b.a aVar = this.f34284b;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void b(@Nullable DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f34283a, false, 23622, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f34283a, false, 23622, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            super.b(dialogInterface);
            b.a aVar = this.f34284b;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void c(@Nullable DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f34283a, false, 23623, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f34283a, false, 23623, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            super.c(dialogInterface);
            b.a aVar = this.f34284b;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    @Nullable
    public final Integer a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34282a, false, 23619, new Class[0], Integer.class)) {
            return -1;
        }
        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f34282a, false, 23619, new Class[0], Integer.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        if (r6 == null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.LifeStory r26, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.b.a r27) {
        /*
            r23 = this;
            r1 = r25
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r24
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r26
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f34282a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r13] = r6
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r6 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
            r10[r14] = r6
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b$a> r6 = com.ss.android.ugc.aweme.story.api.b.a.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r8 = 0
            r9 = 23620(0x5c44, float:3.3099E-41)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0062
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r24
            r5[r13] = r1
            r5[r14] = r26
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f34282a
            r19 = 0
            r20 = 23620(0x5c44, float:3.3099E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.LifeStory> r1 = com.ss.android.ugc.aweme.story.api.model.LifeStory.class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b$a> r1 = com.ss.android.ugc.aweme.story.api.b.a.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r17 = r23
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0062:
            if (r24 == 0) goto L_0x00c1
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00c1
            if (r26 != 0) goto L_0x0070
            goto L_0x00c1
        L_0x0070:
            com.ss.android.ugc.aweme.im.service.model.h r4 = new com.ss.android.ugc.aweme.im.service.model.h
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "moment_id"
            java.lang.String r2 = r26.getStoryId()
            r5.put(r6, r2)
            java.lang.String r2 = "enter_from"
            java.lang.String r6 = "aweme"
            r5.put(r2, r6)
            java.lang.String r2 = "uid"
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r7 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getCurUser()
            if (r6 == 0) goto L_0x00a1
            java.lang.String r6 = r6.getUid()
            if (r6 != 0) goto L_0x00a3
        L_0x00a1:
            java.lang.String r6 = ""
        L_0x00a3:
            r5.put(r2, r6)
            r4.f52893a = r1
            java.util.Map r5 = (java.util.Map) r5
            r4.f52894b = r5
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.b.a()
            android.app.Activity r0 = com.ss.android.ugc.aweme.base.utils.v.a((android.content.Context) r24)
            r2 = 10
            com.ss.android.ugc.aweme.app.services.n$a r5 = new com.ss.android.ugc.aweme.app.services.n$a
            r5.<init>(r3)
            com.ss.android.ugc.aweme.im.service.a.a r5 = (com.ss.android.ugc.aweme.im.service.a.a) r5
            r1.wrapperSyncXStory(r0, r4, r2, r5)
            return
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.n.a(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.story.api.model.LifeStory, com.ss.android.ugc.aweme.story.api.b$a):void");
    }
}
