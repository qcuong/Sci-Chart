package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class EcgBloodOxygenationLayoutBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.spoLabel, 3);
        sViewsWithIds.put(R.id.spoInfoLabel, 4);
    }
    // views
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.TextView spoClockLabel;
    public final android.widget.TextView spoInfoLabel;
    public final android.widget.TextView spoLabel;
    public final android.widget.TextView spoValueLabel;
    // variables
    private com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EcgBloodOxygenationLayoutBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spoClockLabel = (android.widget.TextView) bindings[1];
        this.spoClockLabel.setTag(null);
        this.spoInfoLabel = (android.widget.TextView) bindings[4];
        this.spoLabel = (android.widget.TextView) bindings[3];
        this.spoValueLabel = (android.widget.TextView) bindings[2];
        this.spoValueLabel.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            case BR.viewModel :
                setViewModel((com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSpoClockValue((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelSpoValue((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSpoClockValue(android.databinding.ObservableField<java.lang.String> ViewModelSpoClockValue, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeViewModelSpoValue(android.databinding.ObservableField<java.lang.String> ViewModelSpoValue, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
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
        java.lang.String viewModelSpoClockValueGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelSpoClockValue = null;
        java.lang.String viewModelSpoValueGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelSpoValue = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodOxygenationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.spoClockValue
                        viewModelSpoClockValue = viewModel.getSpoClockValue();
                    }
                    updateRegistration(0, viewModelSpoClockValue);


                    if (viewModelSpoClockValue != null) {
                        // read viewModel.spoClockValue.get()
                        viewModelSpoClockValueGet = viewModelSpoClockValue.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.spoValue
                        viewModelSpoValue = viewModel.getSpoValue();
                    }
                    updateRegistration(1, viewModelSpoValue);


                    if (viewModelSpoValue != null) {
                        // read viewModel.spoValue.get()
                        viewModelSpoValueGet = viewModelSpoValue.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.spoClockLabel, viewModelSpoClockValueGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.spoValueLabel, viewModelSpoValueGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static EcgBloodOxygenationLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodOxygenationLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EcgBloodOxygenationLayoutBinding>inflate(inflater, com.scichart.scishowcase.R.layout.ecg_blood_oxygenation_layout, root, attachToRoot, bindingComponent);
    }
    public static EcgBloodOxygenationLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodOxygenationLayoutBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.ecg_blood_oxygenation_layout, null, false), bindingComponent);
    }
    public static EcgBloodOxygenationLayoutBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodOxygenationLayoutBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ecg_blood_oxygenation_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EcgBloodOxygenationLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.spoClockValue
        flag 1 (0x2L): viewModel.spoValue
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}