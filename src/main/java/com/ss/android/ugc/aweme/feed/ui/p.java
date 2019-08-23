package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.douyin.share.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aa;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.ac;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.h.o;
import com.ss.android.ugc.aweme.feed.h.v;
import com.ss.android.ugc.aweme.feed.h.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.share.a.a;
import com.ss.android.ugc.aweme.feed.share.a.b;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.feed.share.command.e;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.BaseShareDialog;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.cl;
import com.ss.android.ugc.aweme.u.ai;
import com.ss.android.ugc.aweme.u.l;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cr;
import com.ss.android.ugc.aweme.utils.ew;
import com.ss.android.ugc.aweme.utils.u;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class p implements ac, IShareService.IActionHandler, IShareService.OnShareCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46809a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f46810b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f46811c;

    /* renamed from: d  reason: collision with root package name */
    public String f46812d;

    /* renamed from: e  reason: collision with root package name */
    public BaseShareDialog f46813e;

    /* renamed from: f  reason: collision with root package name */
    public DialogInterface.OnClickListener f46814f;
    public String g;
    private aa<ar> h;
    private int i;
    private a j;
    private b k;
    private com.ss.android.ugc.aweme.livewallpaper.a.b l;
    private String m;
    private String n;
    private boolean o;
    @Nullable
    private IShareService.ShareStruct p;

    @SuppressLint({"LogNotTimber"})
    public p() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42677, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c((Context) this.f46810b, this.f46810b.getString(C0906R.string.m3)).a();
        r.onEvent(new MobClick().setEventName("public_permission").setLabelName("cancel").setValue(this.f46811c.getAid()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(com.ss.android.ugc.aweme.qrcode.f.a aVar, IShareService.ShareStruct shareStruct, i iVar) throws Exception {
        if (aVar != null) {
            aVar.dismiss();
        }
        a((String) iVar.e(), shareStruct);
        com.bytedance.ies.dmt.ui.d.a.a((Context) this.f46810b, (int) C0906R.string.a2a).a();
        r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName("copy").setValue(com.ss.android.ugc.aweme.u.aa.m(this.f46811c)).setJsonObject(d("copy").b()));
        new ai().a(this.f46812d).b(this.f46812d).f(h()).e("copy").f(this.f46811c).a(com.ss.android.ugc.aweme.longvideo.b.a.a(this.f46810b)).e();
        return null;
    }

    public final void a(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f46809a, false, 42689, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f46809a, false, 42689, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new ab<TResult>(this, null)).a((g<TResult, TContinuationResult>) new ac<TResult,TContinuationResult>(this, null), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public IShareService.ShareResult a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f46809a, false, 42696, new Class[]{String.class, String.class}, IShareService.ShareResult.class)) {
            return (IShareService.ShareResult) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f46809a, false, 42696, new Class[]{String.class, String.class}, IShareService.ShareResult.class);
        }
        IShareService.ShareResult shareResult = new IShareService.ShareResult();
        shareResult.type = str3;
        shareResult.identifier = str4;
        shareResult.success = true;
        return shareResult;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46809a, false, 42697, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46809a, false, 42697, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(new ar(i2, this.f46811c));
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46809a, false, 42701, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f46809a, false, 42701, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (((Boolean) SharePrefCache.inst().getHasLongPressDislike().c()).booleanValue()) {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this.f46810b, (int) C0906R.string.a64).a();
        } else {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this.f46810b, (int) C0906R.string.b9a).a();
        }
        if (this.f46811c != null) {
            bg.a(new com.ss.android.ugc.aweme.feed.f.g(this.f46811c.getAid()));
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42670, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ac.b.a(this.f46810b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new r(this));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42684, new Class[0], Void.TYPE);
            return;
        }
        b((IShareService.ShareStruct) null);
        r.a("download_share_alert2_download", (Map) null);
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42687, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42687, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (i() || this.f46811c.getStatus() == null || this.f46811c.getStatus().getPrivateStatus() != 1) {
            if (this.k == null) {
                this.k = new b(this.f46810b);
            }
            this.k.a(this.f46811c, this.m);
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46810b, (int) C0906R.string.dr1).a();
            return false;
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42692, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42692, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f46811c == null) {
            return false;
        } else {
            AwemeStatus status = this.f46811c.getStatus();
            if (status == null || status.isAllowShare()) {
                return true;
            }
            n nVar = new n(this.f46810b);
            nVar.a(new FeedSelfseeNoticeModel());
            nVar.a(this.f46811c.getAid());
            return false;
        }
    }

    private String g() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42698, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42698, new Class[0], String.class);
        }
        AbTestModel d2 = AbTestManager.a().d();
        String str = "";
        if (d2 != null) {
            if (d2.shareButtonStyle == 1) {
                str = "plain";
            } else if (d2.shareButtonStyle == 2) {
                str = "text";
            } else if (d2.shareButtonStyle == 3) {
                str = "num";
            }
        }
        return str;
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42700, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42700, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f46811c.getAuthor() == null || !TextUtils.equals(d.a().getCurUserId(), this.f46811c.getAuthor().getUid())) {
            return false;
        } else {
            return true;
        }
    }

    @NonNull
    private String h() {
        boolean z;
        String str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42699, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42699, new Class[0], String.class);
        }
        boolean a2 = cg.a(this.m, 3);
        boolean z3 = h.a().f23231a;
        boolean a3 = cg.a(this.m, 5);
        boolean a4 = cg.a(this.m, 11);
        if (cg.a(this.m, 7) || cg.a(this.m, 6) || cg.a(this.m, 8)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f46811c != null && this.f46811c.isForwardAweme() && cg.b(this.m)) {
            z2 = true;
        }
        if (z || z2) {
            str = "shaped_qr_code";
        } else if (this.o) {
            str = "link_unreviewed";
        } else if (a2) {
            str = "download_then_share";
        } else if (a3) {
            str = "token";
        } else if (a4) {
            str = "change_app_id";
        } else if (!TextUtils.equals(this.m, "weixin_moments")) {
            str = "normal_share";
        } else if (z3) {
            str = "system_share";
        } else {
            str = "normal_share";
        }
        return str;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42676, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(this.f46810b);
        aVar.a((CharSequence) this.f46810b.getString(C0906R.string.bqz));
        ArrayList arrayList = new ArrayList();
        final String string = this.f46810b.getString(C0906R.string.bt0);
        if (!u.f75965b.c(this.f46811c)) {
            arrayList.add(string);
        }
        final String string2 = this.f46810b.getString(C0906R.string.c4g);
        if (!u.f75965b.d(this.f46811c)) {
            arrayList.add(string2);
        }
        final String string3 = this.f46810b.getString(C0906R.string.c4u);
        if (!u.f75965b.e(this.f46811c)) {
            arrayList.add(string3);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        final String[] strArr2 = strArr;
        AnonymousClass1 r4 = new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46815a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z;
                final int i2 = i;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46815a, false, 42716, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46815a, false, 42716, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                AnonymousClass1 r0 = new com.ss.android.ugc.aweme.feed.h.p(p.this.f46810b) {

                    /* renamed from: b  reason: collision with root package name */
                    public static ChangeQuickRedirect f46821b;

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f46821b, false, 42717, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f46821b, false, 42717, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        super.a(exc);
                        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 2752) {
                            com.ss.android.ugc.aweme.app.api.a.a.a(p.this.f46810b, exc, C0906R.string.ba3, C0906R.string.ba4);
                            if (TextUtils.equals(strArr2[i2], string2)) {
                                z.a("promote_layer_show").a("enter_from", p.this.f46812d).a(PushConstants.CONTENT, "friend_only_fail").a("group_id", p.this.f46811c.getAid()).e();
                            } else if (TextUtils.equals(strArr2[i2], string3)) {
                                z.a("promote_layer_show").a("enter_from", p.this.f46812d).a(PushConstants.CONTENT, "private_fail").a("group_id", p.this.f46811c.getAid()).e();
                            }
                        }
                    }
                };
                r0.a(new o());
                if (TextUtils.equals(strArr2[i2], string2)) {
                    new n().a(2, p.this.f46810b, p.this.f46811c, r0);
                } else if (TextUtils.equals(strArr2[i2], string3)) {
                    new n().a(1, p.this.f46810b, p.this.f46811c, r0);
                } else if (TextUtils.equals(strArr2[i2], string)) {
                    p pVar = p.this;
                    if (PatchProxy.isSupport(new Object[0], pVar, p.f46809a, false, 42678, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], pVar, p.f46809a, false, 42678, new Class[0], Void.TYPE);
                    } else {
                        if (StringUtils.equal(d.a().getCurUserId(), pVar.f46811c.getAuthor().getUid())) {
                            t tVar = new t();
                            tVar.a("to_status", "public");
                            StringBuilder sb = new StringBuilder();
                            u uVar = u.f75965b;
                            Aweme aweme = pVar.f46811c;
                            if (PatchProxy.isSupport(new Object[]{aweme}, uVar, u.f75964a, false, 88003, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                u uVar2 = uVar;
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, uVar2, u.f75964a, false, 88003, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                            } else if (aweme == null || aweme.getAwemeType() != 2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                i3 = 1;
                            }
                            sb.append(i3);
                            tVar.a("is_photo", sb.toString());
                            r.onEvent(new MobClick().setEventName("scope_control").setLabelName("share_option").setValue(pVar.f46811c.getAid()).setJsonObject(tVar.a()));
                        }
                        com.ss.android.ugc.aweme.d.a.a(pVar.f46810b, new com.ss.android.ugc.aweme.d.b() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f46823a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f46823a, false, 42719, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f46823a, false, 42719, new Class[0], Void.TYPE);
                                    return;
                                }
                                p.this.a();
                            }

                            public final void a(boolean z) {
                                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46823a, false, 42718, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46823a, false, 42718, new Class[]{Boolean.TYPE}, Void.TYPE);
                                } else if (z) {
                                    p.this.a();
                                } else {
                                    com.ss.android.ugc.aweme.feed.h.p pVar = new com.ss.android.ugc.aweme.feed.h.p(p.this.f46810b);
                                    pVar.a(new o());
                                    pVar.a(p.this.f46811c, 0);
                                    pVar.a(p.this.f46811c.getAid(), 1);
                                    r.onEvent(new MobClick().setEventName("public_permission").setLabelName("confirm").setValue(p.this.f46811c.getAid()));
                                }
                            }
                        });
                    }
                }
                dialogInterface.dismiss();
            }
        };
        aVar.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) r4);
        try {
            aVar.b();
        } catch (Resources.NotFoundException unused) {
        }
    }

    public void onShareComplete(IShareService.ShareResult shareResult) {
        IShareService.ShareResult shareResult2 = shareResult;
        if (PatchProxy.isSupport(new Object[]{shareResult2}, this, f46809a, false, 42693, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult2}, this, f46809a, false, 42693, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
            return;
        }
        a(shareResult2, false);
    }

    private boolean b(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f46809a, false, 42685, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f46809a, false, 42685, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
        }
        f.f42393c.a(this.f46811c, 3);
        if (g.c(this.f46811c)) {
            return e();
        }
        return c(shareStruct);
    }

    private void a(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46809a, false, 42672, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46809a, false, 42672, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (this.f46813e != null) {
            this.f46813e.dismiss();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", this.f46812d);
        hashMap.put("author_id", aweme.getAuthorUid());
        hashMap.put("group_id", aweme.getAid());
        if (AbTestManager.a().bh() || aweme.isForwardAweme()) {
            str = "shaped";
        } else {
            str = "general";
        }
        hashMap.put("qr_code_type", str);
        if (aweme.isForwardAweme()) {
            if (aweme.getForwardItem() != null) {
                hashMap.put("from_user_id", aweme.getForwardItem().getAuthorUid());
                hashMap.put("from_group_id", aweme.getForwardItem().getAid());
                hashMap.put("repost_from_group_id", aweme.getForwardItem().getForwardItemId());
                hashMap.put("repost_from_user_id", aweme.getForwardItem().getForwardUserId());
            }
            hashMap.put("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            hashMap.put("forward_user_id", aweme.getForwardUserId());
            hashMap.put("forward_group_id", aweme.getForwardGroupId());
        }
        r.a("click_qr_code", (Map) com.ss.android.ugc.aweme.app.d.d.a().a(hashMap).a("platform", "scan").f34114b);
        com.ss.android.ugc.aweme.feed.share.command.d a2 = e.a(aweme, (Context) this.f46810b);
        a2.j.extraParams = hashMap;
        new com.ss.android.ugc.aweme.feed.share.command.o(this.f46810b, a2).show();
    }

    private void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46809a, false, 42695, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f46809a, false, 42695, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName(str).setValue(com.ss.android.ugc.aweme.u.aa.m(this.f46811c)).setValue(this.f46811c.getAid()).setJsonObject(d(str).b()));
        new ai().a(this.f46812d).b(this.f46812d).f(h()).e(str).f(this.f46811c).c("normal_share").a(com.ss.android.ugc.aweme.longvideo.b.a.a(this.f46810b)).e();
    }

    private c d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46809a, false, 42702, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str}, this, f46809a, false, 42702, new Class[]{String.class}, c.class);
        }
        c a2 = new c().a("author_id", com.ss.android.ugc.aweme.u.aa.a(this.f46811c)).a("content_type", com.ss.android.ugc.aweme.u.aa.o(this.f46811c)).a("is_long_item", Integer.valueOf(com.ss.android.ugc.aweme.longvideo.b.a.b(this.f46810b) ? 1 : 0)).a("style", g()).a("share_mode", h()).a("is_photo", com.ss.android.ugc.aweme.u.aa.n(this.f46811c)).a("request_id", com.ss.android.ugc.aweme.u.aa.a(this.f46811c, this.i)).a("enter_from", this.f46812d);
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(this.f46811c))) {
            a2.a("poi_id", com.ss.android.ugc.aweme.u.aa.e(this.f46811c));
        }
        if (com.ss.android.ugc.aweme.u.aa.c(this.f46812d)) {
            a2.a("city_info", com.ss.android.ugc.aweme.u.aa.a()).a("distance_info", com.ss.android.ugc.aweme.u.aa.i(this.f46811c)).a("poi_type", com.ss.android.ugc.aweme.u.aa.h(this.f46811c)).a("poi_channel", com.ss.android.ugc.aweme.u.aa.b());
        }
        return com.ss.android.ugc.aweme.forward.e.a.a(a2, this.f46811c, this.n);
    }

    private boolean b(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f46809a, false, 42669, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f46809a, false, 42669, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        String[] strArr = {"qq", "weibo", "weixin", "qzone", "weixin_moments", "download"};
        int i2 = 0;
        while (true) {
            if (i2 >= 6) {
                z = false;
                break;
            } else if (TextUtils.equals(strArr[i2], str2)) {
                break;
            } else {
                i2++;
            }
        }
        return z;
    }

    private boolean c(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f46809a, false, 42688, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f46809a, false, 42688, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (i() || this.f46811c.getStatus() == null || this.f46811c.getStatus().getPrivateStatus() != 1) {
            if (this.j == null) {
                this.j = new a(this.f46810b, this.i, this.p);
            }
            this.j.r = new aa(this, shareStruct);
            this.j.a(this.f46811c, this.m);
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46810b, (int) C0906R.string.dr1).a();
            com.ss.android.ugc.aweme.app.aa.a(aa.a.PRIVATE, this.f46811c);
            return false;
        }
    }

    public boolean checkStatus(String str) {
        boolean z;
        Object obj;
        String str2;
        boolean z2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        String str5;
        String str6 = str;
        if (PatchProxy.isSupport(new Object[]{str6}, this, f46809a, false, 42665, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str6}, this, f46809a, false, 42665, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        this.m = str6;
        this.o = false;
        if (this.f46811c != null && this.f46811c.getAwemeType() == 13) {
            return f();
        }
        if (this.f46811c != null && this.f46811c.getAwemeType() == 34 && !TextUtils.equals(str6, "report") && !TextUtils.equals(str6, "dislike")) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46810b, (int) C0906R.string.ca).a();
            return false;
        } else if (str6 == "rocket") {
            return f();
        } else {
            int checkSelfPermission = ContextCompat.checkSelfPermission(this.f46810b, "android.permission.WRITE_EXTERNAL_STORAGE");
            if (!g.c(this.f46811c)) {
                cl a2 = cg.a(str6, cg.a());
                StringBuilder sb = new StringBuilder("checkStatus, shareMode: ");
                if (a2 != null) {
                    obj = Integer.valueOf(a2.f64988c);
                } else {
                    obj = "null";
                }
                sb.append(obj);
                if (!(a2 == null || a2.f64988c == 1)) {
                    switch (a2.f64988c) {
                        case 2:
                            AlertDialog.Builder builder = new AlertDialog.Builder(this.f46810b);
                            builder.setMessage((CharSequence) cg.a(str6, cg.a()).f64991f);
                            builder.create().show();
                            break;
                        case 3:
                            if (this.f46811c != null) {
                                Aweme aweme = this.f46811c;
                                com.ss.android.ugc.aweme.app.d.d a3 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", this.f46811c.getAid());
                                if (i()) {
                                    str2 = "self";
                                } else {
                                    str2 = "other";
                                }
                                com.ss.android.ugc.aweme.poi.e.h.a(aweme, "download", a3.a("download_type", str2).a("enter_from", this.f46812d).a("download_method", "download_to_share").a("impr_type", com.ss.android.ugc.aweme.u.aa.s(this.f46811c)));
                            }
                            if (com.ss.android.ugc.aweme.u.aa.p(this.f46811c) || this.f46811c.isReviewed()) {
                                if (com.ss.android.ugc.aweme.feed.share.a.c.c(this.f46811c)) {
                                    if (checkSelfPermission == 0) {
                                        if (AbTestManager.a().aP() != 1) {
                                            Aweme aweme2 = this.f46811c;
                                            if (aweme2.getDistributeType() != 3 || !com.ss.android.ugc.aweme.longvideo.b.a.b(this.f46810b)) {
                                                if ((aweme2.getDistributeType() != 2 && aweme2.getDistributeType() != 1 && aweme2.getDistributeType() != 3) || aweme2.getVideoControl() == null) {
                                                    b((IShareService.ShareStruct) null);
                                                    break;
                                                } else {
                                                    a(aweme2.getVideoControl().shareType, aweme2);
                                                    break;
                                                }
                                            } else {
                                                LongVideo a4 = com.ss.android.ugc.aweme.longvideo.g.f53947b.a(aweme2);
                                                if (!(a4 == null || a4.getVideoControl() == null)) {
                                                    a(a4.getVideoControl().shareType, aweme2);
                                                    break;
                                                }
                                            }
                                        } else {
                                            if (!PatchProxy.isSupport(new Object[]{str6}, this, f46809a, false, 42683, new Class[]{String.class}, Void.TYPE)) {
                                                if (this.f46810b != null && !this.f46810b.isFinishing()) {
                                                    cl a5 = cg.a(str6, cg.a());
                                                    if (a5 != null) {
                                                        if (!TextUtils.isEmpty(a5.k)) {
                                                            Dialog b2 = new a.C0185a(this.f46810b).a(a5.m, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                                                /* renamed from: a  reason: collision with root package name */
                                                                public static ChangeQuickRedirect f46825a;

                                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46825a, false, 42720, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46825a, false, 42720, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                                        return;
                                                                    }
                                                                    p.this.b();
                                                                }
                                                            }).a(true).a(com.ss.android.ugc.aweme.views.g.a(this.f46810b, null, a5.k)).b((View) com.ss.android.ugc.aweme.views.g.a(a5.j, this.f46810b)).a().b();
                                                            b2.setCanceledOnTouchOutside(false);
                                                            b2.setOwnerActivity(this.f46810b);
                                                        } else {
                                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.f46810b);
                                                            builder2.setMessage((CharSequence) a5.h);
                                                            builder2.setNegativeButton((int) C0906R.string.pm, y.f46945b).setPositiveButton((int) C0906R.string.a1w, (DialogInterface.OnClickListener) new z(this)).show();
                                                        }
                                                        r.a("download_share_alert2_show", (Map) null);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                PatchProxy.accessDispatch(new Object[]{str6}, this, f46809a, false, 42683, new Class[]{String.class}, Void.TYPE);
                                                break;
                                            }
                                        }
                                    } else {
                                        c();
                                        break;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                this.o = true;
                                com.ss.android.a.a.a(this.f46810b).setTitle((int) C0906R.string.dna).setPositiveButton((int) C0906R.string.c6j, this.f46814f).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).show();
                                return false;
                            }
                            break;
                        case 5:
                            if (!PatchProxy.isSupport(new Object[0], this, f46809a, false, 42686, new Class[0], Void.TYPE)) {
                                f.f42393c.a(this.f46811c, 3);
                                if (!(this.f46811c == null || this.f46811c.getShareInfo() == null)) {
                                    new ShareCommandFactory(this.f46810b, this.m, this.f46811c.getShareInfo()).a("sslocal://aweme/detail/" + this.f46811c.getAid(), 1, this.f46811c.getAid());
                                    break;
                                }
                            } else {
                                PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42686, new Class[0], Void.TYPE);
                                break;
                            }
                        case 6:
                            new com.ss.android.ugc.aweme.feed.share.command.o(this.f46810b, e.a(this.f46811c, (Context) this.f46810b), 6, str6).show();
                            break;
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                            new com.ss.android.ugc.aweme.feed.share.command.o(this.f46810b, e.a(this.f46811c, (Context) this.f46810b), 7, str6).show();
                            break;
                        case 8:
                            new com.ss.android.ugc.aweme.feed.share.command.o(this.f46810b, e.a(this.f46811c, (Context) this.f46810b), 8, str6).show();
                            break;
                        case 9:
                            if (PatchProxy.isSupport(new Object[]{str6}, this, f46809a, false, 42668, new Class[]{String.class}, Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str6}, this, f46809a, false, 42668, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                cl a6 = cg.a(str6, cg.a());
                                if (TextUtils.equals(str6, "weixin") || TextUtils.equals(str6, "qq") || TextUtils.equals(str6, "weixin_moments")) {
                                    com.ss.android.ugc.aweme.n a7 = com.ss.android.ugc.aweme.u.a();
                                    String shareUrl = this.f46811c.getShareInfo().getShareUrl();
                                    if (this.f46811c.getShareInfo().getBoolPersist() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    String a8 = a7.a(shareUrl, z3);
                                    if (TextUtils.isEmpty(a6.h) || !a6.h.contains("<ToBeReplaced>")) {
                                        str3 = this.f46811c.getShareInfo().getShareLinkDesc();
                                        if (!TextUtils.isEmpty(str3)) {
                                            str3 = str3.replace("%s", a8 + " ");
                                        }
                                    } else {
                                        String str7 = a6.h;
                                        str3 = str7.replace("<ToBeReplaced>", this.f46811c.getShareInfo().getShareTitle() + a8 + " ");
                                    }
                                    if (TextUtils.equals(str6, "weixin_moments") || TextUtils.equals(str6, "weixin")) {
                                        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(k.g(), "wx76fdd06dde311af3", true);
                                        if (createWXAPI.isWXAppInstalled()) {
                                            WXTextObject wXTextObject = new WXTextObject();
                                            wXTextObject.text = str3;
                                            WXMediaMessage wXMediaMessage = new WXMediaMessage();
                                            wXMediaMessage.mediaObject = wXTextObject;
                                            wXMediaMessage.description = str3;
                                            SendMessageToWX.Req req = new SendMessageToWX.Req();
                                            req.transaction = String.valueOf(System.currentTimeMillis());
                                            req.message = wXMediaMessage;
                                            if (!TextUtils.equals(str6, "weixin_moments")) {
                                                createWXAPI.sendReq(req);
                                            } else if (createWXAPI.getWXAppSupportAPI() >= 553779201) {
                                                req.scene = 1;
                                                createWXAPI.sendReq(req);
                                            }
                                        }
                                    } else {
                                        cg.a(this.f46810b, str6, null, "", str3);
                                    }
                                    com.ss.android.b.a.a.a.b(new q(this, str6));
                                    z2 = true;
                                }
                                z2 = false;
                            }
                            if (!z2) {
                                return true;
                            }
                            return false;
                        case 11:
                            if (PatchProxy.isSupport(new Object[]{str6, a2}, this, f46809a, false, 42667, new Class[]{String.class, cl.class}, Boolean.TYPE)) {
                                z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str6, a2}, this, f46809a, false, 42667, new Class[]{String.class, cl.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                if (this.f46811c.getShareInfo() != null) {
                                    str4 = this.f46811c.getShareInfo().getShareUrl();
                                } else {
                                    str4 = "";
                                }
                                if (!TextUtils.isEmpty(str4)) {
                                    String a9 = ew.a(str4);
                                    if (!TextUtils.isEmpty(a9)) {
                                        if (TextUtils.isEmpty(a2.f64990e)) {
                                            str5 = "www.douyinshortvideo.com";
                                        } else {
                                            str5 = a2.f64990e;
                                        }
                                        IShareService.ShareStruct a10 = com.ss.android.ugc.aweme.feed.share.i.a((Context) this.f46810b, this.f46811c, true);
                                        a10.enterFrom = this.f46812d;
                                        a10.useShortForm = false;
                                        a10.url = str4.replaceFirst(a9, str5);
                                        z4 = cg.a((Context) this.f46810b, a2.f64989d, str6, a10);
                                        if (z4) {
                                            a(a(str6, this.f46811c.getAid()), true);
                                        }
                                    }
                                }
                                z4 = false;
                            }
                            if (!z4) {
                                return true;
                            }
                            return false;
                    }
                    onShareComplete(a(str6, this.f46811c.getAid()));
                    return false;
                }
            } else if (g.e(this.f46811c) && b(str)) {
                if (checkSelfPermission == 0) {
                    e();
                } else {
                    c();
                }
                return false;
            }
            if (!g.c(this.f46811c) || "rocket".equals(str6) || "copy".equals(str6) || "report".equals(str6) || PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(str6)) {
                z = false;
            } else {
                z = true;
            }
            if ((str6.equals("report") || PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(str6)) && i()) {
                return true;
            }
            if (!"weibo".equals(str6) && !"download".equals(str6) && !"livewallpaper".equals(str6) && !z) {
                return f();
            }
            if (checkSelfPermission != 0) {
                c();
                return false;
            } else if (!z || "download".equals(str6)) {
                return true;
            } else {
                return f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(IShareService.ShareStruct shareStruct, i iVar) throws Exception {
        a((String) iVar.e(), shareStruct);
        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46810b, (int) C0906R.string.a7l, 1).a();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(IShareService.ShareStruct shareStruct, i iVar) throws Exception {
        a((String) iVar.e(), shareStruct);
        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46810b, (int) C0906R.string.a7l, 1).a();
        return null;
    }

    private void a(int i2, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aweme}, this, f46809a, false, 42666, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aweme}, this, f46809a, false, 42666, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE);
        } else if (i2 == 0) {
            a(aweme);
        } else if (i2 == 1) {
            b((IShareService.ShareStruct) null);
        } else {
            if (i2 == 2) {
                a((IShareService.ShareStruct) null, (String) null);
            }
        }
    }

    private void b(String str, String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f46809a, false, 42675, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f46809a, false, 42675, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("to_status", str2);
            }
            jSONObject.put("is_photo", g.c(this.f46811c) ? 1 : 0);
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName(str).setLabelName("share_option");
        if (this.f46811c == null) {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str3 = this.f46811c.getAid();
        }
        r.onEvent(labelName.setValue(str3).setJsonObject(jSONObject));
    }

    private void a(IShareService.ShareResult shareResult, boolean z) {
        if (PatchProxy.isSupport(new Object[]{shareResult, Byte.valueOf(z ? (byte) 1 : 0)}, this, f46809a, false, 42694, new Class[]{IShareService.ShareResult.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult, Byte.valueOf(z)}, this, f46809a, false, 42694, new Class[]{IShareService.ShareResult.class, Boolean.TYPE}, Void.TYPE);
        } else if (shareResult != null && shareResult.success) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.f46811c)) {
                if (TextUtils.equals(this.f46812d, "general_search")) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f46811c).a("result_ad").b("share").a((Context) this.f46810b);
                } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.L(this.f46811c) || (com.ss.android.ugc.aweme.commercialize.utils.c.L(this.f46811c) && !TextUtils.equals(shareResult.type, "chat_merge"))) {
                    com.ss.android.ugc.aweme.commercialize.log.g.x(this.f46810b, this.f46811c);
                    if (com.ss.android.ugc.aweme.longvideo.b.a.b(this.f46810b)) {
                        com.ss.android.ugc.aweme.commercialize.log.g.ab(this.f46810b, this.f46811c);
                    }
                }
            }
            if (!com.ss.android.ugc.aweme.commercialize.utils.c.L(this.f46811c)) {
                a(16);
            }
            if (z) {
                new ai().a(false).c(true).g("1016").a(this.f46812d).b(this.f46812d).f(h()).e(shareResult.type).f(this.f46811c).e();
            } else {
                c(shareResult.type);
            }
            com.ss.android.ugc.aweme.common.b bVar = new com.ss.android.ugc.aweme.common.b();
            bVar.a(new com.ss.android.ugc.aweme.feed.h.c());
            bVar.a(this.f46811c.getAid(), 1, 0, 0, Integer.valueOf(this.f46811c.getAwemeType()));
            ao.a(shareResult.type);
        }
    }

    private void a(String str, IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{str, shareStruct}, this, f46809a, false, 42690, new Class[]{String.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, shareStruct}, this, f46809a, false, 42690, new Class[]{String.class, IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.f46810b.getSystemService("clipboard");
        String shareLinkDesc = this.f46811c.getShareInfo().getShareLinkDesc();
        if (!TextUtils.isEmpty(shareLinkDesc)) {
            shareLinkDesc = shareLinkDesc.replace("%s", str);
        } else if (shareStruct != null) {
            shareLinkDesc = shareStruct.description + " " + shareStruct.url;
        }
        ClipData newPlainText = ClipData.newPlainText(shareLinkDesc, shareLinkDesc);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f46809a, false, 42671, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f46809a, false, 42671, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals("download", str2)) {
            return b(shareStruct);
        } else {
            if (TextUtils.equals("copy", str2)) {
                return a(shareStruct, str);
            }
            if (TextUtils.equals("dislike", str2)) {
                if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f46809a, false, 42681, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f46809a, false, 42681, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                }
                if (this.f46811c != null) {
                    if (com.ss.android.g.a.c()) {
                        r.onEvent(MobClick.obtain().setEventName("dislike").setLabelName("tap").setValue(this.f46811c.getAid()));
                    }
                    new l().a(this.f46812d).f(this.f46811c).b(com.ss.android.ugc.aweme.u.aa.m(this.f46811c)).c(com.ss.android.ugc.aweme.u.aa.a(this.f46811c)).e(this.g).f(com.ss.android.ugc.aweme.u.aa.c(this.f46811c)).e();
                    w wVar = new w();
                    wVar.a(new v());
                    wVar.a(this);
                    wVar.a(this.f46811c);
                }
                return true;
            } else if (TextUtils.equals("report", str2)) {
                if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f46809a, false, 42679, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f46809a, false, 42679, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                }
                if (g.b(this.f46811c)) {
                    if (i()) {
                        if (PatchProxy.isSupport(new Object[0], this, f46809a, false, 42680, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f46809a, false, 42680, new Class[0], Void.TYPE);
                        } else if (this.f46810b != null && !this.f46810b.isFinishing()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(this.f46810b);
                            if (com.ss.android.ugc.aweme.commercialize.star.a.f39483f.a(this.f46811c)) {
                                builder.setMessage((int) C0906R.string.a4m);
                            } else if (cr.a(this.f46811c)) {
                                builder.setMessage((CharSequence) this.f46810b.getResources().getString(C0906R.string.a4s, new Object[]{this.f46811c.getDescendantsModel().getNotifyMsg()}));
                            } else {
                                builder.setMessage((int) C0906R.string.a4l);
                            }
                            builder.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.a4k, (DialogInterface.OnClickListener) new v(this)).show();
                        }
                        r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName("delete").setValue(com.ss.android.ugc.aweme.u.aa.m(this.f46811c)).setJsonObject(d("delete").b()));
                    } else {
                        a(1);
                        r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName("report").setValue(com.ss.android.ugc.aweme.u.aa.m(this.f46811c)).setJsonObject(d("report").b()));
                    }
                }
                return false;
            } else if (TextUtils.equals(PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, str2)) {
                if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f46809a, false, 42673, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f46809a, false, 42673, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                } else if (!g.b(this.f46811c)) {
                    return false;
                } else {
                    b("scope_click", "");
                    d();
                    return false;
                }
            } else if (TextUtils.equals("chat_merge", str2)) {
                if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, f46809a, false, 42691, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, f46809a, false, 42691, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
                }
                if (!d.a().isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a(this.f46810b, this.f46812d, "click_shareim_button");
                } else {
                    Bundle bundle = new Bundle();
                    if (com.ss.android.ugc.aweme.im.b.d() && com.ss.android.ugc.aweme.im.b.f() == 1) {
                        bundle.putInt("key_share_type", 8);
                    }
                    bundle.putSerializable("share_struct", shareStruct);
                    com.ss.android.ugc.aweme.im.b.a().enterChooseContact(this.f46810b, bundle, null);
                    ao.a("chat_merge");
                    Aweme b2 = j.a().b(Long.toString(shareStruct2.adId));
                    if (com.ss.android.ugc.aweme.commercialize.utils.c.t(b2)) {
                        Context context = this.f46810b;
                        if (context == null) {
                            context = GlobalContext.getContext();
                        }
                        com.ss.android.ugc.aweme.commercialize.log.g.x(context, b2);
                    }
                }
                return true;
            } else if (!TextUtils.equals("livewallpaper", str2)) {
                return false;
            } else {
                if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f46809a, false, 42674, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f46809a, false, 42674, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                } else if (this.f46811c == null) {
                    return false;
                } else {
                    com.ss.android.ugc.aweme.livewallpaper.c.e.a(this.f46811c, this.f46812d);
                    if (this.l == null) {
                        this.l = new com.ss.android.ugc.aweme.livewallpaper.a.b(this.f46810b);
                    }
                    this.l.c(this.f46811c);
                    return true;
                }
            }
        }
    }

    private boolean a(IShareService.ShareStruct shareStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f46809a, false, 42682, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f46809a, false, 42682, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!g.a(this.f46811c)) {
            return false;
        } else {
            com.ss.android.ugc.aweme.qrcode.f.a a2 = com.ss.android.ugc.aweme.qrcode.f.a.a(this.f46810b, this.f46810b.getResources().getString(C0906R.string.a8b));
            a2.a();
            i.a((Callable<TResult>) new w<TResult>(this, shareStruct)).a((g<TResult, TContinuationResult>) new x<TResult,TContinuationResult>(this, a2, shareStruct), i.f1052b);
            return true;
        }
    }

    public p(Activity activity, com.ss.android.ugc.aweme.feed.f.aa<ar> aaVar, String str, int i2, String str2) {
        this.f46810b = activity;
        this.h = aaVar;
        this.f46812d = str;
        this.i = i2;
        this.n = str2;
    }

    public p(Activity activity, com.ss.android.ugc.aweme.feed.f.aa<ar> aaVar, String str, int i2, String str2, IShareService.ShareStruct shareStruct) {
        this.f46810b = activity;
        this.h = aaVar;
        this.f46812d = str;
        this.i = i2;
        this.n = str2;
        this.p = shareStruct;
    }
}
