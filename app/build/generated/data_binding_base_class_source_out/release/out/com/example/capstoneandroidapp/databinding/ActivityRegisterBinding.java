// Generated by view binder compiler. Do not edit!
package com.example.capstoneandroidapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.capstoneandroidapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText etAge;

  @NonNull
  public final EditText etId;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPass;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRegister,
      @NonNull EditText etAge, @NonNull EditText etId, @NonNull EditText etName,
      @NonNull EditText etPass) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.etAge = etAge;
    this.etId = etId;
    this.etName = etName;
    this.etPass = etPass;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      Button btnRegister = rootView.findViewById(id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.et_age;
      EditText etAge = rootView.findViewById(id);
      if (etAge == null) {
        break missingId;
      }

      id = R.id.et_id;
      EditText etId = rootView.findViewById(id);
      if (etId == null) {
        break missingId;
      }

      id = R.id.et_name;
      EditText etName = rootView.findViewById(id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.et_pass;
      EditText etPass = rootView.findViewById(id);
      if (etPass == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegister, etAge, etId,
          etName, etPass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
