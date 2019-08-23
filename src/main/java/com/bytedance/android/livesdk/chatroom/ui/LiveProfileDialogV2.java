package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LiveDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.b.f;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.chatroom.event.h;
import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.utils.y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.a;

public class LiveProfileDialogV2 extends LiveDialogFragment implements View.OnClickListener, f, af.b {
    private static final /* synthetic */ a.C0900a P;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11657a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f11658b = LiveProfileDialogV2.class.getSimpleName();
    public DataCenter A;
    public LiveProfileDetailFragment B;
    public final CompositeDisposable C = new CompositeDisposable();
    private af D;
    private com.bytedance.android.livesdk.b.a E;
    private User F;
    private boolean G;
    private String H;
    private View I;
    private View J;
    private View K;
    private boolean L;
    private View M;
    private List<b> N;
    private boolean O = true;

    /* renamed from: c  reason: collision with root package name */
    public int f11659c;

    /* renamed from: d  reason: collision with root package name */
    public y f11660d;

    /* renamed from: e  reason: collision with root package name */
    public long f11661e;

    /* renamed from: f  reason: collision with root package name */
    public User f11662f;
    public Room g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    boolean o;
    String p = "";
    public View q;
    public View r;
    public TextView s;
    public View t;
    public TextView u;
    public HSImageView v;
    public LivingView w;
    public View x;
    public HSImageView y;
    public Activity z;

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f11657a, false, 6167, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f11657a, false, 6167, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.G) {
            if (this.f11662f.getUserAttr() == null) {
                this.f11662f.setUserAttr(new k());
            }
            this.f11662f.getUserAttr().f7773b = z2;
            this.s.setText(z2 ? C0906R.string.d9i : C0906R.string.d9z);
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6150, new Class[0], Void.TYPE);
        } else if (this.g != null && this.f11662f != null) {
            this.K.setVisibility(4);
            this.K.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11663a;

                /* JADX WARNING: Removed duplicated region for block: B:113:0x03c1  */
                /* JADX WARNING: Removed duplicated region for block: B:121:0x03ec  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0175  */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x0178  */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
                /* JADX WARNING: Removed duplicated region for block: B:45:0x019e  */
                /* JADX WARNING: Removed duplicated region for block: B:52:0x0229  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x0265  */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x02e1  */
                /* JADX WARNING: Removed duplicated region for block: B:71:0x02eb  */
                /* JADX WARNING: Removed duplicated region for block: B:74:0x0304  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r20 = this;
                        r7 = r20
                        r8 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = f11663a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 6173(0x181d, float:8.65E-42)
                        r1 = r20
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0027
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = f11663a
                        r3 = 0
                        r4 = 6173(0x181d, float:8.65E-42)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r20
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0027:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.r
                        r0.setVisibility(r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f11662f
                        com.bytedance.android.live.base.model.ImageModel r1 = r1.getAvatarThumb()
                        com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.app.Activity r0 = r0.z
                        r1 = 0
                        r3 = 8
                        if (r0 == 0) goto L_0x00f2
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.app.Activity r0 = r0.z
                        int r0 = r0.getRequestedOrientation()
                        if (r0 != 0) goto L_0x00f2
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        long r4 = r0.getLiveRoomId()
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L_0x0085
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        long r0 = r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.g
                        long r4 = r2.getOwnerUserId()
                        int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r2 == 0) goto L_0x0085
                        boolean r0 = com.bytedance.android.live.uikit.a.a.d()
                        if (r0 == 0) goto L_0x0085
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LivingView r0 = r0.w
                        r0.a()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        r0.b()
                        goto L_0x015c
                    L_0x0085:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        com.bytedance.android.live.base.model.user.d r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x00b7
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r3)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r0.setPadding(r8, r8, r8, r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r0.setBackgroundResource(r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.y
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f11662f
                        com.bytedance.android.live.base.model.user.d r1 = r1.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r1 = r1.f7750b
                        com.bytedance.android.live.core.utils.k.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
                        goto L_0x015c
                    L_0x00b7:
                        boolean r0 = com.bytedance.android.live.uikit.a.a.f()
                        if (r0 == 0) goto L_0x00cd
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r0.setPadding(r8, r8, r8, r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r0.setBackgroundResource(r8)
                        goto L_0x0155
                    L_0x00cd:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r3)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r1 = 1084227584(0x40a00000, float:5.0)
                        int r1 = com.bytedance.android.live.core.utils.ac.a((float) r1)
                        r2 = 1088421888(0x40e00000, float:7.0)
                        int r2 = com.bytedance.android.live.core.utils.ac.a((float) r2)
                        r0.setPadding(r8, r1, r8, r2)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r1 = 2130840652(0x7f020c4c, float:1.7286349E38)
                        r0.setBackgroundResource(r1)
                        goto L_0x015c
                    L_0x00f2:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        long r4 = r0.getLiveRoomId()
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L_0x012c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        long r0 = r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.g
                        long r4 = r2.getOwnerUserId()
                        int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r2 == 0) goto L_0x012c
                        boolean r0 = com.bytedance.android.live.uikit.a.a.d()
                        if (r0 == 0) goto L_0x012c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LivingView r0 = r0.w
                        r0.a()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        r0.b()
                        goto L_0x015c
                    L_0x012c:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        if (r0 == 0) goto L_0x015c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        com.bytedance.android.live.base.model.user.d r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x0155
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r3)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.y
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f11662f
                        com.bytedance.android.live.base.model.user.d r1 = r1.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r1 = r1.f7750b
                        com.bytedance.android.live.core.utils.k.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
                        goto L_0x015c
                    L_0x0155:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.x
                        com.bytedance.common.utility.UIUtils.setViewVisibility(r0, r8)
                    L_0x015c:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.v
                        r1 = 2131165500(0x7f07013c, float:1.7945219E38)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f11662f
                        r0.setTag(r1, r2)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.g
                        com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
                        r1 = 1
                        if (r0 != 0) goto L_0x0178
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        goto L_0x0190
                    L_0x0178:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.g
                        com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
                        long r4 = r2.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        long r9 = r2.f11661e
                        int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                        if (r2 != 0) goto L_0x0190
                        r2 = 1
                        goto L_0x0191
                    L_0x0190:
                        r2 = 0
                    L_0x0191:
                        r0.i = r2
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.i
                        if (r0 == 0) goto L_0x019e
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        r0.j = r1
                        goto L_0x01ca
                    L_0x019e:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        if (r0 == 0) goto L_0x01ca
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x01ca
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f11662f
                        com.bytedance.android.live.base.model.user.k r2 = r2.getUserAttr()
                        boolean r2 = r2.f7774c
                        r0.j = r2
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f11662f
                        com.bytedance.android.live.base.model.user.k r2 = r2.getUserAttr()
                        boolean r2 = r2.f7775d
                        r0.k = r2
                    L_0x01ca:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.utils.y r0 = r0.f11660d
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        long r4 = r2.f11661e
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r2 = r2.i
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r6 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r6 = r6.i
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r9 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r15 = r9.h
                        r14 = 4
                        java.lang.Object[] r9 = new java.lang.Object[r14]
                        java.lang.Long r10 = new java.lang.Long
                        r10.<init>(r4)
                        r9[r8] = r10
                        java.lang.Byte r10 = java.lang.Byte.valueOf(r2)
                        r9[r1] = r10
                        java.lang.Byte r10 = java.lang.Byte.valueOf(r6)
                        r13 = 2
                        r9[r13] = r10
                        java.lang.Byte r10 = java.lang.Byte.valueOf(r15)
                        r16 = 3
                        r9[r16] = r10
                        com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.utils.y.f17645a
                        r12 = 0
                        r17 = 13696(0x3580, float:1.9192E-41)
                        java.lang.Class[] r10 = new java.lang.Class[r14]
                        java.lang.Class r18 = java.lang.Long.TYPE
                        r10[r8] = r18
                        java.lang.Class r18 = java.lang.Boolean.TYPE
                        r10[r1] = r18
                        java.lang.Class r18 = java.lang.Boolean.TYPE
                        r10[r13] = r18
                        java.lang.Class r18 = java.lang.Boolean.TYPE
                        r10[r16] = r18
                        java.lang.Class r18 = java.lang.Void.TYPE
                        r19 = r10
                        r10 = r0
                        r3 = 2
                        r13 = r17
                        r3 = 4
                        r14 = r19
                        r17 = r15
                        r15 = r18
                        boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                        if (r9 == 0) goto L_0x0265
                        java.lang.Object[] r9 = new java.lang.Object[r3]
                        java.lang.Long r10 = new java.lang.Long
                        r10.<init>(r4)
                        r9[r8] = r10
                        java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                        r9[r1] = r2
                        java.lang.Byte r2 = java.lang.Byte.valueOf(r6)
                        r4 = 2
                        r9[r4] = r2
                        java.lang.Byte r2 = java.lang.Byte.valueOf(r17)
                        r9[r16] = r2
                        com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.utils.y.f17645a
                        r12 = 0
                        r13 = 13696(0x3580, float:1.9192E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r3]
                        java.lang.Class r2 = java.lang.Long.TYPE
                        r14[r8] = r2
                        java.lang.Class r2 = java.lang.Boolean.TYPE
                        r14[r1] = r2
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        r2 = 2
                        r14[r2] = r1
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        r14[r16] = r1
                        java.lang.Class r15 = java.lang.Void.TYPE
                        r10 = r0
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                        goto L_0x02db
                    L_0x0265:
                        boolean r3 = r0.f17648d
                        if (r3 != 0) goto L_0x02db
                        org.json.JSONObject r3 = new org.json.JSONObject
                        r3.<init>()
                        java.lang.String r9 = "rid"
                        com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r0.f17647c     // Catch:{ Exception -> 0x02da }
                        long r10 = r10.getId()     // Catch:{ Exception -> 0x02da }
                        r3.put(r9, r10)     // Catch:{ Exception -> 0x02da }
                        java.lang.String r9 = "source"
                        com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r0.f17647c     // Catch:{ Exception -> 0x02da }
                        long r10 = r10.getUserFrom()     // Catch:{ Exception -> 0x02da }
                        r3.put(r9, r10)     // Catch:{ Exception -> 0x02da }
                        if (r2 == 0) goto L_0x02ae
                        if (r17 == 0) goto L_0x029b
                        android.content.Context r2 = r0.f17646b
                        com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r2)
                        java.lang.String r10 = "livesdk_live_click_user"
                        java.lang.String r11 = "anchor_c_anchor"
                        r14 = 0
                        r12 = r4
                        r16 = r3
                        r9.a((java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (org.json.JSONObject) r16)
                        goto L_0x02d7
                    L_0x029b:
                        android.content.Context r2 = r0.f17646b
                        com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r2)
                        java.lang.String r10 = "livesdk_live_click_user"
                        java.lang.String r11 = "anchor_c_audience"
                        r14 = 0
                        r12 = r4
                        r16 = r3
                        r9.a((java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (org.json.JSONObject) r16)
                        goto L_0x02d7
                    L_0x02ae:
                        if (r17 != 0) goto L_0x02c5
                        if (r6 == 0) goto L_0x02c5
                        android.content.Context r2 = r0.f17646b
                        com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r2)
                        java.lang.String r10 = "livesdk_live_click_user"
                        java.lang.String r11 = "audience_c_anchor"
                        r14 = 0
                        r12 = r4
                        r16 = r3
                        r9.a((java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (org.json.JSONObject) r16)
                        goto L_0x02d7
                    L_0x02c5:
                        android.content.Context r2 = r0.f17646b
                        com.bytedance.android.livesdk.j.f r9 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r2)
                        java.lang.String r10 = "livesdk_live_click_user"
                        java.lang.String r11 = "audience_c_audience"
                        r14 = 0
                        r12 = r4
                        r16 = r3
                        r9.a((java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (org.json.JSONObject) r16)
                    L_0x02d7:
                        r0.f17648d = r1
                        goto L_0x02db
                    L_0x02da:
                    L_0x02db:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.h
                        if (r0 == 0) goto L_0x02eb
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.q
                        r1 = 8
                        r0.setVisibility(r1)
                        goto L_0x02fe
                    L_0x02eb:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.q
                        r0.setVisibility(r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.q
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2$1$1 r1 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2$1$1
                        r1.<init>()
                        r0.setOnClickListener(r1)
                    L_0x02fe:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.i
                        if (r0 != 0) goto L_0x03ae
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.k
                        if (r0 == 0) goto L_0x0310
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.h
                        if (r0 == 0) goto L_0x03ae
                    L_0x0310:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.m
                        if (r0 != 0) goto L_0x031c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.n
                        if (r0 == 0) goto L_0x03ae
                    L_0x031c:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.l
                        if (r0 != 0) goto L_0x032e
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.n
                        if (r0 != 0) goto L_0x032e
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.j
                        if (r0 != 0) goto L_0x03ae
                    L_0x032e:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.l
                        if (r0 != 0) goto L_0x0340
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.n
                        if (r0 != 0) goto L_0x0340
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.h
                        if (r0 != 0) goto L_0x03ae
                    L_0x0340:
                        com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
                        long r0 = r0.f9032f
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f11662f
                        long r2 = r2.getId()
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 == 0) goto L_0x03ae
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        int r0 = r0.f11659c
                        r1 = 2
                        if (r0 != r1) goto L_0x035a
                        goto L_0x03ae
                    L_0x035a:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.l
                        if (r0 != 0) goto L_0x0393
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        boolean r0 = r0.n
                        if (r0 == 0) goto L_0x0367
                        goto L_0x0393
                    L_0x0367:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x0388
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f11662f
                        com.bytedance.android.live.base.model.user.k r0 = r0.getUserAttr()
                        boolean r0 = r0.f7773b
                        if (r0 == 0) goto L_0x0388
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        r1 = 2131563874(0x7f0d1562, float:1.8753217E38)
                        r0.setText(r1)
                        goto L_0x039d
                    L_0x0388:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        r1 = 2131563891(0x7f0d1573, float:1.8753252E38)
                        r0.setText(r1)
                        goto L_0x039d
                    L_0x0393:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        r1 = 2131563884(0x7f0d156c, float:1.8753238E38)
                        r0.setText(r1)
                    L_0x039d:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        r0.setVisibility(r8)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        r0.setOnClickListener(r1)
                        goto L_0x03b7
                    L_0x03ae:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        r1 = 8
                        r0.setVisibility(r1)
                    L_0x03b7:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.s
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x03dd
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.q
                        int r0 = r0.getVisibility()
                        if (r0 == 0) goto L_0x03d5
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.u
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x03dd
                    L_0x03d5:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.t
                        r0.setVisibility(r8)
                        goto L_0x03e6
                    L_0x03dd:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.t
                        r1 = 8
                        r0.setVisibility(r1)
                    L_0x03e6:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment r0 = r0.B
                        if (r0 == 0) goto L_0x03f7
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment r0 = r0.B
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f11662f
                        r0.a((com.bytedance.android.live.base.model.user.User) r1)
                    L_0x03f7:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2.AnonymousClass1.run():void");
                }
            });
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6166, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6169, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            this.D.d();
        }
        if (this.E != null) {
            this.E.f9083b = null;
        }
        this.G = false;
        this.C.clear();
        super.onDestroy();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11657a, true, 6170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11657a, true, 6170, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveProfileDialogV2.java", LiveProfileDialogV2.class);
            P = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2", "android.view.View", NotifyType.VIBRATE, "", "void"), 444);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6161, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.j.a.a().a("livesdk_live_show", Room.class, new j().a("live_detail").c("personal_card"), new com.bytedance.android.livesdk.j.c.k());
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6154, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("target_uid", String.valueOf(this.f11661e));
            hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().k().a(this.f11661e));
            hashMap.put("packed_level", PushConstants.PUSH_TYPE_UPLOAD_LOG);
            hashMap.put("current_room_id", String.valueOf(this.g.getId()));
            hashMap.put("request_from", "admin");
            hashMap.put("anchor_id", String.valueOf(this.g.getOwner().getId()));
            hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().k().a(this.g.getOwner().getId()));
            if (this.D != null) {
                this.D.a(hashMap);
            }
        }
    }

    public final void a(String str) {
        if (this.B != null) {
            this.B.A = str;
        }
    }

    public final void b(String str) {
        this.H = str;
        if (this.B != null) {
            this.B.B = str;
        }
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11657a, false, 6165, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11657a, false, 6165, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (!(th2 instanceof com.bytedance.android.live.a.a.b.a)) {
            l.a(getContext(), th2);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11657a, false, 6145, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11657a, false, 6145, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
    }

    public final void a(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f11657a, false, 6162, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f11657a, false, 6162, new Class[]{i.class}, Void.TYPE);
        } else if (this.G) {
            if (iVar == null || iVar.getId() <= 0) {
                a((Throwable) new IllegalArgumentException("User is invalid"));
            } else {
                this.f11662f = User.from(iVar);
                c();
                if (this.f11662f.getFollowInfo() != null && this.i) {
                    this.A.lambda$put$1$DataCenter("data_xt_followed_change", Long.valueOf(this.f11662f.getFollowInfo().f7763c));
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11657a, false, 6144, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11657a, false, 6144, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.L) {
                window.setGravity(8388693);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
            } else {
                window.setGravity(80);
                window.setLayout(-1, -2);
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                window.setSoftInputMode(48);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11657a, false, 6143, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11657a, false, 6143, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.L) {
            i2 = C0906R.style.v0;
        } else {
            i2 = C0906R.style.v1;
        }
        setStyle(1, i2);
        this.G = true;
        if (this.D != null) {
            this.D.a((af.b) this);
        }
        if (this.E != null) {
            this.E.f9083b = this;
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f11657a, false, 6163, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f11657a, false, 6163, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.G) {
            if (this.J.getVisibility() == 8) {
                this.I.setVisibility(8);
                this.J.setVisibility(0);
            } else if (th instanceof com.bytedance.android.live.a.a.b.a) {
                ai.a(((com.bytedance.android.live.a.a.b.a) th).getPrompt());
            } else {
                ai.a((int) C0906R.string.d9r);
            }
        }
    }

    public void onClick(View view) {
        FansClubData fansClubData;
        boolean z2;
        boolean z3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f11657a, false, 6153, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f11657a, false, 6153, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(P, this, this, view2));
        int id = view.getId();
        if (id == C0906R.id.hk) {
            if (view2.getTag(C0906R.id.hk) instanceof User) {
                if (this.f11662f == null || this.g == null || this.f11662f.getLiveRoomId() == 0 || this.f11662f.getId() == this.g.getOwnerUserId() || !com.bytedance.android.live.uikit.a.a.d()) {
                    if (!this.l) {
                        User user = (User) view2.getTag(C0906R.id.hk);
                        if (PatchProxy.isSupport(new Object[]{user}, this, f11657a, false, 6156, new Class[]{User.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{user}, this, f11657a, false, 6156, new Class[]{User.class}, Void.TYPE);
                        } else if (this.g != null) {
                            if (((Integer) e.a().f9041c).intValue() == 2) {
                                ai.a((int) C0906R.string.d57);
                            } else {
                                if (this.i) {
                                    this.f11660d.a("live_audience_c_anchor", user.getId());
                                } else {
                                    this.f11660d.a("live_audience_c_audience", user.getId());
                                }
                                HashMap hashMap = new HashMap(1);
                                if (this.A != null) {
                                    hashMap.put("log_enter_live_source", this.A.get("log_enter_live_source"));
                                } else {
                                    hashMap.put("log_enter_live_source", this.p);
                                }
                                hashMap.put("sec_user_id", user.getSecUid());
                                if (com.bytedance.android.live.uikit.a.a.f()) {
                                    hashMap.put("second_enter_room", String.valueOf(this.g.getId()));
                                }
                                TTLiveSDKContext.getHostService().i().a(user.getId(), (Map<String, String>) hashMap);
                                dismiss();
                            }
                        }
                        dismiss();
                    } else {
                        return;
                    }
                } else if (this.l) {
                    ai.a((int) C0906R.string.dc1);
                } else {
                    final User user2 = (User) view2.getTag(C0906R.id.hk);
                    if (PatchProxy.isSupport(new Object[]{user2}, this, f11657a, false, 6157, new Class[]{User.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user2}, this, f11657a, false, 6157, new Class[]{User.class}, Void.TYPE);
                    } else if (user2.getLiveRoomId() != 0) {
                        new com.bytedance.android.livesdk.chatroom.detail.i(new b.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f11667a;

                            public final void a(int i, String str) {
                            }

                            public final void a(@NonNull Room room) {
                                if (PatchProxy.isSupport(new Object[]{room}, this, f11667a, false, 6175, new Class[]{Room.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{room}, this, f11667a, false, 6175, new Class[]{Room.class}, Void.TYPE);
                                    return;
                                }
                                int orientation = room.getOrientation();
                                LiveProfileDialogV2 liveProfileDialogV2 = LiveProfileDialogV2.this;
                                long liveRoomId = user2.getLiveRoomId();
                                long id = user2.getId();
                                if (PatchProxy.isSupport(new Object[]{new Long(liveRoomId), new Long(id), Integer.valueOf(orientation)}, liveProfileDialogV2, LiveProfileDialogV2.f11657a, false, 6158, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                                    LiveProfileDialogV2 liveProfileDialogV22 = liveProfileDialogV2;
                                    PatchProxy.accessDispatch(new Object[]{new Long(liveRoomId), new Long(id), Integer.valueOf(orientation)}, liveProfileDialogV22, LiveProfileDialogV2.f11657a, false, 6158, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                liveProfileDialogV2.dismiss();
                                Bundle bundle = new Bundle();
                                bundle.putString("enter_from", "live_detail");
                                bundle.putLong("anchor_id", id);
                                bundle.putLong("from_room_id", liveRoomId);
                                com.bytedance.android.livesdk.j.a.a().a(j.class);
                                bundle.putString("enter_from_merge", "live_detail");
                                bundle.putString("enter_from", "live_detail");
                                bundle.putString("enter_method", "personal_card");
                                bundle.putString("source", "personal_card");
                                if (com.bytedance.android.live.uikit.a.a.f()) {
                                    bundle.putInt("orientation", orientation);
                                }
                                com.bytedance.android.livesdk.rank.a.a(liveProfileDialogV2.A, bundle);
                                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.l(liveRoomId, "live_detail", bundle));
                            }
                        }, user2.getLiveRoomId()).a();
                    }
                }
            } else {
                return;
            }
        }
        if (id == C0906R.id.cdx) {
            this.I.setVisibility(0);
            this.J.setVisibility(8);
            d();
            return;
        }
        if (id == C0906R.id.bl9) {
            if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6160, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6160, new Class[0], Void.TYPE);
            } else {
                if (this.g != null) {
                    if (!NetworkUtils.isNetworkAvailable(getContext())) {
                        ai.a((int) C0906R.string.cst);
                    } else if (this.l || this.n) {
                        dismiss();
                        if (this.F == null || this.f11662f == null || this.F.getId() != this.f11662f.getId()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        df dfVar = new df(getContext(), this.g, this.f11662f, z2, this.L);
                        dfVar.show();
                    } else if (this.m) {
                        if (this.f11662f.getUserAttr() == null || !this.f11662f.getUserAttr().f7773b) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.E != null) {
                            this.E.a(z3, this.g.getId(), this.f11661e);
                        }
                    }
                }
            }
        } else if (id == C0906R.id.ac5) {
            if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6155, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6155, new Class[0], Void.TYPE);
                return;
            }
            dismiss();
            if (this.h && this.A != null) {
                h hVar = new h();
                hVar.f10176b = this.N;
                if (!(this.f11662f == null || this.f11662f.getFansClub() == null)) {
                    FansClubMember fansClub = this.f11662f.getFansClub();
                    if (fansClub.getPreferData() == null || fansClub.getPreferData().size() <= 0) {
                        fansClubData = null;
                    } else {
                        fansClubData = fansClub.getPreferData().get(0);
                    }
                    hVar.f10175a = fansClubData;
                }
                this.A.lambda$put$1$DataCenter("cmd_show_fans_club_setting", hVar);
            }
        }
    }

    public final void a(List<com.bytedance.android.live.base.model.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f11657a, false, 6164, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f11657a, false, 6164, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null && list.size() > 0) {
            this.N = list;
            if (this.B != null) {
                this.B.D = list;
            }
            this.u.setVisibility(0);
            if (this.s.getVisibility() == 0) {
                this.t.setVisibility(0);
                return;
            }
            this.t.setVisibility(8);
        }
    }

    public final void b(boolean z2, Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), exc2}, this, f11657a, false, 6168, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), exc2}, this, f11657a, false, 6168, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (this.G) {
            l.a(getContext(), (Throwable) exc2, (int) C0906R.string.d9g);
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        LiveProfileDetailFragment liveProfileDetailFragment;
        boolean z2;
        View view2 = view;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f11657a, false, 6147, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f11657a, false, 6147, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.g != null) {
            this.r = view2.findViewById(C0906R.id.bep);
            this.K = view2.findViewById(C0906R.id.bjl);
            this.I = view2.findViewById(C0906R.id.c7k);
            this.J = view2.findViewById(C0906R.id.cdx);
            this.J.setOnClickListener(this);
            this.I.setVisibility(0);
            this.J.setVisibility(8);
            this.q = view2.findViewById(C0906R.id.cdl);
            this.s = (TextView) view2.findViewById(C0906R.id.bl9);
            this.t = view2.findViewById(C0906R.id.bla);
            this.u = (TextView) view2.findViewById(C0906R.id.ac5);
            this.u.setOnClickListener(this);
            this.u.setVisibility(8);
            this.v = (HSImageView) view2.findViewById(C0906R.id.hk);
            this.w = (LivingView) view2.findViewById(C0906R.id.bfg);
            this.x = view2.findViewById(C0906R.id.ayv);
            this.y = (HSImageView) view2.findViewById(C0906R.id.ays);
            this.v.setOnClickListener(this);
            if (PatchProxy.isSupport(new Object[]{100}, this, f11657a, false, 6151, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{100}, this, f11657a, false, 6151, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                Activity activity = this.z;
                User user = this.f11662f;
                Room room = this.g;
                boolean z4 = this.L;
                int i2 = this.f11659c;
                af afVar = this.D;
                DataCenter dataCenter = this.A;
                if (PatchProxy.isSupport(new Object[]{activity, user, room, Byte.valueOf(z4 ? (byte) 1 : 0), Integer.valueOf(i2), afVar, dataCenter}, null, LiveProfileDetailFragment.f11636a, true, 6091, new Class[]{Activity.class, User.class, Room.class, Boolean.TYPE, Integer.TYPE, af.class, DataCenter.class}, LiveProfileDetailFragment.class)) {
                    liveProfileDetailFragment = (LiveProfileDetailFragment) PatchProxy.accessDispatch(new Object[]{activity, user, room, Byte.valueOf(z4), Integer.valueOf(i2), afVar, dataCenter}, null, LiveProfileDetailFragment.f11636a, true, 6091, new Class[]{Activity.class, User.class, Room.class, Boolean.TYPE, Integer.TYPE, af.class, DataCenter.class}, LiveProfileDetailFragment.class);
                } else {
                    LiveProfileDetailFragment liveProfileDetailFragment2 = new LiveProfileDetailFragment();
                    liveProfileDetailFragment2.r = user;
                    if (user != null) {
                        liveProfileDetailFragment2.u = user.getId();
                        liveProfileDetailFragment2.w = new y(activity, room, user.getId());
                    }
                    liveProfileDetailFragment2.v = room;
                    liveProfileDetailFragment2.z = i2;
                    liveProfileDetailFragment2.x = z4;
                    liveProfileDetailFragment2.y = afVar;
                    liveProfileDetailFragment2.h = activity;
                    liveProfileDetailFragment2.i = dataCenter;
                    if (com.bytedance.android.livesdkapi.a.a.f18614b || ((Integer) LiveSettingKeys.SHOW_ANCHOR_LEVEL.a()).intValue() != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    liveProfileDetailFragment2.E = z2;
                    liveProfileDetailFragment = liveProfileDetailFragment2;
                }
                this.B = liveProfileDetailFragment;
                if (this.D != null) {
                    this.D.f11208b = this.B;
                }
                LiveProfileDetailFragment liveProfileDetailFragment3 = this.B;
                if (PatchProxy.isSupport(new Object[]{liveProfileDetailFragment3}, this, f11657a, false, 6152, new Class[]{Fragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{liveProfileDetailFragment3}, this, f11657a, false, 6152, new Class[]{Fragment.class}, Void.TYPE);
                } else if (liveProfileDetailFragment3 != null) {
                    FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                    beginTransaction.replace(C0906R.id.c6z, liveProfileDetailFragment3);
                    beginTransaction.commitAllowingStateLoss();
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6148, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6148, new Class[0], Void.TYPE);
            } else if (com.bytedance.android.live.uikit.a.a.a()) {
                this.O = false;
            } else if (com.bytedance.android.live.uikit.a.a.b()) {
                this.O = false;
            } else if (com.bytedance.android.live.uikit.a.a.f()) {
                this.O = false;
            }
            if (this.f11662f == null) {
                if (PatchProxy.isSupport(new Object[0], this, f11657a, false, 6149, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11657a, false, 6149, new Class[0], Void.TYPE);
                } else {
                    this.r.setVisibility(8);
                    this.K.setVisibility(0);
                }
            } else {
                c();
            }
            long b2 = TTLiveSDKContext.getHostService().k().b();
            if (this.g.getOwner() != null && b2 == this.g.getOwner().getId()) {
                z3 = true;
            }
            this.l = z3;
            if (this.l) {
                this.m = true;
            } else if (!(this.F == null || this.F.getUserAttr() == null)) {
                this.n = this.F.getUserAttr().f7775d;
                this.m = this.F.getUserAttr().f7774c;
            }
            d();
            if (this.O && this.h && !com.bytedance.android.livesdkapi.a.a.f18614b && !com.bytedance.android.live.uikit.a.a.f() && this.D != null) {
                this.D.a();
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11657a, false, 6146, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11657a, false, 6146, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.M = layoutInflater.inflate(C0906R.layout.agu, viewGroup2, false);
        return this.M;
    }

    public static LiveProfileDialogV2 a(@NonNull Context context, boolean z2, long j2, Room room, User user, String str) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z2 ? (byte) 1 : 0), new Long(j3), room, user, str}, null, f11657a, true, 6142, new Class[]{Context.class, Boolean.TYPE, Long.TYPE, Room.class, User.class, String.class}, LiveProfileDialogV2.class)) {
            return a(context, z2, j2, room, user, 1, str);
        }
        return (LiveProfileDialogV2) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z2), new Long(j3), room, user, str}, null, f11657a, true, 6142, new Class[]{Context.class, Boolean.TYPE, Long.TYPE, Room.class, User.class, String.class}, LiveProfileDialogV2.class);
    }

    private static LiveProfileDialogV2 a(@NonNull Context context, boolean z2, long j2, Room room, User user, int i2, String str) {
        Context context2 = context;
        long j3 = j2;
        Room room2 = room;
        User user2 = user;
        String str2 = str;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z2 ? (byte) 1 : 0), new Long(j3), room2, user2, 1, str2}, null, f11657a, true, 6140, new Class[]{Context.class, Boolean.TYPE, Long.TYPE, Room.class, User.class, Integer.TYPE, String.class}, LiveProfileDialogV2.class)) {
            return (LiveProfileDialogV2) PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z2), new Long(j3), room2, user2, 1, str2}, null, f11657a, true, 6140, new Class[]{Context.class, Boolean.TYPE, Long.TYPE, Room.class, User.class, Integer.TYPE, String.class}, LiveProfileDialogV2.class);
        }
        LiveProfileDialogV2 liveProfileDialogV2 = new LiveProfileDialogV2();
        liveProfileDialogV2.L = z2;
        liveProfileDialogV2.f11661e = j3;
        if (TTLiveSDKContext.getHostService().k().b() == j3) {
            z3 = true;
        }
        liveProfileDialogV2.h = z3;
        liveProfileDialogV2.g = room2;
        liveProfileDialogV2.F = user2;
        liveProfileDialogV2.D = new af();
        liveProfileDialogV2.f11660d = new y(context2, room2, j3);
        liveProfileDialogV2.E = new com.bytedance.android.livesdk.b.a();
        liveProfileDialogV2.f11659c = 1;
        liveProfileDialogV2.p = str2;
        liveProfileDialogV2.z = (Activity) context2;
        return liveProfileDialogV2;
    }
}
