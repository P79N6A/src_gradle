package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.q;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class ImShareDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52763a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f52764b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a f52765c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f52766d;

    /* renamed from: e  reason: collision with root package name */
    public IShareService.ShareStruct f52767e;

    /* renamed from: f  reason: collision with root package name */
    private final IMUser[] f52768f;
    private final IMContact[] g;
    private RemoteImageView h;
    private DmtTextView i;
    private ViewGroup j;
    private TextView k;
    private Button l;
    private Button m;
    private View n;
    private Context o;
    private String p;
    private int q;
    private int r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52774a;

        /* renamed from: b  reason: collision with root package name */
        public Context f52775b;

        /* renamed from: c  reason: collision with root package name */
        public IMContact[] f52776c;

        /* renamed from: d  reason: collision with root package name */
        public IMUser[] f52777d;

        /* renamed from: e  reason: collision with root package name */
        public IShareService.ShareStruct f52778e;

        /* renamed from: f  reason: collision with root package name */
        public b.a f52779f;
        public b.a g;
        public String h;
        private int i;
        private int j;

        public final ImShareDialog a() {
            if (!PatchProxy.isSupport(new Object[0], this, f52774a, false, 54113, new Class[0], ImShareDialog.class)) {
                return new ImShareDialog(this, (byte) 0);
            }
            return (ImShareDialog) PatchProxy.accessDispatch(new Object[0], this, f52774a, false, 54113, new Class[0], ImShareDialog.class);
        }

        public final a a(IShareService.ShareStruct shareStruct) {
            this.f52778e = shareStruct;
            return this;
        }

        public final a b(b.a aVar) {
            this.g = aVar;
            return this;
        }

        public a(Context context) {
            this.f52775b = context;
        }

        public final a a(b.a aVar) {
            this.f52779f = aVar;
            return this;
        }

        public final a a(String str) {
            if (str == null) {
                str = "";
            }
            this.h = str;
            return this;
        }

        public final a a(IMContact[] iMContactArr) {
            this.f52776c = iMContactArr;
            this.f52777d = null;
            return this;
        }

        public final a a(int i2) {
            if (PatchProxy.isSupport(new Object[]{416}, this, f52774a, false, 54111, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{416}, this, f52774a, false, 54111, new Class[]{Integer.TYPE}, a.class);
            }
            this.i = com.ss.android.ugc.aweme.framework.e.b.a(this.f52775b, 416.0f);
            return this;
        }

        public final a b(int i2) {
            if (PatchProxy.isSupport(new Object[]{335}, this, f52774a, false, 54112, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{335}, this, f52774a, false, 54112, new Class[]{Integer.TYPE}, a.class);
            }
            this.j = com.ss.android.ugc.aweme.framework.e.b.a(this.f52775b, 335.0f);
            return this;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54106, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f52766d.getWindowToken(), 0);
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54107, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.cancel();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54105, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.dismiss();
    }

    private ImShareDialog(a aVar) {
        super(aVar.f52775b, C0906R.style.sm);
        this.o = aVar.f52775b;
        this.f52768f = aVar.f52777d;
        this.g = aVar.f52776c;
        this.f52767e = aVar.f52778e;
        this.f52764b = aVar.f52779f;
        this.f52765c = aVar.g;
        this.p = aVar.h;
    }

    private <T extends IMContact> void a(T[] tArr) {
        if (PatchProxy.isSupport(new Object[]{tArr}, this, f52763a, false, 54102, new Class[]{IMContact[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tArr}, this, f52763a, false, 54102, new Class[]{IMContact[].class}, Void.TYPE);
            return;
        }
        this.j.removeAllViews();
        if (tArr.length == 1) {
            this.k.setText(C0906R.string.axg);
            this.m.setText(C0906R.string.axc);
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ad5, null);
            T t = tArr[0];
            c.b((AvatarImageView) inflate.findViewById(C0906R.id.i2), t.getDisplayAvatar());
            ((TextView) inflate.findViewById(C0906R.id.dq2)).setText(t.getDisplayName());
            a((ImageView) inflate.findViewById(C0906R.id.dr5), t);
            this.j.addView(inflate);
            return;
        }
        this.k.setText(C0906R.string.av9);
        int length = tArr.length;
        for (T t2 : tArr) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0906R.layout.ad2, null);
            c.b((AvatarImageView) inflate2.findViewById(C0906R.id.i2), t2.getDisplayAvatar());
            a((ImageView) inflate2.findViewById(C0906R.id.dr5), t2);
            this.j.addView(inflate2);
        }
        this.m.setText(getContext().getResources().getText(C0906R.string.axc) + "(" + length + ")");
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f52763a, false, 54097, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f52763a, false, 54097, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.n = LayoutInflater.from(this.o).inflate(C0906R.layout.jb, null);
        setContentView(this.n);
        setCancelable(false);
        this.k = (TextView) findViewById(C0906R.id.co3);
        this.j = (ViewGroup) findViewById(C0906R.id.dpz);
        this.h = (RemoteImageView) findViewById(C0906R.id.cpk);
        this.i = (DmtTextView) findViewById(C0906R.id.cqk);
        this.f52766d = (EditText) findViewById(C0906R.id.a8o);
        this.f52766d.setText(this.p);
        this.f52766d.setSelection(this.f52766d.getText().length());
        this.l = (Button) findViewById(C0906R.id.cpb);
        this.m = (Button) findViewById(C0906R.id.cpe);
        au.a(this.l);
        au.a(this.m);
        this.l.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52769a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f52769a, false, 54109, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f52769a, false, 54109, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImShareDialog.this.f52764b != null) {
                    ImShareDialog.this.f52764b.onShare(ImShareDialog.this.f52766d.getText().toString());
                }
                ImShareDialog.this.dismiss();
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52771a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f52771a, false, 54110, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f52771a, false, 54110, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImShareDialog.this.f52765c != null) {
                    if (TextUtils.equals("story_reply", ImShareDialog.this.f52767e.itemType) && TextUtils.isEmpty(ImShareDialog.this.f52766d.getText())) {
                        com.bytedance.ies.dmt.ui.d.a.c(ImShareDialog.this.getContext(), (int) C0906R.string.ayn, 1).a();
                    } else if (ImShareDialog.this.f52766d.getText().length() >= ad.a()) {
                        UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
                    } else {
                        ImShareDialog.this.f52765c.onShare(ImShareDialog.this.f52766d.getText().toString());
                        ImShareDialog.this.dismiss();
                    }
                }
            }
        });
        if ((b.a(this.f52767e) && this.f52767e.awemeType == 2) || TextUtils.equals("pic", this.f52767e.itemType)) {
            if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54104, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54104, new Class[0], Void.TYPE);
            } else {
                Resources resources = getContext().getResources();
                if ((((float) this.f52767e.awemeWidth) * 1.0f) / ((float) this.f52767e.awemeHeight) <= 0.7516f) {
                    this.q = resources.getDimensionPixelSize(C0906R.dimen.ex);
                    this.r = resources.getDimensionPixelSize(C0906R.dimen.ey);
                } else if ((((float) this.f52767e.awemeWidth) * 1.0f) / ((float) this.f52767e.awemeHeight) >= 1.65f) {
                    this.q = resources.getDimensionPixelSize(C0906R.dimen.ey);
                    this.r = resources.getDimensionPixelSize(C0906R.dimen.ew);
                } else {
                    int dimensionPixelSize = resources.getDimensionPixelSize(C0906R.dimen.ey);
                    this.r = dimensionPixelSize;
                    this.q = dimensionPixelSize;
                }
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.width = this.q;
            layoutParams.height = this.r;
            this.h.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals("text", this.f52767e.itemType) || TextUtils.equals("coupon", this.f52767e.itemType)) {
            this.i.setText(this.f52767e.shareText);
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            if (this.f52767e.shareText.length() <= 1024) {
                g.a((TextView) this.i);
            }
        } else {
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            a(this.h, this.f52767e);
        }
        if (TextUtils.equals("good", this.f52767e.itemType) || TextUtils.equals("good_window", this.f52767e.itemType)) {
            TextView textView = (TextView) findViewById(C0906R.id.cpq);
            if (TextUtils.equals("good", this.f52767e.itemType) && !TextUtils.isEmpty(this.f52767e.title)) {
                findViewById(C0906R.id.bhx).setVisibility(0);
                findViewById(C0906R.id.cpr).setVisibility(8);
                textView.setText(this.f52767e.title);
                textView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = this.h.getLayoutParams();
                layoutParams2.width = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 165.0f);
                layoutParams2.height = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 165.0f);
                this.h.setLayoutParams(layoutParams2);
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.setCornersRadius(UIUtils.dip2Px(GlobalContext.getContext(), 2.0f));
                ((GenericDraweeHierarchy) this.h.getHierarchy()).setRoundingParams(roundingParams);
                ((GenericDraweeHierarchy) this.h.getHierarchy()).setPlaceholderImage(2130840152);
            } else if (TextUtils.equals("good_window", this.f52767e.itemType) && this.f52767e.extraParams != null && this.f52767e.extraParams.containsKey("name")) {
                findViewById(C0906R.id.bhx).setVisibility(0);
                textView.setText(this.f52767e.extraParams.get("name"));
                textView.setVisibility(0);
                textView.post(new h(this, textView));
                ViewGroup.LayoutParams layoutParams3 = this.h.getLayoutParams();
                layoutParams3.width = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 120.0f);
                layoutParams3.height = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 120.0f);
                this.h.setLayoutParams(layoutParams3);
                RoundingParams roundingParams2 = new RoundingParams();
                roundingParams2.setRoundAsCircle(true);
                ((GenericDraweeHierarchy) this.h.getHierarchy()).setRoundingParams(roundingParams2);
                ((GenericDraweeHierarchy) this.h.getHierarchy()).setPlaceholderImage(2130840153);
            }
        }
        this.f52766d.setFilters(new InputFilter[]{new q(ad.a())});
        this.f52766d.setOnKeyListener(new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54101, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54099, new Class[0], Void.TYPE);
        } else if (this.f52768f != null && this.f52768f.length > 0) {
            a(this.f52768f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f52763a, false, 54100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52763a, false, 54100, new Class[0], Void.TYPE);
        } else if (this.g != null && this.g.length > 0) {
            a(this.g);
        }
    }

    /* synthetic */ ImShareDialog(a aVar, byte b2) {
        this(aVar);
    }

    private <T extends IMContact> void a(ImageView imageView, T t) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2, t}, this, f52763a, false, 54103, new Class[]{ImageView.class, IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, t}, this, f52763a, false, 54103, new Class[]{ImageView.class, IMContact.class}, Void.TYPE);
            return;
        }
        ax.a(imageView2, e.a((IMContact) t));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r3.equals("music") != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.ugc.aweme.base.ui.RemoteImageView r19, com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f52763a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r4 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r4 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 54098(0xd352, float:7.5807E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52763a
            r15 = 1
            r16 = 54098(0xd352, float:7.5807E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return
        L_0x0048:
            java.lang.String r3 = r1.itemType
            if (r3 != 0) goto L_0x0052
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.im.sdk.utils.az.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1)
            return
        L_0x0052:
            java.lang.String r3 = r1.itemType
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -913038159: goto L_0x00ac;
                case 102340: goto L_0x00a2;
                case 117588: goto L_0x0098;
                case 3165170: goto L_0x008e;
                case 3322092: goto L_0x0084;
                case 3599307: goto L_0x007a;
                case 104263205: goto L_0x0071;
                case 978111542: goto L_0x0067;
                case 1402633315: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x00b7
        L_0x005d:
            java.lang.String r2 = "challenge"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 0
            goto L_0x00b8
        L_0x0067:
            java.lang.String r2 = "ranking"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x0071:
            java.lang.String r5 = "music"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x007a:
            java.lang.String r2 = "user"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 5
            goto L_0x00b8
        L_0x0084:
            java.lang.String r2 = "live"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 7
            goto L_0x00b8
        L_0x008e:
            java.lang.String r2 = "game"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 3
            goto L_0x00b8
        L_0x0098:
            java.lang.String r2 = "web"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 6
            goto L_0x00b8
        L_0x00a2:
            java.lang.String r2 = "gif"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 4
            goto L_0x00b8
        L_0x00ac:
            java.lang.String r2 = "story_video"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 8
            goto L_0x00b8
        L_0x00b7:
            r2 = -1
        L_0x00b8:
            switch(r2) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x0193;
                case 2: goto L_0x0169;
                case 3: goto L_0x0132;
                case 4: goto L_0x0128;
                case 5: goto L_0x010a;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00da;
                case 8: goto L_0x00c2;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.im.sdk.utils.az.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1)
            goto L_0x01d3
        L_0x00c2:
            r2 = 2130840539(0x7f020bdb, float:1.728612E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.videoCover
            boolean r2 = r2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a
            if (r2 == 0) goto L_0x01d3
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a r1 = (com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a.convert(r1)
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            return
        L_0x00da:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.videoCover
            if (r2 == 0) goto L_0x00e4
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            return
        L_0x00e4:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.thumb4Share
            if (r2 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.thumb4Share
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            return
        L_0x00ee:
            r1 = 2130840529(0x7f020bd1, float:1.72861E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x00f5:
            java.lang.String r2 = r1.thumbUrl
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0103
            java.lang.String r1 = r1.thumbUrl
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            return
        L_0x0103:
            r1 = 2130840540(0x7f020bdc, float:1.7286122E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x010a:
            com.facebook.drawee.interfaces.DraweeHierarchy r2 = r19.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            com.facebook.drawee.generic.RoundingParams r2 = r2.getRoundingParams()
            if (r2 == 0) goto L_0x0122
            r2.setRoundAsCircle(r11)
            com.facebook.drawee.interfaces.DraweeHierarchy r3 = r19.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r3 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r3
            r3.setRoundingParams(r2)
        L_0x0122:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.im.sdk.utils.az.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1)
            return
        L_0x0128:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.videoCover
            if (r2 == 0) goto L_0x01d3
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.im.sdk.utils.az.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1, (boolean) r10)
            return
        L_0x0132:
            java.lang.String r2 = r1.thumbUrl
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0140
            java.lang.String r1 = r1.thumbUrl
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            return
        L_0x0140:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r1.extraParams
            if (r2 == 0) goto L_0x01d3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.extraParams
            java.lang.String r2 = "isGame"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0168
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0162
            r1 = 2130840531(0x7f020bd3, float:1.7286103E38)
            goto L_0x0165
        L_0x0162:
            r1 = 2130840530(0x7f020bd2, float:1.7286101E38)
        L_0x0165:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
        L_0x0168:
            return
        L_0x0169:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.videoCover
            if (r2 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.videoCover
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            return
        L_0x0173:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r1.extraParams
            if (r2 == 0) goto L_0x01d3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.extraParams
            java.lang.String r2 = "cover_thumb"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0192
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r2 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r1, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.ss.android.ugc.aweme.base.model.UrlModel) r1
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
        L_0x0192:
            return
        L_0x0193:
            int r2 = r1.awemeType
            r3 = 1801(0x709, float:2.524E-42)
            if (r2 != r3) goto L_0x01a0
            r1 = 2130840537(0x7f020bd9, float:1.7286116E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x01a0:
            int r2 = r1.awemeType
            r3 = 1802(0x70a, float:2.525E-42)
            if (r2 != r3) goto L_0x01ad
            r1 = 2130840536(0x7f020bd8, float:1.7286114E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x01ad:
            int r2 = r1.awemeType
            r3 = 1803(0x70b, float:2.527E-42)
            if (r2 != r3) goto L_0x01ba
            r1 = 2130840535(0x7f020bd7, float:1.7286112E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x01ba:
            int r1 = r1.awemeType
            r2 = 2301(0x8fd, float:3.224E-42)
            if (r1 != r2) goto L_0x01d3
            r1 = 2130840534(0x7f020bd6, float:1.728611E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            return
        L_0x01c7:
            r1 = 2130839916(0x7f02096c, float:1.7284856E38)
            r0.setImageResource(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r1)
            return
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog.a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct):void");
    }
}
