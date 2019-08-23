package com.ss.android.ugc.aweme.discover.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/FrescoHelperExt;", "", "()V", "bindImage", "", "draweeView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "url", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42143a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f42144b = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f42146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UrlModel f42147c;

        a(RemoteImageView remoteImageView, UrlModel urlModel) {
            this.f42146b = remoteImageView;
            this.f42147c = urlModel;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42145a, false, 36084, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42145a, false, 36084, new Class[0], Void.TYPE);
            } else if (this.f42146b.getMeasuredHeight() <= 0 || this.f42146b.getMeasuredWidth() <= 0) {
                c.b(this.f42146b, this.f42147c);
            } else {
                c.a(this.f42146b, this.f42147c, this.f42146b.getMeasuredWidth(), this.f42146b.getMeasuredHeight());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.base.b$b  reason: collision with other inner class name */
    public static final class C0535b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f42149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f42150c;

        public C0535b(RemoteImageView remoteImageView, String str) {
            this.f42149b = remoteImageView;
            this.f42150c = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42148a, false, 36085, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42148a, false, 36085, new Class[0], Void.TYPE);
            } else if (this.f42149b.getMeasuredHeight() <= 0 || this.f42149b.getMeasuredWidth() <= 0) {
                c.a(this.f42149b, this.f42150c);
            } else {
                c.a(this.f42149b, this.f42150c, this.f42149b.getMeasuredWidth(), this.f42149b.getMeasuredHeight());
            }
        }
    }

    private b() {
    }

    @JvmStatic
    public static final void a(@NotNull RemoteImageView remoteImageView, @NotNull UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2}, null, f42143a, true, 36082, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2}, null, f42143a, true, 36082, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(remoteImageView2, "draweeView");
        Intrinsics.checkParameterIsNotNull(urlModel2, "urlModel");
        remoteImageView2.post(new a(remoteImageView2, urlModel2));
    }
}
