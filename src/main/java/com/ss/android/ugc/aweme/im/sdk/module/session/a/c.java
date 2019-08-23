package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/module/session/session/GroupSession;", "Lcom/ss/android/ugc/aweme/im/sdk/module/session/session/IMBaseSession;", "()V", "buildGroupContent", "Landroid/text/SpannableStringBuilder;", "createAction", "Lcom/ss/android/ugc/aweme/im/service/session/IAction;", "getType", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51907a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "session", "Lcom/ss/android/ugc/aweme/im/service/session/BaseSession;", "actionType", "", "doAction"}, k = 3, mv = {1, 1, 15})
    static final class a implements IAction {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f51909b;

        a(c cVar) {
            this.f51909b = cVar;
        }

        public final void a(Context context, com.ss.android.ugc.aweme.im.service.session.a aVar, int i) {
            final boolean z;
            String str;
            final Context context2 = context;
            final com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51908a, false, 52473, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51908a, false, 52473, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE);
            } else if (i2 == 1 || i2 == 2) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 3);
                ChatRoomActivity.a(context2, this.f51909b.O_(), bundle);
                z.a().a(this.f51909b.O_(), "", "group", "click_message", "message");
            } else {
                if (i2 == 0) {
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "session");
                    final e eVar = new e(aVar.O_());
                    b a2 = eVar.a();
                    if (a2 != null) {
                        z = a2.isStickTop();
                    } else {
                        z = false;
                    }
                    com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                    String[] strArr = new String[2];
                    if (z) {
                        str = context2.getString(C0906R.string.apl);
                    } else {
                        str = context2.getString(C0906R.string.ayg);
                    }
                    strArr[0] = str;
                    strArr[1] = context2.getString(C0906R.string.aqo);
                    aVar3.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f51910a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51910a, false, 52474, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51910a, false, 52474, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            switch (i) {
                                case 0:
                                    eVar.a(!z, (com.bytedance.im.core.a.a.b<b>) new com.bytedance.im.core.a.a.b<b>(this) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f51915a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ AnonymousClass1 f51916b;

                                        {
                                            this.f51916b = r1;
                                        }

                                        public final /* synthetic */ void a(Object obj) {
                                            b bVar = (b) obj;
                                            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51915a, false, 52475, new Class[]{b.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51915a, false, 52475, new Class[]{b.class}, Void.TYPE);
                                                return;
                                            }
                                            Intrinsics.checkParameterIsNotNull(bVar, "result");
                                        }

                                        public final void a(@NotNull j jVar) {
                                            int i;
                                            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51915a, false, 52476, new Class[]{j.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51915a, false, 52476, new Class[]{j.class}, Void.TYPE);
                                                return;
                                            }
                                            Intrinsics.checkParameterIsNotNull(jVar, "error");
                                            if (z) {
                                                i = C0906R.string.apm;
                                            } else {
                                                i = C0906R.string.ayh;
                                            }
                                            com.bytedance.ies.dmt.ui.d.a.b(context2, i).a();
                                        }
                                    });
                                    break;
                                case 1:
                                    d.a();
                                    com.ss.android.ugc.aweme.im.service.session.a aVar = aVar2;
                                    Intrinsics.checkExpressionValueIsNotNull(aVar, "session");
                                    d.b(aVar.O_());
                                    z a2 = z.a();
                                    com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar2;
                                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "session");
                                    a2.b(aVar2.O_());
                                    break;
                            }
                            dialogInterface.dismiss();
                        }
                    });
                    aVar3.b();
                }
            }
        }
    }

    public final int b() {
        return 20;
    }

    @NotNull
    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51907a, false, 52471, new Class[0], IAction.class)) {
            return new a(this);
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51907a, false, 52471, new Class[0], IAction.class);
    }

    @NotNull
    public final SpannableStringBuilder e() {
        boolean z;
        List list;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f51907a, false, 52472, new Class[0], SpannableStringBuilder.class)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[0], this, f51907a, false, 52472, new Class[0], SpannableStringBuilder.class);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b a2 = d.a().a(this.h);
        if (a2 == null) {
            return spannableStringBuilder;
        }
        if (!h() || !a2.isMute()) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.k)) {
            String str = this.k;
            Intrinsics.checkExpressionValueIsNotNull(str, PushConstants.CONTENT);
            this.k = StringsKt.replace$default(str, 10, ' ', false, 4, (Object) null);
            List<n> mentionMessages = a2.getMentionMessages();
            if (mentionMessages != null) {
                Collection arrayList = new ArrayList();
                for (Object next : mentionMessages) {
                    n nVar = (n) next;
                    Intrinsics.checkExpressionValueIsNotNull(nVar, AdvanceSetting.NETWORK_TYPE);
                    if (!nVar.isRecalled()) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Context context = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
                String string = context.getResources().getString(C0906R.string.atj);
                spannableStringBuilder.append(string);
                Context context2 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context2.getResources().getColor(C0906R.color.ak0)), 0, string.length(), 33);
            } else if (a2.getUnreadCount() > 1 && z) {
                n lastMessage = a2.getLastMessage();
                if (lastMessage != null && !lastMessage.isSelf()) {
                    if (a2.getUnreadCount() > 999) {
                        Context context3 = GlobalContext.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
                        spannableStringBuilder.append(context3.getResources().getString(C0906R.string.atk, new Object[]{999}));
                    } else {
                        Context context4 = GlobalContext.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
                        spannableStringBuilder.append(context4.getResources().getString(C0906R.string.atk, new Object[]{Integer.valueOf(this.m)}));
                    }
                }
            }
            spannableStringBuilder.append(this.k);
        }
        return spannableStringBuilder;
    }
}
