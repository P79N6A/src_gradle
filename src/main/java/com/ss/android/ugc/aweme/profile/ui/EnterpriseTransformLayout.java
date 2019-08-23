package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class EnterpriseTransformLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61840a;
    private static final int l = ((int) UIUtils.dip2Px(k.a(), 4.0f));
    private static final int m = ((int) UIUtils.dip2Px(k.a(), 16.0f));
    private static final int n = ((int) UIUtils.dip2Px(k.a(), 20.0f));

    /* renamed from: b  reason: collision with root package name */
    TextView f61841b;

    /* renamed from: c  reason: collision with root package name */
    TextView f61842c;

    /* renamed from: d  reason: collision with root package name */
    TextView f61843d;

    /* renamed from: e  reason: collision with root package name */
    List<String> f61844e;

    /* renamed from: f  reason: collision with root package name */
    List<String> f61845f;
    SparseBooleanArray g;
    User h;
    Drawable i;
    Context j;
    public TextView k;
    private Aweme o;

    /* access modifiers changed from: package-private */
    public void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61840a, false, 68035, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f61840a, false, 68035, new Class[]{String.class}, Void.TYPE);
        } else if (this.h != null) {
            if (this.o != null && c.u(this.o)) {
                Context context = getContext();
                Aweme aweme = this.o;
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31569, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31569, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else {
                    g.d(context, "homepagelink_click", aweme, g.f(context, aweme, "raw ad homepage follow"));
                }
            }
            r.a(getContext(), "click_link", b() ? "personal_homepage" : "others_homepage", this.h.getUid(), PushConstants.PUSH_TYPE_NOTIFY, b(str));
            r.a("click_link", (Map) d.a().a("author_id", this.h.getUid()).a("enter_from", b() ? "personal_homepage" : "others_homepage").a("link_type", str2).f34114b);
            if (c.t(this.o)) {
                char c2 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -718695931) {
                    if (hashCode != 31634769) {
                        if (hashCode == 106642798 && str2.equals("phone")) {
                            c2 = 0;
                        }
                    } else if (str2.equals("download_link")) {
                        c2 = 1;
                    }
                } else if (str2.equals("web_link")) {
                    c2 = 2;
                }
                switch (c2) {
                    case 0:
                        Context context2 = getContext();
                        Aweme aweme2 = this.o;
                        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, g.f39316a, true, 31744, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, g.f39316a, true, 31744, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            break;
                        } else {
                            if (!a.a()) {
                                com.ss.android.ugc.aweme.commercialize.log.d.a().a("homepage_ad").b("click_call_dy").b(aweme2).a(context2);
                            }
                            return;
                        }
                    case 1:
                        Context context3 = getContext();
                        Aweme aweme3 = this.o;
                        if (PatchProxy.isSupport(new Object[]{context3, aweme3}, null, g.f39316a, true, 31743, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context3, aweme3}, null, g.f39316a, true, 31743, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            break;
                        } else {
                            if (!a.a()) {
                                com.ss.android.ugc.aweme.commercialize.log.d.a().a("homepage_ad").b("click_download").b(aweme3).a(context3);
                            }
                            return;
                        }
                    case 2:
                        Context context4 = getContext();
                        Aweme aweme4 = this.o;
                        if (!PatchProxy.isSupport(new Object[]{context4, aweme4}, null, g.f39316a, true, 31745, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            if (!a.a()) {
                                com.ss.android.ugc.aweme.commercialize.log.d.a().a("homepage_ad").b("click_website").b(aweme4).a(context4);
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{context4, aweme4}, null, g.f39316a, true, 31745, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                            return;
                        }
                        break;
                }
            }
        }
    }

    private Drawable c() {
        if (PatchProxy.isSupport(new Object[0], this, f61840a, false, 68040, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f61840a, false, 68040, new Class[0], Drawable.class);
        }
        if (this.i == null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0906R.attr.a1z});
            this.i = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        return this.i;
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f61840a, false, 68030, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61840a, false, 68030, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.h == null) {
            return false;
        } else {
            return TextUtils.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), this.h.getUid());
        }
    }

    public final void a() {
        String str;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f61840a, false, 68033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61840a, false, 68033, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f61844e) && this.h != null && !TextUtils.isEmpty(this.h.getUid())) {
            if (b()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            for (int i3 = 0; i3 < this.f61844e.size(); i3++) {
                String str2 = this.f61844e.get(i3);
                String str3 = this.f61845f.get(i3);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    r.a(getContext(), "show_link", str, this.h.getUid(), PushConstants.PUSH_TYPE_NOTIFY, b(str2));
                    r.a("show_link", (Map) d.a().a("author_id", this.h.getUid()).a("enter_from", str).a("link_type", str2).f34114b);
                    if (TextUtils.equals(str2, "micro_app") || TextUtils.equals(str2, "micro_game")) {
                        String queryParameter = Uri.parse(str3).getQueryParameter("app_id");
                        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                        if (TextUtils.equals(str2, "micro_app")) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        iMiniAppService.preloadMiniApp(queryParameter, i2);
                        r.a("mp_show", (Map) d.a().a("mp_id", queryParameter).a("author_id", this.h.getUid()).a("enter_from", str).a("position", "in_video_tag").a("_param_for_special", str2).f34114b);
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context) {
        this(context, null);
    }

    private JSONObject b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61840a, false, 68034, new Class[]{String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str2}, this, f61840a, false, 68034, new Class[]{String.class}, JSONObject.class);
        }
        t tVar = new t();
        tVar.a("link_type", str2);
        return tVar.a();
    }

    public EnterpriseTransformLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(View view, int i2) {
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f61840a, false, 68039, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f61840a, false, 68039, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i3;
            if (Build.VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(i3);
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6}, this, f61840a, false, 68032, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6}, this, f61840a, false, 68032, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter("app_id");
            if (b()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            r.a("mp_click", (Map) d.a().a("mp_id", queryParameter).a("author_id", this.h.getUid()).a("enter_from", str3).a("position", "in_video_tag").a("_param_for_special", str6).f34114b);
            b.a aVar = new b.a();
            if (b()) {
                str4 = "personal_homepage";
            } else {
                str4 = "others_homepage";
            }
            ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(getContext(), str5, aVar.b(str4).c("023003").a());
        }
    }

    public final void a(User user, Aweme aweme) {
        TextView textView;
        User user2 = user;
        Aweme aweme2 = aweme;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{user2, aweme2}, this, f61840a, false, 68028, new Class[]{User.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, aweme2}, this, f61840a, false, 68028, new Class[]{User.class, Aweme.class}, Void.TYPE);
            return;
        }
        this.h = user2;
        setVisibility(8);
        this.f61841b.setVisibility(8);
        this.f61842c.setVisibility(8);
        this.f61843d.setVisibility(8);
        if (user2 != null) {
            this.h = user2;
            this.o = aweme2;
            CommerceInfo commerceInfo = user.getCommerceInfo();
            if (commerceInfo != null) {
                List<com.ss.android.ugc.aweme.commerce.d> offlineInfoList = commerceInfo.getOfflineInfoList();
                if (!CollectionUtils.isEmpty(offlineInfoList)) {
                    setVisibility(0);
                    if (offlineInfoList.size() > 0) {
                        a(this.f61841b, offlineInfoList.get(0), 0);
                        new Paint().setTextSize(this.f61841b.getTextSize());
                        if (offlineInfoList.size() > 1) {
                            TextView textView2 = this.f61842c;
                            com.ss.android.ugc.aweme.commerce.d dVar = offlineInfoList.get(1);
                            if (PatchProxy.isSupport(new Object[]{textView2, dVar}, this, f61840a, false, 68029, new Class[]{TextView.class, com.ss.android.ugc.aweme.commerce.d.class}, Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{textView2, dVar}, this, f61840a, false, 68029, new Class[]{TextView.class, com.ss.android.ugc.aweme.commerce.d.class}, Boolean.TYPE)).booleanValue();
                            } else if (!(textView2 == null || dVar == null)) {
                                String text = dVar.getText();
                                if (!TextUtils.isEmpty(text)) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(textView2.getTextSize());
                                    if (paint.measureText(text) > UIUtils.dip2Px(getContext(), 250.0f)) {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                textView = this.f61843d;
                            } else {
                                textView = this.f61842c;
                            }
                            a(textView, offlineInfoList.get(1), 1);
                        }
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f61844e = new ArrayList();
        this.f61845f = new ArrayList();
        this.g = new SparseBooleanArray(2);
        LayoutInflater.from(context).inflate(C0906R.layout.ty, this);
        setOrientation(1);
        this.f61841b = (TextView) findViewById(C0906R.id.d6b);
        this.f61842c = (TextView) findViewById(C0906R.id.d6e);
        this.f61843d = (TextView) findViewById(C0906R.id.d6f);
        this.f61844e.clear();
        this.f61845f.clear();
    }

    private void a(TextView textView, com.ss.android.ugc.aweme.commerce.d dVar, int i2) {
        com.ss.android.ugc.aweme.commercialize.ad.b bVar;
        String str;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextView textView2 = textView;
        com.ss.android.ugc.aweme.commerce.d dVar2 = dVar;
        int i9 = i2;
        int i10 = 2;
        if (PatchProxy.isSupport(new Object[]{textView2, dVar2, Integer.valueOf(i2)}, this, f61840a, false, 68031, new Class[]{TextView.class, com.ss.android.ugc.aweme.commerce.d.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, dVar2, Integer.valueOf(i2)}, this, f61840a, false, 68031, new Class[]{TextView.class, com.ss.android.ugc.aweme.commerce.d.class, Integer.TYPE}, Void.TYPE);
        } else if (dVar2 == null) {
            textView2.setText("");
        } else {
            this.k = textView2;
            if (a.b()) {
                textView2.setTextColor(getResources().getColor(C0906R.color.s_));
                textView2.setTextSize(14.0f);
            }
            textView2.setVisibility(0);
            this.j = p.a().e();
            if (this.j != null) {
                SpannableString spannableString = new SpannableString("[label] " + dVar.getText());
                String action = dVar.getAction();
                if (!TextUtils.isEmpty(action)) {
                    boolean h2 = AbTestManager.a().h();
                    switch (dVar.getOfflineInfoType()) {
                        case 1:
                            str = "web_link";
                            Context context = textView.getContext();
                            if (h2) {
                                i3 = 2130839663;
                            } else {
                                i3 = 2130839662;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context, i3);
                            textView2.setOnClickListener(new u(this, action, dVar2, str));
                            break;
                        case 2:
                            str = "download_link";
                            Context context2 = textView.getContext();
                            if (h2) {
                                i4 = 2130839566;
                            } else {
                                i4 = 2130839565;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context2, i4);
                            textView2.setOnClickListener(new t(this, str, action));
                            break;
                        case 3:
                            str = "phone";
                            Context context3 = textView.getContext();
                            if (h2) {
                                i5 = 2130839849;
                            } else {
                                i5 = 2130839848;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context3, i5);
                            textView2.setOnClickListener(new r(this, action, str));
                            break;
                        case 4:
                            str = "address";
                            Context context4 = textView.getContext();
                            if (h2) {
                                i6 = 2130839667;
                            } else {
                                i6 = 2130839666;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context4, i6);
                            textView2.setOnClickListener(new s(this, str));
                            break;
                        case 5:
                            str = "micro_app";
                            Context context5 = textView.getContext();
                            if (h2) {
                                i7 = 2130839684;
                            } else {
                                i7 = 2130839683;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context5, i7);
                            textView2.setOnClickListener(new v(this, str, action));
                            break;
                        case 6:
                            str = "micro_game";
                            Context context6 = textView.getContext();
                            if (h2) {
                                i8 = 2130839689;
                            } else {
                                i8 = 2130839688;
                            }
                            new com.ss.android.ugc.aweme.commercialize.ad.b(context6, i8);
                            textView2.setOnClickListener(new w(this, str, action));
                            break;
                        default:
                            bVar = null;
                            str = "";
                            break;
                    }
                    if (this.h != null && !TextUtils.isEmpty(this.h.getUid()) && !this.g.get(i9)) {
                        this.f61844e.add(str);
                        this.f61845f.add(action);
                        this.g.put(i9, true);
                        if (b()) {
                            str2 = "personal_homepage";
                        } else {
                            str2 = "others_homepage";
                        }
                        r.a(getContext(), "show_link", str2, this.h.getUid(), PushConstants.PUSH_TYPE_NOTIFY, b(str));
                        r.a("show_link", (Map) d.a().a("author_id", this.h.getUid()).a("enter_from", str2).a("link_type", str).f34114b);
                        if (TextUtils.equals(str, "micro_app") || TextUtils.equals(str, "micro_game")) {
                            String queryParameter = Uri.parse(action).getQueryParameter("app_id");
                            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                            if (TextUtils.equals(str, "micro_app")) {
                                i10 = 1;
                            }
                            iMiniAppService.preloadMiniApp(queryParameter, i10);
                            r.a("mp_show", (Map) d.a().a("mp_id", queryParameter).a("author_id", this.h.getUid()).a("enter_from", str2).a("position", "in_video_tag").a("_param_for_special", str).f34114b);
                        }
                    }
                    if (bVar != null) {
                        x.a(spannableString, bVar, 0, "[label] ".length() - 1, 17);
                        textView2.setText(spannableString);
                        if (h2) {
                            textView2.setBackgroundResource(2130837945);
                            if (Build.VERSION.SDK_INT >= 23) {
                                textView2.setForeground(c());
                            }
                            if (textView2 == this.f61842c) {
                                a((View) textView2, l);
                            }
                            if (textView.getLayoutParams().height != n) {
                                textView.getLayoutParams().height = n;
                                textView2.setLayoutParams(textView.getLayoutParams());
                            }
                        } else {
                            textView2.setBackgroundResource(0);
                            if (textView2 == this.f61842c) {
                                a((View) textView2, m);
                            }
                            if (textView.getLayoutParams().height != -2) {
                                textView.getLayoutParams().height = -2;
                                textView2.setLayoutParams(textView.getLayoutParams());
                            }
                        }
                        com.ss.android.ugc.aweme.utils.c.a(textView);
                    }
                }
            }
        }
    }
}
