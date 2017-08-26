package com.scichart.scishowcase.databinding;
import com.scichart.scishowcase.R;
import com.scichart.scishowcase.BR;
import android.view.View;
public class EcgHeartRateLayoutBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bpmLabel, 3);
        sViewsWithIds.put(R.id.ecgLabel, 4);
        sViewsWithIds.put(R.id.heartRateInfoLabel, 5);
    }
    // views
    public final android.widget.TextView bpmLabel;
    public final android.widget.TextView bpmValueLabel;
    public final android.widget.TextView ecgLabel;
    public final android.widget.ImageView heartIcon;
    public final android.widget.TextView heartRateInfoLabel;
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    private com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EcgHeartRateLayoutBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.bpmLabel = (android.widget.TextView) bindings[3];
        this.bpmValueLabel = (android.widget.TextView) bindings[2];
        this.bpmValueLabel.setTag(null);
        this.ecgLabel = (android.widget.TextView) bindings[4];
        this.heartIcon = (android.widget.ImageView) bindings[1];
        this.heartIcon.setTag(null);
        this.heartRateInfoLabel = (android.widget.TextView) bindings[5];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
                setViewModel((com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBpmValue((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelHeartRateIconVisibility((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBpmValue(android.databinding.ObservableField<java.lang.String> ViewModelBpmValue, int fieldId) {
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
    private boolean onChangeViewModelHeartRateIconVisibility(android.databinding.ObservableInt ViewModelHeartRateIconVisibility, int fieldId) {
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
        android.databinding.ObservableField<java.lang.String> viewModelBpmValue = null;
        android.databinding.ObservableInt viewModelHeartRateIconVisibility = null;
        int viewModelHeartRateIconVisibilityGet = 0;
        java.lang.String viewModelBpmValueGet = null;
        com.scichart.scishowcase.viewModels.ecg.EcgHeartRateViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bpmValue
                        viewModelBpmValue = viewModel.getBpmValue();
                    }
                    updateRegistration(0, viewModelBpmValue);


                    if (viewModelBpmValue != null) {
                        // read viewModel.bpmValue.get()
                        viewModelBpmValueGet = viewModelBpmValue.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.heartRateIconVisibility
                        viewModelHeartRateIconVisibility = viewModel.getHeartRateIconVisibility();
                    }
                    updateRegistration(1, viewModelHeartRateIconVisibility);


                    if (viewModelHeartRateIconVisibility != null) {
                        // read viewModel.heartRateIconVisibility.get()
                        viewModelHeartRateIconVisibilityGet = viewModelHeartRateIconVisibility.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.bpmValueLabel, viewModelBpmValueGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.heartIcon.setVisibility(viewModelHeartRateIconVisibilityGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static EcgHeartRateLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgHeartRateLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<EcgHeartRateLayoutBinding>inflate(inflater, com.scichart.scishowcase.R.layout.ecg_heart_rate_layout, root, attachToRoot, bindingComponent);
    }
    public static EcgHeartRateLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgHeartRateLayoutBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.scichart.scishowcase.R.layout.ecg_heart_rate_layout, null, false), bindingComponent);
    }
    public static EcgHeartRateLayoutBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static EcgHeartRateLayoutBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ecg_heart_rate_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new EcgHeartRateLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.bpmValue
        flag 1 (0x2L): viewModel.heartRateIconVisibility
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}