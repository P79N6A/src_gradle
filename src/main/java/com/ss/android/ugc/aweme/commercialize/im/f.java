package com.ss.android.ugc.aweme.commercialize.im;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0007J0\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/im/OpenChatExt;", "Lcom/ss/android/ugc/aweme/router/IRouter;", "()V", "getUid", "", "uriString", "isChattingMessageUri", "", "uri", "Landroid/net/Uri;", "open", "context", "Landroid/app/Activity;", "url", "view", "Landroid/view/View;", "Landroid/content/Context;", "", "uid", "ext", "adLog", "Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;", "parseAdLog", "OpenChatTask", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38914a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f38915b = new f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010+\u001a\u00020(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0006\u0010,\u001a\u00020(J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/im/OpenChatExt$OpenChatTask;", "", "ctx", "Landroid/content/Context;", "uid", "", "ext", "imAdLog", "Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;)V", "getCtx", "()Landroid/content/Context;", "getExt", "()Ljava/lang/String;", "im", "Lcom/ss/android/ugc/aweme/im/service/IIMService;", "getIm", "()Lcom/ss/android/ugc/aweme/im/service/IIMService;", "getImAdLog", "()Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;", "loc", "Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "getLoc", "()Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "setLoc", "(Lcom/ss/android/ugc/aweme/poi/LocationBundle;)V", "locDone", "", "getLocDone", "()Z", "setLocDone", "(Z)V", "getUid", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getUser", "()Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "setUser", "(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)V", "checkOpenChatLocked", "", "onGetLocation", "location", "onGetUserInfo", "start", "startGetLocation", "startGetUserInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38916a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final IIMService f38917b = com.ss.android.ugc.aweme.im.b.a(false);
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public IMUser f38918c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.aweme.poi.a f38919d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f38920e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final Context f38921f;
        @Nullable
        public final String g;
        @Nullable
        public final String h;
        @Nullable
        public final com.ss.android.ugc.aweme.im.service.model.a i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.f$a$a  reason: collision with other inner class name */
        static final class C0507a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38922a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f38923b;

            C0507a(a aVar) {
                this.f38923b = aVar;
            }

            public final /* synthetic */ Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f38922a, false, 30840, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f38922a, false, 30840, new Class[0], Void.class);
                }
                a aVar = this.f38923b;
                af a2 = af.a(this.f38923b.f38921f);
                Intrinsics.checkExpressionValueIsNotNull(a2, "LocationHelperCompat.getInstance(ctx)");
                aVar.a(a2.f());
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commercialize/im/OpenChatExt$OpenChatTask$startGetUserInfo$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38924a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f38925b;

            public final void handleMessage(@Nullable Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f38924a, false, 30841, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f38924a, false, 30841, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                if (message != null) {
                    Object obj = message.obj;
                    if (obj != null) {
                        if (obj instanceof Exception) {
                            if (com.ss.android.ugc.aweme.g.a.a()) {
                                com.bytedance.ies.dmt.ui.d.a.b(this.f38925b.f38921f, "debug: query user failed").a();
                            }
                        } else if (obj instanceof User) {
                            this.f38925b.a(IMUser.fromUser((User) obj));
                        }
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, Looper looper) {
                super(looper);
                this.f38925b = aVar;
            }
        }

        private final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f38916a, false, 30839, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38916a, false, 30839, new Class[0], Void.TYPE);
            } else if (this.f38918c != null && this.f38920e) {
                com.ss.android.ugc.aweme.commercialize.im.model.a aVar = new com.ss.android.ugc.aweme.commercialize.im.model.a();
                aVar.ext = this.h;
                aVar.setLoc(this.f38919d);
                IIMService iIMService = this.f38917b;
                if (iIMService != null) {
                    iIMService.startChatWithAdLog(this.f38921f, this.f38918c, this.i, aVar);
                }
            }
        }

        public final synchronized void a(IMUser iMUser) {
            if (PatchProxy.isSupport(new Object[]{iMUser}, this, f38916a, false, 30837, new Class[]{IMUser.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMUser}, this, f38916a, false, 30837, new Class[]{IMUser.class}, Void.TYPE);
                return;
            }
            this.f38918c = iMUser;
            a();
        }

        public final synchronized void a(com.ss.android.ugc.aweme.poi.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f38916a, false, 30838, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f38916a, false, 30838, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
                return;
            }
            this.f38919d = aVar;
            this.f38920e = true;
            a();
        }

        public a(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable com.ss.android.ugc.aweme.im.service.model.a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "ctx");
            this.f38921f = context;
            this.g = str;
            this.h = str2;
            this.i = aVar;
        }
    }

    private f() {
    }

    public final boolean a(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f38914a, false, 30831, new Class[]{String.class}, Boolean.TYPE)) {
            return a((Activity) null, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f38914a, false, 30831, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    private final com.ss.android.ugc.aweme.im.service.model.a a(Uri uri) {
        Uri uri2 = uri;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f38914a, false, 30827, new Class[]{Uri.class}, com.ss.android.ugc.aweme.im.service.model.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.model.a) PatchProxy.accessDispatch(new Object[]{uri2}, this, f38914a, false, 30827, new Class[]{Uri.class}, com.ss.android.ugc.aweme.im.service.model.a.class);
        }
        String queryParameter = uri2.getQueryParameter("cid");
        String queryParameter2 = uri2.getQueryParameter("log_extra");
        CharSequence charSequence = queryParameter;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return null;
        }
        return new com.ss.android.ugc.aweme.im.service.model.a(queryParameter2, queryParameter);
    }

    @JvmStatic
    private static boolean b(@Nullable Uri uri) {
        String str;
        if (PatchProxy.isSupport(new Object[]{uri}, null, f38914a, true, 30828, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, null, f38914a, true, 30828, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        }
        String str2 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (StringsKt.equals("chatting", str, true)) {
            if (uri != null) {
                str2 = uri.getPath();
            }
            if (StringsKt.equals("/message", str2, true)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    @Nullable
    public static final String c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f38914a, true, 30830, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f38914a, true, 30830, new Class[]{String.class}, String.class);
        } else if (!b(str)) {
            return null;
        } else {
            return Uri.parse(str).getQueryParameter("uid");
        }
    }

    @JvmStatic
    public static final boolean b(@Nullable String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, f38914a, true, 30829, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f38914a, true, 30829, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            String str3 = null;
            if (parse != null) {
                str2 = parse.getHost();
            } else {
                str2 = null;
            }
            if (StringsKt.equals("chatting", str2, true)) {
                if (parse != null) {
                    str3 = parse.getPath();
                }
                if (StringsKt.equals("/message", str3, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull Context context, @NotNull Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f38914a, true, 30826, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f38914a, true, 30826, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(uri2, "uri");
        if (!b(uri)) {
            return false;
        }
        a(context2, uri2.getQueryParameter("uid"), uri2.getQueryParameter("ext"), f38915b.a(uri2));
        return true;
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str) {
        Context context;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{activity, str}, this, f38914a, false, 30832, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str}, this, f38914a, false, 30832, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (activity != null) {
            context = activity;
        } else {
            context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        }
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        return a(context, parse);
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str, @Nullable View view) {
        if (!PatchProxy.isSupport(new Object[]{activity, str, view}, this, f38914a, false, 30833, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return a(activity, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str, view}, this, f38914a, false, 30833, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @JvmOverloads
    private static void a(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable com.ss.android.ugc.aweme.im.service.model.a aVar) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        com.ss.android.ugc.aweme.im.service.model.a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, aVar2}, null, f38914a, true, 30824, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, str4, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38914a, true, 30824, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        a aVar3 = new a(context2, str3, str4, aVar2);
        if (PatchProxy.isSupport(new Object[0], aVar3, a.f38916a, false, 30834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar3, a.f38916a, false, 30834, new Class[0], Void.TYPE);
            return;
        }
        if (aVar3.f38917b != null) {
            CharSequence charSequence = aVar3.g;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[0], aVar3, a.f38916a, false, 30835, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar3, a.f38916a, false, 30835, new Class[0], Void.TYPE);
                } else {
                    e.a().a(new a.b(aVar3, Looper.getMainLooper()), aVar3.g);
                }
                if (PatchProxy.isSupport(new Object[0], aVar3, a.f38916a, false, 30836, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar3, a.f38916a, false, 30836, new Class[0], Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.utils.permission.a.a(aVar3.f38921f, af.f2626c)) {
                    aVar3.a((com.ss.android.ugc.aweme.poi.a) null);
                } else {
                    i.a((Callable<TResult>) new a.C0507a<TResult>(aVar3), (Executor) i.f1051a);
                }
            }
        }
    }
}
