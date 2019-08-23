package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.im.sdk.a.b;
import com.ss.android.ugc.aweme.im.sdk.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PhotoPreviewListActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50759a;

    /* renamed from: b  reason: collision with root package name */
    String f50760b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<j> f50761c;

    /* renamed from: d  reason: collision with root package name */
    public View f50762d;

    /* renamed from: e  reason: collision with root package name */
    public View f50763e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f50764f;
    public TextView g;
    public ImageView h;
    public View i;
    public m j;
    public i k;
    private int l;
    private ViewPager m;
    private p n;
    private au.a o;
    private PhotoPreviewPagerAdapter p;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50759a, false, 51021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50759a, false, 51021, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50759a, false, 51022, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50759a, false, 51022, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50759a, false, 51014, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50759a, false, 51014, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f50760b);
        bundle.putInt("photo_start_index", this.l);
        bundle.putSerializable("photo_param_list", this.f50761c);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50759a, false, 51013, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50759a, false, 51013, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.rt);
        a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50759a, false, 51015, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50759a, false, 51015, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            if (bundle != null) {
                this.f50761c = (ArrayList) bundle.getSerializable("photo_param_list");
                this.f50760b = bundle.getString("session_id");
                this.l = bundle.getInt("photo_start_index");
            } else {
                this.f50761c = (ArrayList) getIntent().getSerializableExtra("photo_param_list");
                this.f50760b = getIntent().getStringExtra("session_id");
                this.l = getIntent().getIntExtra("photo_start_index", 0);
            }
            this.j = m.a();
            if (CollectionUtils.isEmpty(this.f50761c)) {
                this.f50761c = j.fromPhotoItems(this.j.f50862d);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f50759a, false, 51016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50759a, false, 51016, new Class[0], Void.TYPE);
        } else {
            this.m = (ViewPager) findViewById(C0906R.id.dvl);
            this.f50762d = findViewById(C0906R.id.co1);
            this.f50762d.setSelected(this.j.f50861c);
            this.f50764f = (TextView) findViewById(C0906R.id.cno);
            this.f50764f.setText(this.j.d());
            this.f50763e = findViewById(C0906R.id.j5);
            this.g = (TextView) findViewById(C0906R.id.cn4);
            this.h = (ImageView) findViewById(C0906R.id.cn3);
            this.i = findViewById(C0906R.id.cn5);
            if (PatchProxy.isSupport(new Object[0], this, f50759a, false, 51017, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50759a, false, 51017, new Class[0], Void.TYPE);
            } else if (CollectionUtils.isEmpty(this.f50761c)) {
                finish();
            } else {
                if (this.l < 0 || this.f50761c == null || this.l >= this.f50761c.size()) {
                    this.l = 0;
                }
                this.j.a(this.g, this.h, null, this.f50761c.get(this.l).getPath());
                this.p = new PhotoPreviewPagerAdapter(getSupportFragmentManager(), this.f50761c);
                this.k = this.j.b(this.f50761c.get(this.l).getPath());
                this.m.setAdapter(this.p);
                this.m.setCurrentItem(this.l);
                if (PatchProxy.isSupport(new Object[0], this, f50759a, false, 51019, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50759a, false, 51019, new Class[0], Void.TYPE);
                } else {
                    if (this.n == null) {
                        this.n = new p() {

                            /* renamed from: b  reason: collision with root package name */
                            public static ChangeQuickRedirect f50765b;

                            public final void onClick(View view) {
                                View view2 = view;
                                if (PatchProxy.isSupport(new Object[]{view2}, this, f50765b, false, 51023, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view2}, this, f50765b, false, 51023, new Class[]{View.class}, Void.TYPE);
                                } else if (view2.equals(PhotoPreviewListActivity.this.f50764f)) {
                                    new b(PhotoPreviewListActivity.this, new c() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f50767a;

                                        public final void sendMsg() {
                                            if (PatchProxy.isSupport(new Object[0], this, f50767a, false, 51024, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f50767a, false, 51024, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            PhotoPreviewListActivity photoPreviewListActivity = PhotoPreviewListActivity.this;
                                            if (PatchProxy.isSupport(new Object[0], photoPreviewListActivity, PhotoPreviewListActivity.f50759a, false, 51018, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], photoPreviewListActivity, PhotoPreviewListActivity.f50759a, false, 51018, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            if (j.a((Collection<T>) photoPreviewListActivity.j.b())) {
                                                arrayList.add(photoPreviewListActivity.k);
                                            } else {
                                                arrayList.addAll(photoPreviewListActivity.j.b());
                                            }
                                            if (bc.c()) {
                                                s.a().b(photoPreviewListActivity.f50760b, j.fromPhotoItems(arrayList));
                                            } else {
                                                s.a().a(photoPreviewListActivity.f50760b, (List<j>) j.fromPhotoItems(arrayList));
                                            }
                                            photoPreviewListActivity.j.e();
                                            if (PatchProxy.isSupport(new Object[0], photoPreviewListActivity, PhotoPreviewListActivity.f50759a, false, 51020, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], photoPreviewListActivity, PhotoPreviewListActivity.f50759a, false, 51020, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            Intent intent = new Intent();
                                            intent.putExtra("send_photo", true);
                                            photoPreviewListActivity.setResult(49, intent);
                                            photoPreviewListActivity.finish();
                                        }
                                    }).sendMsg();
                                } else if (view2.equals(PhotoPreviewListActivity.this.f50762d)) {
                                    PhotoPreviewListActivity.this.f50762d.setSelected(!PhotoPreviewListActivity.this.f50762d.isSelected());
                                    PhotoPreviewListActivity.this.j.f50861c = PhotoPreviewListActivity.this.f50762d.isSelected();
                                } else if (view2.equals(PhotoPreviewListActivity.this.f50763e)) {
                                    PhotoPreviewListActivity.this.finish();
                                } else {
                                    if (view2.equals(PhotoPreviewListActivity.this.h)) {
                                        if (view.isSelected()) {
                                            PhotoPreviewListActivity.this.j.b(PhotoPreviewListActivity.this.k);
                                        } else if (PhotoPreviewListActivity.this.j.c() >= m.f50859b) {
                                            UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.axf);
                                            return;
                                        } else {
                                            PhotoPreviewListActivity.this.j.a(PhotoPreviewListActivity.this.k);
                                        }
                                        view2.setSelected(!view.isSelected());
                                        PhotoPreviewListActivity.this.j.a(null, PhotoPreviewListActivity.this.i, PhotoPreviewListActivity.this.g, PhotoPreviewListActivity.this.h, null, PhotoPreviewListActivity.this.k.f50847b.f27990b);
                                        PhotoPreviewListActivity.this.f50764f.setText(PhotoPreviewListActivity.this.j.d());
                                    }
                                }
                            }
                        };
                    }
                    if (this.o == null) {
                        this.o = au.a.h();
                    }
                    this.o.a(this.f50763e, this.f50762d, this.f50764f, this.f50762d, this.h);
                    p.a((View.OnClickListener) this.n, this.f50764f, this.f50762d, this.f50763e, this.h);
                    this.m.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50769a;

                        public void onPageScrollStateChanged(int i) {
                        }

                        public void onPageScrolled(int i, float f2, int i2) {
                        }

                        public void onPageSelected(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50769a, false, 51025, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50769a, false, 51025, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            PhotoPreviewListActivity.this.k = PhotoPreviewListActivity.this.j.b(PhotoPreviewListActivity.this.f50761c.get(i).getPath());
                            if (!(PhotoPreviewListActivity.this.k == null || PhotoPreviewListActivity.this.k.f50847b == null)) {
                                PhotoPreviewListActivity.this.h.setSelected(PhotoPreviewListActivity.this.j.a(PhotoPreviewListActivity.this.k.f50847b.f27990b));
                                PhotoPreviewListActivity.this.j.a(PhotoPreviewListActivity.this.g, PhotoPreviewListActivity.this.h, null, PhotoPreviewListActivity.this.k.f50847b.f27990b);
                            }
                        }
                    });
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewListActivity", "onCreate", false);
    }
}
