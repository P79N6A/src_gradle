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
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.ui.HostOptionUiDepend;
import java.util.List;

@AnyProcess
public class AbstractHostOptionUiDepend extends BaseAbstractHostDepend<HostOptionUiDepend> implements HostOptionUiDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionUiDependImpl";
    }

    @AnyProcess
    public void hideToast() {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).hideToast();
        }
    }

    @Nullable
    @AnyProcess
    public Dialog getLoadingDialog(@NonNull Activity activity, String str) {
        if (inject()) {
            return ((HostOptionUiDepend) this.defaultOptionDepend).getLoadingDialog(activity, str);
        }
        return null;
    }

    @AnyProcess
    public void showActionSheet(@NonNull Context context, @Nullable String str, @Nullable String[] strArr, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showActionSheet(context, str, strArr, nativeModuleCallback);
        }
    }

    public void showRegionPickerView(@NonNull Activity activity, @Nullable String str, @Nullable String[] strArr, @NonNull HostOptionUiDepend.ExtendRegionPickerCallBack extendRegionPickerCallBack) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showRegionPickerView(activity, str, strArr, extendRegionPickerCallBack);
        }
    }

    @Nullable
    @AnyProcess
    public Dialog showPermissionDialog(@NonNull Activity activity, @NonNull AppbrandPermissionType appbrandPermissionType, @NonNull String str, @NonNull IPermissionsResultAction iPermissionsResultAction) {
        if (inject()) {
            return ((HostOptionUiDepend) this.defaultOptionDepend).showPermissionDialog(activity, appbrandPermissionType, str, iPermissionsResultAction);
        }
        return null;
    }

    @AnyProcess
    public void showMultiPickerView(@NonNull Activity activity, @Nullable String str, @Nullable List<List<String>> list, @Nullable int[] iArr, @NonNull HostOptionUiDepend.ExtendMultiPickerCallBack extendMultiPickerCallBack) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showMultiPickerView(activity, str, list, iArr, extendMultiPickerCallBack);
        }
    }

    @AnyProcess
    public void showPickerView(@NonNull Activity activity, @Nullable String str, int i, @NonNull List<String> list, @NonNull HostOptionUiDepend.ExtendNormalPickerCallBack<String> extendNormalPickerCallBack) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showPickerView(activity, str, i, list, extendNormalPickerCallBack);
        }
    }

    @AnyProcess
    public void showToast(@NonNull Context context, @Nullable String str, @Nullable String str2, long j, @Nullable String str3) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showToast(context, str, str2, j, str3);
        }
    }

    @AnyProcess
    public void showTimePickerView(@NonNull Activity activity, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, @NonNull HostOptionUiDepend.ExtendTimePickerCallBack<String> extendTimePickerCallBack) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showTimePickerView(activity, str, i, i2, i3, i4, i5, i6, extendTimePickerCallBack);
        }
    }

    @AnyProcess
    public void showModal(@NonNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showModal(context, str, str2, str3, z, str4, str5, str6, str7, nativeModuleCallback);
        }
    }

    @AnyProcess
    public void showDatePickerView(@NonNull Activity activity, @Nullable String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NonNull HostOptionUiDepend.ExtendDatePickerCallBack<String> extendDatePickerCallBack) {
        if (inject()) {
            ((HostOptionUiDepend) this.defaultOptionDepend).showDatePickerView(activity, str, str2, i, i2, i3, i4, i5, i6, i7, i8, i9, extendDatePickerCallBack);
        }
    }
}
