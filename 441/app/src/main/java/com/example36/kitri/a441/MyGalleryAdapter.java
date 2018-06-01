package com.example36.kitri.a441;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class MyGalleryAdapter {
    public class MyGalleryAdapter extends BaseAdapter {
        Context context;
        Intenger[] posterID = {
                R.drawable.mov11, R.drawable.mov12, R.drawable.mov13, R.drawable.mov14, R.drawable.mov15, R.drawable.mov16, R.drawable.mov17, R.drawable.mov18, R.drawable.mov19, R.drawable.mov20
        };
        public MyGalleryAdapter(Context c) {
            context = c;
        }
        public Object getItem(int arg0) {
            return null;
        }
        public long getItemId(int arg0) {
            return 0;
        }
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            return null;
        }
    }
}
