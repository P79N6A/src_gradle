package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.ss.android.vesdk.VEUtils;
import java.text.DecimalFormat;

public class CountdownFragment extends AppCompatDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66037a;

    /* renamed from: b  reason: collision with root package name */
    VolumeTapsView f66038b;

    /* renamed from: c  reason: collision with root package name */
    public a f66039c;

    /* renamed from: d  reason: collision with root package name */
    TextView f66040d;

    /* renamed from: e  reason: collision with root package name */
    TextView f66041e;

    /* renamed from: f  reason: collision with root package name */
    TextView f66042f;
    String g;
    long h;
    SafeHandler i;

    public interface a {
        void a();

        void a(int i);

        void a(@Nullable String str, int i, int i2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f66037a, false, 75325, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f66037a, false, 75325, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.f66039c != null) {
            this.f66039c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66037a, false, 75328, new Class[]{Float.TYPE}, Float.TYPE)) {
            return Math.min(1.0f, ((((float) this.f66038b.getMeasuredWidth()) - f2) - ((float) this.f66041e.getMeasuredWidth())) / 100.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66037a, false, 75328, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
    }

    /* access modifiers changed from: package-private */
    public String b(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66037a, false, 75330, new Class[]{Float.TYPE}, String.class)) {
            return new DecimalFormat("0.0").format((double) f2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66037a, false, 75330, new Class[]{Float.TYPE}, String.class);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66037a, false, 75321, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66037a, false, 75321, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.ff);
        this.i = new SafeHandler(this);
    }

    @SuppressLint({"ResourceAsColor"})
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66037a, false, 75322, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f66037a, false, 75322, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        if (!fc.a()) {
            v.a(onCreateDialog);
        }
        return onCreateDialog;
    }

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f66037a, false, 75324, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f66037a, false, 75324, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66037a, false, 75326, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66037a, false, 75326, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.post(new f(this, i2, i3));
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        final long j;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66037a, false, 75323, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66037a, false, 75323, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.pv, viewGroup2, false);
        inflate.setMinimumWidth(100000);
        this.f66038b = (VolumeTapsView) inflate.findViewById(C0906R.id.dvf);
        this.f66040d = (TextView) inflate.findViewById(C0906R.id.d1w);
        this.f66041e = (TextView) inflate.findViewById(C0906R.id.d0u);
        this.f66042f = (TextView) inflate.findViewById(C0906R.id.d1j);
        Bundle arguments = getArguments();
        UrlModel urlModel = (UrlModel) arguments.getSerializable("volume_taps");
        long j2 = arguments.getLong("sdk_record_time");
        if (arguments.getLong("start_time") >= 0) {
            j = arguments.getLong("start_time");
        } else {
            j = 0;
        }
        long j3 = arguments.getLong("total_time");
        long j4 = arguments.getLong("max_duration");
        f fVar = (f) arguments.getSerializable("wave_info");
        this.g = arguments.getString("path");
        this.h = j4;
        VolumeTapsView volumeTapsView = this.f66038b;
        int i2 = (int) j;
        long j5 = j2;
        int i3 = (int) (j + j4);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, volumeTapsView, VolumeTapsView.f71399a, false, 81493, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, volumeTapsView, VolumeTapsView.f71399a, false, 81493, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("start: " + i2);
        } else if (i3 >= i2) {
            int i4 = i2 - volumeTapsView.f71400b;
            volumeTapsView.f71402d += i4;
            volumeTapsView.g += i4;
            volumeTapsView.f71403e += i4;
            volumeTapsView.f71404f += i4;
            volumeTapsView.f71400b = i2;
            volumeTapsView.f71401c = i3;
            volumeTapsView.invalidate();
        } else {
            throw new IllegalArgumentException("start: " + i2 + "; end: " + i3);
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.i.b(this.g);
        VolumeTapsView volumeTapsView2 = this.f66038b;
        if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(b2)}, volumeTapsView2, VolumeTapsView.f71399a, false, 81508, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(b2)}, volumeTapsView2, VolumeTapsView.f71399a, false, 81508, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
        } else if (fVar == null || !com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a(fVar.getMusicWavePointArray())) {
            volumeTapsView2.a(volumeTapsView2.a(volumeTapsView2.getContext(), b2));
        } else {
            com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(fVar, volumeTapsView2.f71400b, volumeTapsView2.f71401c - volumeTapsView2.f71400b, b2);
            int b3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().b(volumeTapsView2.getContext());
            if (b3 < fVar.getMusicWavePointArray().length) {
                volumeTapsView2.a(com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(VEUtils.getResampleMusicWaveData(fVar.getMusicWavePointArray(), 0, b3)));
            }
        }
        this.f66038b.setTotalTime(j3);
        final long j6 = j5;
        this.f66038b.setPastPosition((int) (Math.max(0, j6) + j));
        this.f66038b.setStopPosition((int) (Math.max(0, j4) + j));
        this.f66038b.setOnProgressChangeListener(new VolumeTapsView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66043a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66043a, false, 75335, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66043a, false, 75335, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                CountdownFragment.this.a(i, (int) j);
            }

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66043a, false, 75334, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66043a, false, 75334, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (CountdownFragment.this.f66039c != null) {
                    CountdownFragment.this.f66039c.a(CountdownFragment.this.g, i, i2);
                }
                r.onEvent(MobClick.obtain().setEventName("change_beat").setLabelName("beat_page"));
                CountdownFragment.this.a(i2, (int) j);
            }
        });
        c.a(urlModel, (c.a) new c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66046a;

            public final void a(Exception exc) {
            }

            public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f66046a, false, 75336, new Class[]{DataSource.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f66046a, false, 75336, new Class[]{DataSource.class}, Void.TYPE);
                } else if (dataSource.isFinished()) {
                    CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
                    Bitmap bitmap = null;
                    if (closeableReference != null && (closeableReference.get() instanceof com.facebook.imagepipeline.image.a)) {
                        bitmap = ((com.facebook.imagepipeline.image.a) closeableReference.get()).getUnderlyingBitmap();
                    }
                    try {
                        CountdownFragment.this.f66038b.setWavForm(bitmap);
                    } finally {
                        CloseableReference.closeSafely(closeableReference);
                    }
                }
            }
        });
        ((TextView) inflate.findViewById(C0906R.id.cup)).setOnClickListener(new d(this, j));
        this.f66041e.setText(String.format("%ss", new Object[]{String.valueOf(j4 / 1000)}));
        this.f66040d.setText("0s");
        this.f66042f.setText(String.format("%ss", new Object[]{b(((float) j4) / 1000.0f)}));
        ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
        final View view = inflate;
        final long j7 = j4;
        AnonymousClass3 r0 = new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66048a;

            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f66048a, false, 75337, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66048a, false, 75337, new Class[0], Void.TYPE);
                    return;
                }
                CountdownFragment.this.a(CountdownFragment.this.f66038b.getStopPosition(), (int) j);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (CountdownFragment.this.f66039c != null) {
                    CountdownFragment.this.f66039c.a(CountdownFragment.this.g, (int) (j + j6), (int) (j + j7));
                }
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(r0);
        inflate.setOnClickListener(e.f66068b);
        return inflate;
    }
}
