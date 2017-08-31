package jp.co.android.testviewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class ViewflipperOneCommand extends MainActivity implements OnClickListener {

    private Activity activity = null;

//    private LinearLayout viewflipperOneLayout = null;
    
    public void onCreate(Activity activity) {
        this.activity = activity;

//        viewflipperOneLayout = (LinearLayout)activity.findViewById(R.id.viewflipper_one_layout_id);
    }
    
    public void onCreate(Bundle saveInstanceState, Activity activity) {
        onCreate(activity);
    }
    
    public void onResume() {}
    public void onPause() {}
    
    /**
     * Click event
     * @param view クリック時のViewオブジェクト
     */
//    public void onClick(View view) {
////        if(view == imageButton1_1) {
////            ((MainActivity)activity).toastShow("imageButton1_1", Toast.LENGTH_LONG);
////        } else if (view == imageButton1_2) {
////            ((MainActivity)activity).toastShow("imageButton1_2", Toast.LENGTH_LONG);
////        }
//        super.onClick(view);
//    }
}
