package com.ss.android.ugc.aweme.shortvideo.record;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.util.c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.libsdl.app.AudioRecorderInterface;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69041a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<AppCompatActivity> f69042b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f69043c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final b f69044d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$a  reason: collision with other inner class name */
    class C0726a implements AudioRecorderInterface {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69045a;

        /* renamed from: c  reason: collision with root package name */
        private Dialog f69047c;

        private JSONObject a() {
            if (PatchProxy.isSupport(new Object[0], this, f69045a, false, 78321, new Class[0], JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f69045a, false, 78321, new Class[0], JSONObject.class);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("audio", false);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public final void lackPermission() {
            if (PatchProxy.isSupport(new Object[0], this, f69045a, false, 78319, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69045a, false, 78319, new Class[0], Void.TYPE);
                return;
            }
            c.a("lackPermission() called");
            n.a("checkPermission", 1, a());
            if (PatchProxy.isSupport(new Object[0], this, f69045a, false, 78322, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69045a, false, 78322, new Class[0], Void.TYPE);
                return;
            }
            AppCompatActivity appCompatActivity = (AppCompatActivity) a.this.f69042b.get();
            if (this.f69047c == null && appCompatActivity != null) {
                this.f69047c = new a.C0185a(appCompatActivity).b((int) C0906R.string.fr).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69058a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69058a, false, 78324, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69058a, false, 78324, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        AppCompatActivity appCompatActivity = (AppCompatActivity) a.this.f69042b.get();
                        if (appCompatActivity != null) {
                            appCompatActivity.finish();
                        }
                    }
                }).a((int) C0906R.string.a0x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69054a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69054a, false, 78323, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69054a, false, 78323, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        AppCompatActivity appCompatActivity = (AppCompatActivity) a.this.f69042b.get();
                        if (appCompatActivity != null) {
                            com.ss.android.ugc.aweme.port.in.a.H.E().d(appCompatActivity);
                            appCompatActivity.finish();
                        }
                    }
                }).a().a();
            }
            if (!this.f69047c.isShowing() && appCompatActivity != null) {
                v.a(this.f69047c);
                this.f69047c.show();
            }
        }

        private C0726a() {
        }

        public final int closeWavFile(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69045a, false, 78318, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69045a, false, 78318, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
            }
            c.a("closeWavFile() called");
            return 0;
        }

        public final void recordStatus(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69045a, false, 78320, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69045a, false, 78320, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!z && a.this.f69043c == -1) {
                a.this.f69043c = System.currentTimeMillis();
                a.this.f69044d.a();
            }
        }

        /* synthetic */ C0726a(a aVar, byte b2) {
            this();
        }

        public final int addPCMData(byte[] bArr, int i) {
            if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i)}, this, f69045a, false, 78317, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i)}, this, f69045a, false, 78317, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            if (a.this.f69043c == -1) {
                a.this.f69043c = System.currentTimeMillis();
                a.this.f69044d.a();
            }
            return 0;
        }

        public final int initWavFile(int i, int i2, double d2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2)}, this, f69045a, false, 78316, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2)}, this, f69045a, false, 78316, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
            }
            a.this.f69043c = -1;
            c.a("initWavFile() called with: sampleRate = [" + i + "], channels = [" + i2 + "], speed = [" + d2 + "]");
            return 0;
        }
    }

    public interface b {
        void a();
    }

    public final AudioRecorderInterface a() {
        if (!PatchProxy.isSupport(new Object[0], this, f69041a, false, 78315, new Class[0], AudioRecorderInterface.class)) {
            return new C0726a(this, (byte) 0);
        }
        return (AudioRecorderInterface) PatchProxy.accessDispatch(new Object[0], this, f69041a, false, 78315, new Class[0], AudioRecorderInterface.class);
    }

    public a(AppCompatActivity appCompatActivity, @NonNull b bVar) {
        this.f69042b = new WeakReference<>(appCompatActivity);
        this.f69044d = bVar;
    }
}
