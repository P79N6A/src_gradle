package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.lighten.core.b.g;
import com.bytedance.lighten.core.e;
import com.bytedance.lighten.core.i;
import com.bytedance.lighten.core.l;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import com.ss.android.ugc.aweme.views.m;
import java.util.List;
import org.json.JSONObject;

public class k extends w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70904a;

    /* renamed from: b  reason: collision with root package name */
    PoiStruct f70905b;

    /* renamed from: c  reason: collision with root package name */
    boolean f70906c;
    private a j;

    public interface a {
        void a(boolean z);
    }

    public PoiStruct getPoiStruct() {
        return this.f70905b;
    }

    public String getPoiId() {
        if (PatchProxy.isSupport(new Object[0], this, f70904a, false, 80233, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70904a, false, 80233, new Class[0], String.class);
        } else if (this.f70905b == null) {
            return null;
        } else {
            return this.f70905b.getPoiId();
        }
    }

    public String getPoiName() {
        if (PatchProxy.isSupport(new Object[0], this, f70904a, false, 80234, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70904a, false, 80234, new Class[0], String.class);
        } else if (this.f70905b == null) {
            return null;
        } else {
            return this.f70905b.getPoiName();
        }
    }

    public void setStateChangeCB(a aVar) {
        this.j = aVar;
    }

    public void setLocation(@Nullable PoiStruct poiStruct) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f70904a, false, 80231, new Class[]{PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f70904a, false, 80231, new Class[]{PoiStruct.class}, Void.TYPE);
            return;
        }
        this.f70905b = poiStruct;
        setTextHighlight(true);
        int i = 8;
        if (poiStruct == null) {
            if (this.f70906c) {
                i = 0;
            }
            this.h.setVisibility(i);
            setSingleLine(false);
            setTitle((int) C0906R.string.da);
            setSubtitle((String) null);
        } else {
            this.h.setVisibility(8);
            setSingleLine(true);
            setTitle(poiStruct.getPoiName());
        }
        if (this.j != null) {
            a aVar = this.j;
            if (poiStruct == null) {
                z = false;
            }
            aVar.a(z);
        }
    }

    public final void a(UrlModel urlModel) {
        e eVar;
        g gVar;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, f70904a, false, 80232, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, f70904a, false, 80232, new Class[]{UrlModel.class}, Void.TYPE);
        } else if (urlModel2 == null) {
            this.h.setVisibility(8);
            this.f70906c = false;
        } else {
            this.f70906c = true;
            this.h.setVisibility(0);
            SmartAnimatedImageView smartAnimatedImageView = this.h;
            AnonymousClass1 r1 = new g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70907a;

                public final void a(Uri uri, @Nullable View view) {
                }

                public final void a(Uri uri, @Nullable View view, @Nullable Throwable th) {
                }

                public final void a(Uri uri, @Nullable View view, @Nullable i iVar, @Nullable Animatable animatable) {
                    i iVar2 = iVar;
                    if (PatchProxy.isSupport(new Object[]{uri, view, iVar2, animatable}, this, f70907a, false, 80236, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{uri, view, iVar2, animatable}, this, f70907a, false, 80236, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE);
                    } else if (iVar2 != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k.this.h.getLayoutParams();
                        layoutParams.width = (int) ((((float) iVar2.f21794a) * UIUtils.dip2Px(k.this.getContext(), 14.0f)) / ((float) iVar2.f21795b));
                        k.this.h.setLayoutParams(layoutParams);
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{smartAnimatedImageView, urlModel2, r1}, null, m.f76469a, true, 89538, new Class[]{SmartImageView.class, UrlModel.class, g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{smartAnimatedImageView, urlModel2, r1}, null, m.f76469a, true, 89538, new Class[]{SmartImageView.class, UrlModel.class, g.class}, Void.TYPE);
                return;
            }
            com.bytedance.lighten.core.k kVar = com.bytedance.lighten.core.k.MEDIUM;
            if (PatchProxy.isSupport(new Object[]{smartAnimatedImageView, urlModel2, kVar, r1}, null, m.f76469a, true, 89539, new Class[]{SmartImageView.class, UrlModel.class, com.bytedance.lighten.core.k.class, g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{smartAnimatedImageView, urlModel2, kVar, r1}, null, m.f76469a, true, 89539, new Class[]{SmartImageView.class, UrlModel.class, com.bytedance.lighten.core.k.class, g.class}, Void.TYPE);
            } else if (smartAnimatedImageView != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
                List<String> urlList = urlModel.getUrlList();
                if (PatchProxy.isSupport(new Object[]{urlModel2, urlList, r1}, null, m.f76469a, true, 89552, new Class[]{UrlModel.class, List.class, g.class}, e.class)) {
                    eVar = (e) PatchProxy.accessDispatch(new Object[]{urlModel2, urlList, r1}, null, m.f76469a, true, 89552, new Class[]{UrlModel.class, List.class, g.class}, e.class);
                } else if (urlList == null || urlList.size() == 0) {
                    eVar = null;
                } else {
                    e a2 = l.a(urlList);
                    e a3 = a2.a(Bitmap.Config.RGB_565).a(false).a(1).a(com.bytedance.lighten.core.k.MEDIUM);
                    Uri parse = Uri.parse(urlList.get(0));
                    Context context = GlobalContext.getContext();
                    if (PatchProxy.isSupport(new Object[]{r1, parse, context, urlModel2}, null, m.f76469a, true, 89555, new Class[]{g.class, Uri.class, Context.class, UrlModel.class}, g.class)) {
                        gVar = (g) PatchProxy.accessDispatch(new Object[]{r1, parse, context, urlModel2}, null, m.f76469a, true, 89555, new Class[]{g.class, Uri.class, Context.class, UrlModel.class}, g.class);
                    } else {
                        gVar = new g(urlModel2, r1, context) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f76470a;

                            /* renamed from: b  reason: collision with root package name */
                            UrlModel f76471b;

                            /* renamed from: c  reason: collision with root package name */
                            long f76472c = System.currentTimeMillis();

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ UrlModel f76473d;

                            /* renamed from: e  reason: collision with root package name */
                            final /* synthetic */ g f76474e;

                            /* renamed from: f  reason: collision with root package name */
                            final /* synthetic */ Context f76475f;

                            public final void a(Uri uri, @Nullable View view) {
                                if (PatchProxy.isSupport(new Object[]{uri, view}, this, f76470a, false, 89561, new Class[]{Uri.class, View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{uri, view}, this, f76470a, false, 89561, new Class[]{Uri.class, View.class}, Void.TYPE);
                                    return;
                                }
                                this.f76472c = System.currentTimeMillis();
                                this.f76471b = this.f76473d;
                                if (this.f76474e != null) {
                                    this.f76474e.a(uri, view);
                                }
                            }

                            {
                                this.f76473d = r1;
                                this.f76474e = r2;
                                this.f76475f = r3;
                            }

                            public final void a(Uri uri, @Nullable View view, @Nullable Throwable th) {
                                Uri uri2 = uri;
                                View view2 = view;
                                Throwable th2 = th;
                                if (PatchProxy.isSupport(new Object[]{uri2, view2, th2}, this, f76470a, false, 89563, new Class[]{Uri.class, View.class, Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{uri2, view2, th2}, this, f76470a, false, 89563, new Class[]{Uri.class, View.class, Throwable.class}, Void.TYPE);
                                    return;
                                }
                                if (this.f76474e != null) {
                                    this.f76474e.a(uri2, view2, th2);
                                }
                                if (NetworkUtils.isNetworkAvailable(this.f76475f)) {
                                    String th3 = th.toString();
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("errorDesc", th3);
                                        jSONObject.put(PushConstants.WEB_URL, uri.toString());
                                        jSONObject.put("userId", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                                        if (this.f76475f != null) {
                                            jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(this.f76475f));
                                        }
                                        n.b("aweme_image_load_log", "image_error", jSONObject);
                                    } catch (Exception unused) {
                                    }
                                    n.a("aweme_image_load_error_rate", 1, jSONObject);
                                }
                            }

                            public final void a(Uri uri, @Nullable View view, @Nullable i iVar, @Nullable Animatable animatable) {
                                final Uri uri2 = uri;
                                View view2 = view;
                                i iVar2 = iVar;
                                Animatable animatable2 = animatable;
                                if (PatchProxy.isSupport(new Object[]{uri2, view2, iVar2, animatable2}, this, f76470a, false, 89562, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{uri2, view2, iVar2, animatable2}, this, f76470a, false, 89562, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE);
                                    return;
                                }
                                if (this.f76474e != null) {
                                    this.f76474e.a(uri2, view2, iVar2, animatable2);
                                }
                                a.a(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f76476a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f76476a, false, 89564, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f76476a, false, 89564, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (!TextUtils.isEmpty(m.a(AnonymousClass1.this.f76471b))) {
                                            JSONObject jSONObject = null;
                                            if (c.a()) {
                                                jSONObject = new JSONObject();
                                                try {
                                                    jSONObject.put(PushConstants.WEB_URL, uri2.toString());
                                                } catch (Exception unused) {
                                                }
                                            }
                                            n.a("aweme_image_load_error_rate", 0, jSONObject);
                                            if (AnonymousClass1.this.f76472c > 0) {
                                                n.a("aweme_image_load", "load_time", (float) (System.currentTimeMillis() - AnonymousClass1.this.f76472c));
                                            }
                                        }
                                    }
                                });
                            }
                        };
                    }
                    a3.a(gVar);
                    eVar = a2;
                }
                if (eVar != null) {
                    eVar.a(kVar);
                    l.a(smartAnimatedImageView, eVar.a());
                }
            }
        }
    }

    public k(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130839195);
        setTitle((int) C0906R.string.da);
        setDrawableLeft(a2);
        setSubtitle((String) null);
    }
}
