package day13.adler.foodapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter2 extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter2(Context context) {
        mContext = context;
    }






    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject2 modelObject2 = ModelObject2.values()[position];
        final LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject2.getLayoutResId(), collection, false);
        collection.addView(layout);





        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }




    @Override
    public int getCount() {
        return ModelObject2.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject2 customPagerEnum = ModelObject2.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }



}
