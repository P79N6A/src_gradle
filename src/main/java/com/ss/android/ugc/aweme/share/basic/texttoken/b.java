package com.ss.android.ugc.aweme.share.basic.texttoken;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.a.f;
import com.ss.android.ugc.aweme.share.basic.texttoken.a;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64733a;

    /* renamed from: b  reason: collision with root package name */
    public a.b f64734b;

    /* renamed from: c  reason: collision with root package name */
    protected CompositeDisposable f64735c = new CompositeDisposable();

    /* renamed from: d  reason: collision with root package name */
    public DisposableObserver<Long> f64736d;

    /* renamed from: e  reason: collision with root package name */
    public String f64737e;

    /* renamed from: f  reason: collision with root package name */
    protected ShareCommandFactory.ShareCommandApi f64738f = ((ShareCommandFactory.ShareCommandApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ShareCommandFactory.ShareCommandApi.class));
    public boolean g;

    public abstract void a();

    public abstract String c();

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64733a, false, 73440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64733a, false, 73440, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64736d != null && !this.f64736d.isDisposed()) {
            this.f64736d.dispose();
        }
        this.f64735c.clear();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64733a, false, 73434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64733a, false, 73434, new Class[0], Void.TYPE);
            return;
        }
        this.f64734b.b();
        a.b bVar = this.f64734b;
        String str = this.f64737e;
        if (PatchProxy.isSupport(new Object[]{str}, this, f64733a, false, 73435, new Class[]{String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{str}, this, f64733a, false, 73435, new Class[]{String.class}, String.class);
        } else if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (char c2 : str.toCharArray()) {
                if (i != 0) {
                    sb.append(" ");
                }
                sb.append(c2);
                i++;
            }
            str = sb.toString();
        }
        bVar.b(str);
        if (PatchProxy.isSupport(new Object[0], this, f64733a, false, 73436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64733a, false, 73436, new Class[0], Void.TYPE);
            return;
        }
        String c3 = c();
        ((ClipboardManager) this.f64734b.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(c3, c3));
        if (!TextUtils.isEmpty(this.f64737e)) {
            f.a(this.f64734b.getContext(), this.f64737e);
        }
    }

    public b(a.b bVar) {
        this.f64734b = bVar;
    }
}
