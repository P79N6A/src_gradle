package com.bytedance.android.livesdk.chatroom.ui;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.ad;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.android.livesdkapi.host.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class RoomDecorationListAdapter extends RecyclerView.Adapter<AbsRoomDecorationViewHolder<c>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11747a;

    /* renamed from: b  reason: collision with root package name */
    List<c> f11748b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f11749c;

    /* renamed from: d  reason: collision with root package name */
    private int f11750d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f11751e = -1;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f11752f = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11753a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11754c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11753a, true, 6392, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11753a, true, 6392, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("RoomDecorationListAdapter.java", AnonymousClass1.class);
            f11754c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 49);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11753a, false, 6391, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11753a, false, 6391, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f11754c, this, this, view));
            if (view.getTag() != null && RoomDecorationListAdapter.this.f11749c != null) {
                c cVar = (c) view.getTag();
                if (cVar.h != DecorationWrapperWidget.f() && cVar.h != DecorationWrapperWidget.e()) {
                    RoomDecorationListAdapter.this.f11749c.a(cVar);
                }
            }
        }
    };

    static abstract class AbsRoomDecorationViewHolder<T> extends RecyclerView.ViewHolder {
        public abstract void a(T t);

        AbsRoomDecorationViewHolder(View view) {
            super(view);
        }
    }

    static class RoomDecorationHeaderViewHolder extends AbsRoomDecorationViewHolder<c> {
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        RoomDecorationHeaderViewHolder(View view) {
            super(view);
        }
    }

    static class RoomDecorationTextHeaderViewHolder extends AbsRoomDecorationViewHolder<c> {
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        RoomDecorationTextHeaderViewHolder(View view) {
            super(view);
        }
    }

    static class RoomDecorationTextViewHolder extends AbsRoomDecorationViewHolder<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11756a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f11757b;

        /* renamed from: c  reason: collision with root package name */
        View.OnClickListener f11758c;

        public final /* synthetic */ void a(Object obj) {
            float f2;
            c cVar = (c) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f11756a, false, 6393, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f11756a, false, 6393, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                this.itemView.setTag(cVar);
                if (!(cVar.f18714a == null || cVar.f18714a.getUrls() == null || cVar.f18714a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().p().a(cVar.f18714a, (e.c) new e.c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f11759a;

                        public final void a(Bitmap bitmap) {
                            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f11759a, false, 6394, new Class[]{Bitmap.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f11759a, false, 6394, new Class[]{Bitmap.class}, Void.TYPE);
                            } else if (bitmap != null) {
                                RoomDecorationTextViewHolder.this.f11757b.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, false));
                                RoomDecorationTextViewHolder.this.itemView.setOnClickListener(RoomDecorationTextViewHolder.this.f11758c);
                            }
                        }
                    });
                }
                if (cVar.h != DecorationWrapperWidget.e()) {
                    z = false;
                }
                ImageView imageView = this.f11757b;
                if (z) {
                    f2 = 0.3f;
                } else {
                    f2 = 1.0f;
                }
                imageView.setAlpha(f2);
            }
        }

        RoomDecorationTextViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.f11757b = (ImageView) view.findViewById(C0906R.id.a2z);
            this.f11758c = onClickListener;
        }
    }

    static class RoomDecorationViewHolder extends AbsRoomDecorationViewHolder<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11761a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f11762b;

        /* renamed from: c  reason: collision with root package name */
        View.OnClickListener f11763c;

        public final /* synthetic */ void a(Object obj) {
            float f2;
            c cVar = (c) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f11761a, false, 6395, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f11761a, false, 6395, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                this.itemView.setTag(cVar);
                if (!(cVar.f18714a == null || cVar.f18714a.getUrls() == null || cVar.f18714a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().p().a(cVar.f18714a, (e.c) new e.c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f11764a;

                        public final void a(Bitmap bitmap) {
                            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f11764a, false, 6396, new Class[]{Bitmap.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f11764a, false, 6396, new Class[]{Bitmap.class}, Void.TYPE);
                            } else if (bitmap != null) {
                                RoomDecorationViewHolder.this.f11762b.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, false));
                                RoomDecorationViewHolder.this.itemView.setOnClickListener(RoomDecorationViewHolder.this.f11763c);
                            }
                        }
                    });
                }
                if (cVar.h != DecorationWrapperWidget.f()) {
                    z = false;
                }
                ImageView imageView = this.f11762b;
                if (z) {
                    f2 = 0.3f;
                } else {
                    f2 = 1.0f;
                }
                imageView.setAlpha(f2);
            }
        }

        RoomDecorationViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.f11762b = (ImageView) view.findViewById(C0906R.id.a2y);
            this.f11763c = onClickListener;
        }
    }

    interface a {
        void a(c cVar);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f11747a, false, 6390, new Class[0], Integer.TYPE)) {
            return this.f11748b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11747a, false, 6390, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (i == this.f11750d) {
            return 1;
        }
        if (i > this.f11750d && i < this.f11751e) {
            return 3;
        }
        if (i == this.f11751e) {
            return 2;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    public void a(ad adVar) {
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f11747a, false, 6387, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f11747a, false, 6387, new Class[]{ad.class}, Void.TYPE);
        } else if (adVar != null) {
            if (adVar.f11090b != null && adVar.f11090b.size() > 0) {
                this.f11748b.add(null);
                this.f11748b.addAll(adVar.f11090b);
                this.f11750d = (this.f11748b.size() - adVar.f11090b.size()) - 1;
            }
            if (adVar.f11089a != null && adVar.f11089a.size() > 0) {
                this.f11748b.add(null);
                this.f11748b.addAll(adVar.f11089a);
                this.f11751e = (this.f11748b.size() - adVar.f11089a.size()) - 1;
            }
        }
    }

    public RoomDecorationListAdapter(ad adVar, a aVar) {
        a(adVar);
        this.f11749c = aVar;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbsRoomDecorationViewHolder absRoomDecorationViewHolder = (AbsRoomDecorationViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{absRoomDecorationViewHolder, Integer.valueOf(i)}, this, f11747a, false, 6389, new Class[]{AbsRoomDecorationViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absRoomDecorationViewHolder, Integer.valueOf(i)}, this, f11747a, false, 6389, new Class[]{AbsRoomDecorationViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        absRoomDecorationViewHolder.a(this.f11748b.get(i));
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11747a, false, 6388, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRoomDecorationViewHolder.class)) {
            return (AbsRoomDecorationViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11747a, false, 6388, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRoomDecorationViewHolder.class);
        }
        switch (i) {
            case 1:
                return new RoomDecorationTextHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.air, viewGroup, false));
            case 2:
                return new RoomDecorationHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aiq, viewGroup, false));
            case 3:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.afa, viewGroup, false);
                inflate.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
                return new RoomDecorationTextViewHolder(inflate, this.f11752f);
            case 4:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af9, viewGroup, false);
                if (ac.f()) {
                    i2 = ac.c();
                } else {
                    i2 = ac.a(376.0f);
                }
                int i3 = i2 / 3;
                inflate2.setLayoutParams(new LinearLayoutCompat.LayoutParams(i3, i3));
                return new RoomDecorationViewHolder(inflate2, this.f11752f);
            default:
                return null;
        }
    }
}
