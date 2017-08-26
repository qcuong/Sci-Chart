package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class EcgBloodPressureLayoutBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nibpLabel, 3);
        sViewsWithIds.put(R.id.nibpInfoLabel, 4);
    }
    // views
    public final com.scichart.scishowcase.views.StepProgressBar bloodPressureBar;
    public final android.widget.TextView bloodPressureValue;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.TextView nibpInfoLabel;
    public final android.widget.TextView nibpLabel;
    // variables
    private com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EcgBloodPressureLayoutBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.bloodPressureBar = (com.scichart.scishowcase.views.StepProgressBar) bindings[2];
        this.bloodPressureBar.setTag(null);
        this.bloodPressureValue = (android.widget.TextView) bindings[1];
        this.bloodPressureValue.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nibpInfoLabel = (android.widget.TextView) bindings[4];
        this.nibpLabel = (android.widget.TextView) bindings[3];
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
                setViewModel((com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBloodPressureBarValue((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelBloodPressure((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBloodPressureBarValue(android.databinding.ObservableInt ViewModelBloodPressureBarValue, int fieldId) {
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
    private boolean onChangeViewModelBloodPressure(android.databinding.ObservableField<java.lang.String> ViewModelBloodPressure, int fieldId) {
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
        android.databinding.ObservableInt viewModelBloodPressureBarValue = null;
        int viewModelBloodPressureBarValueGet = 0;
        android.databinding.ObservableField<java.lang.String> viewModelBloodPressure = null;
        java.lang.String viewModelBloodPressureGet = null;
        com.scichart.scishowcase.viewModels.ecg.EcgBloodPressureViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bloodPressureBarValue
                        viewModelBloodPressureBarValue = viewModel.getBloodPressureBarValue();
                    }
                    updateRegistration(0, viewModelBloodPressureBarValue);


                    if (viewModelBloodPressureBarValue != null) {
                        // read viewModel.bloodPressureBarValue.get()
                        viewModelBloodPressureBarValueGet = viewModelBloodPressureBarValue.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bloodPressure
                        viewModelBloodPressure = viewModel.getBloodPressure();
                    }
                    updateRegistration(1, viewModelBloodPressure);


                    if (viewModelBloodPressure != null) {
                        // read viewModel.bloodPressure.get()
                        viewModelBloodPressureGet = viewModelBloodPressure.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.bloodPressureBar.setProgress(viewModelBloodPressureBarValueGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.bloodPressureValue, viewModelBloodPressureGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static EcgBloodPressureLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodPressureLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EcgBloodPressureLayoutBinding>inflate(inflater, com.scichart.scishowcase.R.layout.ecg_blood_pressure_layout, root, attachToRoot, bindingComponent);
    }
    public static EcgBloodPressureLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodPressureLayoutBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.ecg_blood_pressure_layout, null, false), bindingComponent);
    }
    public static EcgBloodPressureLayoutBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgBloodPressureLayoutBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ecg_blood_pressure_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EcgBloodPressureLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.bloodPressureBarValue
        flag 1 (0x2L): viewModel.bloodPressure
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}