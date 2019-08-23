package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LinkInRoomAudioWaitingListAdapter extends RecyclerView.Adapter<WaitingGuestViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10301a;

    /* renamed from: b  reason: collision with root package name */
    public a f10302b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f10303c = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10307a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10308c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10307a, true, 4470, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10307a, true, 4470, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWaitingListAdapter.java", AnonymousClass1.class);
            f10308c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 40);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10307a, false, 4469, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10307a, false, 4469, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10308c, this, this, view));
            if (LinkInRoomAudioWaitingListAdapter.this.f10302b != null && view.getTag() != null) {
                LinkInRoomAudioWaitingListAdapter.this.f10302b.a(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f10304d = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10310a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10311c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10310a, true, 4472, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10310a, true, 4472, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWaitingListAdapter.java", AnonymousClass2.class);
            f10311c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 51);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10310a, false, 4471, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10310a, false, 4471, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10311c, this, this, view));
            if (LinkInRoomAudioWaitingListAdapter.this.f10302b != null && view.getTag() != null) {
                LinkInRoomAudioWaitingListAdapter.this.f10302b.b(((Long) view.getTag()).longValue());
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f10305e = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10313a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10314c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10313a, true, 4474, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10313a, true, 4474, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomAudioWaitingListAdapter.java", AnonymousClass3.class);
            f10314c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 62);
        }

        public void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f10313a, false, 4473, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f10313a, false, 4473, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10314c, this, this, view2));
            if (view.getTag() != null) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent((User) view2.getTag(C0906R.id.am3), "guest_waiting_list"));
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private List<j> f10306f;
    private boolean g;

    static class WaitingGuestViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10316a;

        /* renamed from: b  reason: collision with root package name */
        HSImageView f10317b;

        /* renamed from: c  reason: collision with root package name */
        TextView f10318c;

        /* renamed from: d  reason: collision with root package name */
        TextView f10319d;

        /* renamed from: e  reason: collision with root package name */
        TextView f10320e;

        /* renamed from: f  reason: collision with root package name */
        TextView f10321f;

        WaitingGuestViewHolder(View view) {
            super(view);
            this.f10317b = (HSImageView) view.findViewById(C0906R.id.am3);
            this.f10318c = (TextView) view.findViewById(C0906R.id.am5);
            this.f10319d = (TextView) view.findViewById(C0906R.id.a3u);
            this.f10320e = (TextView) view.findViewById(C0906R.id.bxg);
            this.f10321f = (TextView) view.findViewById(C0906R.id.a5e);
        }
    }

    public interface a {
        void a(long j);

        void b(long j);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f10301a, false, 4468, new Class[0], Integer.TYPE)) {
            return this.f10306f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10301a, false, 4468, new Class[0], Integer.TYPE)).intValue();
    }

    public final int a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f10301a, false, 4464, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10301a, false, 4464, new Class[0], Integer.TYPE)).intValue();
        }
        for (j jVar : this.f10306f) {
            if (2 == jVar.g) {
                i++;
            }
        }
        return i;
    }

    public final int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f10301a, false, 4465, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10301a, false, 4465, new Class[0], Integer.TYPE)).intValue();
        }
        for (j jVar : this.f10306f) {
            if (1 == jVar.g) {
                i++;
            }
        }
        return i;
    }

    public final void a(long j) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10301a, false, 4462, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10301a, false, 4462, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.f10306f.size();
        while (true) {
            if (i >= size) {
                break;
            }
            j jVar = this.f10306f.get(i);
            if (jVar != null && jVar.f11052e != null && jVar.f11052e.getId() == j) {
                jVar.g = 2;
                jVar.f11053f = System.currentTimeMillis() / 1000;
                break;
            }
            i++;
        }
        notifyItemChanged(i);
    }

    public final void b(long j) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10301a, false, 4463, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10301a, false, 4463, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.f10306f.size();
        if (size > 0) {
            int i2 = -1;
            while (true) {
                if (i >= size) {
                    break;
                }
                j jVar = this.f10306f.get(i);
                if (jVar != null && jVar.f11052e != null && jVar.f11052e.getId() == j) {
                    i2 = i;
                    break;
                }
                i++;
            }
            if (i2 >= 0 && i2 < size) {
                this.f10306f.remove(i2);
                notifyItemRemoved(i2);
            }
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f10301a, false, 4466, new Class[]{ViewGroup.class, Integer.TYPE}, WaitingGuestViewHolder.class)) {
            return new WaitingGuestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ak4, viewGroup2, false));
        }
        return (WaitingGuestViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f10301a, false, 4466, new Class[]{ViewGroup.class, Integer.TYPE}, WaitingGuestViewHolder.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ef, code lost:
        if (r12.g == 2) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r15, int r16) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$WaitingGuestViewHolder r8 = (com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.WaitingGuestViewHolder) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f10301a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$WaitingGuestViewHolder> r1 = com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.WaitingGuestViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 4467(0x1173, float:6.26E-42)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0049
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f10301a
            r3 = 0
            r4 = 4467(0x1173, float:6.26E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter$WaitingGuestViewHolder> r1 = com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.WaitingGuestViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0049:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.j> r0 = r7.f10306f
            r1 = r16
            java.lang.Object r0 = r0.get(r1)
            r12 = r0
            com.bytedance.android.livesdk.chatroom.model.a.j r12 = (com.bytedance.android.livesdk.chatroom.model.a.j) r12
            boolean r13 = r7.g
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.WaitingGuestViewHolder.f10316a
            r3 = 0
            r4 = 4475(0x117b, float:6.271E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.model.a.j> r1 = com.bytedance.android.livesdk.chatroom.model.a.j.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r8
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0099
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.WaitingGuestViewHolder.f10316a
            r3 = 0
            r4 = 4475(0x117b, float:6.271E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.model.a.j> r1 = com.bytedance.android.livesdk.chatroom.model.a.j.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0123
        L_0x0099:
            com.bytedance.android.live.core.widget.HSImageView r0 = r8.f10317b
            com.bytedance.android.live.base.model.user.User r1 = r12.f11052e
            com.bytedance.android.live.base.model.ImageModel r1 = r1.getAvatarMedium()
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
            android.widget.TextView r0 = r8.f10318c
            com.bytedance.android.live.base.model.user.User r1 = r12.f11052e
            java.lang.String r1 = r1.getNickName()
            r0.setText(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r12.f11053f
            long r0 = r0 - r2
            int r0 = (int) r0
            int r0 = com.bytedance.android.livesdk.utils.ah.a((int) r0)
            int r1 = r12.g
            if (r9 != r1) goto L_0x00c6
            r1 = 2131886102(0x7f120016, float:1.9406773E38)
            goto L_0x00c9
        L_0x00c6:
            r1 = 2131886103(0x7f120017, float:1.9406775E38)
        L_0x00c9:
            android.widget.TextView r2 = r8.f10319d
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r10] = r4
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a(r1, r0, r3)
            r2.setText(r0)
            r0 = 8
            if (r13 == 0) goto L_0x00f1
            int r1 = r12.g
            if (r1 != r11) goto L_0x00ed
            android.widget.TextView r1 = r8.f10320e
            r1.setVisibility(r10)
            android.widget.TextView r1 = r8.f10321f
            r1.setVisibility(r0)
            goto L_0x00fb
        L_0x00ed:
            int r1 = r12.g
            if (r1 != r9) goto L_0x00fb
        L_0x00f1:
            android.widget.TextView r1 = r8.f10320e
            r1.setVisibility(r0)
            android.widget.TextView r0 = r8.f10321f
            r0.setVisibility(r10)
        L_0x00fb:
            com.bytedance.android.live.core.widget.HSImageView r0 = r8.f10317b
            r1 = 2131167031(0x7f070737, float:1.7948324E38)
            com.bytedance.android.live.base.model.user.User r2 = r12.f11052e
            r0.setTag(r1, r2)
            android.widget.TextView r0 = r8.f10320e
            com.bytedance.android.live.base.model.user.User r1 = r12.f11052e
            long r1 = r1.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setTag(r1)
            android.widget.TextView r0 = r8.f10321f
            com.bytedance.android.live.base.model.user.User r1 = r12.f11052e
            long r1 = r1.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setTag(r1)
        L_0x0123:
            com.bytedance.android.live.core.widget.HSImageView r0 = r8.f10317b
            android.view.View$OnClickListener r1 = r7.f10305e
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r8.f10320e
            android.view.View$OnClickListener r1 = r7.f10303c
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r8.f10321f
            android.view.View$OnClickListener r1 = r7.f10304d
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public LinkInRoomAudioWaitingListAdapter(a aVar, List<j> list, boolean z) {
        this.g = z;
        this.f10302b = aVar;
        if (list != null) {
            this.f10306f = list;
            return;
        }
        throw new RuntimeException("List can not be null.");
    }
}
