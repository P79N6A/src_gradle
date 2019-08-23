package com.ss.android.ugc.aweme.miniapp.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.d.h;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.miniapp.l.k;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import com.tt.miniapphost.util.ProcessUtil;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public class MainProcessProxyActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3600a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f3601b = "MainProcessProxyActivity";

    /* renamed from: c  reason: collision with root package name */
    public AsyncIpcHandler f3602c;

    /* renamed from: d  reason: collision with root package name */
    private int f3603d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3604e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3605f;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3600a, false, 59598, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3600a, false, 59598, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59595, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (!this.f3605f && this.f3602c != null && (this.f3603d == 2 || this.f3603d == 1)) {
            this.f3602c.callback(CrossProcessDataEntity.Builder.create().put("proxy_result", Boolean.FALSE).build());
        }
        c.a().c(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59594, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity", "onResume", true);
        super.onResume();
        if (this.f3604e) {
            this.f3604e = false;
        } else {
            this.f3604e = true;
            if (!isFinishing()) {
                if (this.f3603d == 3) {
                    finish();
                }
                if (this.f3603d == 4) {
                    a.a().a(this);
                    finish();
                }
                if (this.f3603d == 5) {
                    finish();
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity", "onResume", false);
    }

    @Subscribe
    public void onEvent(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3600a, false, 59596, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3600a, false, 59596, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (this.f3602c != null) {
            this.f3602c.callback(CrossProcessDataEntity.Builder.create().put("proxy_result", Boolean.valueOf(hVar.f34124a)).build());
            this.f3605f = hVar.f34124a;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3600a, false, 59586, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3600a, false, 59586, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59587, new Class[0], Void.TYPE);
        } else {
            overridePendingTransition(0, 0);
            Window window = getWindow();
            window.setGravity(8388659);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        }
        c.a().a((Object) this);
        this.f3603d = getIntent().getIntExtra("proxy_type", 0);
        if (this.f3603d == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59588, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59588, new Class[0], Void.TYPE);
            } else {
                final String stringExtra = getIntent().getStringExtra("micro_app_schema");
                final String stringExtra2 = getIntent().getStringExtra("enter_from");
                if (TextUtils.isEmpty(stringExtra)) {
                    finish();
                } else {
                    if (PatchProxy.isSupport(new Object[]{stringExtra2, stringExtra}, this, f3600a, false, 59597, new Class[]{String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{stringExtra2, stringExtra}, this, f3600a, false, 59597, new Class[]{String.class, String.class}, Void.TYPE);
                    } else {
                        e.a((Activity) this, stringExtra2, "click_mp", (Bundle) null, (f) new f() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55935a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f55935a, false, 59602, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55935a, false, 59602, new Class[0], Void.TYPE);
                                    return;
                                }
                                k.a(stringExtra, stringExtra2, "mp_login_success");
                                if (k.a((Context) MainProcessProxyActivity.this, stringExtra)) {
                                    k.b((Context) MainProcessProxyActivity.this, stringExtra);
                                    k.e(stringExtra);
                                }
                                MainProcessProxyActivity.this.finish();
                            }

                            public final void a(Bundle bundle) {
                                if (PatchProxy.isSupport(new Object[]{null}, this, f55935a, false, 59603, new Class[]{Bundle.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{null}, this, f55935a, false, 59603, new Class[]{Bundle.class}, Void.TYPE);
                                    return;
                                }
                                k.a(stringExtra, stringExtra2, "mp_login_close");
                                MainProcessProxyActivity.this.finish();
                            }
                        });
                    }
                }
            }
        } else if (this.f3603d == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59590, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59590, new Class[0], Void.TYPE);
            } else {
                Intent intent = new Intent(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
                intent.putExtra("micro_app_class", getIntent().getSerializableExtra("micro_app_class"));
                intent.putExtra("micro_app_info", getIntent().getSerializableExtra("micro_app_info"));
                intent.putExtra("translation_type", 3);
                intent.putExtra("creation_id", getIntent().getStringExtra("creation_id"));
                intent.putExtra("shoot_way", "mp_record");
                intent.putExtra("sticker_id", getIntent().getStringExtra("sticker_id"));
                startActivity(intent);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
                this.f3602c = ProcessUtil.generateAsyncIpcHandlerFromIntent(getIntent());
            }
        } else if (this.f3603d == 2) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59589, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59589, new Class[0], Void.TYPE);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("micro_app_class", getIntent().getSerializableExtra("micro_app_class"));
                intent2.putExtra("micro_app_info", getIntent().getSerializableExtra("micro_app_info"));
                intent2.setFlags(268435456);
                intent2.putExtra("creation_id", getIntent().getStringExtra("creation_id"));
                intent2.putExtra("shoot_way", "record_screen");
                intent2.putExtra("file_path", getIntent().getStringExtra("file_path"));
                intent2.putExtra("extra_cross_process", true);
                intent2.putExtra("extra_cross_process_boolean_extra", getIntent().getBooleanExtra("extra_cross_process_boolean_extra", false));
                ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivityForResult(this, intent2, 1);
                this.f3602c = ProcessUtil.generateAsyncIpcHandlerFromIntent(getIntent());
            }
        } else if (this.f3603d == 3) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59591, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59591, new Class[0], Void.TYPE);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("share_struct", (IShareService.ShareStruct) getIntent().getSerializableExtra("share_struct"));
                this.f3602c = ProcessUtil.generateAsyncIpcHandlerFromIntent(getIntent());
                IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
                if (iIMService != null) {
                    iIMService.enterChooseContact(this, bundle2, new com.ss.android.ugc.aweme.base.a<Boolean>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55927a;

                        public final /* synthetic */ void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            if (PatchProxy.isSupport(new Object[]{bool}, this, f55927a, false, 59599, new Class[]{Boolean.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bool}, this, f55927a, false, 59599, new Class[]{Boolean.class}, Void.TYPE);
                                return;
                            }
                            if (MainProcessProxyActivity.this.f3602c != null && bool.booleanValue()) {
                                MainProcessProxyActivity.this.f3602c.callback(CrossProcessDataEntity.Builder.create().put("proxy_result", bool).build());
                            }
                            MainProcessProxyActivity.this.finish();
                        }
                    });
                }
            }
        } else if (this.f3603d == 4) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59592, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59592, new Class[0], Void.TYPE);
            } else {
                final String stringExtra3 = getIntent().getStringExtra("game_pay_url");
                final com.ss.android.ugc.aweme.miniapp_api.a.f fVar = q.a().i;
                fVar.a((Activity) this, stringExtra3, 100, true);
                a.a().g = new a.C0642a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55929a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f55929a, false, 59600, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55929a, false, 59600, new Class[0], Void.TYPE);
                            return;
                        }
                        fVar.a((Activity) MainProcessProxyActivity.this, stringExtra3, 100, false);
                        a.a().g = null;
                        a.a().a(MainProcessProxyActivity.this);
                        MainProcessProxyActivity.this.finish();
                    }
                };
            }
        } else if (this.f3603d == 5) {
            if (PatchProxy.isSupport(new Object[0], this, f3600a, false, 59593, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3600a, false, 59593, new Class[0], Void.TYPE);
            } else {
                this.f3602c = ProcessUtil.generateAsyncIpcHandlerFromIntent(getIntent());
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService != null) {
                    iAccountService.bindService().bindMobile(this, "applet_authorize", null, new IAccountService.h() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55933a;

                        public final void a(int i, int i2, @Nullable Object obj) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f55933a, false, 59601, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f55933a, false, 59601, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                                return;
                            }
                            if (MainProcessProxyActivity.this.f3602c != null && i == 7) {
                                if (i2 == 1) {
                                    MainProcessProxyActivity.this.f3602c.callback(CrossProcessDataEntity.Builder.create().put("bindPhoneNumberResult", Boolean.TRUE).build());
                                    return;
                                }
                                MainProcessProxyActivity.this.f3602c.callback(CrossProcessDataEntity.Builder.create().put("bindPhoneNumberResult", Boolean.FALSE).build());
                            }
                        }
                    });
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity", "onCreate", false);
    }
}
