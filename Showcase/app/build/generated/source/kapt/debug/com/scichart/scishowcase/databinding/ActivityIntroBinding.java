package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class ActivityIntroBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 1);
        sViewsWithIds.put(R.id.imageView2, 2);
        sViewsWithIds.put(R.id.guideline, 3);
        sViewsWithIds.put(R.id.scrollView2, 4);
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.textView2, 6);
        sViewsWithIds.put(R.id.textView3, 7);
        sViewsWithIds.put(R.id.textView4, 8);
        sViewsWithIds.put(R.id.textView5, 9);
        sViewsWithIds.put(R.id.button, 10);
        sViewsWithIds.put(R.id.checkbox, 11);
    }
    // views
    public final android.widget.Button button;
    public final android.widget.CheckBox checkbox;
    public final android.support.constraint.Guideline guideline;
    public final android.widget.ImageView imageView;
    public final android.widget.ImageView imageView2;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.ScrollView scrollView2;
    public final android.widget.TextView textView;
    public final android.widget.TextView textView2;
    public final android.widget.TextView textView3;
    public final android.widget.TextView textView4;
    public final android.widget.TextView textView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityIntroBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.button = (android.widget.Button) bindings[10];
        this.checkbox = (android.widget.CheckBox) bindings[11];
        this.guideline = (android.support.constraint.Guideline) bindings[3];
        this.imageView = (android.widget.ImageView) bindings[1];
        this.imageView2 = (android.widget.ImageView) bindings[2];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.scrollView2 = (android.widget.ScrollView) bindings[4];
        this.textView = (android.widget.TextView) bindings[5];
        this.textView2 = (android.widget.TextView) bindings[6];
        this.textView3 = (android.widget.TextView) bindings[7];
        this.textView4 = (android.widget.TextView) bindings[8];
        this.textView5 = (android.widget.TextView) bindings[9];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityIntroBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityIntroBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityIntroBinding>inflate(inflater, com.scichart.scishowcase.R.layout.activity_intro, root, attachToRoot, bindingComponent);
    }
    public static ActivityIntroBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityIntroBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.activity_intro, null, false), bindingComponent);
    }
    public static ActivityIntroBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityIntroBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_intro_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityIntroBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}