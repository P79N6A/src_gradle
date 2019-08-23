package com.ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.ss.android.ugc.aweme.views.o;
import com.ss.android.ugc.aweme.views.q;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public class PromoteProgramDialog extends o implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3826a;

    /* renamed from: b  reason: collision with root package name */
    public String f3827b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f3828c;

    /* renamed from: d  reason: collision with root package name */
    public a f3829d;

    /* renamed from: e  reason: collision with root package name */
    public WeakHandler f3830e;
    private String i;
    private View j;
    private DmtLoadingDialog k;
    @BindView(2131493390)
    View mBtnJoin;
    @BindView(2131493403)
    View mBtnNext;
    @BindView(2131496848)
    View mRootView;
    @BindString(2132085814)
    String mStrRegular;
    @BindView(2131498008)
    TextView mTvMsg;
    @BindView(2131498072)
    TextView mTvProtocol;
    @BindView(2131498191)
    TextView mTvTitle;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3826a, false, 70156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3826a, false, 70156, new Class[0], Void.TYPE);
            return;
        }
        q qVar = new q();
        qVar.a(Pattern.compile(this.mStrRegular), 0);
        qVar.a(this.mTvProtocol);
        qVar.f76519c = new q.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63228a;

            public final void a(TextPaint textPaint) {
                TextPaint textPaint2 = textPaint;
                if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f63228a, false, 70166, new Class[]{TextPaint.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f63228a, false, 70166, new Class[]{TextPaint.class}, Void.TYPE);
                    return;
                }
                textPaint2.setFakeBoldText(true);
                textPaint2.setColor(PromoteProgramDialog.this.f3828c.getResources().getColor(C0906R.color.a0c));
                textPaint2.setUnderlineText(true);
            }

            public final void a(View view, String str, int i) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{view, str2, Integer.valueOf(i)}, this, f63228a, false, 70165, new Class[]{View.class, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, str2, Integer.valueOf(i)}, this, f63228a, false, 70165, new Class[]{View.class, String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (PromoteProgramDialog.this.mStrRegular.equals(str)) {
                    PromoteProgramDialog.this.f3829d.a(PromoteProgramDialog.this.f3828c, PromoteProgramDialog.this.f3827b, PromoteProgramDialog.this.mStrRegular);
                }
            }
        };
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3826a, false, 70161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3826a, false, 70161, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        a(false);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3826a, false, 70158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3826a, false, 70158, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        c a2 = c.a();
        if (a2.b((Object) this)) {
            a2.c(this);
        }
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f3826a, false, 70160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3826a, false, 70160, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        a.a(true, this.mRootView);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3826a, false, 70155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3826a, false, 70155, new Class[0], Void.TYPE);
            return;
        }
        this.f3830e = new WeakHandler(this);
        final Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupClickType().c();
        this.mBtnJoin.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63223a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63223a, false, 70163, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63223a, false, 70163, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                r.a("creative_permission_yes", (Map) d.a().f34114b);
                if (num.intValue() == 0) {
                    PromoteProgramDialog.this.a(true);
                    WeakHandler weakHandler = PromoteProgramDialog.this.f3830e;
                    if (PatchProxy.isSupport(new Object[]{weakHandler}, null, PromoteProgramRequestApiManager.f63232a, true, 70174, new Class[]{WeakHandler.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{weakHandler}, null, PromoteProgramRequestApiManager.f63232a, true, 70174, new Class[]{WeakHandler.class}, Void.TYPE);
                    } else {
                        m.a().a(weakHandler, new Callable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f63234a;

                            public final Object call() throws Exception {
                                if (PatchProxy.isSupport(new Object[0], this, f63234a, false, 70176, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f63234a, false, 70176, new Class[0], Object.class);
                                }
                                try {
                                    return PromoteProgramRequestApiManager.f63233b.confirmPromoteProgram(PushConstants.PUSH_TYPE_THROUGH_MESSAGE).get();
                                } catch (ExecutionException e2) {
                                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
                                }
                            }
                        }, 1);
                    }
                } else if (num.intValue() == 1) {
                    PromoteProgramDialog.this.f3829d.a(PromoteProgramDialog.this.f3828c, PromoteProgramDialog.this.f3827b, PromoteProgramDialog.this.mStrRegular);
                }
            }
        });
        this.mBtnNext.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63226a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63226a, false, 70164, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63226a, false, 70164, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                PromoteProgramDialog.this.a(true);
                r.a("creative_permission_no", (Map) d.a().f34114b);
                if (PatchProxy.isSupport(new Object[]{null}, null, PromoteProgramRequestApiManager.f63232a, true, 70175, new Class[]{WeakHandler.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{null}, null, PromoteProgramRequestApiManager.f63232a, true, 70175, new Class[]{WeakHandler.class}, Void.TYPE);
                } else {
                    m.a().a(null, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63235a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f63235a, false, 70177, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f63235a, false, 70177, new Class[0], Object.class);
                            }
                            try {
                                return PromoteProgramRequestApiManager.f63233b.cancelPromoteProgram().get();
                            } catch (ExecutionException e2) {
                                throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
                            }
                        }
                    }, 1);
                }
                PromoteProgramDialog.this.dismiss();
            }
        });
        String str = (String) SharePrefCache.inst().getPromoteDialogPopupPopupTitle().c();
        String str2 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupMsg().c();
        String str3 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupContent().c();
        if (!TextUtils.isEmpty(str)) {
            this.mTvTitle.setText(str);
        }
        if (this.mTvTitle.getText() != null) {
            if (num.intValue() == 0) {
                this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("!", "").replaceAll("！", ""));
            }
            this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("\\\\n", "\n"));
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mTvMsg.setText(str2);
        } else {
            this.mTvMsg.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.mTvProtocol.setText(str3);
        }
        b();
    }

    @Subscribe
    public void closeKrCopyright(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3826a, false, 70159, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3826a, false, 70159, new Class[]{c.class}, Void.TYPE);
            return;
        }
        dismiss();
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f3826a, false, 70162, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f3826a, false, 70162, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a(false);
        Object obj = message2.obj;
        int i2 = message2.what;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
        } else if (obj instanceof Exception) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), getContext().getResources().getString(C0906R.string.bgg)).a();
        } else {
            if ((obj instanceof PromoteProgramResponse) && i2 == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
                dismiss();
                if (PatchProxy.isSupport(new Object[0], null, b.f63236a, true, 70171, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, b.f63236a, true, 70171, new Class[0], Void.TYPE);
                    return;
                }
                SharedPreferences.Editor edit = b.a().edit();
                edit.putBoolean("joined", true);
                edit.apply();
            }
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3826a, false, 70154, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f3826a, false, 70154, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.j = LayoutInflater.from(context).inflate(C0906R.layout.k5, null);
        setContentView(this.j);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = a.f20279f;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) UIUtils.dip2Px(getContext(), 280.0f);
        ButterKnife.bind((Object) this, this.j);
        this.f3829d = new c();
        String str = (String) SharePrefCache.inst().getPromoteDialogPopupPopupUrl().c();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f3827b = str;
        String str2 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().c();
        if (TextUtils.isEmpty(str2)) {
            str2 = this.mStrRegular;
        }
        this.mStrRegular = str2;
        a();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3826a, false, 70157, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3826a, false, 70157, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (this.k == null) {
                this.k = new DmtLoadingDialog(this.f3828c);
            }
            this.k.show();
        } else {
            if (this.k != null) {
                this.k.dismiss();
            }
        }
    }

    public PromoteProgramDialog(Activity activity, String str) {
        super(activity, C0906R.style.su, false, true, true);
        a(activity, str);
    }

    private void a(Activity activity, String str) {
        if (PatchProxy.isSupport(new Object[]{activity, str}, this, f3826a, false, 70153, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str}, this, f3826a, false, 70153, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        this.f3828c = activity;
        this.i = str;
        setCancelable(false);
        c a2 = c.a();
        if (!a2.b((Object) this)) {
            a2.a((Object) this);
        }
        a((Context) activity);
    }

    public PromoteProgramDialog(Activity activity, String str, byte b2) {
        super(activity, C0906R.style.su, false, true);
        a(activity, str);
    }
}
