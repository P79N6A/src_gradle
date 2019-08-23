package com.zhihu.matisse.internal.ui;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import com.zhihu.matisse.c.b;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.a;

public class PreviewItemFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public b f82686a;

    public void onDetach() {
        super.onDetach();
        this.f82686a = null;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f82686a = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Point point;
        super.onViewCreated(view, bundle);
        final c cVar = (c) getArguments().getParcelable("args_item");
        if (cVar != null) {
            View findViewById = view.findViewById(C0906R.id.dsj);
            if (cVar.c()) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(cVar.f82643c, "video/*");
                        try {
                            PreviewItemFragment.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast makeText = Toast.makeText(PreviewItemFragment.this.getContext(), C0906R.string.bag, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                eq.a(makeText);
                            }
                            makeText.show();
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            ImageViewTouch imageViewTouch = (ImageViewTouch) view.findViewById(C0906R.id.arl);
            imageViewTouch.setDisplayType(a.C0884a.FIT_TO_SCREEN);
            imageViewTouch.setSingleTapListener(new ImageViewTouch.c() {
                public final void a() {
                    if (PreviewItemFragment.this.f82686a != null) {
                        PreviewItemFragment.this.f82686a.b();
                    }
                }
            });
            Uri uri = cVar.f82643c;
            FragmentActivity activity = getActivity();
            ContentResolver contentResolver = activity.getContentResolver();
            Point a2 = com.zhihu.matisse.internal.a.c.a(contentResolver, uri);
            int i = a2.x;
            int i2 = a2.y;
            if (com.zhihu.matisse.internal.a.c.c(contentResolver, uri)) {
                i = a2.y;
                i2 = a2.x;
            }
            if (i2 == 0) {
                point = new Point(1600, 1600);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f2 = (float) i;
                float f3 = ((float) displayMetrics.widthPixels) / f2;
                float f4 = (float) i2;
                float f5 = ((float) displayMetrics.heightPixels) / f4;
                if (f3 > f5) {
                    point = new Point((int) (f2 * f3), (int) (f4 * f5));
                } else {
                    point = new Point((int) (f2 * f3), (int) (f4 * f5));
                }
            }
            if (cVar.b()) {
                d.a().p.b(getContext(), point.x, point.y, (ImageView) imageViewTouch, cVar.f82643c);
            } else {
                d.a().p.a(getContext(), point.x, point.y, (ImageView) imageViewTouch, cVar.f82643c);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0906R.layout.pm, viewGroup, false);
    }
}
