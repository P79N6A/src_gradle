package com.ss.android.ugc.aweme.miniapp;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.miniapp.c.a;
import com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.tt.appbrandimpl.PublishExtra;
import com.tt.essential.HostEssentialDepend;
import com.tt.miniapphost.entity.InitParamsEntity;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.share.OnShareDialogEventListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class c implements HostEssentialDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55595a;

    public final boolean handleActivityLoginResult(int i, int i2, Intent intent) {
        return false;
    }

    @NonNull
    public final boolean handleActivityShareResult(int i, int i2, Intent intent) {
        return i == 1;
    }

    public final boolean openLoginActivity(@NonNull Activity activity) {
        return false;
    }

    public final InitParamsEntity createInitParams() {
        if (PatchProxy.isSupport(new Object[0], this, f55595a, false, 58997, new Class[0], InitParamsEntity.class)) {
            return (InitParamsEntity) PatchProxy.accessDispatch(new Object[0], this, f55595a, false, 58997, new Class[0], InitParamsEntity.class);
        }
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1006, "com.ss.android.ugc.aweme.fileprovider");
        return new InitParamsEntity.Builder().setAppId(q.a().f55895b).setChannel(q.a().f55896c).setVersionCode(q.a().f55897d).setPluginVersion(q.a().f55898e).setAppName(q.a().f55899f).setUaName("").setStrMap(sparseArray).build();
    }

    public final void showShareDialog(@NonNull Activity activity, OnShareDialogEventListener onShareDialogEventListener) {
        Activity activity2 = activity;
        OnShareDialogEventListener onShareDialogEventListener2 = onShareDialogEventListener;
        if (PatchProxy.isSupport(new Object[]{activity2, onShareDialogEventListener2}, this, f55595a, false, 59004, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, onShareDialogEventListener2}, this, f55595a, false, 59004, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2, onShareDialogEventListener2}, this, f55595a, false, 59005, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, onShareDialogEventListener2}, this, f55595a, false, 59005, new Class[]{Activity.class, OnShareDialogEventListener.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new e<TResult>(activity2, onShareDialogEventListener2), i.f1052b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadImage(@android.support.annotation.NonNull android.content.Context r20, com.tt.essential.LoaderOptions r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f55595a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<com.tt.essential.LoaderOptions> r4 = com.tt.essential.LoaderOptions.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 58998(0xe676, float:8.2674E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f55595a
            r15 = 0
            r16 = 58998(0xe676, float:8.2674E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.tt.essential.LoaderOptions> r1 = com.tt.essential.LoaderOptions.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r20
            r3[r11] = r1
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.miniapp.e.a.f55742a
            r6 = 1
            r7 = 59407(0xe80f, float:8.3247E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9
            java.lang.Class<com.tt.essential.LoaderOptions> r9 = com.tt.essential.LoaderOptions.class
            r8[r11] = r9
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.e.a.f55742a
            r15 = 1
            r16 = 59407(0xe80f, float:8.3247E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.tt.essential.LoaderOptions> r1 = com.tt.essential.LoaderOptions.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0083:
            if (r1 == 0) goto L_0x01ec
            java.lang.String r0 = r1.url
            r3 = 0
            if (r0 == 0) goto L_0x00b5
            com.squareup.picasso.s r0 = com.ss.android.ugc.aweme.miniapp.e.a.a()
            java.lang.String r4 = r1.url
            if (r4 != 0) goto L_0x0099
            com.squareup.picasso.w r4 = new com.squareup.picasso.w
            r4.<init>(r0, r3, r10)
        L_0x0097:
            r3 = r4
            goto L_0x00f9
        L_0x0099:
            java.lang.String r3 = r4.trim()
            int r3 = r3.length()
            if (r3 == 0) goto L_0x00ad
            android.net.Uri r3 = android.net.Uri.parse(r4)
            com.squareup.picasso.w r0 = r0.a((android.net.Uri) r3)
        L_0x00ab:
            r3 = r0
            goto L_0x00f9
        L_0x00ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Path must not be empty."
            r0.<init>(r1)
            throw r0
        L_0x00b5:
            java.io.File r0 = r1.file
            if (r0 == 0) goto L_0x00d0
            com.squareup.picasso.s r0 = com.ss.android.ugc.aweme.miniapp.e.a.a()
            java.io.File r4 = r1.file
            if (r4 != 0) goto L_0x00c7
            com.squareup.picasso.w r4 = new com.squareup.picasso.w
            r4.<init>(r0, r3, r10)
            goto L_0x0097
        L_0x00c7:
            android.net.Uri r3 = android.net.Uri.fromFile(r4)
            com.squareup.picasso.w r0 = r0.a((android.net.Uri) r3)
            goto L_0x00ab
        L_0x00d0:
            int r0 = r1.drawableResId
            if (r0 == 0) goto L_0x00eb
            com.squareup.picasso.s r0 = com.ss.android.ugc.aweme.miniapp.e.a.a()
            int r4 = r1.drawableResId
            if (r4 == 0) goto L_0x00e3
            com.squareup.picasso.w r5 = new com.squareup.picasso.w
            r5.<init>(r0, r3, r4)
            r3 = r5
            goto L_0x00f9
        L_0x00e3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Resource ID must not be zero."
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            android.net.Uri r0 = r1.uri
            if (r0 == 0) goto L_0x00f9
            com.squareup.picasso.s r0 = com.ss.android.ugc.aweme.miniapp.e.a.a()
            android.net.Uri r3 = r1.uri
            com.squareup.picasso.w r3 = r0.a((android.net.Uri) r3)
        L_0x00f9:
            if (r3 == 0) goto L_0x01e4
            int r0 = r1.targetHeight
            if (r0 <= 0) goto L_0x010a
            int r0 = r1.targetWidth
            if (r0 <= 0) goto L_0x010a
            int r0 = r1.targetWidth
            int r4 = r1.targetHeight
            r3.a((int) r0, (int) r4)
        L_0x010a:
            boolean r0 = r1.isCenterInside
            if (r0 == 0) goto L_0x011f
            com.squareup.picasso.v$a r0 = r3.f27473a
            boolean r4 = r0.f27467a
            if (r4 != 0) goto L_0x0117
            r0.f27468b = r11
            goto L_0x013a
        L_0x0117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Center inside can not be used after calling centerCrop"
            r0.<init>(r1)
            throw r0
        L_0x011f:
            boolean r0 = r1.isCenterCrop
            if (r0 == 0) goto L_0x0134
            com.squareup.picasso.v$a r0 = r3.f27473a
            boolean r4 = r0.f27468b
            if (r4 != 0) goto L_0x012c
            r0.f27467a = r11
            goto L_0x013a
        L_0x012c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Center crop can not be used after calling centerInside"
            r0.<init>(r1)
            throw r0
        L_0x0134:
            boolean r0 = r1.isFitXY
            if (r0 == 0) goto L_0x013a
            r3.f27474b = r11
        L_0x013a:
            android.graphics.Bitmap$Config r0 = r1.config
            if (r0 == 0) goto L_0x0144
            android.graphics.Bitmap$Config r0 = r1.config
            com.squareup.picasso.v$a r4 = r3.f27473a
            r4.f27470d = r0
        L_0x0144:
            int r0 = r1.errorResId
            if (r0 == 0) goto L_0x0163
            int r0 = r1.errorResId
            if (r0 == 0) goto L_0x015b
            android.graphics.drawable.Drawable r4 = r3.g
            if (r4 != 0) goto L_0x0153
            r3.f27477e = r0
            goto L_0x0163
        L_0x0153:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Error image already set."
            r0.<init>(r1)
            throw r0
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Error image resource invalid."
            r0.<init>(r1)
            throw r0
        L_0x0163:
            int r0 = r1.placeholderResId
            if (r0 == 0) goto L_0x018e
            int r0 = r1.placeholderResId
            boolean r4 = r3.f27475c
            if (r4 == 0) goto L_0x0186
            if (r0 == 0) goto L_0x017e
            android.graphics.drawable.Drawable r4 = r3.f27478f
            if (r4 != 0) goto L_0x0176
            r3.f27476d = r0
            goto L_0x018e
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Placeholder image already set."
            r0.<init>(r1)
            throw r0
        L_0x017e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Placeholder image resource invalid."
            r0.<init>(r1)
            throw r0
        L_0x0186:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already explicitly declared as no placeholder."
            r0.<init>(r1)
            throw r0
        L_0x018e:
            float r0 = r1.bitmapAngle
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.miniapp.e.a$b r0 = new com.ss.android.ugc.aweme.miniapp.e.a$b
            float r4 = r1.bitmapAngle
            r0.<init>(r4)
            com.squareup.picasso.v$a r4 = r3.f27473a
            r0.a()
            java.util.List<com.squareup.picasso.ab> r5 = r4.f27469c
            if (r5 != 0) goto L_0x01ac
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r4.f27469c = r5
        L_0x01ac:
            java.util.List<com.squareup.picasso.ab> r2 = r4.f27469c
            r2.add(r0)
        L_0x01b1:
            boolean r0 = r1.skipMemoryCache
            if (r0 == 0) goto L_0x01c0
            com.squareup.picasso.o r0 = com.squareup.picasso.o.NO_CACHE
            com.squareup.picasso.o[] r2 = new com.squareup.picasso.o[r11]
            com.squareup.picasso.o r4 = com.squareup.picasso.o.NO_STORE
            r2[r10] = r4
            r3.a((com.squareup.picasso.o) r0, (com.squareup.picasso.o[]) r2)
        L_0x01c0:
            boolean r0 = r1.skipDiskCache
            if (r0 == 0) goto L_0x01cf
            com.squareup.picasso.p r0 = com.squareup.picasso.p.NO_CACHE
            com.squareup.picasso.p[] r2 = new com.squareup.picasso.p[r11]
            com.squareup.picasso.p r4 = com.squareup.picasso.p.NO_STORE
            r2[r10] = r4
            r3.a((com.squareup.picasso.p) r0, (com.squareup.picasso.p[]) r2)
        L_0x01cf:
            android.view.View r0 = r1.targetView
            boolean r0 = r0 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x01ec
            android.view.View r0 = r1.targetView
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.miniapp.e.a$a r2 = new com.ss.android.ugc.aweme.miniapp.e.a$a
            com.tt.essential.BitmapLoadCallback r1 = r1.bitmapLoadCallBack
            r2.<init>(r1)
            r3.a((android.widget.ImageView) r0, (com.squareup.picasso.e) r2)
            goto L_0x01ec
        L_0x01e4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "requestCreator must not be null"
            r0.<init>(r1)
            throw r0
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.c.loadImage(android.content.Context, com.tt.essential.LoaderOptions):void");
    }

    public final boolean share(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        IShareService.ShareStruct shareStruct;
        Activity activity2 = activity;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        final OnShareEventListener onShareEventListener2 = onShareEventListener;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59000, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59000, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)).booleanValue();
        } else if (shareInfoModel2 == null || shareInfoModel2.appInfo == null) {
            return false;
        } else if (TextUtils.equals("video", shareInfoModel2.channel)) {
            if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59001, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59001, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)).booleanValue();
            } else if (!TextUtils.isEmpty(shareInfoModel2.gameRecordVideoPath)) {
                String str = shareInfoModel2.appInfo.appId;
                String str2 = shareInfoModel2.appInfo.appName;
                String str3 = shareInfoModel2.gameRecordVideoPath;
                String str4 = shareInfoModel2.gameRecordVideoExtraArgs;
                if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str3, str4}, this, f55595a, false, 59006, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str, str2, str3, str4}, this, f55595a, false, 59006, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (PatchProxy.isSupport(new Object[]{activity2, str, str3}, null, h.f55769a, true, 59016, new Class[]{Activity.class, String.class, String.class}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str, str3}, null, h.f55769a, true, 59016, new Class[]{Activity.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
                    } else if (!h.a(activity2, str3)) {
                        Intent intent = new Intent(activity2, MainProcessProxyActivity.class);
                        q qVar = new q();
                        qVar.setAppId(str);
                        h.a(null, intent, qVar, 1);
                        intent.putExtra("micro_app_class", activity.getClass());
                        intent.putExtra("micro_app_info", qVar);
                        intent.putExtra("micro_app_class", activity.getClass());
                        String uuid = UUID.randomUUID().toString();
                        intent.putExtra("creation_id", uuid);
                        intent.putExtra("shoot_way", "record_screen");
                        intent.putExtra("file_path", str3);
                        intent.putExtra("extra_cross_process", true);
                        intent.putExtra("extra_cross_process_boolean_extra", a.f55600b.a());
                        intent.putExtra("proxy_type", 2);
                        activity2.startActivity(intent);
                        HostProcessBridge.logEvent("shoot", new JSONObject(d.a().a("shoot_way", "record_screen").a("creation_id", uuid).a("enter_from", "mp").f34114b));
                    }
                }
                return true;
            } else {
                if (TextUtils.isEmpty(shareInfoModel2.extra)) {
                    h.a(activity, shareInfoModel, onShareEventListener);
                } else if (!TextUtils.isEmpty(((PublishExtra) new Gson().fromJson(shareInfoModel2.extra, PublishExtra.class)).getVideoPath())) {
                    if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, null, h.f55769a, true, 59017, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, null, h.f55769a, true, 59017, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Boolean.TYPE)).booleanValue();
                    } else if (shareInfoModel2 != null) {
                        PublishExtra publishExtra = (PublishExtra) new Gson().fromJson(shareInfoModel2.extra, PublishExtra.class);
                        if (!h.a(activity2, publishExtra.getVideoPath())) {
                            Intent intent2 = new Intent(activity2, MainProcessProxyActivity.class);
                            intent2.putExtra("file_path", publishExtra.getVideoPath());
                            intent2.putExtra("micro_app_id", shareInfoModel2.appInfo.appId);
                            q qVar2 = new q();
                            qVar2.setAppId(shareInfoModel2.appInfo.appId);
                            qVar2.setAppTitle(shareInfoModel2.title);
                            qVar2.setAppUrl(shareInfoModel2.queryString);
                            qVar2.setCardImage(shareInfoModel2.imageUrl);
                            h.a(onShareEventListener2, intent2);
                            h.a(shareInfoModel2, intent2, qVar2, 1);
                            intent2.putExtra("micro_app_info", qVar2);
                            intent2.putExtra("micro_app_class", activity.getClass());
                            String uuid2 = UUID.randomUUID().toString();
                            intent2.putExtra("creation_id", uuid2);
                            intent2.putExtra("shoot_way", "record_screen");
                            intent2.putExtra("extra_cross_process", true);
                            intent2.putExtra("extra_cross_process_boolean_extra", a.f55600b.a());
                            intent2.putExtra("proxy_type", 2);
                            activity2.startActivity(intent2);
                            HostProcessBridge.logEvent("shoot", new JSONObject(d.a().a("shoot_way", "record_screen").a("creation_id", uuid2).a("enter_from", "mp").f34114b));
                        }
                    }
                } else {
                    h.a(activity, shareInfoModel, onShareEventListener);
                }
                return false;
            }
        } else {
            if (TextUtils.equals("fancyCodeShare", shareInfoModel2.channel)) {
                if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59003, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59003, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
                } else {
                    i.a((Callable<TResult>) new d<TResult>(activity2, shareInfoModel2, onShareEventListener2), i.f1052b);
                }
            } else if (TextUtils.equals("aweme_friend", shareInfoModel2.channel)) {
                if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2}, this, f55595a, false, 59002, new Class[]{Activity.class, ShareInfoModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2}, this, f55595a, false, 59002, new Class[]{Activity.class, ShareInfoModel.class}, Void.TYPE);
                } else {
                    f fVar = q.a().i;
                    if (fVar != null) {
                        fVar.a(activity2, shareInfoModel2);
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59007, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59007, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59008, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, this, f55595a, false, 59008, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
                    } else if (shareInfoModel2 != null) {
                        f fVar2 = q.a().i;
                        if (TextUtils.equals(shareInfoModel2.shareType, "chat_mergeIM") || !TextUtils.equals(shareInfoModel2.shareType, "chat_merge")) {
                            fVar2.b(activity2, shareInfoModel2, onShareEventListener2);
                            return false;
                        }
                        Intent intent3 = new Intent(activity2, MainProcessProxyActivity.class);
                        intent3.putExtra("proxy_type", 3);
                        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2}, null, f55595a, true, 59009, new Class[]{Context.class, ShareInfoModel.class}, IShareService.ShareStruct.class)) {
                            shareStruct = (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2}, null, f55595a, true, 59009, new Class[]{Context.class, ShareInfoModel.class}, IShareService.ShareStruct.class);
                        } else {
                            IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
                            shareStruct2.identifier = shareInfoModel2.appInfo.appId;
                            shareStruct2.appName = shareInfoModel2.appInfo.appName;
                            shareStruct2.title = shareInfoModel2.title;
                            shareStruct2.description = shareInfoModel2.desc;
                            shareStruct2.thumbUrl = shareInfoModel2.imageUrl;
                            String str5 = shareInfoModel2.ugUrl;
                            if (PatchProxy.isSupport(new Object[]{str5}, null, f55595a, true, 59010, new Class[]{String.class}, String.class)) {
                                str5 = (String) PatchProxy.accessDispatch(new Object[]{str5}, null, f55595a, true, 59010, new Class[]{String.class}, String.class);
                            } else if (!TextUtils.isEmpty(str5) && !str5.contains("timestamp=")) {
                                com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(str5);
                                iVar.a("timestamp", u.a(System.currentTimeMillis()));
                                str5 = iVar.a();
                            }
                            shareStruct2.url = str5;
                            com.ss.android.ugc.aweme.base.c.b(shareInfoModel2.imageUrl);
                            shareStruct2.itemType = "game";
                            HashMap<String, String> hashMap = new HashMap<>();
                            if (shareInfoModel2.appInfo.type != 2) {
                                z = false;
                            }
                            hashMap.put("isGame", String.valueOf(z));
                            hashMap.put("query", shareInfoModel2.queryString);
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
                        intent3.putExtra("share_struct", shareStruct);
                        ProcessUtil.fillCrossProcessCallbackIntent(intent3, new IpcCallback() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55596a;

                            public final void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                                if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55596a, false, 59013, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55596a, false, 59013, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                                } else if (crossProcessDataEntity == null) {
                                    onShareEventListener2.onFail(null);
                                } else if (crossProcessDataEntity.getBoolean("proxy_result")) {
                                    onShareEventListener2.onSuccess(null);
                                } else {
                                    onShareEventListener2.onCancel(null);
                                }
                            }
                        });
                        activity2.startActivity(intent3);
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public final boolean startImagePreviewActivity(@NonNull Activity activity, @android.support.annotation.Nullable String str, @android.support.annotation.Nullable List<String> list, int i) {
        Activity activity2 = activity;
        String str2 = str;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, list2, Integer.valueOf(i)}, this, f55595a, false, 58999, new Class[]{Activity.class, String.class, List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, list2, Integer.valueOf(i)}, this, f55595a, false, 58999, new Class[]{Activity.class, String.class, List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        q.a().i.a(activity2, str2, list2, i);
        return true;
    }
}
