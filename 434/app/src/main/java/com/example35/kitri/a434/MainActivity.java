package com.example35.kitri.a434;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv = (GridView) findViewById(R.id.gridview1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);

        Integer[] posterID = {
                R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04
                ,R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08
                ,R.drawable.mov09, R.drawable.mov10,R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04
                ,R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08
                ,R.drawable.mov09, R.drawable.mov10,R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04
                ,R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08
                ,R.drawable.mov09, R.drawable.mov10
        };

        public int getCount() {
            return posterID.length;
        }

        public View getView(int position, View Object convertView;
        convertView, ViewGroup Object parent;
        parent) {
            Context context;
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    View dialogView = (View) View.inflate(
                            MainActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(
                            MainActivity.this);
                    ImageView ivPoster = (ImageView) dialogView
                            .findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("큰 포스터");
                    dlg.setIcon(R.drawable.ic_launcher);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });

            return imageview;
        }

    }
}