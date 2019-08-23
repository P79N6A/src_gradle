package com.ss.android.newmedia.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.image.g;
import com.ss.android.newmedia.thread.AppActionThread;
import com.ss.android.sdk.app.c;
import com.ss.android.sdk.app.f;
import com.ss.android.ugc.aweme.C0906R;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30099a;

    /* renamed from: b  reason: collision with root package name */
    public int f30100b;

    /* renamed from: c  reason: collision with root package name */
    public long f30101c;

    /* renamed from: d  reason: collision with root package name */
    public String f30102d;

    /* renamed from: e  reason: collision with root package name */
    public int f30103e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30104f;
    public boolean g;
    private String h;
    private String i;
    private int j;
    private String[] k;
    private String[] l;
    private c m;
    private c n;

    /* renamed from: com.ss.android.newmedia.a.a$a  reason: collision with other inner class name */
    static class C0365a extends Dialog {
        C0365a(Context context) {
            super(context, C0906R.style.q_);
        }
    }

    public final boolean a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f30099a, false, 18615, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f30099a, false, 18615, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (this.g) {
            return false;
        } else {
            try {
                this.h = jSONObject.optString(PushConstants.CONTENT, null);
                if (StringUtils.isEmpty(this.h)) {
                    return false;
                }
                this.f30100b = jSONObject.optInt("latency_seconds", -1);
                if (this.f30100b < 0) {
                    return false;
                }
                this.f30101c = jSONObject.optLong("rule_id", -1);
                if (this.f30101c <= 0) {
                    return false;
                }
                this.i = jSONObject.optString("package", null);
                this.j = jSONObject.optInt("mobile_alert", 1);
                JSONArray optJSONArray = jSONObject.optJSONArray("button_list");
                if (optJSONArray == null) {
                    return false;
                }
                int length = optJSONArray.length();
                if (length <= 0) {
                    return false;
                }
                if (length > 3) {
                    length = 3;
                }
                this.k = new String[length];
                this.l = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    this.k[i2] = jSONObject2.optString("text", "");
                    this.l[i2] = jSONObject2.optString("action_url", "");
                }
                this.f30102d = jSONObject.optString("image");
                this.f30103e = jSONObject.optInt("expected_index");
                this.g = true;
                this.f30104f = false;
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final void a(Context context, int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2)}, this, f30099a, false, 18619, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2)}, this, f30099a, false, 18619, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (this.g && context != null) {
            int length = this.l.length;
            if (i2 == -1) {
                com.ss.android.common.lib.a.a(context, "appalert_cancel", this.l[0]);
                AppActionThread appActionThread = new AppActionThread(context, false, this.f30101c, 0);
                appActionThread.b();
            } else if (i2 >= 0 && i2 < this.l.length) {
                String str2 = this.l[i2];
                int i3 = i2 + 1;
                if (StringUtils.isEmpty(str2)) {
                    str = this.l[0];
                } else {
                    str = str2;
                }
                com.ss.android.common.lib.a.a(context, "appalert_" + length + "_" + i3, str);
                AppActionThread appActionThread2 = new AppActionThread(context, false, this.f30101c, i3);
                appActionThread2.b();
                if (!StringUtils.isEmpty(str2)) {
                    ToolUtils.runApplication(context, this.i, str2);
                }
            }
        }
    }

    public final Dialog a(Context context, g gVar, LayoutInflater layoutInflater) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder;
        final Context context2 = context;
        g gVar2 = gVar;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{context2, gVar2, layoutInflater2}, this, f30099a, false, 18616, new Class[]{Context.class, g.class, LayoutInflater.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{context2, gVar2, layoutInflater2}, this, f30099a, false, 18616, new Class[]{Context.class, g.class, LayoutInflater.class}, Dialog.class);
        } else if (context2 == null || !this.g || this.k == null || this.l == null || this.k.length <= 0 || this.l.length <= 0 || this.k.length != this.l.length || !NetworkUtils.isNetworkAvailable(context)) {
            return null;
        } else {
            if (this.j == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!NetworkUtils.isWifi(context) && telephonyManager.getPhoneType() == 1 && ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46007".equals(networkOperator))) {
                        return null;
                    }
                } catch (Exception unused) {
                }
            }
            if (StringUtils.isEmpty(this.f30102d)) {
                if (PatchProxy.isSupport(new Object[]{context2}, this, f30099a, false, 18618, new Class[]{Context.class}, AlertDialog.Builder.class)) {
                    builder = (AlertDialog.Builder) PatchProxy.accessDispatch(new Object[]{context2}, this, f30099a, false, 18618, new Class[]{Context.class}, AlertDialog.Builder.class);
                } else {
                    builder = com.ss.android.a.a.a(context);
                    builder.setMessage((CharSequence) this.h);
                    int length = this.k.length;
                    builder.setPositiveButton((CharSequence) this.k[0], (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30115a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30115a, false, 18623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30115a, false, 18623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            a.this.a(context2, 0);
                        }
                    });
                    if (length > 2) {
                        builder.setNeutralButton((CharSequence) this.k[1], (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f30118a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30118a, false, 18624, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30118a, false, 18624, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                a.this.a(context2, 1);
                            }
                        });
                        builder.setNegativeButton((CharSequence) this.k[2], (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f30121a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30121a, false, 18625, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30121a, false, 18625, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                a.this.a(context2, 2);
                            }
                        });
                    } else if (length > 1) {
                        builder.setNegativeButton((CharSequence) this.k[1], (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f30124a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30124a, false, 18626, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30124a, false, 18626, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                a.this.a(context2, 1);
                            }
                        });
                    }
                    this.m = new c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30127a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                        }

                        public final void onShow(DialogInterface dialogInterface) {
                        }

                        public final void onCancel(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f30127a, false, 18627, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f30127a, false, 18627, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            a.this.a(context2, -1);
                        }
                    };
                    builder.setOnCancelListener(new f(this.m));
                }
                alertDialog = builder.create();
            } else {
                if (PatchProxy.isSupport(new Object[]{context2, gVar2, layoutInflater2}, this, f30099a, false, 18617, new Class[]{Context.class, g.class, LayoutInflater.class}, Dialog.class)) {
                    alertDialog = (Dialog) PatchProxy.accessDispatch(new Object[]{context2, gVar2, layoutInflater2}, this, f30099a, false, 18617, new Class[]{Context.class, g.class, LayoutInflater.class}, Dialog.class);
                } else if (this.f30103e >= this.k.length) {
                    alertDialog = null;
                } else {
                    final C0365a aVar = new C0365a(context2);
                    View inflate = layoutInflater2.inflate(C0906R.layout.ey, null, false);
                    View findViewById = inflate.findViewById(C0906R.id.q6);
                    TextView textView = (TextView) inflate.findViewById(C0906R.id.y2);
                    textView.setText(this.k[this.f30103e]);
                    textView.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30105a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f30105a, false, 18620, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f30105a, false, 18620, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            aVar.dismiss();
                            a.this.a(context2, a.this.f30103e);
                        }
                    });
                    findViewById.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30109a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f30109a, false, 18621, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f30109a, false, 18621, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            aVar.cancel();
                        }
                    });
                    this.n = new c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f30112a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                        }

                        public final void onShow(DialogInterface dialogInterface) {
                        }

                        public final void onCancel(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f30112a, false, 18622, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f30112a, false, 18622, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            a.this.a(context2, -1);
                        }
                    };
                    aVar.setOnCancelListener(new f(this.n));
                    gVar2.a((ImageView) inflate.findViewById(C0906R.id.e6), this.f30102d, (String) null);
                    aVar.setContentView(inflate);
                    alertDialog = aVar;
                }
            }
            if (alertDialog == null) {
                return null;
            }
            a(context2, -2);
            alertDialog.show();
            alertDialog.setCanceledOnTouchOutside(false);
            alertDialog.setCancelable(true);
            return alertDialog;
        }
    }
}
