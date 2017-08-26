package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class EcgBloodVolumeLayoutBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.svLabel, 4);
        sViewsWithIds.put(R.id.svInfoLabel, 5);
        sViewsWithIds.put(R.id.bloodPressureValue, 6);
    }
    // views
    public final android.widget.TextView bloodPressureValue;
    public final android.widget.TextView bloodVolumeValueLabel;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final com.scichart.scishowcase.views.StepProgressBar svBar1;
    public final com.scichart.scishowcase.views.StepProgressBar svBar2;
    public final android.widget.TextView svInfoLabel;
    public final android.widget.TextView svLabel;
    // variables
    private com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EcgBloodVolumeLayoutBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.bloodPressureValue = (android.widget.TextView) bindings[6];
        this.bloodVolumeValueLabel = (android.widget.TextView) bindings[1];
        this.bloodVolumeValueLabel.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.svBar1 = (com.scichart.scishowcase.views.StepProgressBar) bindings[2];
        this.svBar1.setTag(null);
        this.svBar2 = (com.scichart.scishowcase.views.StepProgressBar) bindings[3];
        this.svBar2.setTag(null);
        this.svInfoLabel = (android.widget.TextView) bindings[5];
        this.svLabel = (android.widget.TextView) bindings[4];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
                setViewModel((com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSvBar2Value((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelSvBar1Value((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelBloodVolumeValue((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSvBar2Value(android.databinding.ObservableInt ViewModelSvBar2Value, int fieldId) {
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
    private boolean onChangeViewModelSvBar1Value(android.databinding.ObservableInt ViewModelSvBar1Value, int fieldId) {
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
    private boolean onChangeViewModelBloodVolumeValue(android.databinding.ObservableField<java.lang.String> ViewModelBloodVolumeValue, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
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
        android.databinding.ObservableInt viewModelSvBar2Value = null;
        int viewModelSvBar2ValueGet = 0;
        int viewModelSvBar1ValueGet = 0;
        java.lang.String viewModelBloodVolumeValueGet = null;
        android.databinding.ObservableInt viewModelSvBar1Value = null;
        android.databinding.ObservableField<java.lang.String> viewModelBloodVolumeValue = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodVolumeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.svBar2Value
                        viewModelSvBar2Value = viewModel.getSvBar2Value();
                    }
                    updateRegistration(0, viewModelSvBar2Value);


                    if (viewModelSvBar2Value != null) {
                        // read viewModel.svBar2Value.get()
                        viewModelSvBar2ValueGet = viewModelSvBar2Value.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.svBar1Value
                        viewModelSvBar1Value = viewModel.getSvBar1Value();
                    }
                    updateRegistration(1, viewModelSvBar1Value);


                    if (viewModelSvBar1Value != null) {
                        // read viewModel.svBar1Value.get()
                        viewModelSvBar1ValueGet = viewModelSvBar1Value.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bloodVolumeValue
                        viewModelBloodVolumeValue = viewModel.getBloodVolumeValue();
                    }
                    updateRegistration(2, viewModelBloodVolumeValue);


                    if (viewModelBloodVolumeValue != null) {
                        // read viewModel.bloodVolumeValue.get()
                        viewModelBloodVolumeValueGet = viewModelBloodVolumeValue.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.bloodVolumeValueLabel, viewModelBloodVolumeValueGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.svBar1.setProgress(viewModelSvBar1ValueGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.svBar2.setProgress(viewModelSvBar2ValueGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static EcgBloodVolumeLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodVolumeLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EcgBloodVolumeLayoutBinding>inflate(inflater, com.scichart.scishowcase.R.layout.ecg_blood_volume_layout, root, attachToRoot, bindingComponent);
    }
    public static EcgBloodVolumeLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodVolumeLayoutBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.ecg_blood_volume_layout, null, false), bindingComponent);
    }
    public static EcgBloodVolumeLayoutBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodVolumeLayoutBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ecg_blood_volume_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EcgBloodVolumeLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.svBar2Value
        flag 1 (0x2L): viewModel.svBar1Value
        flag 2 (0x3L): viewModel.bloodVolumeValue
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}