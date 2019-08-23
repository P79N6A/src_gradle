package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.support.annotation.MainThread;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;

public class r {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f65739b;

    /* renamed from: c  reason: collision with root package name */
    protected n f65740c;

    /* renamed from: d  reason: collision with root package name */
    protected f f65741d;

    /* renamed from: e  reason: collision with root package name */
    protected MediaRecordPresenter f65742e;

    /* renamed from: f  reason: collision with root package name */
    public q f65743f;
    public b g;
    protected ShortVideoRecordingOperationPanelFragment h;
    protected FragmentActivity i;
    protected boolean j;
    public int k;
    protected int l;
    protected String m;
    public boolean n;

    class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65744a;

        a() {
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65744a, false, 75181, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65744a, false, 75181, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (r.this.j) {
                if (r.this.f65740c != null) {
                    n nVar = r.this.f65740c;
                    if (PatchProxy.isSupport(new Object[0], nVar, n.f65726b, false, 75170, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], nVar, n.f65726b, false, 75170, new Class[0], Void.TYPE);
                    } else {
                        nVar.setVisibility(0);
                    }
                    r.this.f65740c.a(i);
                }
                if (r.this.g != null) {
                    r.this.g.a(true);
                }
            }
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65744a, false, 75182, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65744a, false, 75182, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (r.this.j) {
                r.this.j = false;
                if (r.this.f65740c != null) {
                    r.this.a(r.this.f65740c.getText());
                    r.this.f65740c.dismiss();
                }
                if (r.this.f65742e != null) {
                    r.this.f65742e.f(true);
                }
                r.this.f65740c.setText("");
                if (r.this.g != null) {
                    r.this.g.a(false);
                }
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    public int a(int i2, String str) {
        return 0;
    }

    @MainThread
    public void a() {
    }

    public void b() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65739b, false, 75177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65739b, false, 75177, new Class[0], Void.TYPE);
            return;
        }
        this.j = true;
        if (this.f65740c != null) {
            this.f65740c.c();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f65739b, false, 75178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65739b, false, 75178, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65740c != null) {
            this.f65740c.d();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f65739b, false, 75179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65739b, false, 75179, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65741d != null) {
            this.f65741d.a();
        }
        a("");
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f65739b, false, 75180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65739b, false, 75180, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65741d != null) {
            this.f65741d.a(new a());
        }
    }

    public final r a(int i2) {
        this.k = i2;
        return this;
    }

    public void a(n nVar) {
        this.f65740c = nVar;
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f65739b, false, 75175, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f65739b, false, 75175, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (!(this.f65742e == null || this.f65743f == null)) {
            this.m = str2;
            this.f65742e.a(str2, this.f65743f.f65736b, this.f65743f.f65737c, this.f65743f.f65738d);
        }
    }

    public final void b(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f65739b, false, 75176, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f65739b, false, 75176, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f65740c.setMaxTextCount(a(i2, str));
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f65739b, false, 75174, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f65739b, false, 75174, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && this.f65740c != null) {
            if (i2 == 0) {
                this.f65740c.setText(str);
                return;
            }
            this.f65740c.setHintText(str);
        }
    }

    public r(FragmentActivity fragmentActivity, MediaRecordPresenter mediaRecordPresenter, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        if (fragmentActivity != null) {
            this.i = fragmentActivity;
            this.f65742e = mediaRecordPresenter;
            this.h = shortVideoRecordingOperationPanelFragment;
            this.f65741d = new f(fragmentActivity);
        }
    }
}
