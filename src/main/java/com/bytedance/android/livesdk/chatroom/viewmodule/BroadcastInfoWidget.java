package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class BroadcastInfoWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12372a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f12373b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f12374c;

    /* renamed from: d  reason: collision with root package name */
    long f12375d;

    /* renamed from: e  reason: collision with root package name */
    View f12376e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f12377f = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12378a;

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f12378a, false, 6596, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12378a, false, 6596, new Class[0], Void.TYPE);
                return;
            }
            if (BroadcastInfoWidget.this.isViewValid()) {
                BroadcastInfoWidget broadcastInfoWidget = BroadcastInfoWidget.this;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (PatchProxy.isSupport(new Object[]{new Long(elapsedRealtime)}, broadcastInfoWidget, BroadcastInfoWidget.f12372a, false, 6591, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(elapsedRealtime)}, broadcastInfoWidget, BroadcastInfoWidget.f12372a, false, 6591, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    long j = elapsedRealtime - broadcastInfoWidget.f12375d;
                    if (j < 0) {
                        j = 0;
                    }
                    TextView textView = broadcastInfoWidget.f12374c;
                    int i = (int) (j / 1000);
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), ClassUtils.PACKAGE_SEPARATOR}, null, ah.f17576a, true, 13735, new Class[]{Integer.TYPE, String.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), ClassUtils.PACKAGE_SEPARATOR}, null, ah.f17576a, true, 13735, new Class[]{Integer.TYPE, String.class}, String.class);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (i <= 0) {
                            str = "";
                        } else {
                            long j2 = (long) (i / 3600);
                            long j3 = ((long) i) - (3600 * j2);
                            long j4 = j3 / 60;
                            long j5 = j3 - (60 * j4);
                            if (j2 < 10) {
                                sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                            }
                            sb.append(j2);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            if (j4 < 10) {
                                sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                            }
                            sb.append(j4);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            if (j5 < 10) {
                                sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                            }
                            sb.append(j5);
                            str = sb.toString();
                        }
                    }
                    textView.setText(str);
                }
                BroadcastInfoWidget.this.f12374c.postDelayed(BroadcastInfoWidget.this.f12377f, 1000);
            }
        }
    };
    private Integer[] g;
    private Room h;

    public int getLayoutId() {
        return C0906R.layout.akp;
    }

    public void onUnload() {
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12372a, false, 6589, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12372a, false, 6589, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = (Room) this.dataCenter.get("data_room");
        this.g = (Integer[]) LiveConfigSettingKeys.LIVE_VIDEO_PUSH_BITRATE_LEVEL.a();
        this.f12373b = (ImageView) this.contentView.findViewById(C0906R.id.b2r);
        this.f12373b.setImageLevel(4);
        this.f12374c = (TextView) this.contentView.findViewById(C0906R.id.bd7);
        this.f12376e = this.contentView.findViewById(C0906R.id.c7q);
    }

    public final void a(float f2) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f12372a, false, 6592, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f12372a, false, 6592, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        BroadcastInfoWidget.class.getSimpleName();
        new StringBuilder("kbps:").append(f2);
        Integer[] numArr = this.g;
        if (this.h.getStreamType() != a.AUDIO) {
            int i2 = 0;
            while (true) {
                if (i2 >= numArr.length) {
                    break;
                } else if (f2 >= ((float) numArr[i2].intValue())) {
                    i = (numArr.length - i2) - 1;
                    break;
                } else {
                    i2++;
                }
            }
        } else if (f2 != 0.0f) {
            i = 4;
            Observable.just(0).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new i(this, i), j.f13275b);
        }
        i = 0;
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new i(this, i), j.f13275b);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12372a, false, 6590, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12372a, false, 6590, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.h = (Room) this.dataCenter.get("data_room");
        if (this.h.getId() != ((Long) b.u.a()).longValue() || ((Long) b.v.a()).longValue() <= 0) {
            this.f12375d = SystemClock.elapsedRealtime();
            b.u.a(Long.valueOf(this.h.getId()));
            b.v.a(Long.valueOf(this.f12375d));
        } else {
            this.f12375d = ((Long) b.v.a()).longValue();
        }
        this.f12374c.postDelayed(this.f12377f, 1000);
    }
}
