package jp.co.android.testviewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends Activity implements OnClickListener {

    private ViewFlipper viewflipperBody = null;
    private ViewflipperOneCommand viewflipperOneCommand = null;
    private ViewflipperTwoCommand viewflipperTwoCommand = null;
    private ViewflipperThreeCommand viewflipperThreeCommand = null;
    

    private LinearLayout viewflipperOneLayout = null;
    private LinearLayout viewflipperTwoLayout = null;
    private LinearLayout viewflipperThreeLayout = null;
    private ImageView imageButton1_1 = null;
    private ImageView imageButton1_2 = null;
    private ImageView imageButton1_3 = null;
    private ImageView imageButton2_1 = null;
    private ImageView imageButton2_2 = null;
    private ImageView imageButton2_3 = null;
    private ImageView imageButton3_1 = null;
    private ImageView imageButton3_2 = null;
    private ImageView imageButton3_3 = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //画面共有情報の初期化
        initialSharedView();
        
        viewflipperBody = (ViewFlipper)findViewById(R.id.viewflipper_body_id);
        viewflipperOneLayout = (LinearLayout)findViewById(R.id.viewflipper_one_layout_id);
        viewflipperTwoLayout = (LinearLayout)findViewById(R.id.viewflipper_two_layout_id);
        viewflipperThreeLayout = (LinearLayout)findViewById(R.id.viewflipper_three_layout_id);
        try {
            viewflipperOneCommand = new ViewflipperOneCommand();
            viewflipperOneCommand.onCreate(savedInstanceState, this);

            viewflipperTwoCommand = new ViewflipperTwoCommand();
            viewflipperTwoCommand.onCreate(savedInstanceState, this);
            
            viewflipperThreeCommand = new ViewflipperThreeCommand();
            viewflipperThreeCommand.onCreate(savedInstanceState, this);
            
        } catch (OutOfMemoryError e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        if(view == imageButton1_1 || view == imageButton2_1 || view == imageButton3_1) {
//          viewflipperBody.showNext();
            viewflipperBody.setDisplayedChild(0);
        } else if (view == imageButton1_2 || view == imageButton2_2 || view == imageButton3_2) {
            viewflipperBody.setDisplayedChild(1);
        } else if (view == imageButton1_3 || view == imageButton2_3 || view == imageButton3_3) {
//          viewflipperBody.showNext();
            viewflipperBody.setDisplayedChild(2);
        }
    }

    /**
     * 画面共有情報の初期化（onCreate時に呼び出されることを想定）
     */
    private void initialSharedView() {
        imageButton1_1 = (ImageView)findViewById(R.id.image1_1_id);
        imageButton1_1.setOnClickListener(this);
        imageButton1_2 = (ImageView)findViewById(R.id.image1_2_id);
        imageButton1_2.setOnClickListener(this);
        imageButton1_3 = (ImageView)findViewById(R.id.image1_3_id);
        imageButton1_3.setOnClickListener(this);
        
        imageButton2_1 = (ImageView)findViewById(R.id.image2_1_id);
        imageButton2_1.setOnClickListener(this);
        imageButton2_2 = (ImageView)findViewById(R.id.image2_2_id);
        imageButton2_2.setOnClickListener(this);
        imageButton2_3 = (ImageView)findViewById(R.id.image2_3_id);
        imageButton2_3.setOnClickListener(this);
        
        imageButton3_1 = (ImageView)findViewById(R.id.image3_1_id);
        imageButton3_1.setOnClickListener(this);
        imageButton3_2 = (ImageView)findViewById(R.id.image3_2_id);
        imageButton3_2.setOnClickListener(this);
        imageButton3_3 = (ImageView)findViewById(R.id.image3_3_id);
        imageButton3_3.setOnClickListener(this);
    }

    private Toast toast = null;
    public void toastShow(String msg, int duration) {
        if(toast != null) {
            toast.cancel();
            toast = null;
        }
        toast = Toast.makeText(this, msg, duration);
        toast.show();
    }
    
}