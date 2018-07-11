package day13.adler.foodapp;

public enum ModelObject {

    D(R.string.green, R.layout.view_1),
    RED(R.string.red, R.layout.view_2),
    BLUE(R.string.blue, R.layout.view_3);



    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
