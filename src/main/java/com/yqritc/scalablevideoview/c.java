package com.yqritc.scalablevideoview;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class c extends TextureView implements MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    public MediaPlayer m;
    protected b n;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void c() {
        this.m.reset();
    }

    public int getCurrentPosition() {
        return this.m.getCurrentPosition();
    }

    public int getDuration() {
        return this.m.getDuration();
    }

    public int getVideoHeight() {
        return this.m.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.m.getVideoWidth();
    }

    public boolean isPlaying() {
        return this.m.isPlaying();
    }

    public void pause() {
        this.m.pause();
    }

    public void start() {
        this.m.start();
    }

    public final void a() {
        c();
        this.m.release();
        this.m = null;
    }

    private void b() {
        if (this.m == null) {
            this.m = new MediaPlayer();
            this.m.setOnVideoSizeChangedListener(this);
            setSurfaceTextureListener(this);
            return;
        }
        c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m != null) {
            if (isPlaying()) {
                this.m.stop();
            }
            a();
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public void seekTo(int i) {
        this.m.seekTo(i);
    }

    public void setLooping(boolean z) {
        this.m.setLooping(z);
    }

    public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.m.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.m.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.m.setOnInfoListener(onInfoListener);
    }

    public void setAssetData(@NonNull String str) throws IOException {
        setDataSource(getContext().getAssets().openFd(str));
    }

    public void setDataSource(@NonNull FileDescriptor fileDescriptor) throws IOException {
        b();
        this.m.setDataSource(fileDescriptor);
    }

    public void setRawData(@RawRes int i) throws IOException {
        setDataSource(getResources().openRawResourceFd(i));
    }

    public void setScalableType(b bVar) {
        this.n = bVar;
        a(getVideoWidth(), getVideoHeight());
    }

    private void setDataSource(@NonNull AssetFileDescriptor assetFileDescriptor) throws IOException {
        a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        assetFileDescriptor.close();
    }

    public void setDataSource(@NonNull String str) throws IOException {
        b();
        this.m.setDataSource(str);
    }

    public final void a(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IllegalStateException {
        this.m.setOnPreparedListener(onPreparedListener);
        this.m.prepareAsync();
    }

    public final void a(float f2, float f3) {
        this.m.setVolume(f2, f3);
    }

    private c(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(@NonNull Context context, @NonNull Uri uri) throws IOException {
        b();
        this.m.setDataSource(context, uri);
    }

    private void a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            Matrix a2 = new d(new e(getWidth(), getHeight()), new e(i, i2)).a(this.n);
            if (a2 != null) {
                setTransform(a2);
            }
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        a(i, i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        if (this.m != null) {
            this.m.setSurface(surface);
        }
    }

    private c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.n = b.NONE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.scaleStyle, 0, 0);
            if (obtainStyledAttributes != null) {
                int i2 = obtainStyledAttributes.getInt(0, b.NONE.ordinal());
                obtainStyledAttributes.recycle();
                this.n = b.values()[i2];
            }
        }
    }

    public final void a(@NonNull Context context, @NonNull Uri uri, @Nullable Map<String, String> map) throws IOException {
        b();
        this.m.setDataSource(context, uri, map);
    }

    public final void a(@NonNull FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        b();
        this.m.setDataSource(fileDescriptor, j, j2);
    }
}
