package com.ss.android.ugc.aweme.iesapi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.PressFadeTextView;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import com.ss.android.ugc.sdk.communication.a;
import com.ss.android.ugc.sdk.communication.b;
import com.ss.android.ugc.sdk.communication.msg.a;
import com.ss.android.ugc.sdk.communication.msg.base.Msg;
import java.util.concurrent.Callable;

public class AuthActivity extends Activity implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49999a;

    /* renamed from: b  reason: collision with root package name */
    public a.C0826a f50000b;

    /* renamed from: c  reason: collision with root package name */
    private c f50001c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHandler f50002d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f50003e;

    /* renamed from: f  reason: collision with root package name */
    private PressFadeTextView f50004f;
    private int g = -1;
    private String h = "";
    private boolean i;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49999a, false, 49971, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49999a, false, 49971, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.iesapi.AuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f49999a, false, 49964, new Class[0], Boolean.TYPE)) {
            return d.a().isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49964, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49967, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50000b != null) {
            b.a(this).a((Msg) new a.b(this.f50000b, this.g, this.h), (a.b) null);
        }
        super.finish();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49957, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.iesapi.AuthActivity", "onResume", true);
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49959, new Class[0], Void.TYPE);
        } else if (!a()) {
            if (!this.i) {
                onBackPressed();
            }
            this.i = false;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49960, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49960, new Class[0], Void.TYPE);
            } else {
                setContentView(C0906R.layout.ad);
                if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49962, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49962, new Class[0], Void.TYPE);
                } else {
                    this.f50004f = (PressFadeTextView) findViewById(C0906R.id.y2);
                    this.f50003e = (ImageView) findViewById(C0906R.id.q6);
                    this.f50003e.setOnClickListener(this);
                    this.f50004f.setOnClickListener(this);
                    CircleImageView circleImageView = (CircleImageView) findViewById(C0906R.id.i4);
                    TextView textView = (TextView) findViewById(C0906R.id.dq7);
                    if (this.f50000b != null) {
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) circleImageView, this.f50000b.f77793c);
                        textView.setText(this.f50000b.f77792b);
                    }
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.iesapi.AuthActivity", "onResume", false);
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f49999a, false, 49969, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f49999a, false, 49969, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 0) {
            Object obj = message.obj;
            if (PatchProxy.isSupport(new Object[]{obj}, this, f49999a, false, 49968, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f49999a, false, 49968, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (!(obj instanceof Exception)) {
                this.g = 0;
            } else if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                switch (this.g) {
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    case 13:
                    case 14:
                    case 15:
                    case SearchJediMixFeedAdapter.f42514c:
                    case 17:
                    case 19:
                        this.f50001c.dismiss();
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this, getString(C0906R.string.gn)).a();
                        return;
                    default:
                        com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) obj;
                        this.g = aVar.getErrorCode();
                        this.h = aVar.getPrompt();
                        break;
                }
            } else {
                this.g = -3;
                this.h = obj.toString();
            }
            this.f50001c.dismiss();
            finish();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49999a, false, 49963, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49999a, false, 49963, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.equals(this.f50003e)) {
            if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49970, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49970, new Class[0], Void.TYPE);
            } else {
                finish();
            }
        } else if (view.equals(this.f50004f)) {
            if (!NetworkUtils.isNetworkAvailable(this)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.ke).a();
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49966, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49966, new Class[0], Void.TYPE);
            } else {
                this.f50001c = c.a(this, getString(C0906R.string.brl));
                m.a().a(this.f50002d, new Callable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50005a;

                    public final Object call() throws Exception {
                        String str;
                        if (PatchProxy.isSupport(new Object[0], this, f50005a, false, 49972, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f50005a, false, 49972, new Class[0], Object.class);
                        }
                        if (AuthActivity.this.f50000b == null) {
                            str = "";
                        } else {
                            str = AuthActivity.this.f50000b.f77791a;
                        }
                        if (PatchProxy.isSupport(new Object[]{str}, null, AuthApi.f50007a, true, 49974, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, null, AuthApi.f50007a, true, 49974, new Class[]{String.class}, Void.TYPE);
                        } else {
                            AuthApi.f50008b.bind(str).execute();
                        }
                        return null;
                    }
                }, 0);
            }
            r.onEvent(MobClick.obtain().setEventName("click_authenticate").setLabelName("tongbu_hotsoon"));
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49999a, false, 49956, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49999a, false, 49956, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.iesapi.AuthActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f50002d = new WeakHandler(Looper.getMainLooper(), this);
        if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49961, new Class[0], Void.TYPE);
        } else {
            this.f50000b = new a.C0826a(getIntent().getExtras());
        }
        if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49958, new Class[0], Void.TYPE);
        } else if (!a()) {
            this.i = true;
            if (PatchProxy.isSupport(new Object[0], this, f49999a, false, 49965, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49999a, false, 49965, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.account.c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) this).a());
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.iesapi.AuthActivity", "onCreate", false);
    }
}
