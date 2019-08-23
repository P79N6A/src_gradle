package com.tt.option.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface HostOptionUiDepend {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DATE_PICKER_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TOAST_ICON_TYPE {
    }

    @AnyProcess
    public interface ExtendDatePickerCallBack<T> extends ExtendPickerBaseCallBack {
        @AnyProcess
        void onDatePicked(T t, T t2, T t3);
    }

    public interface ExtendMultiPickerCallBack extends ExtendPickerBaseCallBack {
        @AnyProcess
        void onConfirm(int[] iArr);

        @AnyProcess
        void onWheeled(int i, int i2, Object obj);
    }

    public interface ExtendNormalPickerCallBack<T> extends ExtendPickerBaseCallBack {
        @AnyProcess
        void onItemPicked(int i, T t);
    }

    @AnyProcess
    public interface ExtendPickerBaseCallBack {
        @AnyProcess
        void onCancel();

        @AnyProcess
        void onDismiss();

        @AnyProcess
        void onFailure(@Nullable String str);
    }

    public interface ExtendRegionPickerCallBack extends ExtendPickerBaseCallBack {
        @AnyProcess
        void onConfirm(String[] strArr);

        @AnyProcess
        void onWheeled(int i, int i2, Object obj);
    }

    @AnyProcess
    public interface ExtendTimePickerCallBack<T> extends ExtendPickerBaseCallBack {
        @AnyProcess
        void onTimePicked(T t, T t2);
    }

    @Nullable
    @AnyProcess
    Dialog getLoadingDialog(@NonNull Activity activity, String str);

    @AnyProcess
    void hideToast();

    @AnyProcess
    void showActionSheet(@NonNull Context context, @Nullable String str, @Nullable String[] strArr, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback);

    @AnyProcess
    void showDatePickerView(@NonNull Activity activity, @Nullable String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NonNull ExtendDatePickerCallBack<String> extendDatePickerCallBack);

    @AnyProcess
    void showModal(@NonNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback);

    @AnyProcess
    void showMultiPickerView(@NonNull Activity activity, @Nullable String str, @Nullable List<List<String>> list, @Nullable int[] iArr, @NonNull ExtendMultiPickerCallBack extendMultiPickerCallBack);

    @Nullable
    @AnyProcess
    Dialog showPermissionDialog(@NonNull Activity activity, @NonNull AppbrandPermissionType appbrandPermissionType, @NonNull String str, @NonNull IPermissionsResultAction iPermissionsResultAction);

    @AnyProcess
    void showPickerView(@NonNull Activity activity, @Nullable String str, int i, @NonNull List<String> list, @NonNull ExtendNormalPickerCallBack<String> extendNormalPickerCallBack);

    @AnyProcess
    void showRegionPickerView(@NonNull Activity activity, @Nullable String str, @Nullable String[] strArr, @NonNull ExtendRegionPickerCallBack extendRegionPickerCallBack);

    @AnyProcess
    void showTimePickerView(@NonNull Activity activity, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, @NonNull ExtendTimePickerCallBack<String> extendTimePickerCallBack);

    @AnyProcess
    void showToast(@NonNull Context context, @Nullable String str, @Nullable String str2, long j, @Nullable String str3);
}
