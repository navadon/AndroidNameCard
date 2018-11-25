package com.example.navadon.androidnamecard.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.navadon.androidnamecard.MyModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView address;

  @NonNull
  public final Button btn;

  @NonNull
  public final TextView email;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView line;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView nickname;

  @NonNull
  public final TextView phone;

  @Bindable
  protected MyModel mViewmodel;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView address, Button btn, TextView email, ImageButton imageButton,
      ImageButton imageButton3, ImageButton imageButton4, ImageView imageView, ImageView imageView3,
      ImageView imageView4, TextView line, TextView name, TextView nickname, TextView phone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.btn = btn;
    this.email = email;
    this.imageButton = imageButton;
    this.imageButton3 = imageButton3;
    this.imageButton4 = imageButton4;
    this.imageView = imageView;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.line = line;
    this.name = name;
    this.nickname = nickname;
    this.phone = phone;
  }

  public abstract void setViewmodel(@Nullable MyModel viewmodel);

  @Nullable
  public MyModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.navadon.androidnamecard.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.navadon.androidnamecard.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.example.navadon.androidnamecard.R.layout.activity_main);
  }
}
