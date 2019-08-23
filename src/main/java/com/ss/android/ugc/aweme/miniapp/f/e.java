package com.ss.android.ugc.aweme.miniapp.f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.accountsdk.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.services.ac;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.main.h.c;
import com.ss.android.ugc.aweme.miniapp.dialog.MicroAppShareDialog;
import com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.share.ax;
import com.tt.appbrandimpl.RequestGameVideoHandler;
import com.tt.appbrandimpl.friends.ShareMicroGameActivity;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.option.share.OnShareDialogEventListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3586a;

    /* renamed from: b  reason: collision with root package name */
    MicroAppShareDialog f3587b;

    public final void a(Activity activity, String str, int i, boolean z) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str, 100, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3586a, false, 59422, new Class[]{Activity.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, 100, Byte.valueOf(z)}, this, f3586a, false, 59422, new Class[]{Activity.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, CrossPlatformActivity.class);
        if (z) {
            intent.setData(Uri.parse(str));
            activity2.startActivityForResult(intent, 100);
        } else {
            intent.setFlags(603979776);
        }
        activity2.startActivity(intent);
    }

    public final boolean a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f3586a, false, 59423, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f3586a, false, 59423, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(com.ss.android.ugc.aweme.app.e.f34152b, str4) && !TextUtils.equals(com.ss.android.ugc.aweme.app.e.f34154d, str4)) {
            return false;
        } else {
            com.ss.android.ugc.aweme.app.f.f34171e.a(context2, str3, null);
            return true;
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3586a, false, 59424, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59424, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a(i.a().getContext()) || System.currentTimeMillis() - p.a().f2670b.g < 5000) {
            z = true;
        }
        return z;
    }

    public final boolean a(Activity activity, @Nullable String str, @Nullable List<String> list, int i) {
        Activity activity2 = activity;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, str, list2, Integer.valueOf(i)}, this, f3586a, false, 59425, new Class[]{Activity.class, String.class, List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str, list2, Integer.valueOf(i)}, this, f3586a, false, 59425, new Class[]{Activity.class, String.class, List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a.i.a((Callable<TResult>) new f<TResult>(activity2, list2, i), a.i.f1052b);
        return true;
    }

    public final void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f3586a, false, 59426, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f3586a, false, 59426, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.f.f34171e.a(context2, str2, null);
    }

    public final boolean a(Context context, String str, boolean z) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, (byte) 0}, this, f3586a, false, 59427, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return g.a(context2, str2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 0}, this, f3586a, false, 59427, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, this, f3586a, false, 59428, new Class[]{Context.class, String.class, String.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f3586a, false, 59428, new Class[]{Context.class, String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{context2, str4, "", str5, str6}, null, UserProfileActivity.f62385b, true, 69122, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr2 = {context2, str4, "", str5, str6};
            Object[] objArr3 = objArr2;
            PatchProxy.accessDispatch(objArr3, null, UserProfileActivity.f62385b, true, 69122, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (!(context2 == null || str4 == null || str4.equals(""))) {
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtra("enter_method", str6);
            intent.putExtra("enter_from", str5);
            intent.putExtra("uid", str4);
            intent.putExtra("sec_user_id", "");
            context2.startActivity(intent);
        }
        return true;
    }

    public final void a(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, (byte) 1}, this, f3586a, false, 59433, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, (byte) 1}, this, f3586a, false, 59433, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        QRCodePermissionActivity.a(context2, true);
    }

    public final IAsyncHostDataHandler b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3586a, false, 59436, new Class[0], IAsyncHostDataHandler.class)) {
            return new RequestGameVideoHandler();
        }
        return (IAsyncHostDataHandler) PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59436, new Class[0], IAsyncHostDataHandler.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3586a, false, 59437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59437, new Class[0], Void.TYPE);
            return;
        }
        ServiceManager.get().bind(c.class, new ServiceProvider<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55752a;

            public final /* synthetic */ Object get() {
                if (!PatchProxy.isSupport(new Object[0], this, f55752a, false, 59449, new Class[0], c.class)) {
                    return new ac();
                }
                return (c) PatchProxy.accessDispatch(new Object[0], this, f55752a, false, 59449, new Class[0], c.class);
            }
        }).asSingleton();
        a.a(k.a());
    }

    public final Activity e() {
        if (!PatchProxy.isSupport(new Object[0], this, f3586a, false, 59440, new Class[0], Activity.class)) {
            return (Activity) com.ss.android.ugc.aweme.g.i.get();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59440, new Class[0], Activity.class);
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f3586a, false, 59441, new Class[0], Boolean.TYPE)) {
            return ((Boolean) SharePrefCache.inst().getShowMiniAppFreshGuideDialog().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59441, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3586a, false, 59442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59442, new Class[0], Void.TYPE);
            return;
        }
        SharePrefCache.inst().getShowMiniAppFreshGuideDialog().a(Boolean.FALSE);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3586a, false, 59439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3586a, false, 59439, new Class[0], Void.TYPE);
            return;
        }
        SharePrefCache.inst().getShowMiniAppFreshGuideDialog().a(Boolean.TRUE);
        SharePrefCache.inst().getShowMiniAppFreshGuideNotify().a(Boolean.TRUE);
        SharePrefCache.inst().getShowMiniAppFreshGuideBubble().a(Boolean.TRUE);
    }

    private static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f3586a, true, 59444, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f3586a, true, 59444, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            try {
                return ToolUtils.isApplicationForeground(context2, context.getPackageName());
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public final void a(Activity activity, Intent intent) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, this, f3586a, false, 59438, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, this, f3586a, false, 59438, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        intent2.setClass(activity2, DetailActivity.class);
        activity.startActivity(intent);
    }

    public final boolean b(@NonNull Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f3586a, false, 59443, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f3586a, false, 59443, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String optString = new JSONObject(str2).optString("web_url");
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setFlags(268435456);
            intent.setData(Uri.parse(optString));
            context2.startActivity(intent);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final void a(Activity activity, OnShareDialogEventListener onShareDialogEventListener) {
        Activity activity2 = activity;
        OnShareDialogEventListener onShareDialogEventListener2 = onShareDialogEventListener;
        if (PatchProxy.isSupport(new Object[]{activity2, onShareDialogEventListener2}, this, f3586a, false, 59431, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, onShareDialogEventListener2}, this, f3586a, false, 59431, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new h<TResult>(this, activity2, onShareDialogEventListener2), a.i.f1052b);
    }

    public final void a(@NonNull Activity activity, ShareInfoModel shareInfoModel) {
        IShareService.ShareStruct shareStruct;
        String str;
        Activity activity2 = activity;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2}, this, f3586a, false, 59429, new Class[]{Activity.class, ShareInfoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2}, this, f3586a, false, 59429, new Class[]{Activity.class, ShareInfoModel.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, (byte) 1}, null, com.ss.android.ugc.aweme.feed.share.i.f46055a, true, 42132, new Class[]{Context.class, ShareInfoModel.class, Boolean.TYPE}, IShareService.ShareStruct.class)) {
            shareStruct = (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, (byte) 1}, null, com.ss.android.ugc.aweme.feed.share.i.f46055a, true, 42132, new Class[]{Context.class, ShareInfoModel.class, Boolean.TYPE}, IShareService.ShareStruct.class);
        } else {
            IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
            shareStruct2.identifier = shareInfoModel2.appInfo.appId;
            shareStruct2.appName = shareInfoModel2.appInfo.appName;
            shareStruct2.title = shareInfoModel2.title;
            shareStruct2.thumbUrl = shareInfoModel2.imageUrl;
            shareStruct2.url = com.ss.android.ugc.aweme.feed.share.i.a(shareInfoModel2.ugUrl);
            com.ss.android.ugc.aweme.base.c.b(shareInfoModel2.imageUrl);
            shareStruct2.itemType = "game";
            HashMap<String, String> hashMap = new HashMap<>();
            boolean isMicroGameSchema = ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).isMicroGameSchema(shareInfoModel2.schema);
            hashMap.put("isGame", String.valueOf(isMicroGameSchema));
            if (isMicroGameSchema) {
                str = shareInfoModel2.appInfo.query;
            } else {
                str = shareInfoModel2.appInfo.startPage;
            }
            com.ss.android.ugc.aweme.miniapp_api.model.k kVar = new com.ss.android.ugc.aweme.miniapp_api.model.k();
            kVar.f56037a = "awe_friend";
            hashMap.put("token", shareInfoModel2.token);
            hashMap.put(PushConstants.EXTRA, new Gson().toJson((Object) kVar));
            hashMap.put("query", str);
            hashMap.put("app_id", shareInfoModel2.appInfo.appId);
            shareStruct2.extraParams = hashMap;
            shareStruct2.setThumbPath(null);
            shareStruct2.uid4Share = null;
            shareStruct2.shareText = null;
            shareStruct2.groupId = 0;
            shareStruct2.itemId = 0;
            shareStruct2.adId = 0;
            shareStruct = shareStruct2;
        }
        bundle.putSerializable("share_struct", shareStruct);
        ShareMicroGameActivity.start(activity2, bundle);
    }

    public final void b(Context context, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, this, f3586a, false, 59435, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, this, f3586a, false, 59435, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        g.a(context, str, str2);
    }

    public final void a(Activity activity, int i, int i2) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f3586a, false, 59434, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f3586a, false, 59434, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, MiniAppMediaChooseEmptyActivity.class);
        intent.putExtra("key_choose_num", i2);
        switch (i) {
            case 1:
                intent.putExtra("key_choose_type", 1);
                break;
            case 2:
                intent.putExtra("key_choose_type", 2);
                break;
        }
        activity2.startActivityForResult(intent, 11);
    }

    public final void b(Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        Activity activity2 = activity;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        OnShareEventListener onShareEventListener2 = onShareEventListener;
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f3586a, false, 59432, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f3586a, false, 59432, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
            return;
        }
        if (shareInfoModel2 != null) {
            if (!TextUtils.equals(shareInfoModel2.shareType, "chat_mergeIM")) {
                new ax(activity2, com.ss.android.ugc.aweme.feed.share.command.e.a(shareInfoModel2, (Context) activity2), onShareEventListener2).show();
            } else if (this.f3587b != null) {
                shareInfoModel2.shareType = "chat_merge";
                this.f3587b.updateShareStruct(com.ss.android.ugc.aweme.feed.share.i.a((Context) activity, shareInfoModel));
                MicroAppShareDialog microAppShareDialog = this.f3587b;
                if (PatchProxy.isSupport(new Object[]{onShareEventListener2}, microAppShareDialog, MicroAppShareDialog.f55690a, false, 59225, new Class[]{OnShareEventListener.class}, Void.TYPE)) {
                    MicroAppShareDialog microAppShareDialog2 = microAppShareDialog;
                    PatchProxy.accessDispatch(new Object[]{onShareEventListener2}, microAppShareDialog2, MicroAppShareDialog.f55690a, false, 59225, new Class[]{OnShareEventListener.class}, Void.TYPE);
                } else if (microAppShareDialog.f55694e != null) {
                    microAppShareDialog.f55694e.a(microAppShareDialog.getShareStruct(), new com.ss.android.ugc.aweme.feed.widget.g(onShareEventListener2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55705a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ OnShareEventListener f55706b;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f55705a, false, 59232, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f55705a, false, 59232, new Class[0], Void.TYPE);
                                return;
                            }
                            if (this.f55706b != null) {
                                this.f55706b.onSuccess(null);
                            }
                        }

                        {
                            this.f55706b = r2;
                        }
                    });
                } else {
                    IIMService a2 = b.a(false);
                    if (a2 != null) {
                        a2.directlyShare(microAppShareDialog.f55691b, microAppShareDialog, -1, new com.ss.android.ugc.aweme.im.service.a.b(onShareEventListener2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55708a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ OnShareEventListener f55709b;

                            public final void a(int i) {
                            }

                            public final void a(Object obj) {
                            }

                            {
                                this.f55709b = r2;
                            }

                            public final void a(IMContact iMContact, boolean z) {
                                if (PatchProxy.isSupport(new Object[]{iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55708a, false, 59235, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{iMContact, Byte.valueOf(z)}, this, f55708a, false, 59235, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (this.f55709b != null) {
                                    this.f55709b.onSuccess(null);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public final void a(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        Activity activity2 = activity;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        OnShareEventListener onShareEventListener2 = onShareEventListener;
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f3586a, false, 59430, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f3586a, false, 59430, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new g<TResult>(activity2, shareInfoModel2, onShareEventListener2), a.i.f1052b);
    }
}
