package com.ss.android.ugc.aweme.feed.share.command;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.d.a;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.ap;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.share.cg;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class ShareCommandFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45919a;

    /* renamed from: b  reason: collision with root package name */
    public Context f45920b;

    /* renamed from: c  reason: collision with root package name */
    public String f45921c;

    /* renamed from: d  reason: collision with root package name */
    ShareInfo f45922d;

    /* renamed from: e  reason: collision with root package name */
    public String f45923e;

    /* renamed from: f  reason: collision with root package name */
    public c f45924f;
    private ShareCommandApi g = ((ShareCommandApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ShareCommandApi.class));

    public interface ShareCommandApi {
        @POST(a = "/aweme/v2/platform/share/command/gen/")
        q<a> getCommand(@Query(a = "schema") String str, @Query(a = "schema_type") int i, @Query(a = "object_id") String str2);
    }

    public ShareCommandFactory(Context context, String str, ShareInfo shareInfo) {
        this.f45920b = context;
        this.f45921c = str;
        this.f45922d = shareInfo;
    }

    public final void a(String str, int i, String str2) {
        String str3 = str;
        final int i2 = i;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4}, this, f45919a, false, 42239, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4}, this, f45919a, false, 42239, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this.f45920b)) {
            a.b(this.f45920b, (int) C0906R.string.bgf).a();
        } else {
            l.a(this.g.getCommand(str3, i2, str4), new k<a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45925a;

                public final void onFailure(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f45925a, false, 42245, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f45925a, false, 42245, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    a.b(ShareCommandFactory.this.f45920b, (int) C0906R.string.c6f).a();
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    String str;
                    a aVar = (a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f45925a, false, 42244, new Class[]{a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f45925a, false, 42244, new Class[]{a.class}, Void.TYPE);
                        return;
                    }
                    try {
                        ShareCommandFactory shareCommandFactory = ShareCommandFactory.this;
                        int i = i2;
                        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, shareCommandFactory, ShareCommandFactory.f45919a, false, 42240, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
                            Object[] objArr = {aVar, Integer.valueOf(i)};
                            PatchProxy.accessDispatch(objArr, shareCommandFactory, ShareCommandFactory.f45919a, false, 42240, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
                        } else if (!(aVar == null || TextUtils.isEmpty(aVar.getCommand()) || shareCommandFactory.f45920b == null || shareCommandFactory.f45920b.getApplicationContext() == null)) {
                            if (shareCommandFactory.f45922d != null) {
                                if (i == 22) {
                                    str = String.format(shareCommandFactory.f45920b.getString(C0906R.string.a34), new Object[]{shareCommandFactory.f45922d.getShareTitle(), shareCommandFactory.f45922d.getShareDesc(), aVar.getCommand()});
                                } else {
                                    String shareWeiboDesc = shareCommandFactory.f45922d.getShareWeiboDesc();
                                    String a2 = ap.a(shareCommandFactory.f45922d, shareCommandFactory.f45921c, false);
                                    str = shareWeiboDesc + a2 + String.format(shareCommandFactory.f45920b.getString(C0906R.string.c6g), new Object[]{aVar.getCommand()});
                                }
                                if (PatchProxy.isSupport(new Object[]{str}, shareCommandFactory, ShareCommandFactory.f45919a, false, 42241, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, shareCommandFactory, ShareCommandFactory.f45919a, false, 42241, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    ((ClipboardManager) shareCommandFactory.f45920b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
                                }
                                if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, shareCommandFactory, ShareCommandFactory.f45919a, false, 42242, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, shareCommandFactory, ShareCommandFactory.f45919a, false, 42242, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                                } else {
                                    a.C0185a b2 = new a.C0185a(shareCommandFactory.f45920b).c(2130840525).a((int) C0906R.string.c6h).b(cg.a(shareCommandFactory.f45921c, cg.a()).g);
                                    b2.f20302c = str;
                                    b2.a((int) C0906R.string.c6d, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(i) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f45930a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ int f45931b;

                                        {
                                            this.f45931b = r2;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45930a, false, 42247, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45930a, false, 42247, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f45931b == 22) {
                                                ShareCommandFactory shareCommandFactory = ShareCommandFactory.this;
                                                if (PatchProxy.isSupport(new Object[0], shareCommandFactory, ShareCommandFactory.f45919a, false, 42243, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], shareCommandFactory, ShareCommandFactory.f45919a, false, 42243, new Class[0], Void.TYPE);
                                                } else {
                                                    h.a(shareCommandFactory.f45924f, "click_go_to_attach", d.a().a("enter_from", "poi_page").a("poi_id", shareCommandFactory.f45924f.getPoiId()).a("coupon_id", shareCommandFactory.f45923e).a("platform", shareCommandFactory.f45921c));
                                                }
                                            }
                                            cg.a(f.a().a(ShareCommandFactory.this.f45921c), ShareCommandFactory.this.f45920b);
                                        }
                                    }).b((int) C0906R.string.c6c, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f45928a;

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45928a, false, 42246, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45928a, false, 42246, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            ClipboardManager clipboardManager = (ClipboardManager) ShareCommandFactory.this.f45920b.getSystemService("clipboard");
                                            if (clipboardManager != null) {
                                                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                                            }
                                        }
                                    }).a().b().setCanceledOnTouchOutside(false);
                                }
                                com.ss.android.ugc.aweme.share.a.f.a(shareCommandFactory.f45920b, aVar.getCommand());
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }, com.ss.android.ugc.aweme.base.k.f34752b);
        }
    }
}
