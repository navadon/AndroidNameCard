package com.example.navadon.androidnamecard.databinding;
import com.example.navadon.androidnamecard.R;
import com.example.navadon.androidnamecard.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageButton, 10);
        sViewsWithIds.put(R.id.imageButton3, 11);
        sViewsWithIds.put(R.id.imageButton4, 12);
        sViewsWithIds.put(R.id.btn, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.address.setTag(null);
        this.email.setTag(null);
        this.imageView.setTag(null);
        this.imageView3.setTag(null);
        this.imageView4.setTag(null);
        this.line.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.nickname.setTag(null);
        this.phone.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.navadon.androidnamecard.MyModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.navadon.androidnamecard.MyModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewmodelColorSrc1 = 0;
        java.lang.String viewmodelAddress = null;
        java.lang.String viewmodelLine = null;
        com.example.navadon.androidnamecard.MyModel viewmodel = mViewmodel;
        java.lang.String viewmodelEmail = null;
        java.lang.Integer viewmodelImgSrc1 = null;
        java.lang.String viewmodelPhone = null;
        java.lang.String viewmodelNickname = null;
        java.lang.String viewmodelName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.colorSrc1
                    viewmodelColorSrc1 = viewmodel.getColorSrc1();
                    // read viewmodel.address
                    viewmodelAddress = viewmodel.getAddress();
                    // read viewmodel.line
                    viewmodelLine = viewmodel.getLine();
                    // read viewmodel.email
                    viewmodelEmail = viewmodel.getEmail();
                    // read viewmodel.imgSrc1
                    viewmodelImgSrc1 = viewmodel.getImgSrc1();
                    // read viewmodel.phone
                    viewmodelPhone = viewmodel.getPhone();
                    // read viewmodel.nickname
                    viewmodelNickname = viewmodel.getNickname();
                    // read viewmodel.name
                    viewmodelName = viewmodel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.address, viewmodelAddress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.email, viewmodelEmail);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageView, android.databinding.adapters.Converters.convertColorToDrawable(viewmodelImgSrc1));
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.imageView3, android.databinding.adapters.Converters.convertColorToDrawable(viewmodelColorSrc1));
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.imageView4, android.databinding.adapters.Converters.convertColorToDrawable(viewmodelColorSrc1));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.line, viewmodelLine);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewmodelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nickname, viewmodelNickname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.phone, viewmodelPhone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}